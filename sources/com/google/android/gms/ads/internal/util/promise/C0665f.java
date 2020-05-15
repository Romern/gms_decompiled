package com.google.android.gms.ads.internal.util.promise;

import com.google.android.gms.ads.internal.util.future.C0645d;
import com.google.android.gms.ads.internal.util.future.C0648g;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: com.google.android.gms.ads.internal.util.promise.f */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C0665f {

    /* renamed from: a */
    private final C0648g f9023a = C0648g.m5689a();

    /* renamed from: b */
    public final AtomicInteger f9024b = new AtomicInteger(0);

    public C0665f() {
        bqga.m112781a(this.f9023a, new C0663d(this), C0645d.f8977e);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo6864a(C0662c cVar, C0660a aVar) {
        bqga.m112781a(this.f9023a, new C0664e(cVar, aVar), C0645d.f8977e);
    }

    @Deprecated
    /* renamed from: e */
    public final void mo6866e() {
        this.f9023a.mo6831a((Throwable) new Exception());
    }

    @Deprecated
    /* renamed from: f */
    public final int mo6867f() {
        return this.f9024b.get();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo6865a(Object obj) {
        this.f9023a.mo6830a(obj);
    }
}
