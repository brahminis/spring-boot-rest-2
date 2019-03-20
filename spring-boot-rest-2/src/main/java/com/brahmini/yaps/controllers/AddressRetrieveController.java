package com.brahmini.yaps.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.brahmini.yaps.beans.*;

@Controller
public class AddressRetrieveController {

	@RequestMapping(method = RequestMethod.GET, value="/address/alladdresses")
	
	@ResponseBody
	public List<AddressBook> getAllAddresses(){
		return InsertAddress.getInstance().readEntry();
		
	}
}
