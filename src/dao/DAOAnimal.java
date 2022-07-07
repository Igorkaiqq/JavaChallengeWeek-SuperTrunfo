package DAO;

import model.ModelAnimal;
import connection.Conexao;
import java.util.ArrayList;
/**
*
* @author igork
*/
public class DAOAnimal extends Conexao {

    /**
    * grava Animal
    * @param pModelAnimal
    * @return int
    */
    public int salvarAnimalDAO(ModelAnimal pModelAnimal){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_animal ("
                    + "animalNome,"
                    + "animalForca,"
                    + "animalDefesa,"
                    + "animalVelocidade"
                + ") VALUES ("
                    + "'" + pModelAnimal.getAnimalNome() + "',"
                    + "'" + pModelAnimal.getAnimalForca() + "',"
                    + "'" + pModelAnimal.getAnimalDefesa() + "',"
                    + "'" + pModelAnimal.getAnimalVelocidade() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Animal
    * @param pIdAnimal
    * @return ModelAnimal
    */
    public ModelAnimal getAnimalDAO(int pIdAnimal){
        ModelAnimal modelAnimal = new ModelAnimal();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idAnimal,"
                    + "animalNome,"
                    + "animalForca,"
                    + "animalDefesa,"
                    + "animalVelocidade"
                 + " FROM"
                     + " tbl_animal"
                 + " WHERE"
                     + " idAnimal = '" + pIdAnimal + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelAnimal.setIdAnimal(this.getResultSet().getInt(1));
                modelAnimal.setAnimalNome(this.getResultSet().getString(2));
                modelAnimal.setAnimalForca(this.getResultSet().getDouble(3));
                modelAnimal.setAnimalDefesa(this.getResultSet().getDouble(4));
                modelAnimal.setAnimalVelocidade(this.getResultSet().getDouble(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelAnimal;
    }

    /**
    * recupera uma lista de Animal
        * @return ArrayList
    */
    public ArrayList<ModelAnimal> getListaAnimalDAO(){
        ArrayList<ModelAnimal> listamodelAnimal = new ArrayList();
        ModelAnimal modelAnimal = new ModelAnimal();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "idAnimal,"
                    + "animalNome,"
                    + "animalForca,"
                    + "animalDefesa,"
                    + "animalVelocidade"
                 + " FROM"
                     + " tbl_animal"
                + ";"
            );

            while(this.getResultSet().next()){
                modelAnimal = new ModelAnimal();
                modelAnimal.setIdAnimal(this.getResultSet().getInt(1));
                modelAnimal.setAnimalNome(this.getResultSet().getString(2));
                modelAnimal.setAnimalForca(this.getResultSet().getDouble(3));
                modelAnimal.setAnimalDefesa(this.getResultSet().getDouble(4));
                modelAnimal.setAnimalVelocidade(this.getResultSet().getDouble(5));
                listamodelAnimal.add(modelAnimal);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelAnimal;
    }

    /**
    * atualiza Animal
    * @param pModelAnimal
    * @return boolean
    */
    public boolean atualizarAnimalDAO(ModelAnimal pModelAnimal){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_animal SET "
                    + "idAnimal = '" + pModelAnimal.getIdAnimal() + "',"
                    + "animalNome = '" + pModelAnimal.getAnimalNome() + "',"
                    + "animalForca = '" + pModelAnimal.getAnimalForca() + "',"
                    + "animalDefesa = '" + pModelAnimal.getAnimalDefesa() + "',"
                    + "animalVelocidade = '" + pModelAnimal.getAnimalVelocidade() + "'"
                + " WHERE "
                    + "idAnimal = '" + pModelAnimal.getIdAnimal() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Animal
    * @param pIdAnimal
    * @return boolean
    */
    public boolean excluirAnimalDAO(int pIdAnimal){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_animal "
                + " WHERE "
                    + "idAnimal = '" + pIdAnimal + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}