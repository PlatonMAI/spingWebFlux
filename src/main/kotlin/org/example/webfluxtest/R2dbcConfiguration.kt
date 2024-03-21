import io.r2dbc.spi.ConnectionFactories
import io.r2dbc.spi.ConnectionFactory
import io.r2dbc.spi.ConnectionFactoryOptions
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class R2DBCConfig {
    @Bean
    fun connectionFactory(): ConnectionFactory {
        return ConnectionFactories.get(
                ConnectionFactoryOptions.builder()
                        .option(ConnectionFactoryOptions.DRIVER, "postgresql")
                        .option(ConnectionFactoryOptions.HOST, "localhost")
                        .option(ConnectionFactoryOptions.PORT, 5432)
                        .option(ConnectionFactoryOptions.USER, "cat_user")
                        .option(ConnectionFactoryOptions.PASSWORD, "1234")
                        .option(ConnectionFactoryOptions.DATABASE, "cat_db")
                        .build())
    }
}