(1) $ aws configure
        (It will ask you AWS security id & key)

(2) $ aws ecr get-login --no-include-email --region us-east-1
        (it will give docker login command to execute)

    *Incase aws command not wokring - aws cli need to be installed.


(3) $ docker build -t awstest .
         (Build the docker image)

(4) $ docker tag awstest:latest 771968905786.dkr.ecr.us-east-1.amazonaws.com/awstest:latest

         (I copied above these commands from AWS repository creation output)
        TAG the image, to push into AWS Repository


(5) $ docker push 771968905786.dkr.ecr.us-east-1.amazonaws.com/awstest:latest

          (Push the docker image of application in AWS)

