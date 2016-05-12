package ru.edu.asu.configreader.factory;


import ru.edu.asu.configreader.domain.ConfigRealization;
import ru.edu.asu.configreader.yaml.YamlBuildConfigurationReader;

public class YAMLBuildConfigurationMaker implements ConfigRealizationMaker{
    @Override
    public ConfigRealization createConfig(String filename) {
        return new YamlBuildConfigurationReader(filename);
    }
}
