package org.example.render;

import lombok.AllArgsConstructor;
import org.example.basic.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class SceneFactory {

    private final int depth;

    public Scene createScene() {
        Node rootNode = createNode(null);
        Scene scene = new Scene(rootNode);
        for (int i = 0; i < depth; i++) {
            Node node = createNode(rootNode);
            rootNode.getChildren().add(node);
        }
        return scene;
    }

    private Node createNode(Node parent) {
        Node node = new Node(parent);
        for (int i = 0; i < 10; i++) {
            Mesh mesh = createMesh();
            node.getMeshes().add(mesh);
        }
        return node;
    }

    private Mesh createMesh() {
        Mesh mesh = new Mesh();
        for (int i = 0; i < 10; i++) {
            Surface surface = createSurface();
            mesh.getSurfaces().add(surface);
        }
        return mesh;
    }

    private Surface createSurface() {
        Surface surface = new Surface();
        for (int i = 0; i < 10; i++) {
            Face face = createFace();
            surface.getFaces().add(face);
        }
        return surface;
    }

    private Face createFace() {
        Face face = new Face();
        for (int i = 0; i < 10; i++) {
            Vertex vertex = createVertex();
            face.getVertices().add(vertex);
        }
        return face;
    }

    private Vertex createVertex() {
        double[] position = new double[3];
        double[] normal = new double[3];
        double[] texCoord = new double[2];
        return new Vertex(position, normal, texCoord);
    }
}
