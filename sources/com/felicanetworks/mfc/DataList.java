package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;
import java.util.Vector;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.DataList.C00971 */

        public DataList createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new DataList(parcel);
        }

        public DataList[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new DataList[i];
        }
    };
    private static final String EXC_INVALID_DATA = "The specified Data is null.";
    public static final int MAX_SIZE = 14;
    private Vector dataList;

    public DataList() {
        this.dataList = new Vector();
    }

    public int add(Data data) {
        if (data != null) {
            this.dataList.addElement(data);
            return this.dataList.size() - 1;
        }
        throw new IllegalArgumentException(EXC_INVALID_DATA);
    }

    public void clear() {
        this.dataList.removeAllElements();
    }

    public int describeContents() {
        return 0;
    }

    public Data get(int i) {
        return (Data) this.dataList.elementAt(i);
    }

    public void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        parcel.readList(this.dataList, Data.class.getClassLoader());
        LogMgr.log(6, "001 dataList len=%d", Integer.valueOf(this.dataList.size()));
    }

    public Data remove(int i) {
        Data data = (Data) this.dataList.elementAt(i);
        this.dataList.removeElementAt(i);
        return data;
    }

    /* access modifiers changed from: package-private */
    public void set(int i, Data data) {
        if (i < 0 || i >= this.dataList.size()) {
            throw new ArrayIndexOutOfBoundsException(i);
        } else if (data != null) {
            this.dataList.setElementAt(data, i);
        } else {
            throw new IllegalArgumentException(EXC_INVALID_DATA);
        }
    }

    public int size() {
        return this.dataList.size();
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        LogMgr.log(6, "001 dataList len=%d", Integer.valueOf(this.dataList.size()));
        parcel.writeList(this.dataList);
    }

    private DataList(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        this.dataList = new Vector();
        readFromParcel(parcel);
    }

    public void add(int i, Data data) {
        if (i < 0 || i > this.dataList.size()) {
            throw new ArrayIndexOutOfBoundsException(i);
        } else if (data != null) {
            this.dataList.insertElementAt(data, i);
        } else {
            throw new IllegalArgumentException(EXC_INVALID_DATA);
        }
    }
}
