# Alluxio Simple Client

An example to read first 100 bytes of content from an alluxio file.

```sh
# Build shaded jar package
mvn package

# Run the jar with a alluxio path
java -jar ./target/alluxio-simple-client-1.0-SNAPSHOT.jar <alluxio path>
```