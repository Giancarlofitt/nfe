package com.fincatto.documentofiscal.cte.classes.distribuicao;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

import com.fincatto.documentofiscal.DFBase;

@Root(name = "docZip")
public class CTDistribuicaoDocumentoZip extends DFBase {

    @Text
    private String value;

    @Attribute(name = "NSU")
    private String nsu;

    @Attribute(name = "schema")
    private String schema;

    public String getValue() {
        return this.value;
    }

    public String getNsu() {
        return this.nsu;
    }

    public void setNsu(final String nsu) {
        this.nsu = nsu;
    }

    public String getSchema() {
        return this.schema;
    }

    public void setSchema(final String schema) {
        this.schema = schema;
    }

    public void setValue(final String value) {
        this.value = value;
    }

}