package com.rohitlearns.mysql.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ApiModel(description = "Details about the contact")
@Entity
@Table(name="TOPIC")
public class Topic {

    @Id
    @Column(name = "id")
    @ApiModelProperty(notes = "The Unique Id of the topic")
    private String id;

    @Column(name="name")
    @ApiModelProperty(notes = "Name of the topic")
    private String name;

    @Column(name="description")
    @ApiModelProperty(notes = "The Description of the topic.")
    private String description;

    public Topic() {
    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
