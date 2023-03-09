/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.service;

import com.entity.Pais;
import com.repository.PaisRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Arturo
 */
@Service
public class PaisService implements IPaisService{
    @Autowired
    private PaisRepository paisRepository;
    
    @Override
    public List<Pais> listCountry(){
        return (List<Pais>)paisRepository.findAll();
    }
}
