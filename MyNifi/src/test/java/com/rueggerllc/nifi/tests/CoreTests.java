package com.rueggerllc.nifi.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CoreTests {

	private static Logger logger = Logger.getLogger(CoreTests.class);
	
	
	
	@BeforeClass
	public static void setupClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@Before
	public void setupTest() throws Exception {
	}

	@After
	public void tearDownTest() throws Exception {
	}
	

	
	@Test
	@Ignore
	//  Nifi: (?s:^.*$)
	// Modes:
	// (?i) = case insensitive mode
	// (?s) = single line mode: . matches all characters, includine line breaks
	// (?m) = multi line mode
	public void testRegularExpressions() {
		try {
			String content = "NEW HEAD CONTENT";
			String newResponse = null;
			String response =
					"<html>" +
					"<head>here is Head Content</head>" +
					"<body>Body Content</body>" +
					"<html>";
			if (response.matches("(?s)(?i).*</(\\s)*head(\\s)*>.*") == true) {
				  newResponse = response.replaceFirst("(?s)(?i)</(\\s)*head(\\s)*>", "\n" + content  + "\n</head>");
			}
			logger.info("newResponse=\n" + newResponse);
			
		} catch (Exception e) {
			logger.error("Error", e);
		}
	}
	
	
	@Test
	// @Ignore
	public void testCaptureGroups() {
		try {
			logger.info("testCaptureGroups BEGIN");
			String regex1 = "ID=(\\w+)";
			String regex2 = "Hostname=(\\w+)";
			String regex3 = "Temperature[\\s]*=[\\s]*(\\d+)F";
			String regex4 = "Pressure=(\\d+\\.\\d+)";
			
			String data =
				"ID=1048" + "\n" +
				"Hostname=raspberrypi" + "\n" +
				"Temperature =   44F" + "\n" +
				"Pressure=1012.3" + "\n" +
				"Humidity=81.3";
				
			logger.info("regex1");
			Pattern p1 = Pattern.compile(regex1);
			Matcher m = p1.matcher(data);
			logger.info("GroupCount=" + m.groupCount());
			while (m.find()) {
				logger.info("GROUP=" + m.group());
				logger.info("GROUP0=" + m.group(0));
				logger.info("GROUP1=" + m.group(1));
			}
			
			logger.info("regex2");
			p1 = Pattern.compile(regex1);
			m = p1.matcher(data);
			logger.info("GroupCount=" + m.groupCount());
			while (m.find()) {
				logger.info("GROUP=" + m.group());
				logger.info("GROUP0=" + m.group(0));
				logger.info("GROUP1=" + m.group(1));
			}
			
			logger.info("regex3");
			p1 = Pattern.compile(regex1);
			m = p1.matcher(data);
			logger.info("GroupCount=" + m.groupCount());
			while (m.find()) {
				logger.info("GROUP=" + m.group());
				logger.info("GROUP0=" + m.group(0));
				logger.info("GROUP1=" + m.group(1));
			}

			logger.info("regex4");
			p1 = Pattern.compile(regex4);
			m = p1.matcher(data);
			logger.info("GroupCount=" + m.groupCount());
			while (m.find()) {
				logger.info("GROUP=" + m.group());
				logger.info("GROUP0=" + m.group(0));
				logger.info("GROUP1=" + m.group(1));
			}
			
		} catch (Exception e) {
			logger.error("ERROR", e);
		}
	}
	
	

	
	
}
