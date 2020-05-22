Basic REST Spring boot application that displays list of employee ( GET)

Technologies used: Spring Boot, Spring JPA Data, H2 database(for persistence), swagger

How to deploy the app:

Local:
mvn clean install
mvn spring-boot:run

if application starts ok you should see:

[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.2.RELEASE)

2020-03-08 12:07:04.622  INFO 27336 --- [           main] c.s.academy.SpringBootApplicationData    : Starting SpringBootApplicationData on CATAN with PID 27336 (C:\Users\CONSTANTINCATALINNEA\eclipse-workspace\employeeman\target\classes started by CONSTANTINCATALINNEA in C:\Users\CONSTANTINCATALINNEA\eclipse-workspace\employeeman)
2020-03-08 12:07:04.625  INFO 27336 --- [           main] c.s.academy.SpringBootApplicationData    : No active profile set, falling back to default profiles: default
2020-03-08 12:07:05.168  INFO 27336 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2020-03-08 12:07:05.237  INFO 27336 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 36ms. Found 1 JPA repository interfaces.
2020-03-08 12:07:05.410  INFO 27336 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-03-08 12:07:06.088  INFO 27336 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2020-03-08 12:07:06.097  INFO 27336 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-03-08 12:07:06.097  INFO 27336 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.29]
2020-03-08 12:07:06.164  INFO 27336 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-03-08 12:07:06.164  INFO 27336 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1508 ms
2020-03-08 12:07:06.199  INFO 27336 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-03-08 12:07:06.269  INFO 27336 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2020-03-08 12:07:06.273  INFO 27336 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:academydb'
2020-03-08 12:07:06.357  INFO 27336 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2020-03-08 12:07:06.402  INFO 27336 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.4.9.Final}
2020-03-08 12:07:06.479  INFO 27336 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2020-03-08 12:07:06.615  INFO 27336 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2020-03-08 12:07:07.002  INFO 27336 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2020-03-08 12:07:07.006  INFO 27336 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2020-03-08 12:07:07.294  WARN 27336 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2020-03-08 12:07:07.390  INFO 27336 --- [           main] pertySourcedRequestMappingHandlerMapping : Mapped URL path [/v2/api-docs] onto method [springfox.documentation.swagger2.web.Swagger2Controller#getDocumentation(String, HttpServletRequest)]
2020-03-08 12:07:07.464  INFO 27336 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-03-08 12:07:07.550  INFO 27336 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Context refreshed
2020-03-08 12:07:07.562  INFO 27336 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Found 1 custom documentation plugin(s)
2020-03-08 12:07:07.581  INFO 27336 --- [           main] s.d.s.w.s.ApiListingReferenceScanner     : Scanning for api listing references
2020-03-08 12:07:07.689  INFO 27336 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2020-03-08 12:07:07.690  INFO 27336 --- [           main] c.s.academy.SpringBootApplicationData    : Started SpringBootApplicationData in 3.35 seconds (JVM running for 3.653)

check http://localhost:8080/swagger-ui.html

For openshift (core ready containers) use Import from Git functionalaty (source to image).
Enter in git URL link to this repo https://github.com/catagithub03/employeeman and wait until application is built ( will take aprox5-10 mins :)

Once application is up check route url or swagger ui
{your app route}/swagger-ui.html




