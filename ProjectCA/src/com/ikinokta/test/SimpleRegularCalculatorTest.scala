package com.ikinokta.test
import junit.framework.TestCase
import junit.framework.Assert.assertEquals
import com.ikinokta.start.SimpleRegularCalculator
import com.ikinokta.core.SimpleRegularCell

class SimpleRegularCalculatorTest extends TestCase {
  
   def testCorrectOutput() {
    
    var inputline = (for(c <-"A0000000") yield new SimpleRegularCell(c+"")).toList
    assertEquals("A", SimpleRegularCalculator.calculate(inputline).toString())
    
    inputline = (for(c <-"A000000011111111") yield new SimpleRegularCell(c+"")).toList
    assertEquals("B", SimpleRegularCalculator.calculate(inputline).toString())
    
    inputline = (for(c <-"B11111111") yield new SimpleRegularCell(c+"")).toList
    assertEquals("B", SimpleRegularCalculator.calculate(inputline).toString())
    
    inputline = (for(c <-"A0000000111011111") yield new SimpleRegularCell(c+"")).toList
    assertEquals("R", SimpleRegularCalculator.calculate(inputline).toString())
    
    
    
    
  }

}