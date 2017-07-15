/*
package sample
import org.apache.spark._
import org.apache.spark.storage._
import org.apache.spark.streaming._
import org.apache.spark.streaming.twitter.TwitterUtils

import scala.math.Ordering

import twitter4j.auth.OAuthAuthorization
import twitter4j.conf.ConfigurationBuilder
import org.apache.spark._
import org.apache.spark.storage._
import org.apache.spark.streaming._
import org.apache.spark.streaming.twitter.TwitterUtils
import scala.math.Ordering
import twitter4j.auth.OAuthAuthorization
import twitter4j.conf.ConfigurationBuilder
import org.apache.spark.streaming._
import org.apache.spark.streaming.twitter._
//import sample.Utilities._
// Only needed for Spark Streaming.
import org.apache.spark.streaming.{Seconds, StreamingContext}
// ** Listens to a stream of tweets and saves them to disk.
import org.apache.spark._
import org.apache.spark.storage._
import org.apache.spark.streaming._
import org.apache.spark.streaming.twitter.TwitterUtils

import scala.math.Ordering

import twitter4j.auth.OAuthAuthorization
import twitter4j.conf.ConfigurationBuilder
import org.apache.spark._
import org.apache.spark.storage._
import org.apache.spark.streaming._
import org.apache.spark.streaming.twitter.TwitterUtils
import scala.math.Ordering
import twitter4j.auth.OAuthAuthorization
import twitter4j.conf.ConfigurationBuilder
object SaveTweets {

  // * Our main function where the action happens
  def main(args: Array[String]) {

    // Configure Twitter credentials using twitter.txt
    import java.util.regex.Pattern

    import sample._
    setupTwitter()
    
    // Set up a Spark streaming context named "SaveTweets" that runs locally using
    // all CPU cores and one-second batches of data
    val ssc = new StreamingContext("local[*]", "SaveTweets", Seconds(1))
    
    // Get rid of log spam (should be called after the context is set up)
    setupLogging()

    // Create a DStream from Twitter using our streaming context
    val tweets = TwitterUtils.createStream(ssc, None)
    
    // Now extract the text of each status update into RDD's using map()
    val statuses = tweets.map(status => status.getText())
    
    // Here's one way to just dump every partition of every stream to individual files:
    //statuses.saveAsTextFiles("Tweets", "txt")
    
    // But let's do it the hard way to get a bit more control.
    
    // Keep count of how many Tweets we've received so we can stop automatically
    // (and not fill up your disk!)
    var totalTweets:Long = 0
        
    statuses.foreachRDD((rdd, time) => {
      // Don't bother with empty batches
      if (rdd.count() > 0) {
        // Combine each partition's results into a single RDD:
        val repartitionedRDD = rdd.repartition(1).cache()
        // And print out a directory with the results.
        repartitionedRDD.saveAsTextFile("Tweets_" + time.milliseconds.toString)
        // Stop once we've collected 1000 tweets.
        totalTweets += repartitionedRDD.count()
        println("Tweet count: " + totalTweets)
        if (totalTweets > 1000) {
          System.exit(0)
        }
      }
    })
    
    // You can also write results into a database of your choosing, but we'll do that later.
    
    // Set a checkpoint directory, and kick it all off
    ssc.checkpoint("C:/checkpoint/")
    ssc.start()
    ssc.awaitTermination()
  }  
}

*/
