package com.google.android.gms.ads.adinfo;

import android.content.Context;
import com.google.android.gms.ads.identifier.C0271c;
import com.google.android.gms.ads.identifier.settings.C0287e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.adinfo.b */
final /* synthetic */ class C0184b implements Callable {

    /* renamed from: a */
    private final Context f7828a;

    public C0184b(Context context) {
        this.f7828a = context;
    }

    public final Object call() {
        C0287e a = C0287e.m5194a(this.f7828a);
        return new C0271c(a.mo6512c(), a.mo6518i());
    }
}
