package utils

import java.io.File

object Utils {




  val windowsPath = "F:\\database\\netcfia"
  val linuxPath = "/mnt/sdb/xwq/projects/netcfia"
  val path : String= {
    if (new File(windowsPath).exists()) windowsPath else linuxPath
  }


}
