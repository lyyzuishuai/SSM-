package com.neuedu.entity;

import java.util.ArrayList;

/**
 * 购物车类
 */
public class ShoppingCart {

    //用户信息
    private EasybuyUser user;
    //购物车项集合
    private ArrayList<ShoppingCartItem> items;

    public ShoppingCart(EasybuyUser user) {
        this.user = user;
        this.items = new ArrayList<>();
    }

    public EasybuyUser getUser() {
        return user;
    }

    public void setUser(EasybuyUser user) {
        this.user = user;
    }

    public ArrayList<ShoppingCartItem> getItems() {
        return items;
    }

    /**
     * 添加购物车项
     *
     * @param product 商品对象
     * @param num     购买数量
     */
    public void addItem(EasybuyProduct product, int num) {
        boolean flag = true;
        //循环判断购物车内是否有该商品
        for (ShoppingCartItem i : items) {
            if (product.getId().intValue() == i.getProduct().getId().intValue()) {
                i.addNumber(num);
                flag = false;
                break;
            }
        }
        //购物车内无该商品
        if (flag) {
            this.items.add(new ShoppingCartItem(product, num));
        }
    }

    /**
     * 减商品商品数量
     *
     * @param product 商品对象
     * @param num     减去的数量
     */
    public void reduceItem(EasybuyProduct product, int num) {
        boolean flag = false;
        ShoppingCartItem item = null;
        //循环判断购物车内是否有该商品
        for (ShoppingCartItem i : items) {
            if (product.getId().intValue() == i.getProduct().getId().intValue()) {
                //减掉商品数量
                i.reduceNumber(num);
                //判断数量是否小于等于0
                flag = i.getNumber() <= 0 ? true : false;
                //取购物车项的引用，在循环外，从集合中移除
                item = i;
                break;
            }
        }
        if (flag) {
            //移除商品
            this.items.remove(item);
        }
    }


}
