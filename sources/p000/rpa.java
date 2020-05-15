package p000;

import com.google.android.gms.common.Feature;

/* renamed from: rpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rpa {

    /* renamed from: h */
    public final boolean f43475h;

    /* renamed from: i */
    private final Feature[] f43476i;

    @Deprecated
    public rpa() {
        this.f43476i = null;
        this.f43475h = false;
    }

    /* renamed from: b */
    public static roz m34196b() {
        return new roz();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11798a(rjd rjd, aucf aucf);

    /* renamed from: a */
    public Feature[] mo13163a() {
        return this.f43476i;
    }

    public rpa(Feature[] featureArr, boolean z) {
        this.f43476i = featureArr;
        this.f43475h = z;
    }
}
