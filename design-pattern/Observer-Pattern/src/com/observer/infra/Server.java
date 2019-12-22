package com.observer.infra;

import java.util.ArrayList;

public class Server implements Subject {
	private ArrayList<Observer> observers;
	private String serverStatus;
	
	public Server() {
		observers = new ArrayList<Observer>();
		
	}
	
	public void statusChanged(String status) {
		this.serverStatus = status;
		System.out.println("서버 상태 변경 - "+serverStatus);
		this.notifyObserver(serverStatus);
	}

	@Override
	public void add(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void delete(Observer observer) {
		if(observers.contains(observer)) {
			observers.remove(observer);
		}
		

	}

	@Override
	public void notifyObserver(String status) {
		for(Observer obs:observers) {
			obs.update(status);
		}
		
	}

	

	}


