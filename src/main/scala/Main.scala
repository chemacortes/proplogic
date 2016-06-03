package proposionallogic

import scala.scalajs.js.JSApp


object ProposionalLogic {

    implicit class BooleanRich(a:Boolean) {
        def :=>(b:Boolean):Boolean = !a && b
    }

}

object MyApp extends JSApp {

    import ProposionalLogic._

    def main() = {

        println("Hola")
        println(true :=> false :=> true)

    }
}
