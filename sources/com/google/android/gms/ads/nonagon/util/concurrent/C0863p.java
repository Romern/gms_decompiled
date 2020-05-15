package com.google.android.gms.ads.nonagon.util.concurrent;

import com.google.android.gms.ads.nonagon.p013ad.event.C0750c;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.ads.nonagon.util.concurrent.p */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0863p {

    /* renamed from: a */
    public final bqgj f9374a;

    /* renamed from: b */
    public final C0750c f9375b;

    static {
        bqga.m112775a((Object) null);
    }

    public C0863p(bqgj bqgj, C0750c cVar) {
        this.f9374a = bqgj;
        this.f9375b = cVar;
    }

    /* renamed from: a */
    public final C0858k mo7092a(Object obj, bqgg... bqggArr) {
        return new C0858k(this, obj, Arrays.asList(bqggArr));
    }

    /* renamed from: a */
    public final C0862o mo7093a(Object obj, bqgg bqgg) {
        return new C0862o(this, obj, bqgg, Collections.singletonList(bqgg), bqgg);
    }
}
