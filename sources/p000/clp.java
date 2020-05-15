package p000;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: clp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class clp extends cln {

    /* renamed from: b */
    private static final byte[] f7030b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f6570a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bitmap mo3959a(cgt cgt, Bitmap bitmap, int i, int i2) {
        return cmw.m4562a(cgt, bitmap, i, i2);
    }

    public final boolean equals(Object obj) {
        return obj instanceof clp;
    }

    public final int hashCode() {
        return -599754482;
    }

    /* renamed from: a */
    public final void mo3732a(MessageDigest messageDigest) {
        messageDigest.update(f7030b);
    }
}
