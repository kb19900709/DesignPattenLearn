package com.kb.patten.template.people;

import com.kb.patten.template.main.LifeTemplate;

public class KB extends LifeTemplate {

	public KB() {
		super(KB.class.getSimpleName());
	}

	@Override
	protected void goCompany() {
		System.out.println("騎車上班囉");
	}

	@Override
	protected void goHome() {
		System.out.println("騎車下班囉");
	}

	@Override
	protected void play() {
		System.out.println("只能看書... 哭哭");
	}

}
