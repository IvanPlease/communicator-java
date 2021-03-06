package com.communicator.facade;

import com.communicator.domain.NotificationDto;
import com.communicator.service.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class NotificationFacade {
    private final NotificationService service;

    public NotificationDto createNotification(NotificationDto notificationDto) {
        return service.create(notificationDto);
    }

    public List<NotificationDto> getAllNotifications(Long id) {
        return service.getAllByReceiverId(id);
    }

    public void deleteNotification(Long id) {
        service.delete(id);
    }

}
