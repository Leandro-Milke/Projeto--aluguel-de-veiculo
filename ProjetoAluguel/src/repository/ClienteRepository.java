package repository;

import model.Cliente;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ClienteRepository {

    Map<Integer, Cliente> clientesDB;

    public ClienteRepository (){
        this.clientesDB = new TreeMap<>();
    }

    public void salvar(Cliente cliente){
        this.clientesDB.put(cliente.getId(), cliente);
    }

    public List<Cliente> buscarTodos(){
        return this.clientesDB.values().stream().collect(Collectors.toList());
    }

    public Cliente buscarPorId(Integer id){
        return this.clientesDB.get(id);
    }

    public void removePorId(Integer id){
        this.clientesDB.remove(id);
    }


}
