package testNGConcept;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
 
public class Annotations {
 
// test case 1
 
@Test (priority = 4 , invocationCount = 10  , groups = {"smoke"} )
public void testCase1() {
System.out.println("@test1");
}


@Test 
@Ignore
public void testCase5() {
System.out.println("@test5");
}


@Test (enabled  = false)
public void testCase6() {
System.out.println("@test6");
}
 // 0 on priority
@Test 
public void testCase4() {
System.out.println("@test4");
}
 
@Test (priority = 2)
public void testCase2() {
System.out.println("@test2");
}

@Test (priority = -1)
public void testCase3() {
System.out.println("@test3");
}
 
@BeforeMethod
public void beforeMethod() {
System.out.println("@beforeMethod");
}
 
@AfterMethod
public void afterMethod() {
System.out.println("@afterMethod");
}
 
@BeforeClass
public void beforeClass() {
System.out.println("@beforeClass");
}
 
@AfterClass
public void afterClass() {
System.out.println("@afterClass");
}
 
@BeforeTest
public void beforeTest() {
System.out.println("@beforeTest");
}
 
@AfterTest
public void afterTest() {
System.out.println("@afterTest");
}
 
@BeforeSuite
public void beforeSuite() {
System.out.println("@beforeSuite");
}
 
@AfterSuite
public void afterSuite() {
System.out.println("@afterSuite");
}
 
}