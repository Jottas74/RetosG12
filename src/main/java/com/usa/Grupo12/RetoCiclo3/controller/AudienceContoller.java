
package com.usa.Grupo12.RetoCiclo3.controller;

import com.usa.Grupo12.RetoCiclo3.entity.Audience;
import com.usa.Grupo12.RetoCiclo3.service.AudienceService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/Audience")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class AudienceContoller {
    
    @Autowired
    private AudienceService service;
    @GetMapping("/all")
    public List<Audience> getAudiences(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Audience> getAudience(@PathVariable("id") int audienceId) {
        return service.getAudience(audienceId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Audience save(@RequestBody Audience audience) {
        return service.save(audience);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Audience update(@RequestBody Audience audience) {
        return service.update(audience);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int audienceId) {
        return service.deleteAudience(audienceId);
    } 
    
}
