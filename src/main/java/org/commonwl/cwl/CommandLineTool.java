package org.commonwl.cwl;

public class CommandLineTool extends Process {
    private String baseCommand;

    public CommandLineTool(String id) {
        super(id);
    }

    public CommandLineTool(String id, String baseCommand) {
        super(id);
        this.baseCommand = baseCommand;
    }

    public void setBaseCommand(String baseCommand) {
        this.baseCommand = baseCommand;
    }

    public String getBaseCommand() {
        return baseCommand;
    }
}
