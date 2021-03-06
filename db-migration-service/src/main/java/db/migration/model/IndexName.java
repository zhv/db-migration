package db.migration.model;

import javax.xml.bind.annotation.XmlAttribute;

public class IndexName implements MultiName{
    private String schemaName;
    private String indexName;

    public IndexName() {
    }

    public IndexName(String indexName) {
        this.indexName = indexName;
    }

    public IndexName(String schemaName, String indexName) {
        this.schemaName = schemaName;
        this.indexName = indexName;
    }

    public String getSchemaName() {
        return schemaName;
    }
    @XmlAttribute
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getIndexName() {
        return indexName;
    }
    @XmlAttribute
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @Override
    public String getFullName() {
        String fullName = "";
        if (schemaName != null){
            fullName+=schemaName;
            if(!fullName.isEmpty()){
                fullName+=".";
            }
        }
        if (indexName != null){
            fullName+=indexName;
        }
        return fullName;
    }
}
