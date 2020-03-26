package sparkss

import org.apache.spark.sql.SparkSession

object SparkSessionWrapper {

  lazy val spark: SparkSession = {

    SparkSession.builder().master("local").appName("allburn").getOrCreate()
  }

}