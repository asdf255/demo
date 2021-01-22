package com.example.demo.web.controller;

import com.example.demo.domain.service.PurchaseRequest;
import com.example.demo.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import java.nio.file.Path;
import java.util.Map;

/**
 * javaドック
 * コントロールクラス
 *
 *  /**でenter押すとぶろっくがでる
 * アノテーション
 */
@RestController
public class HelloController {

    @Autowired
    private PurchaseService purchaseService;

//    @Autowired
//    private PurchaseRequest request;

    @GetMapping(path = "/hello")
    public HelloObject hello(){
        HelloObject helloObject = new HelloObject() ;
        helloObject.setName("hagio");
        helloObject.setMessage("Hello");
        return helloObject;
    }

    @PostMapping(path = "hello2")
    public HelloObject hello2(@RequestBody Map<String,String> body){ //key valueがstringってことを明示
        HelloObject helloObject = new HelloObject() ;
        helloObject.setName(body.get("name"));
        helloObject.setMessage(body.get("message") + "!!!!");

        return helloObject;
    }

    @GetMapping("purchase")
    public String purchase(){
        PurchaseRequest request = new PurchaseRequest();
        request.setCoTransactionId("1234567");
        request.setUserId("yu");
        request.setItemName("manga");
        request.setAmount("432");

        return purchaseService.purchase(request);
    }
}



class HelloObject{
    private String name;
    private  String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}