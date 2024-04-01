package com.example.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductApi {

    //    @GetMapping
//    public String getProduct(@RequestParam String name,
//                             @RequestParam String surname,
//                             @RequestParam(required = false, defaultValue = "Franek") String pseudo) {
//        return "Hello with GET " + name + " " + surname + " " + pseudo;
//    }
//    @GetMapping("/{name}")
//    public String getProduct(@PathVariable String name){
//        return "Hello with GET " + name;
//    }
//    @GetMapping
//    public String getSomeProduct(@RequestHeader String name){
//        return "Hello with HEADERS " + name;
//    }
    @GetMapping
    public String getBodyProduct(@RequestBody String name) {
        return "Hello with Body: " + name;
    }

    @GetMapping("/{name}")
    public String getProducts(@PathVariable String name,
                              @RequestParam String surname) {
        return "Hello with Path & Param: " + name + " " + surname;
    }

    @PutMapping
    public String putProduct() {
        return "Hello with PUT";
    }

    @PostMapping
    public String postProduct() {
        return "Hello with POST";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "Hello with DELETE";
    }

    @GetMapping("/example")
    public ResponseEntity<String> getProducts() {
        return ResponseEntity.ok("Hello with HTTPStatus");
    }

}
