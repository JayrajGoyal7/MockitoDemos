package com.example.Junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArraysTest.class, StringHelperParameterizedTest.class })
public class SuiteArraysParameterizedTest {

}
