package lk.nibm.ead2.web.controller;

import lk.nibm.ead2.web.model.Basket;
import lk.nibm.ead2.web.model.BasketItemDTO;
import lk.nibm.ead2.web.service.IBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/baskets")
public class BasketRestController {

    @Autowired
    private IBasketService basketService;

    @PostMapping("/basket")
    public ResponseEntity<Basket> createBasket(@RequestBody List<BasketItemDTO> cartItems) {
        try {
            Basket createdBasket = basketService.saveAll(cartItems);
            return new ResponseEntity<>(createdBasket, HttpStatus.CREATED);
        } catch (Exception e) {
            // Log the exception or handle it appropriately
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBasket(@PathVariable Long id) {
        try {
            boolean deleted = basketService.delete(id);
            if (deleted) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            // Log the exception or handle it appropriately
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
