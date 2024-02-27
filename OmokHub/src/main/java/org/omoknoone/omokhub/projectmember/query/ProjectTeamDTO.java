package org.omoknoone.omokhub.projectmember.query;

import java.time.LocalTime;

public class ProjectTeamDTO {
    private int projectTeamId;
    private int maxMember;
    private int currentMember;
    private String teamName;
    private LocalTime addedDate;
    private boolean isActive;

    public ProjectTeamDTO() {
    }

    public ProjectTeamDTO(int projectTeamId, int maxMember, int currentMember, String teamName, LocalTime addedDate, boolean isActive) {
        this.projectTeamId = projectTeamId;
        this.maxMember = maxMember;
        this.currentMember = currentMember;
        this.teamName = teamName;
        this.addedDate = addedDate;
        this.isActive = isActive;
    }

    public int getProjectTeamId() {
        return projectTeamId;
    }

    public void setProjectTeamId(int projectTeamId) {
        this.projectTeamId = projectTeamId;
    }

    public int getMaxMember() {
        return maxMember;
    }

    public void setMaxMember(int maxMember) {
        this.maxMember = maxMember;
    }

    public int getCurrentMember() {
        return currentMember;
    }

    public void setCurrentMember(int currentMember) {
        this.currentMember = currentMember;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public LocalTime getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalTime addedDate) {
        this.addedDate = addedDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "ProjectTeamDTO{" +
                "projectTeamId=" + projectTeamId +
                ", maxMember=" + maxMember +
                ", currentMember=" + currentMember +
                ", teamName='" + teamName + '\'' +
                ", addedDate=" + addedDate +
                ", isActive=" + isActive +
                '}';
    }
}
