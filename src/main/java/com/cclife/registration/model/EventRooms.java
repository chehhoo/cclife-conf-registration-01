/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cclife.registration.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ephesus
 */
@Entity
@Table(name = "event_rooms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EventRooms.findAll", query = "SELECT e FROM EventRooms e"),
    @NamedQuery(name = "EventRooms.findByRoomID", query = "SELECT e FROM EventRooms e WHERE e.roomID = :roomID"),
    @NamedQuery(name = "EventRooms.findByEventID", query = "SELECT e FROM EventRooms e WHERE e.eventID = :eventID"),
    @NamedQuery(name = "EventRooms.findByDescription", query = "SELECT e FROM EventRooms e WHERE e.description = :description"),
    @NamedQuery(name = "EventRooms.findByCapacity", query = "SELECT e FROM EventRooms e WHERE e.capacity = :capacity"),
    @NamedQuery(name = "EventRooms.findByStatus", query = "SELECT e FROM EventRooms e WHERE e.status = :status"),
    @NamedQuery(name = "EventRooms.findBySpaceLeft", query = "SELECT e FROM EventRooms e WHERE e.spaceLeft = :spaceLeft"),
    @NamedQuery(name = "EventRooms.findByKeysCheckOut", query = "SELECT e FROM EventRooms e WHERE e.keysCheckOut = :keysCheckOut"),
    @NamedQuery(name = "EventRooms.findByKeysCheckIn", query = "SELECT e FROM EventRooms e WHERE e.keysCheckIn = :keysCheckIn"),
    @NamedQuery(name = "EventRooms.findByType", query = "SELECT e FROM EventRooms e WHERE e.type = :type")})
public class EventRooms implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "RoomID")
    private String roomID;
    @Size(max = 50)
    @Column(name = "EventID")
    private String eventID;
    @Size(max = 50)
    @Column(name = "Description")
    private String description;
    @Column(name = "Capacity")
    private Integer capacity;
    @Size(max = 1)
    @Column(name = "Status")
    private String status;
    @Column(name = "SpaceLeft")
    private Integer spaceLeft;
    @Column(name = "KeysCheckOut")
    private Integer keysCheckOut;
    @Column(name = "KeysCheckIn")
    private Integer keysCheckIn;
    @Size(max = 50)
    @Column(name = "Type")
    private String type;

    public EventRooms() {
    }

    public EventRooms(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSpaceLeft() {
        return spaceLeft;
    }

    public void setSpaceLeft(Integer spaceLeft) {
        this.spaceLeft = spaceLeft;
    }

    public Integer getKeysCheckOut() {
        return keysCheckOut;
    }

    public void setKeysCheckOut(Integer keysCheckOut) {
        this.keysCheckOut = keysCheckOut;
    }

    public Integer getKeysCheckIn() {
        return keysCheckIn;
    }

    public void setKeysCheckIn(Integer keysCheckIn) {
        this.keysCheckIn = keysCheckIn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomID != null ? roomID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventRooms)) {
            return false;
        }
        EventRooms other = (EventRooms) object;
        if ((this.roomID == null && other.roomID != null) || (this.roomID != null && !this.roomID.equals(other.roomID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cclife.registration.model.EventRooms[ roomID=" + roomID + " ]";
    }
    
}
