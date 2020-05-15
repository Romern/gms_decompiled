package com.google.android.gms.ads.nonagon.signals;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.nonagon.signals.f */
final /* synthetic */ class C0789f implements Callable {

    /* renamed from: a */
    private final List f9222a;

    /* renamed from: b */
    private final Object f9223b;

    public C0789f(List list, Object obj) {
        this.f9222a = list;
        this.f9223b = obj;
    }

    public final Object call() {
        List list = this.f9222a;
        Object obj = this.f9223b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0786c cVar = (C0786c) ((bqgg) list.get(i)).get();
            if (cVar != null) {
                cVar.mo7056a(obj);
            }
        }
        return obj;
    }
}
