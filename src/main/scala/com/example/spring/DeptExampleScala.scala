package com.example.spring

object DeptExampleScala {
	def main(args: Array[String]): Unit = {
		var dept : Dept = new Dept
		dept.deptno = 10;
		dept.dname = "총무부"	
		dept.loc =  "서울"
		
		println(dept)
		dept.print()
		dept.print2()
		println(dept.deptno + dept.dname)
		
	}
}