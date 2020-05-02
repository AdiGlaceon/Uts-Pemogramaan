package com.app.UTS9.UTS43A87006180259;

import com.app.UTS.model.KursusOnline;
import com.app.UTS.repo.KursusOnlineRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Uts43A87006180259Application {

	public static void main(String[] args) {
		SpringApplication.run(Uts43A87006180259Application.class, args);
	}
        @Bean
        public CommandLineRunner testKursusOnlineRepository(KursusOnlineRepository repo){
            return a -> {
                List<KursusOnline> list = repo.findAll();
                System.out.format("%-15s %-30s %-20s %-20s %25s \n","Peserta ID","Nama",
                            "Tanggal Lahir","Jumlah Kursus","Rate");
                System.out.println("-----------------------------------------------------"
                           +"-------------------");
                list.forEach(c ->{
                    System.out.format("%-15s %-30s %-20s %-20s %25s\n",
                            c.getPesertaID(),c.getNama(),
                            c.getTanggalLahir(),c.getJumlahKursus(),c.getRate());
                });
            };
        }
}
