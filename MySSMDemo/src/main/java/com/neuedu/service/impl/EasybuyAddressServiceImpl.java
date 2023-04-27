package com.neuedu.service.impl;

import com.neuedu.dao.EasybuyUserAddressMapper;
import com.neuedu.entity.EasybuyUserAddress;
import com.neuedu.service.EasybuyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("easybuyAddressService")
public class EasybuyAddressServiceImpl implements EasybuyAddressService {

    @Autowired
    private EasybuyUserAddressMapper addressMapper;

    @Override
    public List<EasybuyUserAddress> selectByUserId(Integer uid) {
        return addressMapper.selectByUserId(uid);
    }
}
