
package com.usa.Grupo12.RetoCiclo3.Interface;

import com.usa.Grupo12.RetoCiclo3.entity.Reservaciones;
import org.springframework.data.repository.CrudRepository;


public interface ReservationInterface extends CrudRepository<Reservaciones,Integer>{
    
}
