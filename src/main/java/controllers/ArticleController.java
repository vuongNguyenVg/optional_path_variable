package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ArticleController {
   @GetMapping(value = {"/article", "/article/{id}"})
   public String getArticle(@PathVariable (name = "id") Optional<Integer> optionalArticleId){
      if(optionalArticleId.isPresent()){
         System.out.println(optionalArticleId.get());
         return "detail";
      }
      else {
         return "home";
      }
   }
}
