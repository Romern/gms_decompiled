package com.felicanetworks.cmnctrl.net;

import com.felicanetworks.cmnlib.util.CommonUtil;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkAccessResponseData {
    private static final int CUT_SIZE = 1024;
    public int code;
    public byte[] data;
    public Map header;

    public NetworkAccessResponseData(int i, Map map, byte[] bArr) {
        this.code = i;
        this.header = map;
        this.data = bArr;
    }

    public String toString() {
        String str;
        byte[] bArr = this.data;
        if (bArr == null) {
            str = null;
        } else if (bArr.length > CUT_SIZE) {
            byte[] bArr2 = new byte[CUT_SIZE];
            System.arraycopy(bArr, 0, bArr2, 0, CUT_SIZE);
            str = CommonUtil.binToHexString(bArr2);
        } else {
            str = CommonUtil.binToHexString(bArr);
        }
        return "NetworkAccessResponseData[" + this.code + ", " + this.header + ", " + str + "]";
    }
}
