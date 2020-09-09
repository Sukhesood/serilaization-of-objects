package hello;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject{

	public static void main(String[] args) {
		App vehicle= new App("truck", 23);
		App vehicle1= new App("car",34);
		System.out.println(vehicle);
		System.out.println(vehicle1);
		try(FileOutputStream fos= new FileOutputStream("vehicles.dat")){
			try(ObjectOutputStream obj= new ObjectOutputStream(fos)){
				obj.writeObject(vehicle);
				obj.writeObject(vehicle1);
				System.out.println("object written on to the file");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("file is not found");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IO exception");
		}
	}

}
