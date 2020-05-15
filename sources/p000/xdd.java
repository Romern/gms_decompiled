package p000;

import android.os.Build;

/* renamed from: xdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xdd {
    /* renamed from: a */
    public static xmq m42691a(byte[] bArr) {
        String d = sqd.m35972d(bArr);
        if (!xde.m42698d(d)) {
            return xmq.SOFTWARE;
        }
        int i = Build.VERSION.SDK_INT;
        if (!xde.m42699e(d).isTrustedUserPresenceRequired()) {
            return xmq.KEYSTORE;
        }
        return xmq.STRONGBOX;
    }
}
