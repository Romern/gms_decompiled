package com.felicanetworks.sductrl.chip;

import com.felicanetworks.cmnlib.util.CommonUtil;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ChipMgrInfoData {
    public byte[] carrier;
    public byte[] container;
    public String icCode;
    public byte[] idm;

    public ChipMgrInfoData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        this.idm = bArr;
        this.icCode = str;
        this.container = bArr2;
        this.carrier = bArr3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChipMgrInfoData[");
        sb.append("idm:" + CommonUtil.binToHexString(this.idm));
        sb.append(",icCode:" + this.icCode);
        sb.append(",container:" + CommonUtil.binToHexString(this.container));
        sb.append(",carrier:" + CommonUtil.binToHexString(this.carrier));
        sb.append("]");
        return sb.toString();
    }
}
