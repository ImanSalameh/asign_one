package model;

import
        java.util.ArrayList;
import java.util.List;

public class Animaldata implements IAnimal {
    private ArrayList<Animals> animals = new ArrayList<>();

    public Animaldata() {
        animals.add(new Animals("nnnn","dog"));




    }
    @Override
    public String[] getName() {
        String []animal=new String[]{"dog","cat"};
        return animal;
    }

    @Override
    public List<Animals> getN(String nam) {
        ArrayList<Animals> data = new ArrayList<>();
        for (Animals a : animals) {
            if (a.getName().equals(nam)) {
                data.add(a);
            }
        }
        return data;
    }


}


