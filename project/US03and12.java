import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class US03and12 {

	public static boolean US03(List<Individual> individualList) {
		boolean res = true;
		//System.out.println(individualList);
		List<Individual> deathErrorList = new ArrayList<>();
		for(Individual person: individualList) {
			if(!person.getDeath().equals("NA")) {
				String birthStr = person.getBirthday();
				String deathStr = person.getDeath();
				boolean re=HelperFuctions.isDateValid(deathStr,birthStr);
				if(re==false) {
					deathErrorList.add(person);
				}
			}
		}
		if(deathErrorList.isEmpty()) {
			//System.out.println("No error");
			res = true;
		}else {
			//System.out.println("Error List");
			for (Individual person : deathErrorList) {
				System.out.println("ERROR: INDIVIDUAL: US03: "+person.getLine()+": "+person.getId()+": Died "+person.getDeath()+" before born "+person.getBirthday());				 
				//System.out.println("ID:"+person.getId()+"	| Name:"+person.getName()+"	| Birth:"+person.getBirthday()+"	| Death:"+person.getDeath());
			}
//			System.out.println();
			res = false;
		}
		return res;
	}
	
//	static List<Family> familyList;
//	List<String> dataGet;
//	static Map<String, Individual> individualMap;
	public static boolean US12(Family f, Map<String, Individual> individualMap) {
		boolean res = true;
		String husbandID = f.getHusbandID();
    	String wifeID = f.getWifeID();
    	Individual husband = individualMap.get(husbandID);
    	Individual wife = individualMap.get(wifeID);
        List<Individual> childList = f.getChildren();
        
    	for (Individual c : childList) {
        	String birth = c.getBirthday();
        		if (HelperFuctions.yearsBetween(husband.getBirthday(), birth) >= 80) {
        			res = false;
					System.out.println("ERROR: FAMILY: US12: "+f.getLine()+": "+f.getID()+
							" : Husband's ("+husband.getId()+ ") birth "+husband.getBirthday()+
							" is more then 80 years old at the child ("+c.getId()+") birth "
							+c.getBirthday());
        		}
        		if (HelperFuctions.yearsBetween(wife.getBirthday(), birth) >= 60) {
        			res = false;
					System.out.println("ERROR: FAMILY: US12: "+f.getLine()+": "+f.getID()+
							" : Wife's ("+wife.getId()+ ") birth "+wife.getBirthday()+
							" is more then 60 years old at the child ("+c.getId()+") birth "
							+c.getBirthday());
        		}
    	}
		
    	return res;
		
	}
}