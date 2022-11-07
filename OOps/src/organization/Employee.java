package organization;
class Employee{
    int salary = 6000;
}
class Manager extends Employee
{

    int incentive = salary+2000;

}
class Labour extends Employee{
    int overtime = salary+1000;
}
