package com.neuedu.entity;

/**
 * 购物车项
 */
public class ShoppingCartItem {
    //商品对象
    private EasybuyProduct product;
    //购买数量
    private int number;

    public ShoppingCartItem(EasybuyProduct product, int number) {
        this.product = product;
        this.number = number;
    }

    public EasybuyProduct getProduct() {
        return product;
    }

    public void setProduct(EasybuyProduct product) {
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * 添加商品数量
     * @param number
     */
    public void addNumber(int number) {
        this.number += number;
    }

    /**
     * 减少商品数量
     * @param number
     */
    public void reduceNumber(int number) {
        this.number -= number;
    }
}
