package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FelicaResultInfo extends ResultInfo {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.FelicaResultInfo.C01011 */

        public FelicaResultInfo createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new FelicaResultInfo(parcel);
        }

        public FelicaResultInfo[] newArray(int i) {
            LogMgr.log(4, "%s : in = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new FelicaResultInfo[i];
        }
    };

    /* renamed from: id */
    protected int f7375id;
    protected AppInfo otherAppInfo;
    protected int statusFlag1;
    protected int statusFlag2;
    protected int type;

    public FelicaResultInfo() {
        LogMgr.log(4, "%s", "000");
        LogMgr.log(4, "%s", "999");
    }

    public int getId() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s : id = %d", "999", Integer.valueOf(this.f7375id));
        return this.f7375id;
    }

    public AppInfo getOtherAppInfo() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s : otherAppPID = %d", "999", this.otherAppInfo);
        return this.otherAppInfo;
    }

    public int getStatusFlag1() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s : statusFlag1 = %d", "999", Integer.valueOf(this.statusFlag1));
        return this.statusFlag1;
    }

    public int getStatusFlag2() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s : statusFlag2 = %d", "999", Integer.valueOf(this.statusFlag2));
        return this.statusFlag2;
    }

    public int getType() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s : type = %d", "999", Integer.valueOf(this.type));
        return this.type;
    }

    /* access modifiers changed from: protected */
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        this.f7375id = parcel.readInt();
        this.type = parcel.readInt();
        this.statusFlag1 = parcel.readInt();
        this.statusFlag2 = parcel.readInt();
        this.otherAppInfo = (AppInfo) parcel.readParcelable(AppInfo.class.getClassLoader());
        LogMgr.log(6, "%s", "999");
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        LogMgr.log(4, "%s : in = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        parcel.writeInt(getId());
        parcel.writeInt(getType());
        parcel.writeInt(getStatusFlag1());
        parcel.writeInt(getStatusFlag2());
        parcel.writeParcelable(this.otherAppInfo, i);
        LogMgr.log(4, "%s", "999");
    }

    public FelicaResultInfo(int i, String str) {
        super(i, str);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s", "000", Integer.valueOf(i), str);
        LogMgr.log(4, "%s", "999");
    }

    public FelicaResultInfo(int i, String str, int i2, int i3) {
        super(i, str);
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s, id = %d, type = %d", "000", valueOf, str, valueOf2, Integer.valueOf(i3));
        this.f7375id = i2;
        this.type = i3;
        LogMgr.log(4, "%s : id = %d, type = %d", "999", valueOf2, Integer.valueOf(i3));
    }

    public FelicaResultInfo(int i, String str, int i2, int i3, int i4, int i5) {
        this(i, str, i2, i3);
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Integer valueOf3 = Integer.valueOf(i3);
        Integer valueOf4 = Integer.valueOf(i4);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s, id = %d, type = %d, statusFlag1 = %d, statusFlag = %d", "000", valueOf, str, valueOf2, valueOf3, valueOf4, Integer.valueOf(i5));
        this.statusFlag1 = i4;
        this.statusFlag2 = i5;
        LogMgr.log(4, "%s : statusFlag1 = %d, statusFlag2 = %d", "999", valueOf4, Integer.valueOf(i5));
    }

    public FelicaResultInfo(int i, String str, int i2, int i3, AppInfo appInfo) {
        this(i, str, i2, i3);
        LogMgr.log(4, "%s : exceptionType = %d, message = %s, id = %d, type = %d, otherAppInfo = %d", "000", Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3), appInfo);
        this.otherAppInfo = appInfo;
        LogMgr.log(4, "%s : otherAppPID = %d", "999", appInfo);
    }

    private FelicaResultInfo(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
        LogMgr.log(6, "%s", "999");
    }
}
