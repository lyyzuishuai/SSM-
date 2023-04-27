package com.neuedu.service;

import com.neuedu.entity.EasybuyUser;
import com.neuedu.entity.Page;

import java.util.List;

/**
 * 用户的业务接口
 */
public interface EasyBuyUserService {

    public EasybuyUser getUser(int id);

    /**
     * 管理员登录方法
     *
     * @param uname 登录名
     * @param pwd   密码
     * @return 用户对象
     */
    public EasybuyUser selectByAdmin(String uname, String pwd);

    /**
     * 用户登录方法
     *
     * @param uname 登录名
     * @param pwd   密码
     * @return 用户对象
     */
    public EasybuyUser selectByUser(String uname, String pwd);

    /**
     * 分页获取用户信息
     *
     * @param page
     * @return
     */
    public List<EasybuyUser> selectByPage(Page<EasybuyUser> page);

    public int save(EasybuyUser user);

    Integer deleteUserById(Integer id);

    Integer updateUserById(EasybuyUser user);

//    void selectUserAll();
}
