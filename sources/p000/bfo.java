package p000;

import android.util.Log;

/* renamed from: bfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfo extends bew {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: a */
    public final void mo3074a() {
        try {
            byte[] bArr = (byte[]) bgs.f3191a.mo3119a("CDCVM_BLOB", true);
            String str = new String(bArr);
            if (str.length() == 0) {
                new String("::TokenSetCDCVMDelegate::verify::_baCDCVMBuf::");
            } else {
                "::TokenSetCDCVMDelegate::verify::_baCDCVMBuf::".concat(str);
            }
            if (((Short) bes.m2844a("TR_APP_STATE")).shortValue() != 31357) {
                byte[] bArr2 = new byte[1];
                bew.m2863a(new bgl().mo3112e(bArr, bArr2));
                String valueOf = String.valueOf(bgx.m3012b(bArr2));
                if (valueOf.length() == 0) {
                    new String("::TokenSetCDCVMDelegate::verify::_baCDCVMStatus::");
                } else {
                    "::TokenSetCDCVMDelegate::verify::_baCDCVMStatus::".concat(valueOf);
                }
                bes.m2845a("TR_MOB_CVM_STATUS", (byte) -102);
                byte b = bArr2[0];
                if (b != 0) {
                    if (b == 1) {
                        bes.m2845a("TR_MOB_CVM_TYPE", (byte) 35);
                        return;
                    } else if (b == 2) {
                        bes.m2845a("TR_MOB_CVM_TYPE", (byte) -104);
                        return;
                    } else if (b == 3) {
                        bes.m2845a("TR_MOB_CVM_TYPE", (byte) 81);
                        return;
                    } else if (b != 4) {
                        if (b == 5) {
                            bes.m2845a("TR_MOB_CVM_TYPE", (byte) 70);
                            return;
                        }
                        return;
                    }
                }
                bes.m2845a("TR_MOB_CVM_STATUS", (byte) 117);
                return;
            }
            throw new bfq(bha.OPERATION_NOT_SUPPORTED);
        } catch (bfq e) {
            Log.e("core-hceclient", "::TokenSetCDCVMDelegate::catch::", e);
            throw e;
        }
    }
}
