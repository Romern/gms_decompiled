package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.spamsignals.C0593a;
import com.google.android.gms.ads.nonagon.signals.C0787d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.ads.nonagon.signals.gmscore.i */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0827i implements C0787d {

    /* renamed from: a */
    public final String f9306a;

    /* renamed from: b */
    private final C0593a f9307b;

    /* renamed from: c */
    private final Executor f9308c;

    /* renamed from: d */
    private final PackageInfo f9309d;

    public C0827i(C0593a aVar, Executor executor, String str, PackageInfo packageInfo) {
        this.f9307b = aVar;
        this.f9308c = executor;
        this.f9306a = str;
        this.f9309d = packageInfo;
    }

    /* renamed from: a */
    public final bqgg mo7055a() {
        return bqdf.m112620a(bqdx.m112673a(this.f9307b.mo6382a(this.f9306a, this.f9309d), C0825g.f9304a, this.f9308c), Throwable.class, new C0826h(this), this.f9308c);
    }
}
