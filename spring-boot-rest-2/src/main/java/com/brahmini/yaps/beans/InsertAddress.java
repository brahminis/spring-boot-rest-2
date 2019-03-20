package com.brahmini.yaps.beans;

import java.util.List;
import java.util.ArrayList;


/**
 * @author souji - 	InsertAddres will have four methods as below
 * 					createEntry
 * 					readEntry
 * 					updateEntry
 * 					deleteEntry
 *
 */



public class InsertAddress {
	
	private List<AddressBook> addressList;
	
	private static InsertAddress insadd = null;
	
	private InsertAddress() {
		addressList = new ArrayList<AddressBook>();
	}
	
	public static InsertAddress getInstance() {
		
		if (insadd == null) {
			insadd = new InsertAddress();
			return insadd;
		}else {
			return insadd;
		}
	}

	public void createEntry(AddressBook address) {
		addressList.add(address);
	}
	
	
	public List<AddressBook> readEntry(){
		return addressList;
	}
	
	
	public String updateEntry(AddressBook addr) {
		for(int i=0; i<addressList.size(); i++) 
		{
			AddressBook addrb = addressList.get(i);
			if(addrb.getEmail_address().equals(addr.getEmail_address())) {
				addressList.set(i, addr);
				return "Update Successfull";
			}
		
		}
		return "Update Un-Successfull";
	}
	
	public String deleteEntry(AddressBook addr) {
		for(int i=0; i<addressList.size(); i++) 
		{
			AddressBook addrb = addressList.get(i);
			if(addrb.getEmail_address().equals(addr.getEmail_address())) {
				addressList.remove(i);
				return "Delete Successfull";
			}
		
		}
		return "Delete Un-Successfull";
	}
}
