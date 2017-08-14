package com.spring.ioc.SpringIoc.annotationconfig.beans;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class AnnotationGame {

    @Autowired
    private AnnotationPlayer[] players;

    private Set<AnnotationPlayer> playerCollection;

    public AnnotationPlayer[] getPlayers() {
        return players;
    }

    public void setPlayers(AnnotationPlayer[] players) {
        this.players = players;
    }

    public Set<AnnotationPlayer> getPlayerCollection() {
        return playerCollection;
    }

    @Autowired
    public void setPlayerCollection(Set<AnnotationPlayer> playerCollection) {
        this.playerCollection = playerCollection;
    }
}
