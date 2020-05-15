package p000;

import android.util.Log;

/* renamed from: bfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfa extends bew {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: a */
    public final void mo3074a() {
        try {
            byte[] bArr = (byte[]) bgs.f3191a.mo3119a("CERTIFICATE", false);
            bgl bgl = new bgl();
            byte[] bArr2 = new byte[1024];
            String str = new String(bArr);
            if (str.length() == 0) {
                new String("::TokenChannelUpdateDelegate::srcBuffer::");
            } else {
                "::TokenChannelUpdateDelegate::srcBuffer::".concat(str);
            }
            bew.m2863a(bgl.mo3107b(bArr, bArr2));
            if (bgl.m2964b()) {
                bArr2 = bgl.mo3114a();
            }
            String str2 = new String(bArr2);
            if (str2.length() == 0) {
                new String("::TokenChannelUpdateDelegate::destBuffer::");
            } else {
                "::TokenChannelUpdateDelegate::destBuffer::".concat(str2);
            }
        } catch (bfq e) {
            Log.e("core-hceclient", "::TokenChannelUpdateDelegate::catch::", e);
            throw e;
        }
    }
}
