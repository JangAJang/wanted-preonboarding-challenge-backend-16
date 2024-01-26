package com.wanted.preonboarding.reservation.domain.event;

import com.wanted.preonboarding.performance.domain.entity.Performance;
import com.wanted.preonboarding.reservation.domain.valueObject.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "of")
@Getter
public class WaitToReserveEvent {

    UserInfo userInfo;
    Performance performance;
}
