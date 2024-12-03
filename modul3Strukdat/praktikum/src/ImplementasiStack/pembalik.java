package ImplementasiStack;

import java.util.Stack;

class pembalik {
    String data;
    String kalokebalik = "";
    int maxSize;
    ImplementasiStack.stack stack;

    public pembalik(String input) {
        this.maxSize = input.length();
        this.data = input;
        stack = new stack(maxSize);
    }

    public String hasil() {
        for (int i = 0; i < maxSize; i++) {
            stack.push(data.charAt(i));
        }
        for (int i = 0; i < maxSize; i++) {
            kalokebalik += stack.pop();
        }
        return kalokebalik;
    }
}
