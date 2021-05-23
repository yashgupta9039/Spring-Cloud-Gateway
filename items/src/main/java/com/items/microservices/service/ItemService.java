package com.items.microservices.service;

import com.items.microservices.entity.Item;

import java.util.List;

public interface ItemService {
    List<Item> retrieveItems();
}
