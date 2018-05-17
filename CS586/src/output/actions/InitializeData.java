package output.actions;

import data.Data;

/*
 * Interface of InitializeData action strategy
 * Groups all InitializeData actions under the same interface
 */

public interface InitializeData {
	public void act(Data d);
}