package com.mxxk.lightstar.service.stock;

import com.mxxk.lightstar.entity.Shares;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SharesJpaRepository extends JpaRepository<Shares,Integer> {
}
