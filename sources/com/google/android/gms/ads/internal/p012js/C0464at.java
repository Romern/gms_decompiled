package com.google.android.gms.ads.internal.p012js;

import com.google.android.gms.ads.internal.util.C0604ab;
import com.google.android.gms.ads.internal.util.promise.C0661b;
import com.google.android.gms.ads.internal.util.promise.C0665f;

/* renamed from: com.google.android.gms.ads.internal.js.at */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0464at extends C0665f {

    /* renamed from: a */
    public final C0604ab f8439a;

    /* renamed from: c */
    private final Object f8440c = new Object();

    /* renamed from: d */
    private boolean f8441d;

    /* renamed from: e */
    private int f8442e;

    public C0464at(C0604ab abVar) {
        this.f8439a = abVar;
        this.f8441d = false;
        this.f8442e = 0;
    }

    /* renamed from: a */
    public final C0459ao mo6652a() {
        boolean z;
        C0459ao aoVar = new C0459ao(this);
        synchronized (this.f8440c) {
            mo6864a(new C0460ap(aoVar), new C0461aq(aoVar));
            if (this.f8442e >= 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            this.f8442e++;
        }
        return aoVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6653b() {
        boolean z;
        synchronized (this.f8440c) {
            if (this.f8442e > 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            this.f8442e--;
            mo6655d();
        }
    }

    /* renamed from: c */
    public final void mo6654c() {
        boolean z;
        synchronized (this.f8440c) {
            if (this.f8442e >= 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            this.f8441d = true;
            mo6655d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo6655d() {
        boolean z;
        synchronized (this.f8440c) {
            if (this.f8442e >= 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            if (this.f8441d && this.f8442e == 0) {
                mo6864a(new C0463as(this), new C0661b());
            }
        }
    }
}
