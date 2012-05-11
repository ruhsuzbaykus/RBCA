package com.ikinokta.core

abstract class Cell{

	def state
	  
	def +(that: Cell): Cell
	  
	  override def toString = state.toString()
}