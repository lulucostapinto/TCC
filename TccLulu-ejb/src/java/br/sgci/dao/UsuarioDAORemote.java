<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sgci.dao;

import br.sgci.bean.Usuario;
import javax.ejb.Remote;

/**
 *
 * @author Lulu
 */
@Remote
public interface UsuarioDAORemote {
    Usuario findByLogin(String login);
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sgci.dao;

import br.sgci.bean.Usuario;
import javax.ejb.Remote;

/**
 *
 * @author Lulu
 */
@Remote
public interface UsuarioDAORemote {
    Usuario findByLogin(String login);
}
>>>>>>> 5c0d60751e7e13bd1ac341a9e10c5b8e86c7b7ae
