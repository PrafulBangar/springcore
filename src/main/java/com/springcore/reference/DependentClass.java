package com.springcore.reference;

public class DependentClass {
private String A;
private DependencyClass depObj;
public String getA() {
    return A;
}
public void setA(String a) {
    A = a;
}
public DependencyClass getDepObj() {
    return depObj;
}
public void setDepObj(DependencyClass depObj) {
    this.depObj = depObj;
}
@Override
public String toString() {
    return "dependentClass [A=" + A + ", depObj=" + depObj + "]";
}
public DependentClass() {
    super();
    // TODO Auto-generated constructor stub
}


    
}
