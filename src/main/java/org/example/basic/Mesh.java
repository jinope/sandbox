package org.example.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Mesh implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final List<Surface> surfaces = new ArrayList<>();
    private final List<Material> materials = new ArrayList<>();
}
