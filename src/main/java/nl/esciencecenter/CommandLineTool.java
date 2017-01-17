package nl.esciencecenter;

/**
 * Created by niels on 17-1-17.
 */
public class CommandLineTool implements java.io.Serializable {



    Object cwlVersion;
    Object clazz;
    Object inputs;
    Object outputs;
    Object baseCommand;
    Object stdout;

    public Object getCwlVersion() {
        return cwlVersion;
    }

    public void setCwlVersion(Object cwlVersion) {
        this.cwlVersion = cwlVersion;
    }

    public Object getClazz() {
        return clazz;
    }

    public void setClazz(Object clazz) {
        this.clazz = clazz;
    }

    public Object getInputs() {
        return inputs;
    }

    public void setInputs(Object inputs) {
        this.inputs = inputs;
    }

    public Object getOutputs() {
        return outputs;
    }

    public void setOutputs(Object outputs) {
        this.outputs = outputs;
    }

    public Object getBaseCommand() {
        return baseCommand;
    }

    public void setBaseCommand(Object baseCommand) {
        this.baseCommand = baseCommand;
    }

    public Object getStdout() {
        return stdout;
    }

    public void setStdout(Object stdout) {
        this.stdout = stdout;
    }
}
