package com.lwc.repair3.bean;

public class WorkerInfo {
    private String workerId;

    private String workerName;

    private Byte workerSex;

    private Byte workerStatus;

    private Byte workerLevel;

    private Integer workeAmount;

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId == null ? null : workerId.trim();
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName == null ? null : workerName.trim();
    }

    public Byte getWorkerSex() {
        return workerSex;
    }

    public void setWorkerSex(Byte workerSex) {
        this.workerSex = workerSex;
    }

    public Byte getWorkerStatus() {
        return workerStatus;
    }

    public void setWorkerStatus(Byte workerStatus) {
        this.workerStatus = workerStatus;
    }

    public Byte getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(Byte workerLevel) {
        this.workerLevel = workerLevel;
    }

    public Integer getWorkeAmount() {
        return workeAmount;
    }

    public void setWorkeAmount(Integer workeAmount) {
        this.workeAmount = workeAmount;
    }
}