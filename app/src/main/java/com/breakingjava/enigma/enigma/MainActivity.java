package com.breakingjava.enigma.enigma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.net.Socket;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Usen esta funcion para acceder al socket
        Socket cliente = SocketConnection.getSocket();
    }
}
