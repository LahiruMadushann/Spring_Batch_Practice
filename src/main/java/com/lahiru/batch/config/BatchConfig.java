package com.lahiru.batch.config;

import com.lahiru.batch.student.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BatchConfig {
    public FlatFileItemReader<Student> itemReader() {}
}
