package com.example.cloud.config;

import io.cloudevents.CloudEvent;
import io.cloudevents.jackson.JsonFormat;
import io.cloudevents.spring.messaging.CloudEventMessageConverter;
import io.cloudevents.spring.webflux.CloudEventHttpMessageReader;
import io.cloudevents.spring.webflux.CloudEventHttpMessageWriter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.web.codec.CodecCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.CodecConfigurer;

@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(value = {CloudEvent.class, JsonFormat.class, CloudEventMessageConverter.class})
public class CloudEventSupportAutoConfiguration {


    @Configuration
    @ConditionalOnClass(name = "io.cloudevents.spring.webflux.CloudEventHttpMessageReader")
    @ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.REACTIVE)
    static class CloudEventsMessageReactiveCodec implements CodecCustomizer {
        @Override
        public void customize(CodecConfigurer configurer) {
            configurer.customCodecs().register(new CloudEventHttpMessageReader());
            configurer.customCodecs().register(new CloudEventHttpMessageWriter());
        }
    }

    @ConditionalOnMissingBean
    @Bean
    public CloudEventMessageConverter cloudEventMessageConverter() {
        return new CloudEventMessageConverter();
    }

}
