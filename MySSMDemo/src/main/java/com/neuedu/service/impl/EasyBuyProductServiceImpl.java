package com.neuedu.service.impl;

import com.neuedu.dao.EasybuyProductMapper;
import com.neuedu.entity.EasybuyProduct;
import com.neuedu.entity.EasybuyUser;
import com.neuedu.entity.Page;
import com.neuedu.service.EasyBuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("easyBuyProductService")
public class EasyBuyProductServiceImpl implements EasyBuyProductService {

    @Autowired
    private EasybuyProductMapper easybuyProductMapper;

    public EasybuyProduct getProduct(int pid) {
        return easybuyProductMapper.selectByPrimaryKey(pid);
    }

    public ArrayList<EasybuyProduct> selectByIds(List<String> pids) {
        return easybuyProductMapper.selectByIds(pids);
    }


    public EasybuyProduct selectById(int pid) {
        return easybuyProductMapper.selectByPrimaryKey(pid);
    }

    public ArrayList<EasybuyProduct> selectByPage(Page<EasybuyProduct> page) {
        return easybuyProductMapper.selectByPage(page);
    }

    public int save(EasybuyProduct product) {
        return easybuyProductMapper.insert(product);
    }

    @Override
    public Integer deleteProductById(Integer id) {
        return easybuyProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateProductById(EasybuyProduct product) {
        product.setIsdelete(0);
        return easybuyProductMapper.updateByPrimaryKey(product);
    }

    @Override
    public List<EasybuyProduct> selectByAll() {
        return easybuyProductMapper.selectByAll();
    }


}
