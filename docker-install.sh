#!/bin/sh
sudo docker build -t spring-api-rest-barshop-ssl .

OUTPUT=$(sudo docker run -d -p 80:80 -p 443:443 spring-api-rest-barshop-ssl -name spring-api-rest-barshop-ssl)
echo "${OUTPUT}"
echo "COMMAND LOG"
echo "sudo docker logs ${OUTPUT}"
echo "COMMAND STOP AND REMOVE DOCKER:"
echo "sudo docker stop ${OUTPUT} & sudo docker rm ${OUTPUT}"
echo "EXECUTE COMMAND IN TERMINAL CONTEINER"
echo "sudo docker exec -it ${OUTPUT} /bin/bash"