package dao;

import java.util.ArrayList;
import java.util.List;

import bean.BoletimBean;

public class BoletimDAO {
	
	private static List<BoletimBean> boletimList = new ArrayList<BoletimBean>();
	
	public static List<BoletimBean> getBoletimList() {
		return boletimList;
	}
	
	public static BoletimBean getBoletimBeanByIndex(Integer index) {
		return boletimList.get(index);
	}
	
	public static void add(BoletimBean boletimBean) {
		boletimList.add(boletimBean);
	}
	
	public static void remove(BoletimBean boletimBean) {
		boletimList.remove(boletimBean);		
	}

	public static void remove(Integer index) {
		BoletimBean boletimBean = getBoletimBeanByIndex(index); 
		boletimList.remove(boletimBean);		
	}
}
