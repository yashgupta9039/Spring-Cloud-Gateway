package com.items.microservices.service;

import com.items.microservices.entity.Item;
import com.items.microservices.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> retrieveItems() {
        return (List<Item>) itemRepository.findAll();
    }
}
