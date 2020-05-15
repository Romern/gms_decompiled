package com.google.android.gms.ads.internal.p012js;

import com.google.android.gms.ads.internal.util.promise.C0661b;
import com.google.android.gms.ads.internal.util.promise.C0665f;

/* renamed from: com.google.android.gms.ads.internal.js.ao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0459ao extends C0665f {

    /* renamed from: a */
    public final C0464at f8431a;

    /* renamed from: c */
    private final Object f8432c = new Object();

    /* renamed from: d */
    private boolean f8433d;

    public C0459ao(C0464at atVar) {
        this.f8431a = atVar;
    }

    /* renamed from: a */
    public final void mo6650a() {
        synchronized (this.f8432c) {
            if (!this.f8433d) {
                this.f8433d = true;
                mo6864a(new C0456al(), new C0661b());
                mo6864a(new C0457am(this), new C0458an(this));
            }
        }
    }
}
