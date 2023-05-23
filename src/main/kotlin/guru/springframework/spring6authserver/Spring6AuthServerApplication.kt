package guru.springframework.spring6authserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Spring6AuthServerApplication

fun main(args: Array<String>) {
    runApplication<Spring6AuthServerApplication>(*args)
}
