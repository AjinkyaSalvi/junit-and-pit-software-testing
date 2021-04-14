package Homework5;

public class Problem3Class {
	public enum state {Start,OFF,U,X5,X10,N,L};
	
	private state nextState;
	private int B,I,T,X;

	public void operateBinoculars(state currentState, int D, int G, int P, int Z) {
		switch (currentState) {
			case Start: { B=0;I=0;T=0;X=0;nextState=state.OFF;
				break; }
			case OFF: { if (P==1) {
					B=1;I=0;T=0;X=1;nextState=state.U;
					break; }
				else 
					if (G==1) {
					B=1;I=0;T=1;X=0;nextState=state.L;
					break; }
				else
					B=0;I=0;T=0;X=0;nextState=state.OFF;
				break; }
			case U: { if (Z==1) {
					B=1;I=0;T=0;X=2;nextState=state.X5;
					break; }
				else
					if (P==1) {
					B=0;I=0;T=0;X=0;nextState=state.OFF;
					break; }
				else
					B=1;I=0;T=0;X=1;nextState=state.U;
				break; }
			case X5: { if ((G==1)||(P==1)) {
					B=1;I=0;T=0;X=2;nextState=state.X5;
					break; }
				else
					if (Z==1) {
					B=1;I=0;T=0;X=3;nextState=state.X10;
					break; }
				else
					B=1;I=1;T=0;X=2;nextState=state.N;
				break; }
			case X10: { if (Z==1) {
					B=1;I=0;T=0;X=1;nextState=state.U;
					break; }
				else
					B=1;I=0;T=0;X=3;nextState=state.X10;
				break; }
			case N: { if (D==1) {
					B=1;I=0;T=0;X=2;nextState=state.X5;
					break; }
				else
					B=1;I=1;T=0;X=2;nextState=state.N;
				break; }
			case L: { if (P==1) {
					B=0;I=0;T=0;X=0;nextState=state.OFF;
					break; }
				else
					B=1;I=0;T=1;X=0;nextState=state.L;
				break; }
		}
	}

	public state getNextState() {
			return nextState;
		}
		public void setNextState(state nextState) {
			this.nextState = nextState;
		}
		public int getB() {
			return B;
		}
		public void setB(int b) {
			B = b;
		}
		public int getI() {
			return I;
		}
		public void setI(int i) {
			I = i;
		}
		public int getT() {
			return T;
		}
		public void setT(int t) {
			T = t;
		}
		public int getX() {
			return X;
		}
		public void setX(int x) {
			X = x;
		}
}
