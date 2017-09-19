package org.commonwl.cwl;

import java.util.ArrayList;

public class Process {
    private String id;
    private ArrayList<InputParameter> inputs;
    private ArrayList<OutputParameter> outputs;

    public Process(String id) {
        this.id = id;
        this.inputs = new ArrayList<>();
        this.outputs = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setInputs(ArrayList<InputParameter> inputs) {
        this.inputs = inputs;
    }

    public ArrayList<InputParameter> getInputs() {
        return inputs;
    }

    public void setOutputs(ArrayList<OutputParameter> outputs) {
        this.outputs = outputs;
    }

    public ArrayList<OutputParameter> getOutputs() {
        return outputs;
    }
}
