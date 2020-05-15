package com.google.android.gms.ads.nonagon.p013ad.event;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.ads.nonagon.ad.event.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0750c {

    /* renamed from: a */
    protected final Map f9162a = new HashMap();

    public C0750c(Set set) {
        mo7047a(set);
    }

    /* renamed from: a */
    public final synchronized void mo7044a(C0749b bVar) {
        for (Map.Entry entry : this.f9162a.entrySet()) {
            ((Executor) entry.getValue()).execute(new C0748a(bVar, entry.getKey()));
        }
    }

    /* renamed from: a */
    public final synchronized void mo7045a(C0751d dVar) {
        mo7046a(dVar.f9163a, dVar.f9164b);
    }

    /* renamed from: a */
    public final synchronized void mo7046a(Object obj, Executor executor) {
        this.f9162a.put(obj, executor);
    }

    /* renamed from: a */
    public final synchronized void mo7047a(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            mo7045a((C0751d) it.next());
        }
    }
}
