package com.smp.challengeme.service;

import com.smp.challengeme.model.entity.QuestionSet;
import com.smp.challengeme.repository.QuestionSetRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class QuestionService {
        private final QuestionSetRepository questionSetRepository;

        public void uploadQuestion(MultipartFile file) {

            QuestionSet questionSet = create(file);
        }

        private QuestionSet create(MultipartFile file) {
            try(InputStream inputStream = file.getInputStream()){
                QuestionSet questionSet = QuestionSet.builder()
                        .file(IOUtils.toByteArray(inputStream))
                        .build();
                questionSetRepository.save(questionSet);
                return null;
            } catch (IOException e) {
                log.error("Error while uploading question file.");
                e.printStackTrace();
            }
            return null;
        }

    }
