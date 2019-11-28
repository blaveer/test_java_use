package com.company.DesignMode.MemoMode;
/**发起者*/
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }
    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
