
package com.usa.Grupo12.RetoCiclo3.repository;

import com.usa.Grupo12.RetoCiclo3.Interface.AudienceInterface;
import com.usa.Grupo12.RetoCiclo3.entity.Audience;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class AudienceRepository {
    
     @Autowired
    private AudienceInterface crud;

    public List<Audience> getAll(){
        return (List<Audience>) crud.findAll();
    }

    public Optional<Audience> getAudience(int id){
        return crud.findById(id);
    }

    public Audience save(Audience audience){
        return crud.save(audience);
    }
    public void delete(Audience audience){
        crud.delete(audience);
    }
    
    
}
