import alluxio.AlluxioURI;
import alluxio.client.file.FileInStream;
import alluxio.client.file.FileSystem;
import alluxio.conf.AlluxioConfiguration;
import alluxio.exception.AlluxioException;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class Main {
    public static int BUFFER_SIZE = 100;

    public static void main(String[] args) throws IOException, AlluxioException {
//        if (args.length != 1) {
//            System.out.println("Usage: java -jar <jarpath> <alluxio file path>");
//            System.exit(1);
//            return;
//        }
//
        FileSystem fs = alluxio.client.file.FileSystem.Factory.get();
//        String filePathArg = args[args.length - 1];
        String filePathArg = "/test.txt";
        AlluxioURI path = new AlluxioURI(filePathArg);

        System.out.printf("Reading the first %d bytes of file %s\n\n", BUFFER_SIZE, filePathArg);

//        byte[] buffer = new byte[BUFFER_SIZE];
        ByteBuffer buffer = ByteBuffer.allocate(BUFFER_SIZE);

        try (FileInStream inStream = fs.openFile(path)) {
            while (inStream.read(buffer) != -1) {
            }
        }

        System.out.println(buffer.toString());
    }
}
