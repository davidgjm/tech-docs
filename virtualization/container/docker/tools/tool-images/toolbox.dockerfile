FROM alpine:latest

RUN apk --no-cache add curl vim

CMD [ "/bin/sleep", "2h" ]