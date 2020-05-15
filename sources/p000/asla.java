package p000;

import java.util.HashSet;
import java.util.Map;

/* renamed from: asla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asla extends C0036av {

    /* renamed from: a */
    HashSet f89149a = new HashSet();

    public asla(Map map) {
        bnhe bnhe = (bnhe) map;
        for (Map.Entry entry : bnhe.entrySet()) {
            if (((C0034at) entry.getValue()).mo2448b() != aslx.CORRECT) {
                this.f89149a.add((asly) entry.getKey());
            }
        }
        mo2450b(Boolean.valueOf(this.f89149a.isEmpty()));
        for (Map.Entry entry2 : bnhe.entrySet()) {
            mo2667a(C0052bk.m3243a((C0034at) entry2.getValue()), new askz(this, entry2));
        }
    }
}
