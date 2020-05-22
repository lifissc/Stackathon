package com.simplemall.micro.serv.zuul.filter;

import com.netflix.zuul.ZuulFilter;

public class PostFilter extends ZuulFilter {

	@Override
	public Object run() {
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return false;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "post";
	}

}
