package br.com.inmetrics.teste.support;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class YamlHelper {
	ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	File file = new File(classLoader.getResource("test_data.yaml").getFile());
	ObjectMapper om = new ObjectMapper(new YAMLFactory());
	
}