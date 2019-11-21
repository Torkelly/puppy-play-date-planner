package ppdapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ppdapp.beans.Message;

public interface messageRepository extends JpaRepository<Message, Long> { }