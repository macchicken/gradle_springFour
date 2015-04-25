# gradle_springFour
Spring 4 with latest Freemarker

Spring 4.1.6 release, migrate from a Spring3 project

Since org.springframework.http.converter.json.MappingJacksonHttpMessageConverter is removed,
so use RestController when dealing with json,
should use org.springframework.web.accept.ContentNegotiationManagerFactoryBean to handle the json type in bean setting,
with content-negotiation-manager setting to this bean

Also, must assign cacheManagerName for each cacheManager while using Spring EhCacheManager, otherwise would throw exception
instead of warnings in Spring3

jackson is 2.5.3
mybatis is 3.2.8,becareful with String and int convert, in this verison, would throw cast exception, so sepcify the parapemeter type with String
