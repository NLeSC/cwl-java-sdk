/**
 * Copyright 2017 Netherlands eScience Center
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.commonwl.cwl;

import org.apache.commons.cli.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class Runner {

    final static Logger logger = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        // create Options object
        Options options = new Options();
        // add options
        options.addOption("outdir", true, "Output directory, defaults to the current directory");
        options.addOption("quiet", false, "No diagnostic output");
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse( options, args);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // return left-over non-recognized options as an array
        String[] leftoverArgs = cmd.getArgs();
        if (leftoverArgs == null || leftoverArgs.length != 2 ) {
            logger.info("error: number positional arguments must be 2");
        }        cmd.getArgs();
        // automatically generate the help statement
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp( "cwlrunner [optional arguments] [workflow] [job_object] \npositional arguments: \n  workflow \n  job_object \n \noptional arguments:", options );
    }
}

