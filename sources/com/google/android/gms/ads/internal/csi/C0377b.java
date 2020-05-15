package com.google.android.gms.ads.internal.csi;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.csi.b */
public final /* synthetic */ class C0377b implements Runnable {

    /* renamed from: a */
    private final C0378c f8278a;

    public C0377b(C0378c cVar) {
        this.f8278a = cVar;
    }

    public final void run() {
        Map map;
        C0378c cVar = this.f8278a;
        while (true) {
            try {
                C0386k kVar = (C0386k) cVar.f8279a.take();
                String b = kVar.mo6619b();
                if (!TextUtils.isEmpty(b)) {
                    LinkedHashMap linkedHashMap = cVar.f8280b;
                    synchronized (kVar.f8298c) {
                        C0387d.m5366d().mo6781a();
                        map = kVar.f8297b;
                    }
                    cVar.mo6613a(cVar.mo6610a(linkedHashMap, map), b);
                }
            } catch (InterruptedException e) {
                C0633h.m5673d("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }
}
