package com.lan.DomDemo.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XMLDataSource {

	/**
	 * 创建一个Document的文本
	 * 用于空文件创建document  仍在内存中
	 * @return
	 */
	public static Document createDocument() {
		//创建document
		Document document = DocumentHelper.createDocument();
		//创建根元素
		Element root = document.addElement("root");
		
		//添加子节点1和设置属性
		Element auther1 = root.addElement("auther")//子节点名字
				.addAttribute("name", "James")//子节点属性值
				.addAttribute("location", "UK")
				.addText("James SXtrachan");//节点文字
		//添加子节点2和设置属性
		Element auther2 = root.addElement("auther")
				.addAttribute("name", "Bob")
				.addAttribute("location", "US")
				.addText("James McWhirter");
		
		return document;
	}
	/**
	 * 讲Document写入文件
	 * @param document
	 * @throws IOException
	 */
	public static void wirte(Document document) throws IOException {
		//写一个没有格式的XML文件
		XMLWriter write = new XMLWriter(new FileWriter("E://a.xml"));
		write.write(document);
		write.close();
		// 创建文件输出的时候，自动缩进的格式      
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		XMLWriter writer = new XMLWriter(new FileWriter("E://output.xml"),format);
		writer.write(document);
		writer.close();
	}
	
	
	/**
	 * 读xml模板追加写入
	 * @param 
	 * @return Docuyment
	 * @throws DocumentException
	 */
	public static Document parse(String url) throws DocumentException {
		SAXReader reader = new SAXReader();
		Document document = reader.read(url);//可以是文件,可以是url
		return document;
	}
	
	/**
	 * 找Document里的元素
	 * @param document
	 * @throws DocumentException
	 */
	public static void bar(Document document) throws DocumentException {
		Element root = document.getRootElement();
		
		//获得根节点
		for( Iterator itr = root.elementIterator(); itr.hasNext();){
			Element element = (Element)itr.next();
			//TODO
		}
 
		//遍历子元素的根元素名称“foo”的节点
		for ( Iterator i = root.elementIterator("foo"); i.hasNext();){
			Element foo = (Element)i.next();
			//TODO
		}
		
		//遍历子元素的属性
		for (Iterator i = root.attributeIterator(); i.hasNext();){
			Attribute attribute = (Attribute) i.next();
			//TODO
		}
	}
	/**
	 * 循环遍历每一个节点
	 * @param element
	 */
	public static void treeWalk(Element element) {
		for ( int i=0, size = element.nodeCount(); i < size; i++){
			Node node = element.node(i);
			if (node instanceof Element ) {
				treeWalk ((Element)node);
				System.out.println("node = " + node.getText());
			}
			else {
				//do something
			}
		}
		
	}
	
	/**
	 * 读取文档中的链接
	 * @param document
	 * @throws DocumentException
	 */
	public static void findLink(Document document) throws DocumentException {
		List list = document.selectNodes("//a/@href");
		for( Iterator iter = list.iterator(); iter.hasNext();) {
			Attribute attribute = (Attribute) iter.next();
			String url = attribute.getValue();
			System.out.println("url = " + url.toString());
		}
	}
}
