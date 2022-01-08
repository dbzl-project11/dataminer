package com.dbzl.dataminer;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Dataminer {


    static String rootDir = "/media/jordan/Opt/dbz_league/baseGameFiles";

    public static void main(String [] args) throws IOException {
        File root = new File(rootDir);
        String generalParamFileName = "017_character_param.dat";
        String b1ParamFileName = "024_character_blast_1_param.dat";
        File [] gameFiles = root.listFiles();
        StringBuilder files = new StringBuilder(10000);
        for(File characterFile : gameFiles){
            File paramFile = new File(characterFile.getAbsolutePath() + "/" +b1ParamFileName);
            System.out.println("opening " + paramFile.getAbsolutePath());
            B1ParamFile params = new B1ParamFile(Files.readAllBytes(paramFile.getAbsoluteFile().toPath()));
            files.append(characterFile.getName()).append('\n').append(params).append("\n'\n");
        }

        Files.write(Paths.get(rootDir, "out-b1.txt"), files.toString().getBytes(StandardCharsets.UTF_8));

    }
}
