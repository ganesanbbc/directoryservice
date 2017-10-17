package com.pal.microservice.directory;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;

@Component
class DBInfo {
    private String url;

    public DBInfo(DataSource dataSource) throws SQLException {
        this.url = dataSource.getConnection().getMetaData().getURL();
    }

    public String getUrl() {
        return url;
    }
}