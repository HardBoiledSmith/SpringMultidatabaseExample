# SpringMultidatabaseExample

Example for multi-database in Spring MVC 

## Required

1. Java 8 (with JDK)
1. Maven 3
1. IntelliJ IDEA 2018+

## Start Vagrant

1. `cd _provisioning`
1. `vagrant up`
1. Vagrant box `SpringMultidatabaseExample` reboots after provisioning was successful

## Install WAS (SpringMultidatabaseExample.war)

1. after reboot, copy `SpringMultidatabaseExample.war` to `/home/ec2-user/`
1. connect ssh `ssh root@[IP_ADDRESS]`
1. `sudo su`
1. `mv /home/ec2-user/SpringMultidatabaseExample.war /var/lib/tomcat8/webapps/`
1. `service tomcat8 restart`
1. open `http://[IP_ADDRESS]:8080/SpringMultidatabaseExample`

## References

http://fedulov.website/2015/10/14/dynamic-datasource-routing-with-spring/
