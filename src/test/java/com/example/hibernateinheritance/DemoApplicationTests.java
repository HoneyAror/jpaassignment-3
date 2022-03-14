package com.example.hibernateinheritance;

import com.example.hibernateinheritance.entities.Check;
import com.example.hibernateinheritance.entities.CreditCard;
import com.example.hibernateinheritance.repos.PaymentRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureTestEntityManager
class DemoApplicationTests {

	@Autowired
	PaymentRepo repo;


	@Test
	public void createPayment(){
		CreditCard cc= new CreditCard();
		cc.setId(1);
		cc.setAmount(1000);
		cc.setcardnumber("12345789");
		repo.save(cc);
	}

	@Test
	public void createCheckPayment(){
		Check ch= new Check();
		ch.setId(2);
		ch.setAmount(4000);
		ch.setChecknumber("2345789");
		repo.save(ch);
	}


}
