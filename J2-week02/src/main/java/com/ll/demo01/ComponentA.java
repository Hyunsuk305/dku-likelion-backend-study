package com.ll.demo01;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ComponentA {
    private final ComponentB componentB;
    private final ComponentC componentC;
    private final ComponentD componentD;
    private final ComponentE componentE;

    public String action() {
        return "Component action / " + componentB.getAction();
    }
}
