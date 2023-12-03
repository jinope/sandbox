package org.example.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Face implements Serializable {
    private final List<Integer> indices = new ArrayList<>();
    private final List<Vertex> vertices = new ArrayList<>();
}
