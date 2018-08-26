# Build
mvn clean package && docker build -t academy.learnprogramming/wakma-hrms .

# RUN

docker rm -f wakma-hrms || true && docker run -d -p 8080:8080 -p 4848:4848 --name wakma-hrms academy.learnprogramming/wakma-hrms 