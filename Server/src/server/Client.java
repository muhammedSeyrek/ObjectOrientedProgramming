
package server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client {
    static Socket socket;
    static DataInputStream dataInputStream;
    static DataOutputStream dataOutputStream;


    public static void main(String[] args) throws IOException {
        JFrame f = new JFrame("Client");
        
        JLabel l = new JLabel("Server IP:");
        l.setBounds(10, 20, 70, 20);
        
        JTextField serverIP = new JTextField();
        serverIP.setBounds(80, 20, 60, 20);
        
        JLabel lPort = new JLabel("Port:");
        lPort.setBounds(150, 20, 40, 20);
        
        JTextField port = new JTextField();
        port.setBounds(180, 20, 60, 20);
        
        JButton btn = new JButton("Baglan");
        btn.setBounds(260, 20, 80, 20);
        
        JTextArea a = new JTextArea();
        a.setBounds(10, 60, 330, 150);
        a.setEnabled(false);
        
        JTextField send = new JTextField();
        send.setBounds(10, 220, 220, 60);
        send.setEnabled(false);

        JButton btnSend = new JButton("Gönder");
        btnSend.setBounds(240, 220, 100, 60);
        btnSend.setEnabled(false);

        f.add(l);
        f.add(serverIP);
        f.add(lPort);
        f.add(port);
        f.add(btn);
        f.add(a);
        f.add(send);
        f.add(btnSend);
        f.setSize(370, 330);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                socket = new Socket(serverIP.getText(),Integer.parseInt(port.getText()));
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            a.setEnabled(true);
                            send.setEnabled(true);
                            btnSend.setEnabled(true);
                            try {
                                dataInputStream = new DataInputStream(socket.getInputStream());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            try {
                                dataOutputStream = new DataOutputStream(socket.getOutputStream());
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                            String msgInput = " ";
                            while (!msgInput.equals("exit")){
                                try {
                                    msgInput = Cryption.decryption(dataInputStream.readUTF());

                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                }
                                a.setText(a.getText() + "\n"+"Server -> " + msgInput);
                            }
                        }
                    });
                    thread.start();



            }
        });
        
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String msgOut = Cryption.encryption(send.getText());
                    System.out.println("Şifreli mesaj : " + msgOut);
                    dataOutputStream.writeUTF(msgOut);
                    send.setText("");
                    a.setText(a.getText() + "\n" +"Client -> "+ Cryption.decryption(msgOut));
                }catch (IOException ex){

                }
            }
        });

    }
}
