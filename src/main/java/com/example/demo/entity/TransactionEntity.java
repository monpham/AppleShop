package com.example.demo.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "transaction")
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private List<OrderEntity> orderEntityList;

    @Column(name = "transactionname")
    private String transactionname;
    @Column(name = "transactionmail")
    private String transactionmail;
    @Column(name = "transactionaddress")
    private String transactionaddress;
    @Column(name = "transactionphone")
    private String transactionphone;
    @Column(name = "payment")
    private double payment;
    @Column(name = "security")
    private String security;
    @Column(name = "transactionstatus")
    private boolean transactionstatus;
    @Column(name = "transactiondate")
    private Date transactiondate;




    public TransactionEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<OrderEntity> getOrderEntityList() {
        return orderEntityList;
    }

    public void setOrderEntityList(List<OrderEntity> orderEntityList) {
        this.orderEntityList = orderEntityList;
    }

    public String getTransactionname() {
        return transactionname;
    }

    public void setTransactionname(String transactionname) {
        this.transactionname = transactionname;
    }

    public String getTransactionmail() {
        return transactionmail;
    }

    public void setTransactionmail(String transactionmail) {
        this.transactionmail = transactionmail;
    }

    public String getTransactionaddress() {
        return transactionaddress;
    }

    public void setTransactionaddress(String transactionaddress) {
        this.transactionaddress = transactionaddress;
    }

    public String getTransactionphone() {
        return transactionphone;
    }

    public void setTransactionphone(String transactionphone) {
        this.transactionphone = transactionphone;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public boolean isTransactionstatus() {
        return transactionstatus;
    }

    public void setTransactionstatus(boolean transactionstatus) {
        this.transactionstatus = transactionstatus;
    }

    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }
}
