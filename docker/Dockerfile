FROM ubuntu:22.04

# Update the package list and install Apache
RUN apt update && apt install apache2 -y

# Download the web page and store it in the web server directory
RUN apt install curl -y
RUN curl -o /var/www/html/index.html http://mnptechnologies.com/

# Expose port 80
EXPOSE 80

# Set an environment variable
ENV MY_PATH=/root/

# Start Apache in the background and then open a bash shell
ENTRYPOINT ["/bin/bash", "-c", "service apache2 start && bash"]
