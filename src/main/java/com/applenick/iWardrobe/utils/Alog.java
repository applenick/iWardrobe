package com.applenick.iWardrobe.utils;

import com.applenick.iWardrobe.iWardrobe;

public class Alog {

	public static void console(String msg){
		iWardrobe.get().getServer().getConsoleSender().sendMessage(msg);
	}

}