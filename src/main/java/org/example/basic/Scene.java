package org.example.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Externalizable;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Scene implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final Node node;
}
