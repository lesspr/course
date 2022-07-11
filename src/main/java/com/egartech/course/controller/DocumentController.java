package com.egartech.course.controller;

import com.egartech.course.model.Document;
import com.egartech.course.service.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class DocumentController {
    private final DocumentService documentService;

    @GetMapping("/")
    public String documents(Model model) {
        model.addAttribute("documents", documentService.listDocuments());
        return "documents";
    }

    @GetMapping("/document/search")
    public String searchDocuments(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("documents", documentService.listSearchDocuments(title));
        return "documents";
    }

    @GetMapping("/document/{id}")
    public String documentInfo(@PathVariable Long id, Model model) {
        model.addAttribute("document", documentService.getDocumentById(id));
        return "document-info";
    }

    @PostMapping("/document/create")
    public String createDocument(Document document) {
        documentService.saveDocument(document);
        return "redirect:/";
    }

    @PostMapping("/document/delete/{id}")
    public String deleteDocument(@PathVariable Long id) {
        documentService.deleteDocument(id);
        return "redirect:/";
    }

}
