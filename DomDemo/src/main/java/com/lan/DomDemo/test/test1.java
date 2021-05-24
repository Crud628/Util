package com.lan.DomDemo.test;

import org.dom4j.Document;
import org.dom4j.DocumentException;

import com.lan.DomDemo.util.XMLDataSource;

public class test1 {

	public static void main(String[] args) {
		try {
			Document document = XMLDataSource.parse("E://a.xml");
			XMLDataSource.treeWalk(document.getRootElement());
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
