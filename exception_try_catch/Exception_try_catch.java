package exception_try_catch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exception_try_catch {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = br.readLine();//IOException con Buffered BufferedReader, surround setence with try catch
            int a = 5/0;//ArithmeticException
            
        } catch (IOException ex) {
            Logger.getLogger(Exception_try_catch.class.getName()).log(Level.SEVERE, null, ex);//información de depuración
        } catch (ArithmeticException ex2) {
            System.out.println("¡¡No se puede hacer una división entre 0!!");
        }
	}

}
