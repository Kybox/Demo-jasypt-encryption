package fr.kybox.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoJasyptEncryptionApplication implements CommandLineRunner {

    private final EncryptedProperty encryptedProperty;

    public DemoJasyptEncryptionApplication(EncryptedProperty encryptedProperty) {
        this.encryptedProperty = encryptedProperty;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoJasyptEncryptionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Decrypted property :");
        System.out.println("-> " + encryptedProperty.getTest());

    }
}
