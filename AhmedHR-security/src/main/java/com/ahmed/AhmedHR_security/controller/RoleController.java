package com.ahmed.AhmedHR_security.controller;

import com.ahmed.AhmedHR_security.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/role")
@RequiredArgsConstructor
//@CrossOrigin(value = {"http://localhost:4200", "https://google.com"})
public class RoleController {
    private final RoleService roleService;

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {

        return ResponseEntity.ok(roleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {

        return ResponseEntity.ok(roleService.findById(id));
    }
}
