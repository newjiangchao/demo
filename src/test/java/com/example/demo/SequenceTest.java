package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author viakiba
 * testNG 样例
 * @description
 * @date Create in 17:56 2018/7/22
 */
@Slf4j
@SpringBootTest
public class SequenceTest extends AbstractTestNGSpringContextTests {

    int i;

    @BeforeClass(groups = "before")
    public void beforeTest0() {
        i = 10;
        log.info("beforeTest0");
    }

    @Test(priority = 1, groups = {"sequence"})
    public void test1() {
        log.info("test1 + sequence ");
    }

    @Test(priority = 3, groups = {"sequence", "filter1"})
    public void test2() {
        log.info("test3 + sequence + filter1 ");
    }

    @Test(priority = 2, groups = {"sequence", "filter2"})
    public void test3() {
        log.info("test2+ sequence + filter2");
    }

    @Test(priority = 4, groups = {"sequence", "filter1", "filter3"})
    public void test4() {
        log.info("test4 + sequence + filter1");
    }

//    @Parameters({"testParam"})
//    @Test(priority = 5,groups = {"sequence","param"})
//    public void test5(int testParam){
//        log.info(testParam);
//        log.info("test5+sequence+param");
//    }

    @Test(priority = 5, groups = {"before"})
    public void test5() {
        log.info("test5+sequence+param");
    }

    @AfterGroups(groups = {"before"})
    public void afterTest0() {
        i = -1;
        log.info("afterTest0" + i);
    }
}
