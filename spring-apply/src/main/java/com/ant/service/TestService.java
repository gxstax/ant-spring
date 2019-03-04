package com.ant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ant
 * @ClassName: TestService
 * @Description: TestService
 * @datetime 2019/3/4 8:18
 * @Version 1.0
 */
//@Service
public class TestService {

    @Autowired
    private IndexService indexService;
}
