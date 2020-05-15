package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BlockData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.BlockData.C00931 */

        public BlockData createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new BlockData(parcel);
        }

        public BlockData[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new BlockData[i];
        }
    };
    private Block block;
    private Data data;

    private BlockData(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        readFromParcel(parcel);
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        this.block = (Block) parcel.readParcelable(Block.class.getClassLoader());
        this.data = (Data) parcel.readParcelable(Data.class.getClassLoader());
    }

    public void checkFormat() {
        int i = LogMgr.ERR;
        Block block2 = this.block;
        if (block2 == null || this.data == null) {
            throw new IllegalArgumentException();
        }
        block2.checkFormat();
        this.data.checkFormat();
        ServiceUtil.getInstance().checkBlockData(this.block, this.data);
    }

    public int describeContents() {
        return 0;
    }

    public Block getBlock() {
        return this.block;
    }

    public Data getData() {
        return this.data;
    }

    public void set(Block block2, Data data2) {
        ServiceUtil.getInstance().checkBlockData(block2, data2);
        this.block = block2;
        this.data = data2;
    }

    public void setBlock(Block block2) {
        ServiceUtil.getInstance().checkBlockData(block2, this.data);
        this.block = block2;
    }

    public void setData(Data data2) {
        ServiceUtil.getInstance().checkBlockData(this.block, data2);
        this.data = data2;
    }

    /* access modifiers changed from: package-private */
    public void setWithoutValidation(Block block2, Data data2) {
        this.block = block2;
        this.data = data2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        parcel.writeParcelable(this.block, i);
        parcel.writeParcelable(this.data, i);
    }

    public BlockData(Block block2, Data data2) {
        set(block2, data2);
    }
}
