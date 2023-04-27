package com.neuedu.service.impl;

import com.neuedu.dao.EasybuyUserMapper;
import com.neuedu.entity.EasybuyUser;
import com.neuedu.entity.Page;
import com.neuedu.service.EasyBuyUserService;
import com.neuedu.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户的业务逻辑实现类
 * 业务逻辑层调用数据访问层对象
 * 1、实现业务逻辑接口
 * 2、在类上添加@Service("easyBuyUserService")
 * 3、添加数据访问接口引用，再加上自动注入注解
 * 4、写具体方法
 */
@Service("easyBuyUserService")
public class EasyBuyUserServiceImpl implements EasyBuyUserService {

    //声明数据访问接口对象
    @Autowired
    private EasybuyUserMapper easybuyUserMapper;

    public EasybuyUser getUser(int id) {
        return easybuyUserMapper.selectByPrimaryKey(id);
    }

    /**
     * 管理员登录方法
     *
     * @param uname 登录名
     * @param pwd   密码
     * @return 用户对象
     */
    public EasybuyUser selectByAdmin(String uname, String pwd) {
        pwd = MD5Utils.MD5(pwd);
        return easybuyUserMapper.selectByAdmin(uname, pwd);
    }

    /**
     * 用户登录方法
     *
     * @param uname 登录名
     * @param pwd   密码
     * @return 用户对象
     */
    public EasybuyUser selectByUser(String uname, String pwd) {
        pwd = MD5Utils.MD5(pwd);
        return easybuyUserMapper.selectByUser(uname, pwd);
    }

    /**
     * 分页获取用户信息
     *
     * @param page
     * @return
     */
    public List<EasybuyUser> selectByPage(Page<EasybuyUser> page) {
        return easybuyUserMapper.selectByPage(page);
    }

    public int save(EasybuyUser user) {
        return easybuyUserMapper.insertSelective(user);
    }

    @Override
    public Integer deleteUserById(Integer id) {
        return easybuyUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateUserById(EasybuyUser user) {
        return easybuyUserMapper.updateByPrimaryKey(user);
    }

//    @Override
//    public void selectUserAll() {
//        easybuyUserMapper.selectUserAll();
//    }
}
