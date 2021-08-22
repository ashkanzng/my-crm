package com.api.crm.view;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;


/**
 * The main view is a top-level placeholder for other views.
 */
@PWA(name = "vaadin-crm", shortName = "vaadin-crm", enableInstallPrompt = false)
@Theme(themeFolder = "vaadin-crm")
@PageTitle("Main")
@Route("")
public class MainLayout extends AppLayout {

    private HorizontalLayout layout;
    private H3 viewTitle;

    public MainLayout(){
        addToNavbar(true, createHeaderContent());
    }

    private Component createHeaderContent() {
        layout = new HorizontalLayout();
        HorizontalLayout layout = new HorizontalLayout();
        layout.getThemeList().set("dark", true);
        layout.setWidthFull();
        layout.setSpacing(false);
        layout.setAlignItems(FlexComponent.Alignment.CENTER);
        viewTitle = new H3("Tables");
        layout.add(viewTitle);
        return layout;
    }
}
