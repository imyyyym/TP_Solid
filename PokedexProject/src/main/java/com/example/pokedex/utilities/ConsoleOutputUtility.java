package com.example.pokedex.utilities;

public class ConsoleOutputUtility {
    private OutputFormat outputFormat;
    private TextFormatGenerator textFormatGenerator;
    private HTMLFormatGenerator htmlFormatGenerator;
    private CSVFormatGenerator csvFormatGenerator;

    public ConsoleOutputUtility(OutputFormat outputFormat, TextFormatGenerator textFormatGenerator,
                                HTMLFormatGenerator htmlFormatGenerator, CSVFormatGenerator csvFormatGenerator) {
        this.outputFormat = outputFormat;
        this.textFormatGenerator = textFormatGenerator;
        this.htmlFormatGenerator = htmlFormatGenerator;
        this.csvFormatGenerator = csvFormatGenerator;
    }

    public ConsoleOutputUtility(OutputFormat outputFormat) {
    }

    public void makeOutput() {
        if (this.outputFormat == OutputFormat.TEXT) {
            System.out.println(textFormatGenerator.generateHumanReadableText());
        } else if (this.outputFormat == OutputFormat.HTML) {
            System.out.println(htmlFormatGenerator.generateHTML());
        } else if (this.outputFormat == OutputFormat.CSV) {
            System.out.println(csvFormatGenerator.generateCSV());
        }
    }
}