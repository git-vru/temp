package de.tum.cit.ase.maze;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import games.spooky.gdx.nativefilechooser.NativeFileChooser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MazeBuilder extends MazeRunnerGame{
    private MazeRunnerGame game;
    private SpriteBatch spriteBatch;
    private Map<List<Integer>, Integer> maps;
    private List<List<int[]>> allMazes = new ArrayList<>();
    public int currentMazeIndex;

    /**
     * Constructor for MazeRunnerGame.
     *
     * @param fileChooser The file chooser for the game, typically used in desktop environment.
     */
    public MazeBuilder(NativeFileChooser fileChooser) {
        super(fileChooser);
    }

    public void setCurrentMazeIndex(int currentMazeIndex) {
        this.currentMazeIndex = currentMazeIndex;
    }
    public void create() {
        loadAllMazes();
        createMaze();
    }
    private void loadAllMazes() {
        List<int[]> mazeData = new ArrayList<>();
        for (int i = 1 ; i <= 5 ; i++) {
            loadMazeData("C:\\Users\\emirh\\IdeaProjects\\fophn2324infun2324projectworkx-g38\\maps\\level-" + i + ".properties", mazeData);
            allMazes.add(mazeData);
        }
    }

    private void loadMazeData(String fileName, List<int[]> mazeData) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    String[] coordinates = parts[0].split(",");
                    if (coordinates.length == 2) {
                        int x = Integer.parseInt(coordinates[0]);
                        int y = Integer.parseInt(coordinates[1]);
                        int objectType = Integer.parseInt(parts[1]);
                        mazeData.add(new int[] {x, y, objectType});
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void createMaze() {
        Texture wallTexture = new Texture("basictiles.png");
        Texture entryPointTexture = new Texture("things.png");
        Texture exitTexture = new Texture("things.png");
        Texture trapTexture = new Texture("things.png");
        Texture enemyTexture = new Texture("mobs.png");
        Texture keyTexture = new Texture("objects.png");
        TextureRegion wall1 = new TextureRegion(wallTexture, 0,0 /*wallTexture.getHeight() - 16*/, 16, 16);
        TextureRegion entryPoint1 = new TextureRegion(entryPointTexture, 0, entryPointTexture.getHeight() - 16, 16, 16);
        TextureRegion exit1 = new TextureRegion(exitTexture, 0, exitTexture.getHeight() - 32, 16, 16);
        TextureRegion trap1 = new TextureRegion(trapTexture, 0, 0, 16, 16);
        TextureRegion enemy1 = new TextureRegion(enemyTexture, 0, (enemyTexture.getHeight() / 2) - 16, 16, 16);
        TextureRegion key1 = new TextureRegion(keyTexture, 0, keyTexture.getHeight() - 8, 8, 8);

        List<int[]> currentMazeData = allMazes.get(currentMazeIndex);
        for (int[] point : currentMazeData) {
            int x = point[0] * 60;
            int y = point[1] * 60;
            int objectType = point[2];
            if (currentMazeIndex == 0) {

            }
            else if (currentMazeIndex == 1) {
                switch (objectType) {
                    case 0:
                        spriteBatch.draw(entryPoint1, x, y, 60, 60);
                        break;
                    case 1:
                        spriteBatch.draw(entryPoint1, x, y, 60, 60);
                        break;
                    case 2:
                        spriteBatch.draw(exit1, x, y, 60, 60);
                        break;
                    case 3:
                        spriteBatch.draw(trap1, x, y, 60, 60);
                        break;
                    case 4:
                        spriteBatch.draw(enemy1, x, y, 60, 60);
                        break;
                    case 5:
                        spriteBatch.draw(key1, x, y, 60, 60);
                        break;
                }
            }
            else if (currentMazeIndex == 2) {
                switch (objectType) {
                    case 0:
                        spriteBatch.draw(entryPoint1, x, y, 60, 60);
                        break;
                    case 1:
                        spriteBatch.draw(entryPoint1, x, y, 60, 60);
                        break;
                    case 2:
                        spriteBatch.draw(exit1, x, y, 60, 60);
                        break;
                    case 3:
                        spriteBatch.draw(trap1, x, y, 60, 60);
                        break;
                    case 4:
                        spriteBatch.draw(enemy1, x, y, 60, 60);
                        break;
                    case 5:
                        spriteBatch.draw(key1, x, y, 60, 60);
                        break;
                }
            }
            else if ( currentMazeIndex == 3) {
                switch (objectType) {
                    case 0:
                        spriteBatch.draw(entryPoint1, x, y, 60, 60);
                        break;
                    case 1:
                        spriteBatch.draw(entryPoint1, x, y, 60, 60);
                        break;
                    case 2:
                        spriteBatch.draw(exit1, x, y, 60, 60);
                        break;
                    case 3:
                        spriteBatch.draw(trap1, x, y, 60, 60);
                        break;
                    case 4:
                        spriteBatch.draw(enemy1, x, y, 60, 60);
                        break;
                    case 5:
                        spriteBatch.draw(key1, x, y, 60, 60);
                        break;
                }
            }
            else if (currentMazeIndex == 4) {
                switch (objectType) {
                    case 0:
                        spriteBatch.draw(entryPoint1, x, y, 60, 60);
                        break;
                    case 1:
                        spriteBatch.draw(entryPoint1, x, y, 60, 60);
                        break;
                    case 2:
                        spriteBatch.draw(exit1, x, y, 60, 60);
                        break;
                    case 3:
                        spriteBatch.draw(trap1, x, y, 60, 60);
                        break;
                    case 4:
                        spriteBatch.draw(enemy1, x, y, 60, 60);
                        break;
                    case 5:
                        spriteBatch.draw(key1, x, y, 60, 60);
                        break;
                }
            }
            spriteBatch.end();
        }
    }
}
