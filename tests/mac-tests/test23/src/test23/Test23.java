package test23;

import com.embeddedunveiled.serial.SerialComManager;
import com.embeddedunveiled.serial.SerialComManager.BAUDRATE;
import com.embeddedunveiled.serial.SerialComManager.DATABITS;
import com.embeddedunveiled.serial.SerialComManager.FLOWCONTROL;
import com.embeddedunveiled.serial.SerialComManager.PARITY;
import com.embeddedunveiled.serial.SerialComManager.STOPBITS;

public class Test23 {
	public static void main(String[] args) {
		SerialComManager scm = new SerialComManager();
		
		try {
			long DTE = scm.openComPort("/dev/ttyUSB0", true, true, false);
			scm.configureComPortData(DTE, DATABITS.DB_8, STOPBITS.SB_1, PARITY.P_NONE, BAUDRATE.B9600, 0);
			scm.configureComPortControl(DTE, FLOWCONTROL.HARDWARE, 'x', 'x', false, true);
			
			long DTE1 = scm.openComPort("/dev/ttyUSB1", true, true, false);
			scm.configureComPortData(DTE1, DATABITS.DB_8, STOPBITS.SB_1, PARITY.P_NONE, BAUDRATE.B9600, 0);
			scm.configureComPortControl(DTE1, FLOWCONTROL.HARDWARE, 'x', 'x', false, true);
			
			scm.setDTR(DTE, true);
			scm.setDTR(DTE1, true);
			Thread.sleep(100);
			scm.setRTS(DTE, true);
			scm.setRTS(DTE1, true);
			Thread.sleep(100);

			scm.writeString(DTE, "str1", 0);
			Thread.sleep(100);
			scm.writeString(DTE, "str1", 0);
			Thread.sleep(100);
			scm.writeString(DTE, "str1", 0);
			Thread.sleep(100);
			scm.writeString(DTE, "str1", 0);
			scm.writeString(DTE, "str1", 0);
			Thread.sleep(100);
			scm.writeString(DTE, "str1", 0);
			Thread.sleep(100);
			scm.writeString(DTE, "str1", 0);
			Thread.sleep(100);
			scm.writeString(DTE, "str1", 0);
			
			scm.writeString(DTE1, "str1", 0);
			Thread.sleep(100);
			scm.writeString(DTE1, "str1", 0);
			Thread.sleep(100);
			scm.writeString(DTE1, "str1", 0);
			scm.writeString(DTE1, "str1", 0);
			Thread.sleep(100);
			scm.writeString(DTE1, "str1", 0);
			Thread.sleep(100);
			scm.writeString(DTE1, "str1", 0);
			
			Thread.sleep(100000);
			scm.closeComPort(DTE);
			scm.closeComPort(DTE1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}