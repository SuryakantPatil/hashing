import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {
		public static void main(String[] args) {
			
			
			Flight f1 = new Flight(101,"Lufthansa","Mumbai","Germany");
			Flight f2 = new Flight(102,"Air India","Delhi","Washington");
			Flight f3 = new Flight(105,"British Airways","Mumbai","London");
			Flight f4 = new Flight(107,"American Airlines","New York","Mumbai");
			Flight f5 = new Flight(103,"Air France","Mumbai","Paris");
			
			
			ArrayList<Flight> al = new ArrayList<Flight>();
			
			al.add(f1);
			al.add(f2);
			al.add(f3);
			al.add(f4);
			al.add(f5);
			
			Comparator cmp = new FlightNameComparator();
			
			Collections.sort(al,cmp);
			
			for(Flight fl : al) {
				System.out.println("Flight is : "+fl);
			}
		}
}
class SourceComparator implements Comparator<Flight> {
	@Override
	public int compare(Flight o1, Flight o2) {
		return o1.source.compareTo(o2.source);
	}
}

class DestinationComparator implements Comparator<Flight> {
	@Override
	public int compare(Flight o1, Flight o2) {
		return o1.destination.compareTo(o2.destination);
	}
}
class FlightNumberComparator implements Comparator<Flight> {
	@Override
	public int compare(Flight o1, Flight o2) {
		return Integer.compare(o1.flightNumber, o2.flightNumber);
	}
}
class FlightNameComparator implements Comparator<Flight> {
	@Override
	public int compare(Flight o1, Flight o2) {
		return o1.flightName.compareTo(o2.flightName);
	}
}
	class Flight {
		int flightNumber;
		String flightName;
		String source;
		String destination;
		public Flight(int flightNumber, String flightName, String source, String destination) {
			super();
			this.flightNumber = flightNumber;
			this.flightName = flightName;
			this.source = source;
			this.destination = destination;
		}
		@Override
		public String toString() {
			return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", source=" + source
					+ ", destination=" + destination + "]";
		}
		
		
	}











