package factory;

import data.Data;
import data.Data1;
import output.actions.CancelMsg;
import output.actions.CancelMsg1;
import output.actions.DisplayMenu;
import output.actions.DisplayMenu1;
import output.actions.GasPumpedMsg;
import output.actions.GasPumpedMsg1;
import output.actions.PayMsg;
import output.actions.PayMsg1;
import output.actions.PrintReceipt;
import output.actions.PrintReceipt1;
import output.actions.PumpGasUnit;
import output.actions.PumpGasUnit1;
import output.actions.ReadyMsg;
import output.actions.ReadyMsg1;
import output.actions.RejectMsg;
import output.actions.RejectMsg1;
import output.actions.ReturnCash;
import output.actions.ReturnCash1;
import output.actions.SetInitialValues;
import output.actions.SetInitialValues1;
import output.actions.SetPrice;
import output.actions.SetPrice1;
import output.actions.StopMsg;
import output.actions.StopMsg1;
import output.actions.StoreCash;
import output.actions.StoreCash1;
import output.actions.StoreData;
import output.actions.StoreData1;
import output.actions.InitializeData;
import output.actions.InitializeData1;
import output.actions.WrongPinMsg;
import output.actions.WrongPinMsg1;
import output.actions.EnterPinMsg;
import output.actions.EnterPinMsg1;
import output.actions.StorePin;
import output.actions.StorePin1;

/*
 * Implementation of AbstractFactory. This class makes the
 * data store object and actions for GusPump1 version.
 */
public class ConcreteFactory1 extends AbstractFactory {
	
	private Data1 d;

	public ConcreteFactory1 (){
		// Creates DataStore1 when factory is created.
		d = new Data1();
	}
	
	/* 
	 * Returns the existing DataStore.
	 * If a new instance of DataStore were created each
	 * time this function is called, the info is lost.
	 */ 
	@Override
	public Data getData() {

		return d;
	}
	
	/*
	 * Returns CancelMsg action for GasPump1 
	 */
	@Override
	public CancelMsg getCancelMsg() {
		return new CancelMsg1();
	}

	/*
	 * Returns DisplayMenu action for GasPump1 
	 */
	@Override
	public DisplayMenu getDisplayMenu() {
		return new DisplayMenu1();
	}

	/*
	 * Returns GasPumpedMsg action for GasPump1 
	 */
	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		return new GasPumpedMsg1();
	}

	/*
	 * Returns PayMsg action for GasPump1 
	 */
	@Override
	public PayMsg getPayMsg() {
		return new PayMsg1();
	}

	/*
	 * Returns PrintReceipt action for GasPump1 
	 */
	@Override
	public PrintReceipt getPrintReceipt() {
		return new PrintReceipt1();
	}

	/*
	 * Returns PumpGasUnit action for GasPump1 
	 */
	@Override
	public PumpGasUnit getPumpGasUnit() {
		return new PumpGasUnit1();
	}

	/*
	 * Returns ReadyMsg action for GasPump1 
	 */
	@Override
	public ReadyMsg getReadyMsg() {
		return new ReadyMsg1();
	}

	/*
	 * Returns RejectMsg action for GasPump1 
	 */
	@Override
	public RejectMsg getRejectMsg() {
		return new RejectMsg1();
	}

	/*
	 * Returns ReturnCash action for GasPump1 
	 */
	@Override
	public ReturnCash getReturnCash() {
		return new ReturnCash1();
	}

	/*
	 * Returns SetInitialValues action for GasPump1 
	 */
	@Override
	public SetInitialValues getInitialValues() {
		return new SetInitialValues1();
	}

	/*
	 * Returns SetPrice action for GasPump1 
	 */
	@Override
	public SetPrice getSetPrice() {
		return new SetPrice1();
	}

	/*
	 * Returns StopMsg action for GasPump1 
	 */
	@Override
	public StopMsg getStopMsg() {
		return new StopMsg1();
	}

	/*
	 * Returns StoreCash action for GasPump1 
	 */
	@Override
	public StoreCash getStoreCash() {
		return new StoreCash1();
	}

	/*
	 * Returns StoreData action for GasPump1 
	 */
	@Override
	public StoreData getStoreData() {
		return new StoreData1();
	}
	/*
	 * Returns InitializeData action for GasPump1 
	 */
	@Override
	public InitializeData getInitializeData() {
		return new InitializeData1();
	}
	
	/*
	 * Returns WrongPinMsg action for GasPump1 
	 */
	@Override
	public WrongPinMsg getWrongPinMsg() {
		return new WrongPinMsg1();
	}
	
	/*
	 * Returns EnterPinMsg action for GasPump1 
	 */
	@Override
	public EnterPinMsg getEnterPinMsg() {
		return new EnterPinMsg1();
	}
	
	/*
	 * Returns StorePin action for GasPump1 
	 */
	@Override
	public StorePin getStorePin() {
		return new StorePin1();
	}

}
