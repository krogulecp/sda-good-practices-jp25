package info.krogulec.sda.goodpractices.names;

import java.util.List;
import java.util.stream.Collectors;

public class Ships {

    List<Cell> gameBoard;

    public List<Cell> getFlaggedCells() {
        return gameBoard.stream()
                .filter(Cell::isFlagged)
                .collect(Collectors.toList());
    }
}
