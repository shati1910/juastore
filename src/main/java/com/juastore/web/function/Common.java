package com.juastore.web.function;

public class Common {
	public String ReplaceChar(String text) {
		text = text.replace("<", "&lt;");
		text = text.replace(">", "&gt;");
		text = text.replace("\"", "&quot;");
		text = text.replace("\'", "&#39;");
		text = text.replace("\\", "&#92;");
		return text;
	}
}
