package com.prayansh.rx.pokevision.models;

/**
 * Created by Prayansh on 2016-07-25.
 */
public class PokeScan {
    private String status;
    private String jobId;

    public String getStatus() {
        return status;
    }

    public String getJobId() {
        return jobId;
    }

    @Override
    public String toString() {
        return "PokeScan{" +
                "status='" + status + '\'' +
                ", jobId='" + jobId + '\'' +
                '}';
    }
}
