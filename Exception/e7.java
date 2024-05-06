package com.Exception;

public class e7{
		  public static void main(String[] args) {
		    String str = "null";
		    try {
		      System.out.println(str.length()); // NullPointerException
		    } catch (NullPointerException e) {
		      System.out.println("NullPointerException: " + e.getMessage());
}
		  }
}
