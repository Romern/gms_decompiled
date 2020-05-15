package com.felicanetworks.mfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.felicanetworks.mfc.util.LogMgr;
import java.util.Vector;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BlockList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.felicanetworks.mfc.BlockList.C00951 */

        public BlockList createFromParcel(Parcel parcel) {
            LogMgr.log(4, "%s : in = %s", "000", parcel);
            LogMgr.log(4, "%s", "999");
            return new BlockList(parcel);
        }

        public BlockList[] newArray(int i) {
            LogMgr.log(4, "%s : size = %d", "000", Integer.valueOf(i));
            LogMgr.log(4, "%s", "999");
            return new BlockList[i];
        }
    };
    private Vector blockList;

    public BlockList() {
        this.blockList = new Vector();
    }

    private void readFromParcel(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        parcel.readList(this.blockList, Block.class.getClassLoader());
        LogMgr.log(6, "001 blockList len=%d", Integer.valueOf(this.blockList.size()));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.felicanetworks.mfc.BlockList.add(com.felicanetworks.mfc.Block, boolean):int
     arg types: [com.felicanetworks.mfc.Block, int]
     candidates:
      com.felicanetworks.mfc.BlockList.add(int, com.felicanetworks.mfc.Block):void
      com.felicanetworks.mfc.BlockList.add(com.felicanetworks.mfc.Block, boolean):int */
    public int add(Block block) {
        return add(block, true);
    }

    public void checkFormat() {
        int i = LogMgr.ERR;
        int i2 = 0;
        while (i2 < this.blockList.size()) {
            Block block = (Block) this.blockList.elementAt(i2);
            if (block != null) {
                block.checkFormat();
                ServiceUtil.getInstance().checkBlock(block, true);
                i2++;
            } else {
                LogMgr.log(1, "801 blockList[%d] is null", Integer.valueOf(i2));
                throw new IllegalArgumentException();
            }
        }
    }

    public void clear() {
        this.blockList.removeAllElements();
    }

    public int describeContents() {
        return 0;
    }

    public Block get(int i) {
        return (Block) this.blockList.elementAt(i);
    }

    public Block remove(int i) {
        Block block = (Block) this.blockList.elementAt(i);
        this.blockList.removeElementAt(i);
        return block;
    }

    public int size() {
        return this.blockList.size();
    }

    public void writeToParcel(Parcel parcel, int i) {
        LogMgr.log(4, "%s : out = %s, flag = %d", "000", parcel, Integer.valueOf(i));
        LogMgr.log(6, "001 blockList len=%d", Integer.valueOf(this.blockList.size()));
        parcel.writeList(this.blockList);
    }

    public int add(Block block, boolean z) {
        ServiceUtil.getInstance().checkBlock(block, z);
        this.blockList.addElement(block);
        return this.blockList.size() - 1;
    }

    private BlockList(Parcel parcel) {
        LogMgr.log(6, "%s : in = %s", "000", parcel);
        this.blockList = new Vector();
        readFromParcel(parcel);
    }

    public void add(int i, Block block) {
        add(i, block, true);
    }

    public void add(int i, Block block, boolean z) {
        if (i < 0 || i > this.blockList.size()) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        ServiceUtil.getInstance().checkBlock(block, z);
        this.blockList.insertElementAt(block, i);
    }
}
