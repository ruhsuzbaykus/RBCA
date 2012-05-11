package com.ikinokta.start


import scala.io.Source
import com.ikinokta.core.SimpleRegularCell

object Starter {


      
	
  
    def main(args: Array[String]): Unit = {
    	val inputLine =  (Source.fromFile("simpleregularinput").getLines()).toList(0)
    	val input = (for(c <-inputLine) yield new SimpleRegularCell(c+"")).toList
   
   	
    	
    	println(SimpleRegularCalculator.calculate(input))
    	
    }

  

}