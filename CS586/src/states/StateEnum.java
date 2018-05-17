package states;

/*
 * Enumeration to handles states in the
 * state machine
 */

public enum StateEnum {
	Start(0), S0(1), S1(2), S2(3),
	S3(4), S4(5), S5(6), S6(7), S8(8);
    int id;
    private StateEnum(int i){id = i;}
    public int id(){return id;}
}