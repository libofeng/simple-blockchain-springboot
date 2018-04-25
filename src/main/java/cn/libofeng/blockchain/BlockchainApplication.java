package cn.libofeng.blockchain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class BlockchainApplication {

    public static void main(String... args) {
        if (System.getProperty("blockchain.node.id") == null) {
            System.setProperty("blockchain.node.id", UUID.randomUUID().toString().replace("-", ""));
        }
        SpringApplication.run(BlockchainApplication.class, args);
    }
}
