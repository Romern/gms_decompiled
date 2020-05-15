package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BlockCountInformation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.BlockCountInformation.C00921 */

        public BlockCountInformation createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new BlockCountInformation(parcel);
        }

        public BlockCountInformation[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new BlockCountInformation[i];
        }
    };
    protected int assignedBlocks;
    protected int emptyBlocks;

    public BlockCountInformation(int i, int i2) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException();
        } else if (i2 < 0 || i2 > 65535) {
            throw new IllegalArgumentException();
        } else {
            this.assignedBlocks = i;
            this.emptyBlocks = i2;
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getAssignedBlocks() {
        return this.assignedBlocks;
    }

    public int getFreeBlocks() {
        return this.emptyBlocks;
    }

    /* access modifiers changed from: protected */
    public void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        this.assignedBlocks = parcel.readInt();
        this.emptyBlocks = parcel.readInt();
        LogMgr.log(7, "001 assignedBlocks=%d emptyBlocks=%d", Integer.valueOf(this.assignedBlocks), Integer.valueOf(this.emptyBlocks));
    }

    public void setAssignedBlocks(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException();
        }
        this.assignedBlocks = i;
    }

    public void setFreeBlocks(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException();
        }
        this.emptyBlocks = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        LogMgr.log(7, "001 assignedBlocks=%d emptyBlocks=%d", Integer.valueOf(this.assignedBlocks), Integer.valueOf(this.emptyBlocks));
        parcel.writeInt(this.assignedBlocks);
        parcel.writeInt(this.emptyBlocks);
    }

    private BlockCountInformation(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
    }
}
