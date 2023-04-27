package com.neuedu.service;

import com.neuedu.entity.EasybuyOrder;
import com.neuedu.entity.EasybuyOrderDetail;

import java.util.ArrayList;

public interface EasybuyOrderService {

    public int save(EasybuyOrder order, ArrayList<EasybuyOrderDetail> details);

    public ArrayList<EasybuyOrder> selectByUid(int uid);
}
