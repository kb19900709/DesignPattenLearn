package com.kb.patten.template;

import com.kb.patten.template.main.LifeTemplate;
import com.kb.patten.template.people.KB;
import com.kb.patten.template.people.Pete;

public class Test {
	public static void main(String[] args) {
		System.out.println("### The first people ###");
		LifeTemplate KB = new KB();
		KB.templateLife();

		System.out.println("\n### The second people ###");
		LifeTemplate Pete = new Pete();
		Pete.templateLife();
	}
}
