package org.cieslinski.konstruktory;

public class App {
	DictRepo dictRepo;
	UserRepo userrepo;
	
	public App(DictRepo dictRepo, UserRepo userrepo) {
		
		this.dictRepo = dictRepo;
		this.userrepo = userrepo;
	}
	
	public DictRepo getDictRepo() {
		return dictRepo;
	}
/*	public void setDictRepo(DictRepo dictRepo) {
		this.dictRepo = dictRepo;
	}*/
	public UserRepo getUserrepo() {
		return userrepo;
	}
	/*public void setUserrepo(UserRepo userrepo) {
		this.userrepo = userrepo;
	}*/
	
}
