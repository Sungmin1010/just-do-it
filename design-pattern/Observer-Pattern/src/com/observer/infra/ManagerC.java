package com.observer.infra;

public class ManagerC implements Observer {

	private String status;
	
	private Subject server;
	
	public ManagerC(Subject server) {
		this.server = server;
		server.add(this);//옵저버 등록
	}
	
	public void delete() {
		server.delete(this);//옵저버 삭제
	}
	
	@Override
	public void update(String status) {
		this.status = status;
		System.out.println("[관리자C] : 서버 정보가 업데이트 되었습니다. - "+ status);

	}
}
