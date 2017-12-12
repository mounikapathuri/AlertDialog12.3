package com.android.mounika.alertdialog123;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1= (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog();
            }
        });
    }

    public void alertDialog() {
        final AlertDialog.Builder dialog = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.ThemeOverlay_AppCompat_Dark_ActionBar));
            LayoutInflater inflater = this.getLayoutInflater();
            final View dialogview = inflater.inflate(R.layout.customdialog, null);
            dialog.setView(dialogview);
        dialog.setIcon(R.drawable.complete);
        dialog.setTitle("CONFIRM DELETE..");
        dialog.setMessage("Do u Want To Close?");
            final Button button= (Button) dialogview.findViewById(R.id.button);
            final Button button2= (Button) dialogview.findViewById(R.id.button2);
        final AlertDialog dialog1 = dialog.create();
            dialog.show();

           button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
                Toast.makeText(MainActivity.this,"clicked",Toast.LENGTH_LONG).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
            }
        });

        }
        }


