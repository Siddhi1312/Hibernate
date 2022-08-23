package com.cg.client;

import com.cg.entities.Placement;
import com.cg.service.IPlacementService;
import com.cg.service.IPlacementServiceImpl;

public class Client {

	public static void main(String[] args) {
		IPlacementService pla= new IPlacementServiceImpl();
		Placement p=new Placement();
		/*p.setId(12l);
		p.setName("shrija");
		p.setCollege(null);
		p.setQualification("B.Tech");
		p.setYear(4);
		p.setDate(null);
		pla.addPlacement(p);*/
		
		p=pla.searchPlacement(12l);
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getQualification());
		
		
		
		

	}

}
