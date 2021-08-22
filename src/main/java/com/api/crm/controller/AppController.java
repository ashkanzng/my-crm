package com.api.crm.controller;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;


@Route("")
public class AppController extends AppLayout {

    private HorizontalLayout layout;

    public AppController(){
        addToNavbar(true, createHeaderContent());
    }

    private Component createHeaderContent() {
        layout = new HorizontalLayout(new H1("Hello"));
        return layout;
    }
}
