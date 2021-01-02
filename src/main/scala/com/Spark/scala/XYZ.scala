package com.Spark.scala
import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._

object XYZ {
  def main(args: Array[String]) {

    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)

    // Create a SparkContext using every core of the local machine
    val sc = new SparkContext("local[*]", "WordCount")

    val name = sc.textFile("../Employee.txt")

    val namePairRDD = name.map(x=> (x.split(",")(0),x.split(",")(1)))
    //Step 3 : Now swap namePairRDD RDD.
    //val swapped = namePairRDD.map(item => item.swap)
    //step 4: Now sort the rdd by key.
    val sortedOutput = namePairRDD.sortByKey()
    //Step 5 : Now swap the result back
    val swappedBack = sortedOutput.map(item => item.swap)
    val results = swappedBack.collect()
val result = results.mkString("\n")
    println(result)
    results.foreach(println)

    for (x <- results){
      println(x._1)
    }
    //swappedBack.
    //val words = swappedBack.map(x => x.split(",")x(0))
    //Step 6 : Save the output as a Text file and output must be wri
    //swappedBack. repartition(1).saveAsTextFile("../result.txt"
  }


}
