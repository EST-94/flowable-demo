package controller;

import model.Approval;
import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ArticleWorkflowService;

import java.util.List;

@RestController
public class ExampleController {
        @Autowired
        private ArticleWorkflowService service;

        @PostMapping("/submit")
        public void submit(@RequestBody Article article) {
            service.startProcess(article);
        }

        @GetMapping("/tasks")
        public List<Article> getTasks(@RequestParam String assignee) {
            return service.getTasks(assignee);
        }

        @PostMapping("/review")
        public void review(@RequestBody Approval approval) {
            service.submitReview(approval);
        }
}
