package com.vical.rest.impl;

import com.vical.rest.GreetingRest;
import com.vical.domain.Persona;
import com.vical.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author vical on 24-07-17.
 */

@Component
public class GreetingRestImpl implements GreetingRest {

    @Autowired
    private IPersonaService personaService;

    @Override
    public Persona getGreeting() {

        Persona persona = new Persona();
        persona.setName(this.personaService.getGreeting("vical"));

        return persona;
    }
}
