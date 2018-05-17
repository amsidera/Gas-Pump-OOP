package output;

import data.Data;
import factory.AbstractFactory;
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
 * This class represents the output processor for the
 * system. Needs to be initialized with the proper
 * AbstractFactory implementation. This class forwards
 * the call to the appropriate action and gives the
 * data store reference if needed.
 */

public class OutputProcessor {
	
	private Data d;
	private StoreData StoreData;
	private PayMsg PayMsg;
	private StoreCash StoreCash;
	private DisplayMenu DisplayMenu;
	private RejectMsg RejectMsg;
	private CancelMsg CancelMsg;
	private SetPrice SetPrice;
	private SetInitialValues SetInitialValues;
	private ReadyMsg ReadyMsg;
	private PumpGasUnit PumpGasUnit;
	private GasPumpedMsg GasPumpedMsg;
	private StopMsg StopMsg;
	private PrintReceipt PrintReceipt;
	private ReturnCash ReturnCash;
	private InitializeData InitializeData;
	private WrongPinMsg WrongPinMsg;
	private EnterPinMsg EnterPinMsg;
	private StorePin StorePin;
	
	public OutputProcessor(AbstractFactory af){
		d = af.getData();
		StoreData = af.getStoreData();
		PayMsg = af.getPayMsg();
		StoreCash = af.getStoreCash();
		DisplayMenu = af.getDisplayMenu();
		RejectMsg = af.getRejectMsg();
		CancelMsg = af.getCancelMsg();
		SetPrice = af.getSetPrice();
		SetInitialValues = af.getInitialValues();
		ReadyMsg = af.getReadyMsg();
		PumpGasUnit = af.getPumpGasUnit();
		GasPumpedMsg = af.getGasPumpedMsg();
		StopMsg = af.getStopMsg();
		PrintReceipt = af.getPrintReceipt();
		ReturnCash = af.getReturnCash();
		InitializeData = af.getInitializeData();
		WrongPinMsg = af.getWrongPinMsg();
		EnterPinMsg = af.getEnterPinMsg();
		StorePin = af.getStorePin();
	}
	
	/*
	 * StoreData action
	 */
	public void StoreData(){
		StoreData.act(d);
	}
	/*
	 * PayMsg action
	 */
	public void PayMsg(){
		PayMsg.act();
	}
	/*
	 * StoreCash action
	 */
	public void StoreCash(){
		StoreCash.act(d);
	}
	/*
	 * DisplayMenu action
	 */
	public void DisplayMenu(){
		DisplayMenu.act();
	}
	/*
	 * RejectMsg action
	 */
	public void RejectMsg(){
		RejectMsg.act();
	}
	/*
	 * CancelMsg action
	 */
	public void CancelMsg(){
		CancelMsg.act();
	}
	/*
	 * SetPrice action
	 */
	public void SetPrice(int g){
		SetPrice.act(g, d);
	}
	/*
	 * SetInitialValues action
	 */
	public void SetInitialValues(){
		SetInitialValues.act(d);
	}
	/*
	 * ReadyMsg action
	 */
	public void ReadyMsg(){
		ReadyMsg.act();
	}
	/*
	 * PumpGasUnit action
	 */
	public void PumpGasUnit(){
		PumpGasUnit.act(d);
	}
	/*
	 * GasPumpedMsg action
	 */
	public void GasPumpedMsg(){
		GasPumpedMsg.act(d);
	}
	/*
	 * StopMsg action
	 */
	public void StopMsg(){
		StopMsg.act();
	}
	/*
	 * PrintReceipt action
	 */
	public void PrintReceipt(){
		PrintReceipt.act(d);
	}
	/*
	 * ReturnCash action
	 */
	public void ReturnCash(){
		ReturnCash.act(d);
	}
	/*
	 * InitializeData action
	 */
	public void InitializeData(){
		InitializeData.act(d);
	}
	/*
	 * WrongPinMsg action
	 */
	public void WrongPinMsg(){
		WrongPinMsg.act();
	}
	/*
	 * EnterPinMsg action
	 */
	public void EnterPinMsg(){
		EnterPinMsg.act();
	}
		/*
	 * StorePin action
	 */
	public void StorePin(){
		StorePin.act(d);
	}
}