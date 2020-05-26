/*
 * *Create a class called MapOperations inside service package with the following methods.*
2.*public Map<TouristPlace> add(TouristPlace places)
3.*public Map<TouristPlace> sortRandomly(TouristPlace places)
4.*public Map<TouristPlace> sortInEntryOrder(HashMap<TouristPlace> places)
5.*public Map<TouristPlace> sortAlphabetically(HashMap<TouristPlace> places)
6.*public Object reset(HashMap<TouristPlace> places)*
7.*public HashMap<TouristPlace> remove(TouristPlace places)
8.*Use lamda operations to sort.
9.*The return type of all the methods are map.
*/

package service;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import model.TouristPlace;

public class MapOperations
{
	public Map<Integer, TouristPlace> add(TouristPlace places) {
		Map<Integer,TouristPlace> am=new HashMap<>();
		am.put( null, places);
		return am;
	}
	public Map<Integer, TouristPlace> sortRandomly(TouristPlace places) {
		Map<Integer,TouristPlace> rm=new HashMap<>();
		rm.put( null, places);
		return rm;
	}
	public Map<Integer, TouristPlace> sortInEntryOrder(TouristPlace places) {
		Map<Integer,TouristPlace> se=new LinkedHashMap<>();
		se.put( null, places);
		return se;
	}
	public Map<Integer, TouristPlace> sortAlphabetically(TouristPlace places) {
		Map<Integer,TouristPlace> sa=new TreeMap<>();
		sa.put( null, places);
		return sa;
	}
	public Object reset(HashMap<Integer,TouristPlace> places) {
		Map<Integer,TouristPlace> resetPlaces=new HashMap<>();
		resetPlaces.clear();
		return resetPlaces;
		
	}
	public Map<Integer, TouristPlace> remove(TouristPlace places){
		Map<Integer,TouristPlace> removePlace=new HashMap<>();
		removePlace.remove( null, places);
		return removePlace;
		
	}
}