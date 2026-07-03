package interview_preps.elevator;

import interview_preps.elevator.enums.ElevatorDirection;

import java.util.List;

public interface ElevatorSelectionStrategy {

    ElevatorController selectElevator(List<ElevatorController> controllers,
                                      int requestFloor,
                                      ElevatorDirection direction);
}
