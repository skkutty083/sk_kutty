FROM ubuntu:22.04
RUN apt update
Run apt install apache2 -y
ADD http://mnptechnologies.a/
EXPOSE 80
ENV user=skkutty
ENTRYPOINT ["/bin/bash","-c", "service apache2 start && bash"]
