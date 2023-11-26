job("Qodana") {
   container("jetbrains/qodana-jvm") {
      env["QODANA_TOKEN"] = Secrets("qodana-token")
      shellScript {
         content = """qodana"""
      }
   }
}