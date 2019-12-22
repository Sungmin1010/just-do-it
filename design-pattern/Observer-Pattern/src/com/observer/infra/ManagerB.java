package com.observer.infra;

public class ManagerB implements Observer {

	private String status;
	
	private Subject server;
	
	public ManagerB(Subject server) {
		this.server = server;
		server.add(this);//������ ���
	}
	
	@Override
	public void update(String status) {
		this.status = status;
		System.out.println("[������B] : ���� ������ ������Ʈ �Ǿ����ϴ�. - "+ status);

	}

}
