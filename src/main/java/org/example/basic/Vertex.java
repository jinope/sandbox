package org.example.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Vertex implements Serializable {
    private double[] position;
    private double[] normal;
    private double[] texCoord;
}
