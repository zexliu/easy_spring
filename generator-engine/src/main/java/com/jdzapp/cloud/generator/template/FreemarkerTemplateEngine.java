package com.jdzapp.cloud.generator.template;

import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@Component
@Slf4j
public class FreemarkerTemplateEngine {

    @Autowired
    private Configuration configuration;

    @Value("${spring.freemarker.suffix}")
    private String suffix;

    public void writer(Map<String, Object> objectMap, String templateName, String outputFile) throws Exception {
        Template template = configuration.getTemplate(templateName+ suffix);
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            template.process(objectMap, new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8));
        }
        log.debug("模板:" + templateName + ";  文件:" + outputFile);
    }

}
