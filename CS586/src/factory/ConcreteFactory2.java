package factory;

import data.Data;
import data.Data2;
import output.actions.CancelMsg;
import output.actions.CancelMsg2;
import output.actions.DisplayMenu;
import output.actions.DisplayMenu2;
import output.actions.GasPumpedMsg;
import output.actions.GasPumpedMsg2;
import output.actions.PayMsg;
import output.actions.PayMsg2;
import output.actions.PrintReceipt;
import output.actions.PrintReceipt2;
import output.actions.PumpGasUnit;
import output.actions.PumpGasUnit2;
import output.actions.ReadyMsg;
import output.actions.ReadyMsg2;
import output.actions.RejectMsg;
import output.actions.RejectMsg2;
import output.actions.ReturnCash;
import output.actions.ReturnCash2;
import output.actions.SetInitialValues;
import output.actions.SetInitialValues2;
import output.actions.SetPrice;
import output.actions.SetPrice2;
import output.actions.StopMsg;
import output.actions.StopMsg2;
import output.actions.StoreCash;
import output.actions.StoreCash2;
import output.actions.StoreData;
import output.actions.StoreData2;
import output.actions.InitializeData;
import output.actions.InitializeData2;
import output.actions.WrongPinMsg;
import output.actions.WrongPinMsg2;
import output.actions.EnterPinMsg;
import output.actions.EnterPinMsg2;
import output.actions.StorePin;
import output.actions.StorePin2;


/*
 * Implementation of AbstractFactory. This class makes the
 * data store object and actions for GusPump2 version.
 */
public class ConcreteFactory2 extends AbstractFactory {

	private Data2 d;
	
	public ConcreteFactory2(){
		// Creates DataStore2 when factory is created.
		d = new Data2();
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
	 * Returns CancelMsg action for GasPump2 
	 */
	@Override
	public CancelMsg getCancelMsg() {
		return new CancelMsg2();
	}

	/*
	 * Returns DisplayMenu action for GasPump2 
	 */
	@Override
	public DisplayMenu getDisplayMenu() {
		return new DisplayMenu2();
	}

	/*
	 * Returns GasPumpedMsg action for GasPump2 
	 */
	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		return new GasPumpedMsg2();
	}

	/*
	 * Returns PayMsg action for GasPump2 
	 */
	@Override
	public PayMsg getPayMsg() {
		return new PayMsg2();
	}

	/*
	 * Returns PrintReceipt action for GasPump2 
	 */
	@Override
	public PrintReceipt getPrintReceipt() {
		return new PrintReceipt2();
	}

	/*
	 * Returns PumpGasUnit action for GasPump2 
	 */
	@Override
	public PumpGasUnit getPumpGasUnit() {
		return new PumpGasUnit2();
	}

	/*
	 * Returns ReadyMsg action for GasPump2 
	 */
	@Override
	public ReadyMsg getReadyMsg() {
		return new ReadyMsg2();
	}

	/*
	 * Returns RejectMsg action for GasPump2 
	 */
	@Override
	public RejectMsg getRejectMsg() {
		return new RejectMsg2();
	}

	/*
	 * Returns ReturnCash action for GasPump2 
	 */
	@Override
	public ReturnCash getReturnCash() {
		return new ReturnCash2();
	}

	/*
	 * Returns SetInitialValues action for GasPump2 
	 */
	@Override
	public SetInitialValues getInitialValues() {
		return new SetInitialValues2();
	}

	/*
	 * Returns SetPrice action for GasPump2 
	 */
	@Override
	public SetPrice getSetPrice() {
		return new SetPrice2();
	}

	/*
	 * Returns StopMsg action for GasPump2 
	 */
	@Override
	public StopMsg getStopMsg() {
		return new StopMsg2();
	}

	/*
	 * Returns StoreCash action for GasPump2 
	 */
	@Override
	public StoreCash getStoreCash() {
		return new StoreCash2();
	}

	/*
	 * Returns StoreData action for GasPump2 
	 */
	@Override
	public StoreData getStoreData() {
		return new StoreData2();
	}
	/*
	 * Returns InitializeData action for GasPump2 
	 */
	@Override
	public InitializeData getInitializeData() {
		return new InitializeData2();
	}
	/*
	 * Returns WrongPinMsg action for GasPump2 
	 */
	@Override
	public WrongPinMsg getWrongPinMsg() {
		return new WrongPinMsg2();
	}
	
	/*
	 * Returns InitializeData action for GasPump2
	 */
	@Override
	public EnterPinMsg getEnterPinMsg() {
		return new EnterPinMsg2();
	}
	
		/*
	 * Returns StorePin action for GasPump2 
	 */
	@Override
	public StorePin getStorePin() {
		return new StorePin2();
	}

}
