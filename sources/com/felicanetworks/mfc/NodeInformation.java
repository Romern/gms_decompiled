package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NodeInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.NodeInformation.C01111 */

        public NodeInformation createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new NodeInformation(parcel);
        }

        public NodeInformation[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new NodeInformation[i];
        }
    };
    protected AreaInformation[] areaCodeList;
    protected int[] serviceCodeList;

    private NodeInformation(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public AreaInformation[] getAreaInformationList() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s return areaCode = %d", "999", this.areaCodeList);
        return this.areaCodeList;
    }

    public int[] getServiceCodeList() {
        LogMgr.log(6, "%s", "000");
        LogMgr.log(6, "%s return serviceCodeList = %d", "999", this.serviceCodeList);
        return this.serviceCodeList;
    }

    /* access modifiers changed from: protected */
    public void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(AreaInformation.class.getClassLoader());
        if (readParcelableArray != null) {
            this.areaCodeList = new AreaInformation[readParcelableArray.length];
            for (int i = 0; i < readParcelableArray.length; i++) {
                this.areaCodeList[i] = (AreaInformation) readParcelableArray[i];
            }
        }
        int readInt = parcel.readInt();
        if (readInt >= 0) {
            int[] iArr = new int[readInt];
            this.serviceCodeList = iArr;
            parcel.readIntArray(iArr);
        }
    }

    public void setAreaInformationList(AreaInformation[] areaInformationArr) {
        LogMgr.log(4, "%s In areaCode = %s", "000", areaInformationArr);
        if (areaInformationArr != null) {
            this.areaCodeList = areaInformationArr;
            LogMgr.log(4, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s areaCodeList == %s : serviceCodeList == %s", "800", (Object) null);
        throw new IllegalArgumentException();
    }

    public void setServiceCodeList(int[] iArr) {
        LogMgr.log(4, "%s In serviceCodeList = %s", "000", iArr);
        if (iArr != null) {
            int i = 0;
            while (i < iArr.length) {
                try {
                    ServiceUtil.getInstance().checkServiceCode(iArr[i]);
                    i++;
                } catch (Exception e) {
                    LogMgr.log(1, "%s %s", "802", e.toString());
                    throw new IllegalArgumentException();
                }
            }
            this.serviceCodeList = iArr;
            LogMgr.log(4, "%s", "999");
            return;
        }
        LogMgr.log(1, "%s areaCodeList == %s : serviceCodeList == %s", "800", (Object) null);
        throw new IllegalArgumentException();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        parcel.writeParcelableArray(this.areaCodeList, i);
        int[] iArr = this.serviceCodeList;
        if (iArr != null) {
            i2 = iArr.length;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeIntArray(this.serviceCodeList);
    }

    public NodeInformation(AreaInformation[] areaInformationArr, int[] iArr) {
        LogMgr.log(4, "%s In areaCodeList = %s : serviceCodeList = %s", "000", areaInformationArr, iArr);
        if (areaInformationArr == null || iArr == null) {
            LogMgr.log(1, "%s areaCodeList == %s : serviceCodeList == %s", "800", areaInformationArr, iArr);
            throw new IllegalArgumentException();
        }
        int i = 0;
        while (i < iArr.length) {
            try {
                ServiceUtil.getInstance().checkServiceCode(iArr[i]);
                i++;
            } catch (Exception e) {
                LogMgr.log(1, "%s %s", "803", e.toString());
                throw new IllegalArgumentException();
            }
        }
        this.areaCodeList = areaInformationArr;
        this.serviceCodeList = iArr;
        LogMgr.log(4, "%s", "999");
    }
}
