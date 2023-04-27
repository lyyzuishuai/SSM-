package com.neuedu.service;

import com.neuedu.entity.EasybuyProduct;
import com.neuedu.entity.EasybuyUser;
import com.neuedu.entity.Page;

import java.util.ArrayList;
import java.util.List;

public interface EasyBuyProductService {
    public EasybuyProduct selectById(int pid);
    public EasybuyProduct getProduct(int pid);

    public ArrayList<EasybuyProduct> selectByPage(Page<EasybuyProduct> page);

    ArrayList<EasybuyProduct> selectByIds(List<String> pids);

    public int save(EasybuyProduct product);

    Integer deleteProductById(Integer id);

    Integer updateProductById(EasybuyProduct product);

    List<EasybuyProduct> selectByAll();


}
