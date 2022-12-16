package com.hm.digital.inface.biz;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import com.hm.digital.inface.entity.MqRollCall;

public interface MqRollCallService {

  MqRollCall findAll(Specification<MqRollCall> toSpec, Sort sort);
}
