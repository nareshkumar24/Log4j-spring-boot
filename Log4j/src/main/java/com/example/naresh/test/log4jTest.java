package com.example.naresh.test;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class log4jTest {

	private static Logger log = Logger.getLogger(log4jTest.class);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Layout Layout = new PatternLayout(" %p  %d %c %M %m %n");

		// Appender ap = new ConsoleAppender(Layout);
		Appender ap = new FileAppender(Layout, "C:\\Users\\Kuruba Naresh Kumar\\Documents\\dumps\\log\\data.log");

		//FileAppender:
		//------------
		// An appender is responsible for defining where log messages should be output
		// or written. Specifically, the FileAppender is used to write log messages to a
		// file on the filesystem. Here's a brief explanation of its use:

		log.addAppender(ap);

		log.info("This is info");

		log.debug("this is debug");

		log.warn("this is warm");

		log.error("this is error");

		log.fatal("'this is fetal");

		// %p: This placeholder is used to display the log level (e.g., DEBUG, INFO,
		// WARN, ERROR) of the log message.
		// It will be replaced with the appropriate log level when a log message is
		// generated.

		// %d: This placeholder is used to display the date and time when the log
		// message was generated. You can specify a date and time format using a
		// pattern, like "%d{yyyy-MM-dd HH:mm:ss}", to control how the date and time are
		// formatted in the log entry.

		// %c: This placeholder is used to display the logger's name (usually the class
		// name) that generated the log message. It helps you identify the source of the
		// log entry.

		// %M: This placeholder is used to display the method name where the log message
		// was generated. It can be helpful for debugging purposes to identify which
		// method triggered the log entry.

		// %m: This placeholder is used to display the actual log message provided by
		// the application. It represents the content of the log message itself.

		// %n: This placeholder is used to insert a newline character, which separates
		// log entries. It ensures that each log entry appears on a new line in the log
		// file.
	}

}
