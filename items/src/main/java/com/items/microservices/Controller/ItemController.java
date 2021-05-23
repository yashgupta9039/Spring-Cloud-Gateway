package com.items.microservices.Controller;

import com.items.microservices.entity.Item;
import com.items.microservices.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private ItemService itemService;

    @Autowired
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Item>> getAllItems() {
        List<Item> list = itemService.retrieveItems();
        return new ResponseEntity<List<Item>>(list, HttpStatus.OK);
    }
}
