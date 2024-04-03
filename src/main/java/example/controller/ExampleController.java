package example.controller;

import io.swagger.v3.oas.annotations.Operation;
import example.model.Approval;
import example.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import example.service.ArticleWorkflowService;

import java.util.List;

@RestController
public class ExampleController {
        @Autowired
        private ArticleWorkflowService service;

        @PostMapping("/submit")
        @Operation(summary = "submit")
        public void submit(@RequestBody Article article) {
            service.startProcess(article);
        }

        @GetMapping("/tasks")
        @Operation(summary = "getTasks")
        public List<Article> getTasks(@RequestParam String assignee) {
            return service.getTasks(assignee);
        }

        @PostMapping("/review")
        @Operation(summary = "review")
        public void review(@RequestBody Approval approval) {
            service.submitReview(approval);
        }
}
