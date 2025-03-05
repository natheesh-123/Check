package com.UnitTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentRegistrationServiceTest {

	private StudentRegistrationService registrationService;
	 
    @BeforeEach
    public void setUp() {
        registrationService = new StudentRegistrationService();
    }
 
    // Test valid name
    @Test
    public void testValidName() {
        assertTrue(registrationService.isValidName("John Doe"), "Name should be valid");
        assertTrue(registrationService.isValidName("Alice"), "Name should be valid");
    }
 
    // Test invalid name
    @Test
    public void testInvalidName() {
        assertFalse(registrationService.isValidName(""), "Empty name should be invalid");
        assertFalse(registrationService.isValidName("J"), "Name shorter than 2 characters should be invalid");
        assertFalse(registrationService.isValidName("1234"), "Name with numbers should be invalid");
        assertFalse(registrationService.isValidName(null), "Null name should be invalid");
    }
 
    // Test valid email
    @Test
    public void testValidEmail() {
        assertTrue(registrationService.isValidEmail("test@example.com"), "Email should be valid");
        assertTrue(registrationService.isValidEmail("user.name@domain.co"), "Email should be valid");
    }
 
    // Test invalid email
    @Test
    public void testInvalidEmail() {
        assertFalse(registrationService.isValidEmail("invalid-email"), "Email without '@' or '.' should be invalid");
        assertFalse(registrationService.isValidEmail("user@domain"), "Email without top-level domain should be invalid");
        assertFalse(registrationService.isValidEmail(""), "Empty email should be invalid");
        assertFalse(registrationService.isValidEmail(null), "Null email should be invalid");
    }
 
    // Test valid password
    @Test
    public void testValidPassword() {
        assertTrue(registrationService.isValidPassword("password123"), "Password should be valid");
        assertTrue(registrationService.isValidPassword("Admin@1234"), "Password with special characters should be valid");
    }
 
    // Test invalid password
    @Test
    public void testInvalidPassword() {
        assertFalse(registrationService.isValidPassword("pass"), "Password shorter than 8 characters should be invalid");
        assertFalse(registrationService.isValidPassword(""), "Empty password should be invalid");
        assertFalse(registrationService.isValidPassword(null), "Null password should be invalid");
    }
 
    // Test successful registration
    @Test
    public void testSuccessfulRegistration() {
        String result = registrationService.registerStudent("John Doe", "johndoe@example.com", "SecurePass123");
        assertEquals("Registration successful", result, "Registration should be successful with valid data");
    }
 
    // Test registration with invalid name
    @Test
    public void testRegistrationInvalidName() {
        String result = registrationService.registerStudent("J", "johndoe@example.com", "SecurePass123");
        assertEquals("Invalid name", result, "Registration should fail if name is invalid");
    }
 
    // Test registration with invalid email
    @Test
    public void testRegistrationInvalidEmail() {
        String result = registrationService.registerStudent("John Doe", "invalid-email", "SecurePass123");
        assertEquals("Invalid email format", result, "Registration should fail if email is invalid");
    }
 
    // Test registration with invalid password
    @Test
    public void testRegistrationInvalidPassword() {
        String result = registrationService.registerStudent("John Doe", "johndoe@example.com", "short");
        assertEquals("Password must be at least 8 characters long", result, "Registration should fail if password is too short");
    }
	

}
