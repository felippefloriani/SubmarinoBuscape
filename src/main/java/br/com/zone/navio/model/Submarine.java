package br.com.zone.navio.model;

/**
 *
 * @author luisfelippefloriani
 */
public class Submarine {

    private int x;
    private int y;
    private int z;
    private Direction direction = Direction.NORTE;

    public void send(String comand) {

        for (char c : comand.toCharArray()) {

            switch (Comand.getComand(c)) {

                case LEFT:
                case RIGHT:
                    this.changeDirection(c);
                    break;

                default:
                    this.move(c);

            }

        }

    }

    private void changeDirection(char c) {

        if (Comand.LEFT.getValue() == c) {
            direction = direction.getPrevious(direction.index);
            return;
        }

        direction = direction.getNext(direction.index);

    }

    private void move(char c) {

        switch (Comand.getComand(c)) {

            case MOVE:

                switch (direction) {

                    case NORTE:
                        y += 1;
                        break;

                    case SUL:
                        y -= 1;
                        break;

                    case LESTE:
                        x += 1;
                        break;

                    case OESTE:
                        x -= 1;

                }

                break;

            case DOWN:
                z -= 1;
                break;

            case UP:
                if(z < 0){
                    z += 1;
                }
                break;

        }

    }

    public String getPosition() {
        return x + " " + y + " " + z + " " + direction.toString();
    }

}
