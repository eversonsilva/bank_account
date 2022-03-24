package com.everson.bankaccount.repository;

import com.everson.bankaccount.entity.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoRepository extends JpaRepository<Banco, Long> {
}
