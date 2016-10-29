package com.breakingjava.enigma.enigma;

import java.net.Socket;

/**
 * Created by burela on 29/10/16.
 */

public class SocketConnection {
        private static Socket socket;
        public static synchronized Socket getSocket(){
            return socket;
        }
        public static synchronized void setSocket(Socket socket){
            SocketConnection.socket = socket;
        }
}
