<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sgci.dao;

import br.sgci.bean.Curriculo;
import javax.ejb.Remote;

/**
 *
 * @author Lulu
 */
@Remote
public interface CurriculoDAORemote {
    
     public boolean gravar(Curriculo curriculo);

    public Curriculo selecionar(int id);

    public boolean remover(Curriculo curriculo);

    public java.util.List<Curriculo> listar();
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.sgci.dao;

import br.sgci.bean.Curriculo;
import javax.ejb.Remote;

/**
 *
 * @author Lulu
 */
@Remote
public interface CurriculoDAORemote {
    
     public boolean gravar(Curriculo curriculo);

    public Curriculo selecionar(int id);

    public boolean remover(Curriculo curriculo);

    public java.util.List<Curriculo> listar();
    
}
>>>>>>> 5c0d60751e7e13bd1ac341a9e10c5b8e86c7b7ae
