package org.example;

import org.example.basic.*;
import org.example.render.SceneFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Scene> scenes = new ArrayList<>();
        SceneFactory sceneFactory = new SceneFactory(1);
        int count = 1000;
        for (int i = 0; i < count; i++) {
            Scene scene = sceneFactory.createScene();
            String fileName = "scene" + i + ".bin";
            System.out.println("write:" + fileName + ":" + scene);
            writeScene(scene, fileName);
            scenes.add(scene);
            scene = null;
        }

        scenes = null;
        System.gc();
        System.out.println("The world!");

        scenes = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String fileName = "scene" + i + ".bin";
            Scene readedScene = readScene(fileName);
            System.out.println("read:" + fileName + ":" + readedScene);
            scenes.add(readedScene);
            //readedScene = null;
        }

        System.out.println("The world!");
        scenes = null;
        System.gc();
        System.out.println("Bye world!");
    }

    private static void writeScene(Scene scene, String fileName) {
        File file = new File("D:/Sample/");
        File output = new File(file, fileName);
        try (ObjectOutputStream stream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(output)))) {
            stream.writeObject(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Scene readScene(String fileName) {
        Scene scene = null;
        File file = new File("D:/Sample/");
        File input = new File(file, fileName);
        try (ObjectInputStream stream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(input)))) {
            scene = (Scene) stream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
        return scene;
    }
}