package sudoku.game;

import java.io.IOException;

public interface IStorage {
    void updateGameData() throws IOException;
    SudokuGame getGameData() throws IOException;
}
