package com.google.android.gms.ads.identifier.settings;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.ads.identifier.settings.i */
final /* synthetic */ class C0291i implements bmxj {

    /* renamed from: a */
    static final bmxj f8031a = new C0291i();

    private C0291i() {
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalStateException("Signals is empty.");
    }
}
