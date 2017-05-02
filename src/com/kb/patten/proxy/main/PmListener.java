package com.kb.patten.proxy.main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 需要被監控的行為，標註在介面
 * 
 * @author KB
 * @version 1.0
 * @see com.kb.patten.proxy.main.Programer
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PmListener {

}
