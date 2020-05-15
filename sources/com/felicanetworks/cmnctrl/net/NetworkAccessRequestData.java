package com.felicanetworks.cmnctrl.net;

import com.felicanetworks.cmnlib.util.CommonUtil;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkAccessRequestData {
    private static final int CUT_SIZE = 1024;
    public int connectTimeout;
    public byte[] data;
    public Map header;
    public NetworkAccessListener listener;
    public String method;
    public int noticeCnt = 1;
    public int readTimeout;
    public String url;

    public NetworkAccessRequestData(String str, String str2, Map map, int i, int i2, byte[] bArr) {
        this.url = str;
        this.method = str2;
        this.header = map;
        this.connectTimeout = i;
        this.readTimeout = i2;
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
        return "NetworkAccessRequestData[" + this.url + ", " + this.method + ", " + this.header + ", " + str + "]";
    }
}
