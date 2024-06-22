package service.impl;

import service.Application;
import service.Workspace;
import service.MeetingRoom;

import service.Resource;

public class ResourceServiceImpl {
    public void addResource(Resource resource) {
        if (resource instanceof Workspace) {
            Application.getInstance().addWorkspace((Workspace) resource);
        } else if (resource instanceof MeetingRoom) {
            Application.getInstance().addRoom((MeetingRoom) resource);
        }
    }
}