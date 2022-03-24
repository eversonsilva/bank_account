package com.everson.bankaccount.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Banco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean plano;

    @Column(nullable = false, unique = true)
    private String numeroConta;

    @Column
    private BigDecimal saldo;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public boolean getPlano(){
        return plano;
    }

    public void setPlano(boolean plano){
        this.plano = plano;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo(){
        return saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
}
