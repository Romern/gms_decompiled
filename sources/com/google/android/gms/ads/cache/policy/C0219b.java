package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.cache.C0217p;
import com.google.android.gms.ads.internal.p012js.function.C0478f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.ads.cache.policy.b */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0219b {

    /* renamed from: a */
    public static final C0478f f7919a = new C0218a();

    /* renamed from: b */
    private Map f7920b;

    public C0219b() {
        this.f7920b = new C1223np();
    }

    /* renamed from: a */
    public final List mo6422a(String str) {
        return (List) this.f7920b.get(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0219b) {
            return sdg.m34949a(this.f7920b, ((C0219b) obj).f7920b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7920b.hashCode();
    }

    public final String toString() {
        return this.f7920b.toString();
    }

    public C0219b(C0219b bVar) {
        this.f7920b = new C1223np(((C1245ok) bVar.f7920b).f26809h);
        for (Map.Entry entry : bVar.f7920b.entrySet()) {
            this.f7920b.put((String) entry.getKey(), new ArrayList((List) entry.getValue()));
        }
    }

    /* renamed from: a */
    public final Set mo6423a() {
        return this.f7920b.keySet();
    }

    /* renamed from: a */
    public final void mo6424a(C0217p pVar) {
        String str = pVar.f7914b;
        List list = (List) this.f7920b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f7920b.put(str, list);
        }
        list.add(pVar);
    }

    public C0219b(Map map) {
        this.f7920b = map;
    }
}
