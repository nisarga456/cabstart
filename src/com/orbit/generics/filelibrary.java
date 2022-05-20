package com.orbit.generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class filelibrary {
	
		
		/**
		 * this method is used to read the data from property file		
		 * @param key
		 * @return the data from property file
		 * @throws IOException
		 */
		
		public String getPropertyData (String data) throws IOException {
			
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		
		Properties p=new Properties();

		p.load(fis);
		
		String data1 = p.getProperty(data);
		
		return data1;
		}
		
		
	}


