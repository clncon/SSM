package com.itheima.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HandlerInterceptor2 implements HandlerInterceptor{

	 //执行时机:Handler方法执行完成，(modelAndView已经返回)
	 //使用场景:统一异常处理，统一记录系统日志，用于action方法执行监控
	 //（在preHandle记录一个时间点，在afterCompletion记录执行结束时间点，将结束时间点减去开始时间点，得到执行时长）
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		 System.out.println("HandlerInterceptor--->>afeterCompletion2");
		
	}

	 //执行时机:进入Handler方法之后，再返回ModelAndView之前
	 //使用场景:使用modelAndView,向页面传递通用数据，使用统一的view
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView) throws Exception {
	
		 System.out.println("HandlerInterceptor-->>postHandler2");
		
	}

	 //hanlder:springmvc根据url找到Handler(只有一个方法)
	 //执行时机：进入Handler方法之前执行，如果返回false，表示拦截，如果返回true表示放行
	 //使用场景:用于用户身份校验，用户权限拦截校验
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
	
		 System.out.println("HandlerInterceptor1-->>preHandler2");
		return true;
	}
	
	
	 

}
