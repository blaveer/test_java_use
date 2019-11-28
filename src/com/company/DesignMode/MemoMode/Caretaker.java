package com.company.DesignMode.MemoMode;

/**管理者*/
/**个人觉得这个备忘录的代码有点奇怪，是不是应该在这个类中用一个数组将全部的备忘录存储起来，不然这明显没法存储大量的备忘录呀*/
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
