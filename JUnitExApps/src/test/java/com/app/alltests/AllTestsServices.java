package com.app.alltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.app.test.TestConnectionUtil;
import com.app.test.TestMailService;
import com.app.test.TestMathematics;
import com.app.test.TestOperations;
import com.app.test.TestStringOpers;

@RunWith(Suite.class)
@SuiteClasses({ TestConnectionUtil.class, TestMailService.class, TestMathematics.class, TestOperations.class, TestStringOpers.class })
public class AllTestsServices {

}
