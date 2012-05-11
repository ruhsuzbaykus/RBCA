package com.ikinokta.core

class SimpleRegularCell(newstate: String) {

  def state: String = newstate

  def +(that: SimpleRegularCell): SimpleRegularCell = 
    {
    	if(this.state == "A" && that.state == "0")
    	  return new SimpleRegularCell("A")
    	if(this.state == "A" && that.state == "1")
    	  return new SimpleRegularCell("B")
    	if(this.state == "B" && that.state == "1")
    	  return new SimpleRegularCell("B")
    	if(this.state == "B" && that.state == "0")
    	  return new SimpleRegularCell("R")
    	if(this.state == "R")
    	  return new SimpleRegularCell("R")
    	return new SimpleRegularCell(that.state)
    }

  override def toString = state.toString()

}