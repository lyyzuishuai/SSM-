package com.neuedu.controller.manage;

import com.neuedu.dao.EasybuyProductCategorySqlProvider;
import com.neuedu.entity.EasybuyCategory;
import com.neuedu.entity.EasybuyProduct;
import com.neuedu.entity.EasybuyProductCategory;
import com.neuedu.entity.Page;
import com.neuedu.service.EasyBuyProductService;
import com.neuedu.service.EasybuyCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/manage/category")
public class CategoryController {

    @Autowired
    private EasybuyCategoryService categoryService;

    @Autowired
    private EasyBuyProductService productService;


    @RequestMapping("/list")
    public ModelAndView getCategoryList(@RequestParam(name = "pageNo", defaultValue = "1", required = false) Integer pageNo,
                                        @RequestParam(name = "pageSize", defaultValue = "5", required = false) Integer pageSize,
                                        @RequestParam(name = "type", required = false) Integer type,
                                        @RequestParam(name = "key", required = false) String key) {
        Page<EasybuyCategory> page = new Page<EasybuyCategory>(pageNo, pageSize);
        //判断参数设置page值
        if (type != null && type > 0) {
            page.getParams().put("type", type);
        }
        if (key != null && !"".equals(key)) {
            page.setKey(key);
        }

        ArrayList<EasybuyCategory> categories = categoryService.selectByPage(page);

        ModelAndView mv = new ModelAndView();
        mv.addObject("categories", categories);
        mv.addObject("page", page);
        mv.setViewName("/category/list");
        return mv;
    }

    @RequestMapping("/add")
    public ModelAndView toAdd() {
        ModelAndView mv = new ModelAndView();
        ArrayList<EasybuyCategory> easybuyCategoryArrayList = categoryService.selectCategoryAll();
        mv.addObject("category", easybuyCategoryArrayList);
        mv.setViewName("/category/add");
        return mv;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void save(EasybuyCategory category, HttpServletResponse response) throws IOException {
        //防止界面乱码
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        //2、调用
        int rs = categoryService.save(category);

        if (rs == 1) {
            response.getWriter().print("<script>alert('添加成功！');window.location='/manage/category/list'</script>");
        } else
            response.getWriter().print("<script>alert('添加失败！');window.location='/manage/category/add'</script>");
    }

    @RequestMapping("/category/deleteProductById")
    @ResponseBody
    public Map deleteCategoryById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        Integer row = categoryService.deleteCategoryById(id);
        if (row == 1) {
            map.put("msg", "ok");
        } else {
            map.put("msg", "no");
        }
        return map;
    }

    @RequestMapping("/category/returnCategoryEditPage")
    public ModelAndView returnCategoryEditPage(Integer id) {
        ModelAndView mv = new ModelAndView();
        EasybuyCategory category = categoryService.getCategory(id);
        mv.addObject("category", category);
        mv.setViewName("/category/edit-category");
        return mv;
    }

    @RequestMapping("/category/updateCategoryById")
    public void updateCategoryById(EasybuyCategory category, HttpServletResponse response) throws IOException {
        Integer rs = categoryService.updateCategoryById(category);

        //防止界面乱码
        response.setHeader("Content-type", "text/html;charset=UTF-8");

        if (rs == 1) {
            response.getWriter().print("<script>alert('修改成功！');window.location='/manage/category/list'</script>");
        } else
            response.getWriter().print("<script>alert('修改失败！');window.location='/manage/category/add'</script>");
    }

}
