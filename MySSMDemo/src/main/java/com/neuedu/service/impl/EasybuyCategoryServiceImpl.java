package com.neuedu.service.impl;

import com.neuedu.dao.EasybuyCategoryMapper;
import com.neuedu.entity.EasybuyCategory;
import com.neuedu.entity.Page;
import com.neuedu.service.EasybuyCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("easybuyCategoryService")
public class EasybuyCategoryServiceImpl implements EasybuyCategoryService {
    @Autowired
    private EasybuyCategoryMapper easybuycategoryMapper;

    public EasybuyCategory getCategory(int id) {
        return easybuycategoryMapper.selectByPrimaryKey(id);
    }

    public ArrayList<EasybuyCategory> selectByPage(Page<EasybuyCategory> page) {
        return easybuycategoryMapper.selectByPage(page);
    }

    public ArrayList<EasybuyCategory> selectByAll() {
        return easybuycategoryMapper.selectByAll();
    }

    public int save(EasybuyCategory category) {
        return easybuycategoryMapper.insert(category);
    }

    @Override
    public Integer deleteCategoryById(Integer id) {
        return easybuycategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateCategoryById(EasybuyCategory category) {
        return easybuycategoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public ArrayList<EasybuyCategory> selectCategoryAll() {
        return easybuycategoryMapper.selectCategoryAll();
    }
}
