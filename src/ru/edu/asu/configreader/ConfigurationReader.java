package ru.edu.asu.configreader;

import ru.edu.asu.configreader.domain.ConfigRealization;
import ru.edu.asu.configreader.domain.ConfigSpecifiedAbstraction;
import ru.edu.asu.configreader.factory.ConfigRealizationMaker;
import ru.edu.asu.configreader.factory.XMLBuildConfigurationMaker;
import ru.edu.asu.configreader.factory.YAMLBuildConfigurationMaker;
import ru.edu.asu.configreader.xml.XMLBuildConfigurationReader;
import ru.edu.asu.configreader.yaml.YamlBuildConfigurationReader;

public class ConfigurationReader {

	
	public static void main(String[] args) {
		XMLBuildConfigurationReader buildConfigurationReader = new XMLBuildConfigurationReader("build.xml");
		System.out.println("XML Build config: "+buildConfigurationReader.getProject());
		YamlBuildConfigurationReader yamlConfigReader = new YamlBuildConfigurationReader("build.yaml");
		System.out.println("Yaml build config: "+ yamlConfigReader.getBuildConfig());


		System.out.println("-------------Bridge Pattern-------------");
		ConfigSpecifiedAbstraction [] parsers = {
				new ConfigSpecifiedAbstraction(new XMLBuildConfigurationReader("build.xml")),
				new ConfigSpecifiedAbstraction(new YamlBuildConfigurationReader("build.yaml"))
		};

		for (ConfigSpecifiedAbstraction parser : parsers) {
			System.out.println(parser.getProject());
		}

		System.out.println("---------Factory Pattern-----------");

		ConfigRealizationMaker maker = new XMLBuildConfigurationMaker();
		ConfigRealization configRealization = maker.createConfig("build.xml");
		System.out.println(configRealization.getProject());

		ConfigRealizationMaker maker1 = new YAMLBuildConfigurationMaker();
		ConfigRealization configRealization1 = maker1.createConfig("build.yaml");
		System.out.println(configRealization1.getProject());



	}
}
