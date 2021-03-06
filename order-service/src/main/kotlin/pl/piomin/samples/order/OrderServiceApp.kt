package pl.piomin.samples.order

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate
import pl.piomin.samples.order.service.EventBus

@SpringBootApplication
class OrderServiceApp {

    @Bean
    fun restTemplate(): RestTemplate = RestTemplateBuilder().build()

    @Bean
    fun eventBus(): EventBus = EventBus()

}

fun main(args: Array<String>) {
    runApplication<OrderServiceApp>(*args)
}
