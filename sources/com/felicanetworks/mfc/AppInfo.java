package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.AppInfo.C00891 */

        public AppInfo createFromParcel(Parcel parcel) {
            return new AppInfo(parcel);
        }

        public AppInfo[] newArray(int i) {
            return new AppInfo[i];
        }
    };
    private int pid;

    public AppInfo(int i) {
        this.pid = i;
    }

    private void readFromParcel(Parcel parcel) {
        this.pid = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public int getPid() {
        return this.pid;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.pid);
    }

    private AppInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
