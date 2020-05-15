package com.google.android.gms.ads.nonagon.load.service;

import com.google.android.gms.ads.internal.request.service.C0561k;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.load.service.a */
final /* synthetic */ class C0765a implements Callable {

    /* renamed from: a */
    private final bqgg f9179a;

    /* renamed from: b */
    private final bqgg f9180b;

    public C0765a(bqgg bqgg, bqgg bqgg2) {
        this.f9179a = bqgg;
        this.f9180b = bqgg2;
    }

    public final Object call() {
        return new C0781q((JSONObject) this.f9179a.get(), (C0561k) this.f9180b.get());
    }
}
