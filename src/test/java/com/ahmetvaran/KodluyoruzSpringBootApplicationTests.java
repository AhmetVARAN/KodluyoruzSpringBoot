package com.ahmetvaran;

import com.ahmetvaran.data.entity.EmployeeEntity;
import com.ahmetvaran.data.repository.EmployeeRepository;
import com.ahmetvaran.test.TestCrud;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KodluyoruzSpringBootApplicationTests implements TestCrud {

    @Autowired
    EmployeeRepository employeeRepository;

    //CREATE
    @Test
    @Override
    public void testCreate() {
        EmployeeEntity employeeEntity = EmployeeEntity
                .builder()
                .firstName("Ahmet Test")
                .lastName("Varan Test")
                .emailId("ahmetvaran@test.com")
                .build();
        employeeRepository.save(employeeEntity);

        //nesne null ise assertionError hatasını göndersin
        assertNotNull(employeeRepository.findById(1L).get());
    }

    //LIST
    @Test
    @Override
    public void testList() {
        List<EmployeeEntity> list = (List<EmployeeEntity>) employeeRepository.findAll();
        //Eğer 0dan büyükse liste vardır
        assertThat(list).size().isGreaterThan(0);
    }

    //FINDBYID
    @Test
    @Override
    public void testFindById() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();
        //Ahmet Test adında kayıt var mı
        assertEquals("Ahmet Test", employeeEntity.getFirstName());
    }

    //UPDATE
    @Test
    @Override
    public void testUpdate() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();
        employeeEntity.setFirstName("Ahmet 52 Test");
        employeeRepository.save(employeeEntity);
        //eşit değilse sorun olmayacak ama eşitse exception gönderecek
        assertNotEquals("Ahmet Test", employeeRepository.findById(1L).get().getFirstName());
    }


    //DELETE
    @Test
    @Override
    public void testDelete() {
        employeeRepository.deleteById(1L);
        assertThat(employeeRepository.existsById(1L)).isFalse();
    }
}
