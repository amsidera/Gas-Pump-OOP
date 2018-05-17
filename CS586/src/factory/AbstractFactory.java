package factory;

import data.Data;
import output.actions.CancelMsg;
import output.actions.DisplayMenu;
import output.actions.GasPumpedMsg;
import output.actions.PayMsg;
import output.actions.PrintReceipt;
import output.actions.PumpGasUnit;
import output.actions.ReadyMsg;
import output.actions.RejectMsg;
import output.actions.ReturnCash;
import output.actions.SetInitialValues;
import output.actions.SetPrice;
import output.actions.StopMsg;
import output.actions.StoreCash;
import output.actions.StoreData;
import output.actions.InitializeData;
import output.actions.WrongPinMsg;
import output.actions.EnterPinMsg;
import output.actions.StorePin;

/*
 * This abstract class defines all the methods that the
 * factory needs to implements.
 * It contains the method to get the DataStore and the
 * methods to get all the actions.
 */

public abstract class AbstractFactory {
	public abstract Data getData();
	
	public abstract CancelMsg getCancelMsg();
	public abstract DisplayMenu getDisplayMenu();
	public abstract GasPumpedMsg getGasPumpedMsg();
	public abstract PayMsg getPayMsg();
	public abstract PrintReceipt getPrintReceipt();
	public abstract PumpGasUnit getPumpGasUnit();
	public abstract ReadyMsg getReadyMsg();
	public abstract RejectMsg getRejectMsg();
	public abstract ReturnCash getReturnCash();
	public abstract SetInitialValues getInitialValues();
	public abstract SetPrice getSetPrice();
	public abstract StopMsg getStopMsg();
	public abstract StoreCash getStoreCash();
	public abstract StoreData getStoreData();
	public abstract InitializeData getInitializeData();
	public abstract WrongPinMsg getWrongPinMsg();
	public abstract EnterPinMsg getEnterPinMsg();
	public abstract StorePin getStorePin();
}
