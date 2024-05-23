package com.woodz.love.service;


import com.woodz.love.dao.IMainRepository;
import com.woodz.love.model.MainPh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService implements IMainService{
    @Autowired
    IMainRepository mainRepository;

    @Override
    public List<MainPh> getAllMainPh() {
        return null;
    }
}
