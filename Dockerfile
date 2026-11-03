WORKDIR /app
COPY Add.java .
RUN javac Add.java
CMD ["java", "Add"]
