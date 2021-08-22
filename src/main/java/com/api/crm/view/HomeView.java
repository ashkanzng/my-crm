package com.api.crm.view;

import com.api.crm.component.LayoutComponent;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.listbox.ListBox;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@PageTitle("Home")
@Route(value = "home", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HomeView extends HorizontalLayout {

    private VerticalLayout columnLayout;
    private HorizontalLayout operationLayout;
    private TextField tableName;
    private TextField columnName;
    private Set<String> newTableColumns;
    private Grid<Map<String, String>> grid;
    private VerticalLayout dataFormLayout;
    private ListBox<String> listBox;
    private String[] allTables;
    private LayoutComponent layoutComponent;
    private FormLayout dataForm;
    private FormLayout columnForm;

    public HomeView() {
        initializing();
//        createTableForm();
//        showTables();
        add(layoutComponent.getMainLayout(),layoutComponent.getGridLayout());
    }

    private void initializing(){
        newTableColumns = new HashSet<>();
        //allTables = ApiClient.getAllTables();

        layoutComponent = new LayoutComponent();
        grid = new Grid<>();
        //grid.addItemClickListener(e -> fillDataForm(e.getItem()));
        grid.setMaxHeight("450px");
        layoutComponent.getGridLayout().add(grid);
        dataForm = new FormLayout();
        dataForm.setResponsiveSteps(
                new FormLayout.ResponsiveStep("0", 1),
                new FormLayout.ResponsiveStep("350px", 2),
                new FormLayout.ResponsiveStep("500px", 3),
                new FormLayout.ResponsiveStep("700px", 4)
        );
        columnForm = new FormLayout();
        columnForm.setResponsiveSteps(
                new FormLayout.ResponsiveStep("0", 1),
                new FormLayout.ResponsiveStep("350px", 2),
                new FormLayout.ResponsiveStep("600px", 3)
        );
        tableName = new TextField("Table name");
        columnName = new TextField("Column name");

    }
}
