package com.neuedu.vo;

import com.neuedu.entity.EasybuyCategory;
import com.neuedu.entity.EasybuyProduct;

import java.io.Serializable;
import java.util.List;

public class EasybuyProductVo implements Serializable {


    private List<EasybuyProduct> easybuyProductList;

    private List<EasybuyCategory> easybuyCategorList;

    public List<EasybuyProduct> getEasybuyProductList() {
        return easybuyProductList;
    }

    public void setEasybuyProductList(List<EasybuyProduct> easybuyProductList) {
        this.easybuyProductList = easybuyProductList;
    }

    public List<EasybuyCategory> getEasybuyCategorList() {
        return easybuyCategorList;
    }

    public void setEasybuyCategorList(List<EasybuyCategory> easybuyCategorList) {
        this.easybuyCategorList = easybuyCategorList;
    }
}
