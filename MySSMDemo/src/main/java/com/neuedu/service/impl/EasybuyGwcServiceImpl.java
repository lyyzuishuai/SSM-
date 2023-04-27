package com.neuedu.service.impl;

import com.neuedu.dao.EasybuyGwcMapper;
import com.neuedu.entity.EasybuyGwc;
import com.neuedu.service.EasybuyGwcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasybuyGwcServiceImpl implements EasybuyGwcService {

    @Autowired
    private EasybuyGwcMapper gwcMapper;

    @Override
    public Integer save(EasybuyGwc easybuyGwc) {
        return gwcMapper.insert(easybuyGwc);
    }

    @Override
    public List<EasybuyGwc> selectGwcByUserId(Integer id) {
        return gwcMapper.selectGwcByUserId(id);
    }

    @Override
    public Integer deleteShoppingCartById(Integer id) {
        return gwcMapper.deleteShoppingCartById(id);
    }

    @Override
    public EasybuyGwc selectGwcByProdcutId(Integer pid) {
        return gwcMapper.selectGwcByProdcutId(pid);
    }

    @Override
    public void updateProductNumByProductId(Integer pid) {
        gwcMapper.updateProductNumByProductId(pid);
    }

    @Override
    public void deleteShoppingCartByProductId(int productId) {
        gwcMapper.deleteShoppingCartByProductId(productId);
    }

    @Override
    public Integer reduceByProductId(Integer pid) {
        return gwcMapper.reduceByProductId(pid);
    }
}
