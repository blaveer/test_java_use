package com.company.DesignMode.StateModel.ConcreteState;

import com.company.DesignMode.StateModel.Context;
import com.company.DesignMode.StateModel.State;

public class ConcreteState_C extends State {
    @Override
    public void Handler(Context context) {
        System.out.println("现在是状态C");
        context.setState(new ConcreteState_A());
    }
}
