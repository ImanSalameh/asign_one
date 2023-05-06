package com.example.imansalameh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import model.IAnimal;
import model.Animals;
import model.IAnimal;
import model.Animalf;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private TextView textview;

private EditText editText;
    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        editText=findViewById(R.id.edittext);
        populateSpinner();

    }
    public void populateSpinner(){
        Animalf factory=new Animalf();
        IAnimal ob=factory.getModel();
        String[] animal=ob.getName();
        ArrayAdapter<String>adapter;
        adapter = new ArrayAdapter<>(this ,android.R.layout.simple_spinner_item,animal);
        spinner.setAdapter(adapter);
    }
    public void btnAnimalsOnClick(View view) {
        Animalf factory=new Animalf();
        IAnimal ob=factory.getModel();
        String item=" ";
        item=spinner.getSelectedItem().toString();
        List<Animals> animals = ob.getN(item);
        String str="";
        for (Animals a : animals) {

              if (editText.getText().toString().equals(a.getDescription())){
                Toast.makeText(this, "pravoo", Toast.LENGTH_LONG).show();
                  System.out.println(a.getDescription());
                  System.out.println(editText.getText().toString());          }
          else
           Toast.makeText(this,"try again", Toast.LENGTH_LONG).show();


}
}
}