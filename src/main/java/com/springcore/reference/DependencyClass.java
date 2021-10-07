package com.springcore.reference;

public class DependencyClass {
private String variable_a;

public DependencyClass() {
    super();
    // TODO Auto-generated constructor stub
}

public String getVariable_a() {
    return variable_a;
}

public void setVariable_a(String variable_a) {
    this.variable_a = variable_a;
}

@Override
public String toString() {
    return "DependencyClass [variable_a=" + variable_a + "]";
}
}
