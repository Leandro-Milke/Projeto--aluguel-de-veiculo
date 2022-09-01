package repository;

import model.Administrador;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AdministradorRepository {


    Map<Integer, Administrador> administradoresDB;

    public AdministradorRepository (){
        this.administradoresDB = new TreeMap<>();
    }

    public void salvar(Administrador administrador){
        this.administradoresDB.put(administrador.getId(), administrador);
    }

    public List<Administrador> buscarTodos(){
        return this.administradoresDB.values().stream().collect(Collectors.toList());
    }

    public Administrador buscarPorId(Integer id){
        return this.administradoresDB.get(id);
    }

    public void removePorId(Integer id){
        this.administradoresDB.remove(id);
    }


}
