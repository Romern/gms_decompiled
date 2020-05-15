package com.google.android.gms.ads.nonagon.load.service;

import com.google.android.gms.ads.internal.request.service.C0561k;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.load.service.b */
final /* synthetic */ class C0766b implements Callable {

    /* renamed from: a */
    private final bqgg f9181a;

    /* renamed from: b */
    private final bqgg f9182b;

    /* renamed from: c */
    private final bqgg f9183c;

    public C0766b(bqgg bqgg, bqgg bqgg2, bqgg bqgg3) {
        this.f9181a = bqgg;
        this.f9182b = bqgg2;
        this.f9183c = bqgg3;
    }

    public final Object call() {
        return new C0779o((C0782r) this.f9181a.get(), (JSONObject) this.f9182b.get(), (C0561k) this.f9183c.get());
    }
}
