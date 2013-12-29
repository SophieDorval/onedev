package com.pmease.gitop.web.page.home;

import org.apache.wicket.markup.head.IHeaderResponse;

import com.pmease.gitop.web.common.wicket.bootstrap.NotificationPanel;
import com.pmease.gitop.web.page.AbstractLayoutPage;

public class HomePage extends AbstractLayoutPage {

	private static final long serialVersionUID = 1L;
	
	public HomePage() {
		this.setStatelessHint(true);
	}

	@Override
	protected String getPageTitle() {
		return "Gitop - Home";
	}

	@Override
	protected void onPageInitialize() {
		super.onPageInitialize();
		
		add(new NotificationPanel("alert", this));
		this.error("You are wrong");
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
	}
}
