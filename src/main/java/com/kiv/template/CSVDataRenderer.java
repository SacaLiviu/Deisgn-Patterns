package com.kiv.template;

public class CSVDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        return "csv data";
    }

    @Override
    public String processData(String data) {
        return "Processed:"+data;
    }
}
