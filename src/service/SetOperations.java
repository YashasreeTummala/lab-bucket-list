/*
1.* Create a class called SetOperations inside service package with the following methods.
2.*public HashSet<TouristPlace> add(TouristPlace places)
3.*public HashSet<TouristPlace> remove(TouristPlace places)
4.*public Object sortByDestination(HashSet<TouristPlace> places)
5.*public Object sortByRank(HashSet<TouristPlace> places)
6.*public Object reset(HashSet<TouristPlace> places)
7.*Use lamda operations to sort.
8.*The return type of all the methods are set.

 */

package service;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import model.TouristPlace;

public class SetOperations
{
	public HashSet<TouristPlace> add(TouristPlace places) {
		HashSet<TouristPlace> as=new HashSet<>();
        as.add(places);
       
        return as;
	}
	public HashSet<TouristPlace> remove(TouristPlace places) {
		HashSet<TouristPlace> rs=new HashSet<>();
        rs.remove(places);
       
		return null;
	}
	public Object sortByDestination(HashSet<TouristPlace> places) {
		TreeSet<TouristPlace> sd=new TreeSet<>((d1,d2)->d1.getDestination().compareTo(d2.getDestination()));
		return sd;
	}
	public Object sortByRank(HashSet<TouristPlace> places) {
		TreeSet<TouristPlace> sd=new TreeSet<>((d1,d2)->d1.getRank().compareTo(d2.getRank()));
		return sd;
	}
	public Object reset(HashSet<TouristPlace> places) {
		HashSet<TouristPlace> cs=new HashSet<>();
        cs.clear();
       
		return cs;
	}
}