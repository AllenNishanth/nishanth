package org.baseclass.nish;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportsExecution {

	public static void reportsCreation(String jsonFile) {
		File file = new File("C:\\Users\\andre\\eclipse-workspace.New\\Nishanth\\src\\test\\resources\\Reports");
		Configuration configuration = new Configuration(file, "Adactin Web Automation");
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Version", "Windows 11");
		configuration.addClassifications("Sprint N0 5.1", "Build");
		configuration.addClassifications("Build", "Dev");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
	}

}
