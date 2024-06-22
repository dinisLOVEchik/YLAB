package service;

import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class Booking {
    private Long id;
    private User user;
    private Resource resource;
    private LocalDateTime startDate;
    private LocalDateTime endTime;

    public Booking(Long id, User user, Resource resource, LocalDateTime startDate, LocalDateTime endTime) {
        this.id = id;
        this.user = user;
        this.resource = resource;
        this.startDate = startDate;
        this.endTime = endTime;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Resource getResource() {
        return resource;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}