package test_liste_partition;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import liste_partition.ListPartition;

public class TestPartition {
	
	final List<Integer> listTest=Arrays.asList(1,2,3,4,5);

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test()
	public void partitionByZero() {
		
		System.out.println("tester l'exception patition par 0 : excetion intecept�e");
		thrown.expect(RuntimeException.class);
		thrown.expectMessage("Ne peut partitionner une liste par 0 !");
		List<List<Integer>> result = ListPartition.partition(listTest, 0);
	}

	@Test()
	public void partitionNullList() {
		List<List<Integer>> result = ListPartition.partition(null, 3);
		System.out.println("patition avec une liste nulle : "+result);
		assertNotNull("le resultat ne peut pas �tre nul",result);
		assertEquals("la liste retourn�e doit �tre vide", result.size(), 0);
	}

	@Test
	public void testPartition() {
		
		List<List<Integer>> result = ListPartition.partition(listTest, 1);
		System.out.println("patition par 1 : "+result);
		assertNotNull("le resultat ne peut pas �tre nul",result);
		assertEquals("la taille de la liste retourn�e doit �tre 5 ", result.size(), 5);
		
		result = ListPartition.partition(listTest, 2);
		System.out.println("patition par 2 : "+result);
		assertNotNull("le resultat ne peut pas �tre nul",result);
		assertEquals("la taille de la liste retourn�e doit �tre 3 ", result.size(), 3);
		
		result = ListPartition.partition(listTest, 3);
		System.out.println("patition par 3 : "+result);
		assertNotNull("le resultat ne peut pas �tre nul",result);
		assertEquals("la taille de la liste retourn�e doit �tre 3 ", result.size(), 2);
	
	}

}