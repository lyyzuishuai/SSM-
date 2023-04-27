package com.neuedu.service.impl;

import com.neuedu.dao.EasybuyOrderDetailMapper;
import com.neuedu.dao.EasybuyOrderMapper;
import com.neuedu.entity.EasybuyOrder;
import com.neuedu.entity.EasybuyOrderDetail;
import com.neuedu.service.EasybuyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("easybuyOrderService")
public class EasybuyOrderServiceImpl implements EasybuyOrderService {
    @Autowired
    private EasybuyOrderMapper orderMapper;
    @Autowired
    private EasybuyOrderDetailMapper detailMapper;

    /**
     * 此处订单和明细需要放到一个方法中，也就是放入了一个事务中
     * @param order
     * @param details
     * @return
     */
    @Override
    public int save(EasybuyOrder order, ArrayList<EasybuyOrderDetail> details) {
        int rs=orderMapper.insert(order);
        rs+=detailMapper.insert(order.getId(),details);
        return rs;
    }

    @Override
    public ArrayList<EasybuyOrder> selectByUid(int uid) {
        return orderMapper.selectByUId(uid);
    }
}
