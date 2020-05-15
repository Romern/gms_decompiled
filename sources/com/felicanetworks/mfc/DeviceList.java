package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;
import java.util.Enumeration;
import java.util.Hashtable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.DeviceList.C00991 */

        public DeviceList createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new DeviceList(parcel);
        }

        public DeviceList[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new DeviceList[i];
        }
    };
    private static final Device DEVICE_DISPLAY = new Device("Generic", "Display");
    private static final Device DEVICE_FELICA = new Device("FeliCa", "R/W");
    private static final String EXC_ID_GEN_FAILED = "Failed to generate a new id.";
    private static final String EXC_MAX_SIZE = "The size of this list exceeds the maximum value.";
    public static final int ID_DISPLAY = 2;
    public static final int ID_FELICA = 1;
    private static final int ID_OFFSET = 4096;
    private static final int MAX_ID = 65534;
    public static final int MAX_SIZE = 64;
    private Hashtable deviceList;
    private int nextID;

    public DeviceList() {
        this.deviceList = new Hashtable();
        reset();
    }

    private Integer getID(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        Enumeration keys = this.deviceList.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            if (((Device) this.deviceList.get(num)).getName().equals(str2)) {
                return num;
            }
        }
        return null;
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        this.deviceList = new Hashtable();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.deviceList.put(Integer.valueOf(parcel.readInt()), (Device) parcel.readParcelable(Device.class.getClassLoader()));
        }
        this.nextID = parcel.readInt();
        LogMgr.log(6, "001 deviceList len=%d", Integer.valueOf(this.deviceList.size()));
    }

    private void reset() {
        this.deviceList.clear();
        this.deviceList.put(new Integer(1), DEVICE_FELICA);
        this.deviceList.put(new Integer(2), DEVICE_DISPLAY);
        this.nextID = 4096;
    }

    public synchronized int add(String str, String str2) {
        Device device = new Device(str, str2);
        Integer id = getID(str, str2);
        if (id != null) {
            return id.intValue();
        } else if (this.deviceList.size() != 64) {
            int i = this.nextID;
            if (i <= MAX_ID) {
                this.deviceList.put(new Integer(i), device);
                int i2 = this.nextID;
                this.nextID = i2 + 1;
                return i2;
            }
            throw new IllegalStateException(EXC_ID_GEN_FAILED);
        } else {
            throw new IllegalStateException(EXC_MAX_SIZE);
        }
    }

    public void checkFormat() {
        LogMgr.log(4, "%s", "000");
        Hashtable hashtable = this.deviceList;
        if (hashtable == null || hashtable.size() < 2 || this.deviceList.size() > 64) {
            LogMgr.log(1, "%s DeviceList is invalid data", "800");
            throw new IllegalArgumentException();
        }
        int i = 0;
        if (this.deviceList.containsKey(0) || this.deviceList.containsKey(65535)) {
            LogMgr.log(1, "%s DeviceID is invalid data", "801");
            throw new IllegalArgumentException();
        }
        int i2 = 3;
        while (i2 < 4096) {
            if (!this.deviceList.containsKey(Integer.valueOf(i2))) {
                i2++;
            } else {
                LogMgr.log(1, "%s DeviceID is invalid data", "802");
                throw new IllegalArgumentException();
            }
        }
        Device device = get(1);
        if (device == null || !device.getType().equals(DEVICE_FELICA.getType()) || !device.getName().equals(DEVICE_FELICA.getName())) {
            LogMgr.log(1, "%s Device_FeliCa is invalid data", "803");
            throw new IllegalArgumentException();
        }
        Device device2 = get(2);
        if (device2 == null || !device2.getType().equals(DEVICE_DISPLAY.getType()) || !device2.getName().equals(DEVICE_DISPLAY.getName())) {
            LogMgr.log(1, "%s Device_Display is invalid data", "804");
            throw new IllegalArgumentException();
        }
        int size = this.deviceList.size();
        int[] iArr = new int[size];
        Enumeration keys = this.deviceList.keys();
        int i3 = 0;
        while (keys.hasMoreElements()) {
            iArr[i3] = ((Integer) keys.nextElement()).intValue();
            i3++;
        }
        while (i < size) {
            Device device3 = (Device) this.deviceList.get(Integer.valueOf(iArr[i]));
            device3.checkFormat();
            i++;
            int i4 = i;
            while (true) {
                if (i4 < size) {
                    if (!device3.getName().equals(((Device) this.deviceList.get(Integer.valueOf(iArr[i4]))).getName())) {
                        i4++;
                    } else {
                        LogMgr.log(1, "%s There are plural same devices", "806");
                        throw new IllegalArgumentException();
                    }
                }
            }
        }
        LogMgr.log(4, "%s", "999");
    }

    public synchronized void clear() {
        reset();
    }

    public int describeContents() {
        return 0;
    }

    public Device get(int i) {
        return (Device) this.deviceList.get(new Integer(i));
    }

    /* access modifiers changed from: package-private */
    public synchronized Hashtable getDevices() {
        Hashtable hashtable;
        hashtable = new Hashtable();
        Enumeration keys = this.deviceList.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            hashtable.put(num, this.deviceList.get(num));
        }
        return hashtable;
    }

    public synchronized Device remove(int i) {
        return (i == 1 || i == 2) ? null : (Device) this.deviceList.remove(new Integer(i));
    }

    public int size() {
        return this.deviceList.size();
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        LogMgr.log(6, "001 deviceList len=%d", Integer.valueOf(this.deviceList.size()));
        parcel.writeInt(this.deviceList.size());
        Enumeration keys = this.deviceList.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            parcel.writeInt(num.intValue());
            parcel.writeParcelable((Device) this.deviceList.get(num), i);
        }
        parcel.writeInt(this.nextID);
    }

    private DeviceList(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
    }
}
