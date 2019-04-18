package com.starbeat.microservice.ftpStarbeatArchive.dal.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.starbeat.microservice.ftpStarbeatArchive.dal.model.MicroserviceLog;

@Service
public interface MicroserviceLogDao extends MongoRepository<MicroserviceLog, String> {

}