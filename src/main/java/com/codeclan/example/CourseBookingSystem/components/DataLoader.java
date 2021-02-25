package com.codeclan.example.CourseBookingSystem.components;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Course course1 = new Course("Professional blacksmith bootcamp", "Aberdeen", 4.0);
        Course course2 = new Course("Professional shoemaker bootcamp", "Ullapool", 2.0);

        courseRepository.save(course1);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Archibald", "Alloa", 78);
        Customer customer2 = new Customer("Betulio", "Blairlogie", 32);
        Customer customer3 = new Customer("Wolfgang", "Musselburgh", 19);

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        Booking booking1 = new Booking("21/12/21", customer2, course2);
        Booking booking2 = new Booking("08/01/2022", customer1, course1);
        Booking booking3 = new Booking("13/10/21", customer3, course2);
        Booking booking4 = new Booking("30/07/2021", customer1, course2);

        bookingRepository.save(booking1);
        bookingRepository.save(booking2);
        bookingRepository.save(booking3);
        bookingRepository.save(booking4);

    }
}
