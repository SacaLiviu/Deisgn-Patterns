package com.kiv.template;

public class XMLDataRenderer extends DataRenderer {
    @Override
    public String readData() {
        return "xml data";
    }

    @Override
    public String processData(String data) {
        return "Processed:"+data;
    }
}
