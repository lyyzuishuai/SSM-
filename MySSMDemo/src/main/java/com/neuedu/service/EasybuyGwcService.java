package com.neuedu.service;

import com.neuedu.entity.EasybuyGwc;

import java.util.List;

public interface EasybuyGwcService {
    Integer save(EasybuyGwc easybuyGwc);

    List<EasybuyGwc> selectGwcByUserId(Integer id);

    Integer deleteShoppingCartById(Integer id);

    EasybuyGwc selectGwcByProdcutId(Integer pid);

    void updateProductNumByProductId(Integer pid);

    void deleteShoppingCartByProductId(int productId);

    Integer reduceByProductId(Integer pid);
}
