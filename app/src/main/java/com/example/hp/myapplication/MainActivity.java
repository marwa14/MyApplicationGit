package com.example.hp.myapplication;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
/*commit number 2 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String line = null;
        String json = "";
        int nRead = 0;
        byte[] buffer = new byte[1000];
        AssetManager assetManager = getResources().getAssets();
        InputStream inputStream = null;
/*fichier exemple*/
        try {
            inputStream = assetManager.open("test.txt");
            while ((nRead = inputStream.read(buffer)) != -1) {
                // Convert to String so we can display it.
                // Of course you wouldn't want to do this with
                // a 'real' binary file.
                System.out.println(new String(buffer));
                json += nRead;
            }
            System.out.println("json est"+json);
           /* BufferedReader br=new BufferedReader(new
                    InputStreamReader(getAssets().open("test.txt")));
            while ((line =br.readLine())!= null)
            {
                json+= line;
                System.out.println("line"+line);
            }
            System.out.println("json est"+json);
            br.close();*/


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error");
        }
    }
}
