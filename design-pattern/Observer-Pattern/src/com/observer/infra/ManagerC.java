package com.observer.infra;

public class ManagerC implements Observer {

	private String status;
	
	private Subject server;
	
	public ManagerC(Subject server) {
		this.server = server;
		server.add(this);//������ ���
	}
	
	public void delete() {
		server.delete(this);//������ ����
	}
	
	@Override
	public void update(String status) {
		this.status = status;
		System.out.println("[������C] : ���� ������ ������Ʈ �Ǿ����ϴ�. - "+ status);

	}
}
