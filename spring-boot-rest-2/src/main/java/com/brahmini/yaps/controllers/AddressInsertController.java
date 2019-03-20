package com.brahmini.yaps.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.brahmini.yaps.beans.*;

@Controller
public class AddressInsertController {
	@RequestMapping(method = RequestMethod.POST, value="/insert/address")
	
	@ResponseBody
	public AddressReply addressEntry(@RequestBody AddressBook addr) {
		System.out.println("In addressBook");
		AddressReply addrreply = new AddressReply();
		InsertAddress.getInstance().createEntry(addr);
		addrreply.setFirstname(addr.getFirstname());
		addrreply.setLastname(addr.getLastname());
		addrreply.setAddress(addr.getAddress());
		addrreply.setPhone_number(addr.getPhone_number());
		addrreply.setAddress(addr.getAddress());
		addrreply.setAddressInsertStatus("SuccessFull");
		
		return addrreply;
		
	}

}
