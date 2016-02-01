package com.iyeedo.test;

import static java.lang.System.out;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Parameter;

public class PrintClass {
	/**
	 * @param str
	 *            ��ӡ�ַ���
	 * */
	public static void Print(String str) {
		out.println("printStr-->" + str);
	}

	/**
	 * ��־����
	 * @param strings
	 *            �����ӡ�ַ���
	 * */
	public static void PrintAll(String... strings) {
		StackTraceElement te = ((new Exception()).getStackTrace())[1];

		out.println("printAllStr-->");
		out.println("call by:" + te.getClassName() + "|**|" + te.getMethodName() + "|**|" + te.getLineNumber());
		int size = strings.length;
		int index = 0;
		for (String str : strings) {
			out.print(str);
			if (index < size - 1)
				out.print("<-->");
			index++;
		}
		out.println();
	}
}
