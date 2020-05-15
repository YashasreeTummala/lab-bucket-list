/*
1.Create a class called ListOperations inside service package with the following methods.*
2.*public List<TouristPlace> add(TouristPlace places)*
3.*public List<TouristPlace> remove(TouristPlace places)*
4.*public Object sortByDestination(List<TouristPlace> places)*
5.*public Object sortByRank(List<TouristPlace> places)*
6.*public Object reset(List<TouristPlace> places)*
7.*Use lamda operations to sort.*
8.*The return type of all the methods are list.*
*/

package service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import model.TouristPlace;
public class ListOperations{
	
	
	public List<TouristPlace> add(TouristPlace places)
	{
	        ArrayList<TouristPlace> al=new ArrayList<>();
	        al.add(places);
	       
	        return al;
		
	}
	public List<TouristPlace> remove(TouristPlace places)
	{
		ArrayList<TouristPlace> rl=new ArrayList<>();
		rl.remove(places);
		return null;
		
	}
	public Object sortByDestination(List<TouristPlace> places)
	{
		
		ArrayList<TouristPlace> sd=new ArrayList<>();	
		sd.sort((d1,d2) -> d1.getDestination().compareTo(d2.getDestination()));
		return sd;
	}
	
	public Object sortByRank(List<TouristPlace> places)
	{
		ArrayList<TouristPlace> sr=new ArrayList<>();	
		sr.sort((d1,d2) -> d1.getRank().compareTo(d2.getRank()));
		return sr;
		
	}
	public Object reset(List<TouristPlace> places)
	{
		
		ArrayList<TouristPlace> list=new ArrayList<>();
		list.clear();
		return list;
		
	}
}