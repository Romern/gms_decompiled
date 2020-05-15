package com.google.android.gms.ads.nonagon.signals;

import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.flag.C0400m;
import com.google.android.gms.ads.internal.util.future.C0645d;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.ads.nonagon.signals.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0790g {

    /* renamed from: a */
    private final Set f9224a;

    /* renamed from: b */
    private final Executor f9225b;

    public C0790g(Executor executor, Set set) {
        this.f9225b = executor;
        this.f9224a = set;
    }

    /* renamed from: a */
    public final bqgg mo7059a(Object obj) {
        ArrayList arrayList = new ArrayList(this.f9224a.size());
        for (C0787d dVar : this.f9224a) {
            bqgg a = dVar.mo7055a();
            if (((Boolean) C0400m.f8353a.mo6621a()).booleanValue()) {
                a.mo741a(new C0788e(dVar, C0387d.m5368f().mo20506b()), C0645d.f8977e);
            }
            arrayList.add(a);
        }
        return bqga.m112785c(arrayList).mo69216a(new C0789f(arrayList, obj), this.f9225b);
    }
}
