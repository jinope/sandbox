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
public class Node implements Serializable {
    private final double[] transformMatrix = new double[16];
    private Node parent;
    private final List<Node> children = new ArrayList<>();
    private final List<Mesh> meshes = new ArrayList<>();
}
