package com.codeclan.example.CourseBookingSystem;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateCustomer(){
		Customer customer1 = new Customer("Archibald", "Alloa", 78);
		customerRepository.save(customer1);
	}

	@Test
	public void canCreateCourse(){
		Course course1 = new Course("Professional blacksmith bootcamp", "Aberdeen", 4.0);
		courseRepository.save(course1);
	}

	@Test
	public void canCreateateBooking(){
		Course course2 = new Course("Professional shoemaker bootcamp", "Ullapool", 2.0);
		courseRepository.save(course2);
		Customer customer2 = new Customer("Betulio", "Blairlogie", 32);
		customerRepository.save(customer2);
		Booking booking1 = new Booking("21/12/21", customer2, course2);
		bookingRepository.save(booking1);
	}

	@Test
	public void waterfallWorks(){
		Course course3 = new Course("Professional testing bootcamp", "Leith", 5.0);
		courseRepository.save(course3);
		Customer customer3 = new Customer("Wolfgang", "Musselburgh", 19);
		customerRepository.save(customer3);
		Booking booking3 = new Booking("13/10/21", customer3, course3);
		bookingRepository.save(booking3);

		customerRepository.deleteById(customer3.getId());
	}



}
