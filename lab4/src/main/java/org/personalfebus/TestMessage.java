package org.personalfebus;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestMessage {
    @JsonProperty("testName") private String testName;
    @JsonProperty("parameters") private Object[] parameters;
    @JsonProperty("testResult") private String testResult;

    public TestMessage(@JsonProperty("testName") String testName, String testResult,
                       @JsonProperty("parameters") Object[] parameters) {
        this.packageId = packageId;
        this.parameters = parameters;
        this.testName = testName;
        this.testResult = testResult;
    }

    public int getPackageId() {
        return packageId;
    }

    public String getTestName() {
        return testName;
    }

    public String getParameters() {
        return parameters;
    }

    public String getFunctionName() {
        return functionName;
    }

    public String getJsScript() {
        return jsScript;
    }

    public String getTestResult() {
        return testResult;
    }
}
