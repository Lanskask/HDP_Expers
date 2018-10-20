package example

import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.client.{Connection,ConnectionFactory,HBaseAdmin,HTable,Put,Get}
import org.apache.hadoop.hbase.util.Bytes

object HBaseExp1 extends App {
  // val ipAddress = "167.99.88.159"
  val conf = HBaseConfiguration.create()
  // conf.set("hbase.master", ipAddress  + ":60000")
  // conf.set("hbase.zookeeper.quorum", ipAddress + ":2181") // zookeeperHost
  // conf.set("hbase.zookeeper.property.clientPort", "2181")

  val connection = ConnectionFactory.createConnection(conf);
  val admin = connection.getAdmin();

  // list the tables
  val listtables=admin.listTables()
  listtables.foreach(println)

  // let's insert some data in 'mytable' and get the row

  val table = new HTable(conf, "mytable")

  val theput= new Put(Bytes.toBytes("rowkey1"))

  theput.add(Bytes.toBytes("ids"),Bytes.toBytes("id1"),Bytes.toBytes("one"))
  table.put(theput)

  val theget= new Get(Bytes.toBytes("rowkey1"))
  val result=table.get(theget)
  val value=result.value()
  println(Bytes.toString(value))
}

