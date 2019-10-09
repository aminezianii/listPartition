package liste_partition;
import java.util.ArrayList;
import java.util.List;

public class ListPartition {


	public static List<List<Integer>> partition(List<Integer> liste, int taille) throws RuntimeException {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if (liste == null || liste.size() == 0) {
			return result;
		}
		if (taille == 0) {
			throw new RuntimeException("Ne peut partitionner une liste par 0 !");
		}

		List<Integer> subList = new ArrayList<>();

		for (int i = 0; i < liste.size(); i++) {
			subList.add(liste.get(i));
			
			if (subList.size()==taille) {
				result.add(subList);
				subList = new ArrayList<>();	
			}
		}
		if(subList.size()!=0)
			result.add(subList);
		return result;
	}

}
