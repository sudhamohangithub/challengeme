package com.smp.challengeme.controller;

import com.smp.challengeme.service.QuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping(value = "/api/question")
public class QuestionController {

    private final QuestionService questionService;

    @PostMapping(path = "/")
    public ResponseEntity<String> uploadQuestion(final @RequestParam("file") MultipartFile uploadfile,
                                                 final RedirectAttributes redirectAttributes){
        if (uploadfile.isEmpty()) {
            return new ResponseEntity<>("please select a file!", HttpStatus.OK);
        }
        log.info("Received file {}", uploadfile.getOriginalFilename());
        questionService.uploadQuestion(uploadfile);
        return new ResponseEntity<>("file uploaded.", HttpStatus.OK);
    }
}
