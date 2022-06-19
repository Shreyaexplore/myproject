package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		
		Demo d1=context.getBean("demo", Demo.class);
		System.out.println(d1);
		
		//not used much another way of using spel
		SpelExpressionParser temp =new SpelExpressionParser();
		Expression express= temp.parseExpression("30+46");
		System.out.println(express.getValue());
	}

}
