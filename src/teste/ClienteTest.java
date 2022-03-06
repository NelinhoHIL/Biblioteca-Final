package teste;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import codigos.Cliente;

private class ClienteTest {

	@Test
	void testCliente() {
		          
			       String esperado ="maria"; 
		           String resultado = cliente1(); 
			
				   assertTrue(resultado == esperado);
			
			}
			
			private String cliente1() {
		return null;
	}
	

   @Test
     void testCliente2() {
	          
		       String esperado =","; 
	           String resultado = cliente1(); 
		
			   assertTrue(resultado == esperado);
		
		}


    @Test
      void testCliente3() {
          
	       String esperado =","; 
           String resultado = cliente1(); 
	
		   assertTrue(resultado == esperado);
	
	}

    @Test
       void testCliente4() {
           
	       String esperado =","; 
           String resultado = cliente1(); 
	
		   assertTrue(resultado == esperado);
	
	}
	

    @Test
       void testCliente1() {
          
	       String esperado =","; 
           String resultado = cliente1(); 
	
		   assertTrue(resultado == esperado);
	
	}
}	