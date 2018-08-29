# spring_boot_v1.0
搭建springboot web项目

框架介绍：springboot
数据库：mysql
集成：SpringCloud eureka

# 增加sonar 静态扫码配置
	<profiles>
		<profile>
			<id>sonar</id>
			<activation>
				<activeByDefault>true</activeByDefault>
			</activation>
			<properties>
				<!-- 配置 Sonar Host地址，默认：http://localhost:9000 -->
				<sonar.host.url>
					http://localhost:9000
				</sonar.host.url>
			</properties>
		</profile>
	</profiles>
	
	下载地址 https://www.sonarqube.org/downloads/

