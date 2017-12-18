package thrace;
import java.io.*;
import java.security.*;
import javax.crypto.*;
import sun.misc.*;
public class LemonJuice {
    private BASE64Encoder april;
    private BASE64Decoder may;
    private Key card;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private FileInputStream fis;
    private FileOutputStream fos;
    private KeyGenerator forge;
    private Cipher lx;
    private String flux,lux;
    private byte[] pre,post;
    private SecureRandom r;
    public LemonJuice(){}
    public String Ink(String missive,int i1)throws Exception{
        try{
            ois=new ObjectInputStream(fis=new FileInputStream("SecretKey.ser"));
            card=(Key)ois.readObject();ois.close();}
        catch(FileNotFoundException fe){forge=KeyGenerator.getInstance("DES");
            forge.init(r=new SecureRandom());card=forge.generateKey();
            oos=new ObjectOutputStream(
            fos=new FileOutputStream("SecretKey.ser"));
            oos.writeObject(card);oos.close();}
        finally{lx=Cipher.getInstance("DES/ECB/PKCS5Padding");}
        if(i1==1){lx.init(Cipher.ENCRYPT_MODE,card);
            flux=missive;
            pre=flux.getBytes("UTF8");
            post=lx.doFinal(pre);
            april=new BASE64Encoder();
            lux=april.encode(post);
            System.out.println(lux);}
        else if(i1==2){
            lx.init(Cipher.DECRYPT_MODE,card);
            may=new BASE64Decoder();
            pre=may.decodeBuffer(missive);
            post=lx.doFinal(pre);
            lux=new String(post,"UTF8");
            System.out.println(lux);}
        return lux;}   
public static void main(String[] apple)throws Exception{
    //LemonJuice lime=new LemonJuice();
    //lime.Ink(lime.Ink("Input to be mangled",1),2);
}}