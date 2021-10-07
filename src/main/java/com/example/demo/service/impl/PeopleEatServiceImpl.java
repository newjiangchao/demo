package com.example.demo.service.impl;

import com.example.demo.service.PeopleEatService;
import org.springframework.stereotype.Service;

/**
 * @author viakiba
 * @description
 * @date Create in 20:34 2018/7/22
 */
@Service
public class PeopleEatServiceImpl implements PeopleEatService {

    @Override
    public int eatService() {
        System.out.println("eatService 执行");
        return 1;
    }
}
