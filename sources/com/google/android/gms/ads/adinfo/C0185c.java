package com.google.android.gms.ads.adinfo;

import android.util.Base64;

/* renamed from: com.google.android.gms.ads.adinfo.c */
final /* synthetic */ class C0185c implements bmxj {

    /* renamed from: a */
    static final bmxj f7829a = new C0185c();

    private C0185c() {
    }

    public final Object apply(Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr != null) {
            return Base64.encodeToString(bArr, 10);
        }
        return null;
    }
}
