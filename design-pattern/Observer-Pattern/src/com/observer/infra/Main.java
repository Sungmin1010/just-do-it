package com.observer.infra;

public class Main {

	public static void main(String[] args) {
		Server server = new Server();
		
		ManagerA managerA = new ManagerA(server);
		ManagerB managerB = new ManagerB(server);
		
		server.statusChanged("start");
		
		ManagerC managerC = new ManagerC(server);
		
		server.statusChanged("clean");
		//server.delete(managerA);
		managerC.delete();
		
		server.statusChanged("stop");

		
	}

}
