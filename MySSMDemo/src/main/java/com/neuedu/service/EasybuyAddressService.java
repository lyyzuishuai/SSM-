package com.neuedu.service;

import com.neuedu.entity.EasybuyUserAddress;

import java.util.List;

public interface EasybuyAddressService {
    List<EasybuyUserAddress> selectByUserId(Integer uid);

}
