package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.os.Build;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.C0622at;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.ay */
final /* synthetic */ class C0816ay implements Callable {

    /* renamed from: a */
    static final Callable f9267a = new C0816ay();

    private C0816ay() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) C0371o.f8252e.mo6604a();
        if (str != null && !str.isEmpty() && Build.VERSION.SDK_INT >= ((Integer) C0371o.f8253f.mo6604a()).intValue()) {
            String[] split = str.split(",", -1);
            for (String str2 : split) {
                hashMap.put(str2, C0622at.m5623a(str2));
            }
        }
        return new C0819ba(hashMap);
    }
}
