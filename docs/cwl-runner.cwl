#!/usr/bin/env cwl-runner
class: CommandLineTool
cwlVersion: v1.1.0-dev1

doc: |
 Generic interface to run a Common Workflow Language tool or workflow from the
 command line. To be implemented by each CWL compliant execution platform for
 testing conformance to the standard and optionally for use by users.

inputs:
 outdir:
   type: string?
   doc: |
    Output directory, defaults to the current directory
   inputBinding:
    prefix: "--outdir"

 quiet:
   type: boolean?
   doc: no diagnostic output
   inputBinding:
    prefix: "--quiet"

 processfile:
   type: File?
   doc: |
    The CommandLineTool, ExpressionTool, or Workflow description to run.
    Optional if the jobfile has a `cwl:tool` field to indicate which process
    description to run.
   inputBinding:
    position: 1

 jobfile:
   type: File
   doc: The input job document.
   inputBinding:
    position: 2

baseCommand: cwl-runner

outputs:
  log: stderr
  output_object_document: stdout  # in the CWL Output Object Document format

successCodes:
 - 0  # success

permanentFailCodes:
  - 33 # failure due to unimplemented feature
