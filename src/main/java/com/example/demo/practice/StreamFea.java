package com.example.demo.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamFea {

	public static void main(String[] args) {
		List<Employee> list =createListEmployes();
		getMaxSalaryEmployee(list);
		getMinSalaryEmployee(list);
		getMaxSalaryByDept(list);
		getActiveEmployee(list);
		getEmpByDept(list);

	}
	
	private static void getEmpByDept(List<Employee> list) {

		Map<String,List<Employee>> map=list.stream().collect(Collectors.groupingBy(Employee :: getDept));
			map.forEach((k,v) -> System.out.println(k+"   "+v));
	}

	private static void getActiveEmployee(List<Employee> list) {

		Map<String, Long> lists =list.stream().collect(Collectors.groupingBy(Employee :: getActive,Collectors.counting()));
	
		lists.forEach((k,v)-> System.out.println(k+"====="+v));
	}

	private static void getMaxSalaryByDept(List<Employee> list) {

		Map<String, Optional<Employee>> empSalDept =list.stream().collect(Collectors.groupingBy(Employee :: getDept,
				Collectors.reducing(BinaryOperator.maxBy(
						Comparator.comparingDouble(Employee :: getSalary)))));
		
		empSalDept.forEach((k,v)-> System.out.println(k+"---->"+v));
	}

	private static void getMinSalaryEmployee(List<Employee> list) {
		Optional<Employee> val=	list.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee :: getSalary)));
		// TODO Auto-generated method stub
		System.out.println(val.toString());		
	}

	private static void getMaxSalaryEmployee(List<Employee> list) {
		
	Optional<Employee> val=	list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary)));
		// TODO Auto-generated method stub
		System.out.println(val.toString());
	}

	private static List<Employee> createListEmployes() {
//		Integer id, String name, double salary, String dept, String active, int yearOfjoining, int age,
//		String status
		List<Employee> list = new ArrayList();
		list.add(new Employee(1,"A",10000,"OFFSHORE","Active",2016,27));
		list.add(new Employee(2,"B",12000,"RD","Active",2009,29));
		list.add(new Employee(3,"C",15000,"JAVA","Inactive",2019,23));
		list.add(new Employee(4,"AD",10000,"JAVA","Active",2006,29));
		list.add(new Employee(5,"AS",10060,"OFFSHORE","Active",2021,29));
		list.add(new Employee(6,"AW",15600,"RD","Inactive",2022,30));
		list.add(new Employee(7,"AA",106650,"GENFARE","Active",2023,40));
		list.add(new Employee(8,"AQ",17800,"OFFSHORE","Active",2003,39));
		return list;
	}

	public static void getMaxSalary() {
		
		
	}

}
