package com.neuedu.controller;

import com.neuedu.entity.EasybuyOrder;
import com.neuedu.entity.EasybuyOrderDetail;
import com.neuedu.entity.EasybuyProduct;
import com.neuedu.entity.EasybuyUser;
import com.neuedu.service.EasyBuyProductService;
import com.neuedu.service.EasybuyGwcService;
import com.neuedu.service.EasybuyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/order")
public class EbOrderController {

    @Autowired
    private EasyBuyProductService productService;
    @Autowired
    private EasybuyOrderService orderService;

    @Autowired
    private EasybuyGwcService easybuyGwcService;

    @RequestMapping("/save")
    public String save(HttpServletRequest request, HttpSession session) {
        if (session.getAttribute("user") != null) {
            EasybuyUser user = (EasybuyUser) session.getAttribute("user");
            String[] pids = request.getParameterValues("pid");
            List<String> ids = Arrays.asList(pids);
            String addr = request.getParameter("addr");
            ArrayList<EasybuyOrderDetail> details = new ArrayList<>();

            ArrayList<EasybuyProduct> products = productService.selectByIds(ids);
            Integer num = null;
            float total = 0.0f;
            for (EasybuyProduct product : products) {
                num = Integer.parseInt(request.getParameter("num"));
                details.add(new EasybuyOrderDetail(product.getId(),
                        num, product.getPrice() * num));
                total += product.getPrice() * num;
            }
            int rs = 0;
            for (String id : ids) {
                EasybuyOrder order = new EasybuyOrder(user.getId(),
                        user.getLoginname(), addr, total, "");
                rs = orderService.save(order, details);
            }

            if (rs > 1) {
                for (String id : ids) {
                    Integer productId = Integer.parseInt(id);
                    easybuyGwcService.deleteShoppingCartByProductId(productId);
                }
                return "redirect:/order/list";
            } else {
                return "redirect:/shoppingCart/list";
            }
        } else {
            return "redirect:/user/login";
        }
    }

    @RequestMapping("/list")
    public ModelAndView toUserOrderList(HttpSession session) {
        EasybuyUser user = (EasybuyUser) session.getAttribute("user");
        ArrayList<EasybuyOrder> orders = orderService.selectByUid(user.getId());
        ModelAndView mv = new ModelAndView();
        mv.addObject("orders", orders);
        mv.setViewName("/order/list");
        return mv;
    }
}
