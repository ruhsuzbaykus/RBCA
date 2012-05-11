package com.ikinokta.core

class SimpleIntegerCell(newstate: Int) {

  def state: Int = newstate

  def +(that: SimpleIntegerCell): SimpleIntegerCell = new SimpleIntegerCell(this.state + that.state)

  override def toString = state.toString()

}