package com.sda.mvc.controller;

import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.view.GiantView;

public class GiantController {

    private  GiantView giantView;
    private  GiantModel giantModel;

    public GiantController(GiantView giantView, GiantModel giantModel) {
        this.giantView = giantView;
        this.giantModel = giantModel;
    }

    public void setHealth(Health health) {
        this.giantModel.setHealth(health);
    }

    public void updateView() {
        giantView.displayGiant(giantModel);
    }
}
