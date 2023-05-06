package model;

import java.util.ArrayList;
import java.util.List;

public class Animaldata implements IAnimal {
    private ArrayList<Animals> animals = new ArrayList<>();

    public Animaldata() {
        animals.add(new Animals("domesticated","cow"));
        animals.add(new Animals("domesticated","cat"));
        animals.add(new Animals("domesticated","duck"));
        animals.add(new Animals("predatory","lion"));
        animals.add(new Animals("predatory","tiger"));
        animals.add(new Animals("predatory","fox"));

    }
    @Override
    public String[] getName() {
        String []animal=new String[]{"cow","cat","duck","lion","tiger","fox"};
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


