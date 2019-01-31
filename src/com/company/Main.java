package com.company;

public class Main {

    public static void main(String[] args) {
	    String java = "Java is a general-purpose computer-programming language" +
                " that is concurrent, class-based, object-oriented, and" +
                " specifically designed to have as few implementation" +
                " dependencies as possible. It is intended to let application" +
                " developers write once, run anywhere , meaning that compiled" +
                " Java code can run on all platforms that support Java without" +
                " the need for recompilation. Java applications are typically" +
                " compiled to bytecode that can run on any Java virtual machine" +
                " (JVM) regardless of computer architecture. As of 2016, Java" +
                " is one of the most popular programming languages in use," +
                " particularly for client-server web applications, with a" +
                " reported 9 million developers. Java was originally developed" +
                " by James Gosling at Sun Microsystems (which has since been acquired" +
                " by Oracle Corporation) and released in 1995 as a core component" +
                " of Sun Microsystems' Java platform";
	    String[] words = java.split(" ");
	    StringBuffer javaBuffer = new StringBuffer();
	    for (int i = 0; i < words.length; i++){
	        javaBuffer.append(words[i] + " ");
	        if (javaBuffer.length() > 30){
	            javaBuffer.deleteCharAt(javaBuffer.length() - 1);
	            javaBuffer.delete(javaBuffer.lastIndexOf(" "),
                        javaBuffer.length());
	            int x = javaBuffer.length();
	            for (int j = 0; j < 30 - x; j++){
	                javaBuffer.insert(javaBuffer.lastIndexOf(" "), " ");
                }
                System.out.println(javaBuffer);
	            javaBuffer.delete(0, javaBuffer.length());
            }
        }
    }
}
