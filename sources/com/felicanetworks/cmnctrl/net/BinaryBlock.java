package com.felicanetworks.cmnctrl.net;

import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.util.CommonUtil;
import com.felicanetworks.cmnlib.util.DataCheckerUtil;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BinaryBlock implements FunctionCodeInterface {
    protected String charCode;
    protected byte[] data;
    protected int pos = 0;

    public BinaryBlock(byte[] bArr, String str) {
        this.data = bArr;
        this.charCode = str;
    }

    public byte[] getByteArray(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.data, this.pos, bArr, 0, i);
        this.pos += i;
        return bArr;
    }

    public int getClassCode() {
        return 1;
    }

    public int getDigitValue(int i) {
        String str = new String(this.data, this.pos, i, this.charCode);
        this.pos += i;
        DataCheckerUtil.checkDecNumberFormat(str);
        return Integer.parseInt(str);
    }

    public int getFunctionCode() {
        return 4;
    }

    public String getStringValue(int i) {
        String str = new String(this.data, this.pos, i, this.charCode);
        this.pos += i;
        return str;
    }

    public String toString() {
        byte[] bArr = this.data;
        String binToHexString = bArr != null ? CommonUtil.binToHexString(bArr) : null;
        return "BinaryBlock[" + this.pos + "," + this.charCode + "," + binToHexString + "]";
    }
}
