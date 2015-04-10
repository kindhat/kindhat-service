package com.kindhat.service.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import com.google.gson.Gson;

public class Server<T> {
	
	private Class<T> clazz = null;

	public Server(Class<T> clazz){
	    this.clazz = clazz;
	}

	public Class<T> getServerClass() {
	    return clazz;
	}

	public T getItemSync(String url) {
		InputStream input = null;
		T result = null;
		try{
			try {
				input = new URL(url).openStream();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Reader reader = null;
			try {
				reader = new InputStreamReader(input, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			result = new Gson().fromJson(reader, this.getServerClass());
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
}
