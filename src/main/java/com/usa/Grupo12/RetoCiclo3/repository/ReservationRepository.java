
package com.usa.Grupo12.RetoCiclo3.repository;

import com.usa.Grupo12.RetoCiclo3.Interface.ReservationInterface;
import com.usa.Grupo12.RetoCiclo3.entity.Reservaciones;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ReservationRepository {
    
    @Autowired
    private ReservationInterface crud4;

    public List<Reservaciones> getAll(){
        return (List<Reservaciones>) crud4.findAll();
    }
    public Optional<Reservaciones> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservaciones save(Reservaciones reservation){
        return crud4.save(reservation);
    }
    public void delete(Reservaciones reservation){
        crud4.delete(reservation);
    }
    
}
