package service

import entity.Wine
import org.apache.spark.sql.SparkSession
import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._

class WineObjmodel(spark: SparkSession) extends WineTrait {

  override def mapper(jsonPath: String): Unit = {
    spark.sparkContext.textFile(jsonPath)
      .map(row => {
        decode[Wine](row)
      })
      .collect()
      .foreach {
        println
    }
  }
}

trait WineTrait extends Serializable {
  def mapper(jsonPath: String): Unit
}
