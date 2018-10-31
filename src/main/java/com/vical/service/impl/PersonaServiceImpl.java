package com.vical.service.impl;

import com.vical.service.IPersonaService;
import org.springframework.stereotype.Service;

/**
 * @author Vical on 12-10-17.
 */
@Service
public class PersonaServiceImpl implements IPersonaService {

    @Override
    public String getGreeting(String name) {
        return "Hola " + name;
    }
}
