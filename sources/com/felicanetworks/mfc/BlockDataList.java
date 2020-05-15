package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;
import java.util.Vector;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BlockDataList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.BlockDataList.C00941 */

        public BlockDataList createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new BlockDataList(parcel);
        }

        public BlockDataList[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new BlockDataList[i];
        }
    };
    private static final String EXC_INVALID_BLOCKDATA = "The specified BlockData is null.";
    private Vector blockDataList;

    public BlockDataList() {
        this.blockDataList = new Vector();
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        parcel.readList(this.blockDataList, BlockData.class.getClassLoader());
        LogMgr.log(7, "001 blockDataList len=%d", Integer.valueOf(this.blockDataList.size()));
    }

    public int add(BlockData blockData) {
        if (blockData != null) {
            this.blockDataList.addElement(blockData);
            return this.blockDataList.size() - 1;
        }
        throw new IllegalArgumentException(EXC_INVALID_BLOCKDATA);
    }

    public void checkFormat() {
        int i = LogMgr.ERR;
        int i2 = 0;
        while (i2 < this.blockDataList.size()) {
            BlockData blockData = (BlockData) this.blockDataList.elementAt(i2);
            if (blockData != null) {
                blockData.checkFormat();
                i2++;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public void clear() {
        this.blockDataList.removeAllElements();
    }

    public int describeContents() {
        return 0;
    }

    public BlockData get(int i) {
        return (BlockData) this.blockDataList.elementAt(i);
    }

    public BlockData remove(int i) {
        BlockData blockData = (BlockData) this.blockDataList.elementAt(i);
        this.blockDataList.removeElementAt(i);
        return blockData;
    }

    /* access modifiers changed from: package-private */
    public void set(int i, BlockData blockData) {
        if (i < 0 || i >= this.blockDataList.size()) {
            throw new ArrayIndexOutOfBoundsException(i);
        } else if (blockData != null) {
            this.blockDataList.setElementAt(blockData, i);
        } else {
            throw new IllegalArgumentException(EXC_INVALID_BLOCKDATA);
        }
    }

    public int size() {
        return this.blockDataList.size();
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        LogMgr.log(6, "001 blockDataList len=%d", Integer.valueOf(this.blockDataList.size()));
        parcel.writeList(this.blockDataList);
    }

    private BlockDataList(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        this.blockDataList = new Vector();
        readFromParcel(parcel);
    }

    public void add(int i, BlockData blockData) {
        if (i < 0 || i > this.blockDataList.size()) {
            throw new ArrayIndexOutOfBoundsException(i);
        } else if (blockData != null) {
            this.blockDataList.insertElementAt(blockData, i);
        } else {
            throw new IllegalArgumentException(EXC_INVALID_BLOCKDATA);
        }
    }
}
