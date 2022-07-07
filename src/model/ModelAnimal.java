package model;
/**
*
* @author igork
*/
public class ModelAnimal {

    private int idAnimal;
    private String animalNome;
    private double animalForca;
    private double animalDefesa;
    private double animalVelocidade;

    /**
    * Construtor
    */
    public ModelAnimal(){}

    /**
    * seta o valor de idAnimal
    * @param pIdAnimal
    */
    public void setIdAnimal(int pIdAnimal){
        this.idAnimal = pIdAnimal;
    }
    /**
    * @return pk_idAnimal
    */
    public int getIdAnimal(){
        return this.idAnimal;
    }

    /**
    * seta o valor de animalNome
    * @param pAnimalNome
    */
    public void setAnimalNome(String pAnimalNome){
        this.animalNome = pAnimalNome;
    }
    /**
    * @return animalNome
    */
    public String getAnimalNome(){
        return this.animalNome;
    }

    /**
    * seta o valor de animalForca
    * @param pAnimalForca
    */
    public void setAnimalForca(double pAnimalForca){
        this.animalForca = pAnimalForca;
    }
    /**
    * @return animalForca
    */
    public double getAnimalForca(){
        return this.animalForca;
    }

    /**
    * seta o valor de animalDefesa
    * @param pAnimalDefesa
    */
    public void setAnimalDefesa(double pAnimalDefesa){
        this.animalDefesa = pAnimalDefesa;
    }
    /**
    * @return animalDefesa
    */
    public double getAnimalDefesa(){
        return this.animalDefesa;
    }

    /**
    * seta o valor de animalVelocidade
    * @param pAnimalVelocidade
    */
    public void setAnimalVelocidade(double pAnimalVelocidade){
        this.animalVelocidade = pAnimalVelocidade;
    }
    /**
    * @return animalVelocidade
    */
    public double getAnimalVelocidade(){
        return this.animalVelocidade;
    }

    @Override
    public String toString(){
        return "ModelAnimal {" + "::idAnimal = " + this.idAnimal + "::animalNome = " + this.animalNome + "::animalForca = " + this.animalForca + "::animalDefesa = " + this.animalDefesa + "::animalVelocidade = " + this.animalVelocidade +  "}";
    }
}