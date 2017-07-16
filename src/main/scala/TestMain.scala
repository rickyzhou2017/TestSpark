import org.apache.log4j.Logger

/**
  * Created by zhouhuiyu on 17/7/16.
  */
object TestMain {

  var logger = Logger.getLogger(TestMain.getClass)

  def main(args: Array[String]): Unit = {
    logger.info("Hello Scala!!!")
  }

}