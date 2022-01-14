package com.jtelaa.bwbot.bwlib;

import java.io.Serializable;

/**
 * Object for search queries
 * 
 * @since 2
 * @author Joseph
 */

public class Query implements Serializable {
    
    /** Query */
    public String query; 

    /**
     * Constructor
     * 
     * @param query The query (Not formatted)
     */

    public Query(String query) {
        this.query = query;

    }

    /** Check if the query is properly formatted */
    public boolean isFormatted() { return query.contains(" "); }

    /** Return query */
    public String toString() { return formatQuery().getQuery(); }

    /** Return query with the proper formatting (+ instead of spaced ) */
    public String getQuery() { return formatQuery().getQuery(); }

    /** Query without spacing */
    public String getRawQuery() { return unformatQuery().getQuery(); }

    /** Format query @return formatted query */
    public Query formatQuery() { return new Query(query.replaceAll(" ", "+")); }
    
    /** Unformat query @return unformatted query */
    public Query unformatQuery() { return new Query(query.replaceAll("+", " ")); }
    
}
