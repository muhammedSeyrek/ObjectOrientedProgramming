
package server;

import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server {
    static ServerSocket serverSocket ;
    static Socket socket;

    static DataInputStream dataInputStream;

    static String added = "";
    static DataOutputStream dataOutputStream;
    public static void main(String[] args) throws IOException {

        JFrame f = new JFrame("Server");
        
        JLabel l = new JLabel("Dinlenecek Port Numarası:");
        l.setBounds(10, 20, 170, 20);
        
        JTextField t = new JTextField();

        t.setBounds(170, 20, 70, 20);
        
        JButton btn = new JButton("Baglan");
        btn.setBounds(250, 20, 90, 20);

        
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
        f.add(t);
        f.add(btn);
        f.add(a);
        f.add(send);
        f.add(btnSend);
        f.setSize(370, 330);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SimpleDateFormat simple = new SimpleDateFormat("d/M/y h:m:s");
        Date time = new Date();


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                        Thread thread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                a.setEnabled(true);
                                a.setEnabled(true);
                                send.setEnabled(true);
                                btnSend.setEnabled(true);
                                try {
                                    serverSocket = new ServerSocket(Integer.parseInt(t.getText()));
                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                }
                                System.out.println("Baglanti kuruluyor..");

                                try {
                                    socket = serverSocket.accept();
                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                }

                                System.out.println("Baglanti saglandi !");

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
                                    } catch (IOException e) {
                                        throw new RuntimeException(e);
                                    }


                                    added += simple.format(time) + " - ";
                                    added += "Client -> " + msgInput + "\n";
                                    File fileK = new File("Log.txt");
                                    try {
                                        fileK.createNewFile();
                                    } catch (IOException ex) {
                                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    FileWriter fileRKU;
                                    try {
                                        fileRKU = new FileWriter("Log.txt");
                                        try (BufferedWriter bufRKU = new BufferedWriter(fileRKU)) {
                                            bufRKU.write(added);
                                        }
                                    } catch (IOException ex) {
                                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    
                                    a.setText(a.getText() + "\n"+"Client ->" + msgInput);
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
                    dataOutputStream.writeUTF( msgOut);
                    send.setText("");
                    added += simple.format(time) + " - ";
                    added += "Server -> " + Cryption.decryption(msgOut) + "\n";
                    File fileK = new File("Log.txt");
                    try {
                        fileK.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    FileWriter fileRKU;
                    try {
                        fileRKU = new FileWriter("Log.txt");
                        try (BufferedWriter bufRKU = new BufferedWriter(fileRKU)) {
                            bufRKU.write(added);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    a.setText(a.getText() + "\n" + "Server-> "+ Cryption.decryption(msgOut));
                }catch (IOException ex){

                }
            }
        });
        
    }

}
