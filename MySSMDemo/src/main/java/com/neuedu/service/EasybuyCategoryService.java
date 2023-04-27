package com.neuedu.service;

import com.neuedu.entity.EasybuyCategory;
import com.neuedu.entity.EasybuyProduct;
import com.neuedu.entity.Page;

import java.util.ArrayList;

public interface EasybuyCategoryService {
    public EasybuyCategory getCategory(int id);

    public ArrayList<EasybuyCategory> selectByPage(Page<EasybuyCategory> page);

    public ArrayList<EasybuyCategory> selectByAll();

    public int save(EasybuyCategory category);

    Integer deleteCategoryById(Integer id);

    Integer updateCategoryById(EasybuyCategory category);

    ArrayList<EasybuyCategory> selectCategoryAll();
}
