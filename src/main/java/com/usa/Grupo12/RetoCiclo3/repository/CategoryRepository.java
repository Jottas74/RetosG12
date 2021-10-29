
package com.usa.Grupo12.RetoCiclo3.repository;

import com.usa.Grupo12.RetoCiclo3.Interface.CategoryInterface;
import com.usa.Grupo12.RetoCiclo3.entity.Categoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class CategoryRepository {
    
    @Autowired
    private CategoryInterface crud;
    
    public List<Categoria> getAll(){
        return (List<Categoria>) crud.findAll();
    }
    public Optional<Categoria> getCategoria(int id){
        return crud.findById(id);
    }

    public Categoria save(Categoria categoria){
        return crud.save(categoria);
    }
    public void delete(Categoria categoria){
       crud.delete(categoria);
    }

   
    
}
