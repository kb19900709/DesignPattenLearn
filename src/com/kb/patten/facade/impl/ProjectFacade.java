package com.kb.patten.facade.impl;

import com.kb.patten.facade.subsystem.Programming;
import com.kb.patten.facade.subsystem.ProjectManager;
import com.kb.patten.facade.subsystem.SystemAnalyst;
import com.kb.patten.facade.subsystem.SystemDesigner;

/**
 * 實作 Facade 統一入口的類，整合了次系統中的各個類別
 * 
 * @author KB
 * @version 1.0
 */
public class ProjectFacade implements Facade {

	private Programming pg;

	private ProjectManager pm;

	private SystemAnalyst sa;

	private SystemDesigner sd;

	public ProjectFacade() {
		this.pm = new ProjectManager();
		this.sa = new SystemAnalyst();
		this.sd = new SystemDesigner();
		this.pg = new Programming();
	}

	@Override
	public void action() {
		pm.controllProject();
		sa.analyst();
		sd.designe();
		pg.program();
	}

}
