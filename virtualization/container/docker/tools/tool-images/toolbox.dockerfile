FROM alpine:latest

RUN apk --no-cache add curl

CMD [ "sleep 2h" ]