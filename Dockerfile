#This is the base.
FROM java:8

#This is the port.
EXPOSE 8021:8021

#No idea
ADD /target/TransferServiceJar.jar TransferServiceJar.jar

#No idea
ENTRYPOINT ["java", "-jar", "TransferServiceJar.jar"]