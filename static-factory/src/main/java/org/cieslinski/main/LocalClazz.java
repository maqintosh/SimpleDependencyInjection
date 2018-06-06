package org.cieslinski.main;

import java.util.Locale;
import java.util.Map;
import java.util.Properties;

public class LocalClazz {

	Map<String, Locale> locals;
	Properties ustawienia;

	public Map<String, Locale> getLocals() {
		return locals;
	}

	public void setLocals(Map<String, Locale> locals) {
		this.locals = locals;
	}

	public Properties getUstawienia() {
		return ustawienia;
	}

	public void setUstawienia(Properties ustawienia) {
		this.ustawienia = ustawienia;
	}

}
