import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		
		Country c1  = new Country("India", "New Delhi", "Rupee", "1.29B", "Mr. Narendra Modi");
		Country c2  = new Country("England", "London", "Pound", "6.8Cr", "Mr. Boris Johnson");
		Country c3  = new Country("Australia", "Canberra", "Aus Dollar", "25.88m", "Mr. Scott Morison");
		Country c4  = new Country("Nepal", "Kathmandu", "Rupee", "2.86Cr", "Mr. K. P. Sharma Oli");
		
		System.out.println("countries are created...");
		
		TreeMap<String,Country> countryMap = new TreeMap<String,Country>();
		
		countryMap.put("ind", c1);
		countryMap.put("eng", c2);
		countryMap.put("aus", c3);
		countryMap.put("nep", c4);
		System.out.println("Keys and values are put in the map...");
		
		System.out.println("Now access the map keys...");
		
		Set<String> allKeys = countryMap.keySet();
		
		Iterator<String> iter = allKeys.iterator();
		
		while(iter.hasNext()) {
			String theKey = iter.next();
			System.out.println("Key : "+theKey);
			
			Country theCountry = countryMap.get(theKey);
			System.out.println("Country : "+theCountry);
		}
		
		
		
	}
}

class Country
{
	String countryName;
	String capitalName;
	String currency;
	String population;
	String primeMinister;
	
	Country(String countryName, String capitalName, String currency, String population, String primeMinister) {
		super();
		this.countryName = countryName;
		this.capitalName = capitalName;
		this.currency = currency;
		this.population = population;
		this.primeMinister = primeMinister;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capitalName=" + capitalName + ", currency=" + currency
				+ ", population=" + population + ", primeMinister=" + primeMinister + "]";
	}
	
	
}

//map is same as dictionary - key and value

//synchronize (key) value is the details meaning of this word
