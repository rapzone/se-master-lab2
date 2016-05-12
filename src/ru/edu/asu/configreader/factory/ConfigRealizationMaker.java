package ru.edu.asu.configreader.factory;


import ru.edu.asu.configreader.domain.ConfigRealization;

public interface ConfigRealizationMaker {

    ConfigRealization createConfig(String filename);
}
