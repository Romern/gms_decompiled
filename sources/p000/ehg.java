package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ehg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ehg {

    /* renamed from: a */
    public ehh f14948a;

    /* renamed from: b */
    private final Map f14949b = new HashMap();

    /* renamed from: a */
    public final ehi mo10145a() {
        bmxy.m108581a(this.f14948a);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f14949b.entrySet()) {
            ehn ehn = (ehn) entry.getValue();
            ehn.f14983c = (String) entry.getKey();
            bmxy.m108581a(ehn.f14982b);
            bmxy.m108581a(ehn.f14983c);
            hashMap.put((String) entry.getKey(), new eho(ehn.f14981a, ehn.f14982b, ehn.f14983c, ehn.f14984d));
        }
        return new ehi(this.f14948a, hashMap);
    }

    /* renamed from: a */
    public final ehn mo10146a(String str) {
        if (this.f14949b.containsKey(str)) {
            return (ehn) this.f14949b.get(str);
        }
        ehn ehn = new ehn();
        this.f14949b.put(str, ehn);
        return ehn;
    }

    /* renamed from: a */
    public final void mo10147a(String str, bqmb bqmb) {
        mo10146a(str).f14982b = bqmb;
    }
}
