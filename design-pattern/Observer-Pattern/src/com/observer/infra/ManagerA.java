package com.observer.infra;

public class ManagerA implements Observer {

	private String status;
	
	private Subject server;
	
	public ManagerA(Subject server) {
		this.server = server;
		server.add(this);//������ ���
	}
	
	@Override
	public void update(String status) {
		this.status = status;
		System.out.println("[������A] : ���� ������ ������Ʈ �Ǿ����ϴ�. - "+ status);

	}

}
