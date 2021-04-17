import java.util.Iterator;
import java.util.TreeSet;

public class PeriodicTableTest {
	public static void main(String[] args) {
		ChemicalElement e1 = new ChemicalElement(1, 1.008, "Hydrogen", "H");
		ChemicalElement e2 = new ChemicalElement(4, 9.0122, "Beryllium", "Be");
		ChemicalElement e3 = new ChemicalElement(3, 6.94, "Lithium", "Li");
		ChemicalElement e4 = new ChemicalElement(20, 40.078, "Calcium", "Ca");
		ChemicalElement e5 = new ChemicalElement(12, 24.305, "Magnesium", "Mg");
		ChemicalElement e6 = new ChemicalElement(19, 39.098, "Potassium", "K");
		System.out.println("Content is created....elements are ready....");
		
		TreeSet<ChemicalElement> periodicTableSet = new TreeSet<ChemicalElement>();
		System.out.println("Periodic Table is ready to hold elements....");
		
		System.out.println("Adding first element ......");
		periodicTableSet.add(e1); 
		
		System.out.println("Adding second element ......");
		periodicTableSet.add(e2); 
		
		System.out.println("Adding third element ......");
		periodicTableSet.add(e3); 
		
		System.out.println("Adding fourth element ......");
		periodicTableSet.add(e4); 
		
		System.out.println("Adding fifth element ......");
		periodicTableSet.add(e5);
		
		System.out.println("Adding sixth element ......");
		periodicTableSet.add(e6);
		
		System.out.println("-- now iterating the set ----");
		
		Iterator<ChemicalElement> iter = periodicTableSet.iterator();
		while(iter.hasNext()) {
			ChemicalElement theElement = iter.next();
			System.out.println("Element : "+theElement);
		}
		
	}
}
//The type ChemicalElement must implement the inherited abstract method 
//Comparable<ChemicalElement>.compareTo(ChemicalElement)

class ChemicalElement implements Comparable<ChemicalElement>
{
	int atomicNumber;
	double atomicWeight;
	String elementName;
	String atomicFormula;
	
	/*
	public int compareTo(ChemicalElement otherElement) {
		System.out.println("Comparing atomicNumber : "+atomicNumber+" with atomicNumber : "+otherElement.atomicNumber);
		return Integer.compare(atomicNumber, otherElement.atomicNumber);
	}
	*/
	
	public int compareTo(ChemicalElement otherElement) {
		System.out.println("Comparing atomicWeight : "+otherElement.atomicWeight+" with atomicWeight : "+atomicWeight);
		return Double.compare(otherElement.atomicWeight, atomicWeight);
	}
	
	ChemicalElement(int atomicNumber, double atomicWeight, String elementName, String atomicFormula) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicWeight = atomicWeight;
		this.elementName = elementName;
		this.atomicFormula = atomicFormula;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicWeight=" + atomicWeight + ", elementName="
				+ elementName + ", atomicFormula=" + atomicFormula + "]";
	}
	
	
	
}

//how you compare 2 numbers.... like   a=12  b=12  return int, >0 <0 or 0
	/*
	 * if(a>b)
	 * 		return a-b;  // 3
	 * else
	 * 		if (b>a)
	 * 			return a-b; // 12-15   -3
	 * 		else
	 * 			return a-b;  0
	 * */
