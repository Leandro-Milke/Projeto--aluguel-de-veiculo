package repository;

import model.Vendedor;
import model.Vendedor;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class VendedorRepository {


    Map<Integer, Vendedor> vendedoresDB;

    public VendedorRepository (){
        this.vendedoresDB = new TreeMap<>();
    }

    public void salvar(Vendedor vendedor){
        this.vendedoresDB.put(vendedor.getId(), vendedor);
    }

    public List<Vendedor> buscarTodos(){
        return this.vendedoresDB.values().stream().collect(Collectors.toList());
    }

    public Vendedor buscarPorId(Integer id){
        return this.vendedoresDB.get(id);
    }

    public void removePorId(Integer id){
        this.vendedoresDB.remove(id);
    }
    
}
