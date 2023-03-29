package com.yaxu.learnspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
	
	@Pointcut("execution(* com.yaxu.learnspringaop.aopexample.*.*.*(..))")
	public void businessAndDataPackageConfig() {}

	@Pointcut("execution(* com.yaxu.learnspringaop.aopexample.business.*.*(..))")
	public void businessPackageConfig() {}

	@Pointcut("execution(* com.yaxu.learnspringaop.aopexample.data.*.*(..))")
	public void dataPackageConfig() {}
	
	@Pointcut("bean(*Service*)")
	public void allPackageConfigUsingBean() {}

}
