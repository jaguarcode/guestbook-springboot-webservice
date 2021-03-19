package com.jaguarcode.guestbook.repository;

import com.jaguarcode.guestbook.entity.Guestbook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface GuestbookRepository
        extends JpaRepository<Guestbook, Long>, QuerydslPredicateExecutor<Guestbook> {
}
