package com.observer.infra;

public class ManagerA implements Observer {

	private String status;
	
	private Subject server;
	
	public ManagerA(Subject server) {
		this.server = server;
		server.add(this);//옵저버 등록
	}
	
	@Override
	public void update(String status) {
		this.status = status;
		System.out.println("[관리자A] : 서버 정보가 업데이트 되었습니다. - "+ status);

	}

}
