package com.ikinokta.start
import com.ikinokta.core.SimpleRegularCell

object SimpleRegularCalculator {
	
  def calculate(sumList:List[SimpleRegularCell]):SimpleRegularCell = 
	  {
			println(sumList)
			if(sumList.length<=1) sumList(0) else calculate(for(val x <- sumList.sliding(2).toList) yield x(0) + x(1))
	  }
	
}