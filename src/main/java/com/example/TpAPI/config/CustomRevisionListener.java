package com.example.TpAPI.config;

import org.springframework.data.history.Revision;

import java.io.Serializable;

public class CustomRevisionListener implements Serializable {
    public void newRevision(Object revisionEntity) {  final Revision revision = (Revision) revisionEntity;
    }
}
