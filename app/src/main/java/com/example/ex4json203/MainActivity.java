package com.example.ex4json203;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Entreprise e = getEntreprise();


    }

    public String loadJSonFromRaw(int resId){
        try {
            InputStream in = getResources().openRawResource(resId);
            byte[] data = new byte[0];
            data = new byte[in.available()];
            in.read(data);
            in.close();
            return new String(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public Entreprise getEntreprise(){
        Entreprise e = new Entreprise();
        try {
            String json = loadJSonFromRaw(R.raw.entreprise);
            JSONObject obj = new JSONObject(json);
            e.setRs(obj.getString("raisonSociale"));
            e.setAdresse(obj.getString("adresse"));
            JSONArray array = obj.getJSONArray("departement");
            for(int i=0;i<array.length();i++){
                JSONObject o = array.getJSONObject(i);
                Departement d = new Departement();
                d.setNom(o.getString("nom"));
                d.setNbEmp(o.getInt("nbEmploye"));
                e.getDeps().add(d);
            }

        } catch (JSONException ex) {
            ex.printStackTrace();
        }


        return e;
    }

}