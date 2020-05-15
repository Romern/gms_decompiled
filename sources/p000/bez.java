package p000;

import android.util.Log;

/* renamed from: bez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bez extends bew {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: a */
    public final void mo3074a() {
        bgr bgr = bgs.f3191a;
        try {
            byte[] bArr = new byte[1024];
            bgl bgl = new bgl();
            bew.m2863a(bgl.mo3104a((byte[]) bgr.mo3119a("CHANNEL_PARAM", true), bArr));
            if (bgl.m2964b()) {
                bArr = bgl.mo3114a();
            }
            String str = new String(bArr);
            if (str.length() == 0) {
                new String("::TokenChannelInitializeDelegate::destBuffer::");
            } else {
                "::TokenChannelInitializeDelegate::destBuffer::".concat(str);
            }
            String obj = bgz.m3021a(bArr)[0].toString();
            String valueOf = String.valueOf(obj);
            if (valueOf.length() == 0) {
                new String("TokenChannelInitializeDelegate :: devicePublicKeyStr :: ");
            } else {
                "TokenChannelInitializeDelegate :: devicePublicKeyStr :: ".concat(valueOf);
            }
            bgr.mo3121a("DEVICE_PUBLIC_KEY", obj);
        } catch (bfq e) {
            Log.e("core-hceclient", "::TokenChannelInitializeDelegate::catch::", e);
            throw e;
        }
    }
}
