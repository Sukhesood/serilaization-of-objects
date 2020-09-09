package hello;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try( FileInputStream FIO= new FileInputStream("vehicles.dat")){
			try( ObjectInputStream obj =new ObjectInputStream(FIO)){
				try {
					App v1=(App)obj.readObject();
					System.out.println("object= "+v1 );
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					App v2=(App)obj.readObject();
					System.out.println("object= "+v2 );
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
