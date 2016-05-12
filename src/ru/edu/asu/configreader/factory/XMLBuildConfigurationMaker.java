package ru.edu.asu.configreader.factory;


import ru.edu.asu.configreader.domain.ConfigRealization;
import ru.edu.asu.configreader.xml.XMLBuildConfigurationReader;

public class XMLBuildConfigurationMaker implements ConfigRealizationMaker{


    @Override
    public ConfigRealization createConfig(String filename) {
        return new XMLBuildConfigurationReader(filename);
    }
}
