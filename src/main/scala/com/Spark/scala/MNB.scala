package com.Spark.scala

object MNB {
  def main(args: Array[String]): Unit = {
    val ass = new Array[Int](2)
    ass(0) =888
ass(1)=88
println(ass(0))
    for ( m1 <-ass ) {

      println(m1)
    }

    val annn =new Tuple3[String,Int,String]("arjun",999,"shetty")
      println(annn._1)
    ass.foreach(println)
 val nn = List(1,4,2,3).sorted




  }

}
