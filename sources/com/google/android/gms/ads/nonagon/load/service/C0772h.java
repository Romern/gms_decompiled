package com.google.android.gms.ads.nonagon.load.service;

import com.google.android.gms.ads.internal.request.service.C0561k;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.nonagon.load.service.h */
final /* synthetic */ class C0772h implements Callable {

    /* renamed from: a */
    private final C0780p f9190a;

    /* renamed from: b */
    private final bqgg f9191b;

    /* renamed from: c */
    private final bqgg f9192c;

    public C0772h(C0780p pVar, bqgg bqgg, bqgg bqgg2) {
        this.f9190a = pVar;
        this.f9191b = bqgg;
        this.f9192c = bqgg2;
    }

    public final Object call() {
        C0780p pVar = this.f9190a;
        bqgg bqgg = this.f9191b;
        bqgg bqgg2 = this.f9192c;
        String str = ((C0561k) bqgg.get()).f8791l;
        pVar.f9202b.put(str, new C0777m((C0561k) bqgg.get(), (JSONObject) bqgg2.get()));
        return new ByteArrayInputStream(str.getBytes(bmwy.f131158c));
    }
}
