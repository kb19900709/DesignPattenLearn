package com.kb.patten.template.people;

import com.kb.patten.template.main.LifeTemplate;

public class Pete extends LifeTemplate {

	public Pete() {
		super(Pete.class.getSimpleName());
	}

	@Override
	protected void goCompany() {
		System.out.println("搭捷運上班囉");
	}

	@Override
	protected void goHome() {
		System.out.println("騎 Ubike 去公車站，搭公車回家囉");
	}

	@Override
	protected boolean isLeave() {
		// Override hook method
		return true;
	}

	@Override
	protected void play() {
		System.out.println("玩PS4");
	}
}
