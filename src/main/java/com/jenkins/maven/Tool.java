package com.jenkins.maven;

public class Tool {
    private final String testTool;
    private final String buildTool;

    public Tool(String testToolName, String buildTollName) {
        this.testTool = testToolName;
        this.buildTool = buildTollName;
    }
    public void getTools(){
        System.out.println("Build Tool Name :"+buildTool);
        System.out.println("Test Tool Name :"+testTool);
    }
}
