package controller;

import model.ModelAnimal;
import DAO.DAOAnimal;
import java.util.ArrayList;

/**
*
* @author igork
*/
public class ControllerAnimal {

    private DAOAnimal daoAnimal = new DAOAnimal();

    /**
    * grava Animal
    * @param pModelAnimal
    * @return int
    */
    public int salvarAnimalController(ModelAnimal pModelAnimal){
        return this.daoAnimal.salvarAnimalDAO(pModelAnimal);
    }

    /**
    * recupera Animal
    * @param pIdAnimal
    * @return ModelAnimal
    */
    public ModelAnimal getAnimalController(int pIdAnimal){
        return this.daoAnimal.getAnimalDAO(pIdAnimal);
    }

    /**
    * recupera uma lista deAnimal
    * @param pIdAnimal
    * @return ArrayList
    */
    public ArrayList<ModelAnimal> getListaAnimalController(){
        return this.daoAnimal.getListaAnimalDAO();
    }

    /**
    * atualiza Animal
    * @param pModelAnimal
    * @return boolean
    */
    public boolean atualizarAnimalController(ModelAnimal pModelAnimal){
        return this.daoAnimal.atualizarAnimalDAO(pModelAnimal);
    }

    /**
    * exclui Animal
    * @param pIdAnimal
    * @return boolean
    */
    public boolean excluirAnimalController(int pIdAnimal){
        return this.daoAnimal.excluirAnimalDAO(pIdAnimal);
    }
}