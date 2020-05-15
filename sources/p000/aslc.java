package p000;

import java.util.HashSet;
import java.util.Map;

/* renamed from: aslc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aslc extends C0036av {

    /* renamed from: a */
    HashSet f89153a;

    public aslc(Map map) {
        HashSet hashSet = new HashSet();
        this.f89153a = hashSet;
        bnhe bnhe = (bnhe) map;
        hashSet.addAll(bnhe.keySet());
        mo2450b(Boolean.valueOf(!this.f89153a.isEmpty()));
        for (Map.Entry entry : bnhe.entrySet()) {
            C0034at a = C0052bk.m3243a((C0034at) entry.getValue());
            mo2667a(a, new aslb(this, a, entry));
        }
    }
}
