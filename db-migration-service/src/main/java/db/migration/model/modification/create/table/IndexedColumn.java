package db.migration.model.modification.create.table;

import db.migration.model.Column;
import db.migration.model.modification.create.table.enums.Order;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IndexedColumn {
    private Column column;
    private Order order;

    public IndexedColumn() {
    }

    public IndexedColumn(Column column) {
        this.column = column;
    }

    public IndexedColumn(Column column, Order order) {
        this.column = column;
        this.order = order;
    }

    public Column getColumn() {
        return column;
    }
    @XmlElement
    public void setColumn(Column column) {
        this.column = column;
    }

    public Order getOrder() {
        return order;
    }
    @XmlElement
    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        String result = column.getColumnName();
        if(order!=null){
            result+=order.toString();
        }
        return result;
    }
}
