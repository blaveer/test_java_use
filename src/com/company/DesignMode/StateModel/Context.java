package com.company.DesignMode.StateModel;

import com.company.DesignMode.StateModel.ConcreteState.ConcreteState_A;

public class Context {
    private State state;
    public Context(){
        this.state=new ConcreteState_A();
    }

    public void Handle(){
        state.Handler(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
