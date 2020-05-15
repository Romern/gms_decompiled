package p000;

import java.util.Map;
import java.util.NavigableMap;

/* renamed from: bnqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnqr {

    /* renamed from: a */
    public final NavigableMap f131998a = bnmt.m109810d();

    /* renamed from: a */
    private static bnoa m110131a(bnoa bnoa, Object obj, Map.Entry entry) {
        bnfa bnfa;
        bnfa bnfa2;
        if (entry == null || !((bnqq) entry.getValue()).f131996a.mo68170a(bnoa) || !((bnqq) entry.getValue()).f131997b.equals(obj)) {
            return bnoa;
        }
        bnoa bnoa2 = ((bnqq) entry.getValue()).f131996a;
        int a = bnoa.f131891b.compareTo(bnoa2.f131891b);
        int a2 = bnoa.f131892c.compareTo(bnoa2.f131892c);
        if (a <= 0 && a2 >= 0) {
            return bnoa;
        }
        if (a >= 0 && a2 <= 0) {
            return bnoa2;
        }
        if (a > 0) {
            bnfa = bnoa2.f131891b;
        } else {
            bnfa = bnoa.f131891b;
        }
        if (a2 < 0) {
            bnfa2 = bnoa2.f131892c;
        } else {
            bnfa2 = bnoa.f131892c;
        }
        return bnoa.m109925a(bnfa, bnfa2);
    }

    /* renamed from: b */
    public final void mo68343b(bnoa bnoa, Object obj) {
        if (this.f131998a.isEmpty()) {
            mo68342a(bnoa, obj);
            return;
        }
        bmxy.m108581a(obj);
        mo68342a(m110131a(m110131a(bnoa, obj, this.f131998a.lowerEntry(bnoa.f131891b)), obj, this.f131998a.floorEntry(bnoa.f131892c)), obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bnqr) {
            return mo68341a().equals(((bnqr) obj).mo68341a());
        }
        return false;
    }

    public final int hashCode() {
        return mo68341a().hashCode();
    }

    public final String toString() {
        return this.f131998a.values().toString();
    }

    /* renamed from: a */
    private final void m110132a(bnfa bnfa, bnfa bnfa2, Object obj) {
        this.f131998a.put(bnfa, new bnqq(bnoa.m109925a(bnfa, bnfa2), obj));
    }

    /* renamed from: a */
    public final Map mo68341a() {
        return new bnqp(this, this.f131998a.values());
    }

    /* renamed from: a */
    public final void mo68342a(bnoa bnoa, Object obj) {
        if (!bnoa.mo68177f()) {
            bmxy.m108581a(obj);
            if (!bnoa.mo68177f()) {
                Map.Entry lowerEntry = this.f131998a.lowerEntry(bnoa.f131891b);
                if (lowerEntry != null) {
                    bnqq bnqq = (bnqq) lowerEntry.getValue();
                    if (bnqq.mo68340a().compareTo(bnoa.f131891b) > 0) {
                        if (bnqq.mo68340a().compareTo(bnoa.f131892c) > 0) {
                            m110132a(bnoa.f131892c, bnqq.mo68340a(), ((bnqq) lowerEntry.getValue()).f131997b);
                        }
                        m110132a(bnqq.f131996a.f131891b, bnoa.f131891b, ((bnqq) lowerEntry.getValue()).f131997b);
                    }
                }
                Map.Entry lowerEntry2 = this.f131998a.lowerEntry(bnoa.f131892c);
                if (lowerEntry2 != null) {
                    bnqq bnqq2 = (bnqq) lowerEntry2.getValue();
                    if (bnqq2.mo68340a().compareTo(bnoa.f131892c) > 0) {
                        m110132a(bnoa.f131892c, bnqq2.mo68340a(), ((bnqq) lowerEntry2.getValue()).f131997b);
                    }
                }
                this.f131998a.subMap(bnoa.f131891b, bnoa.f131892c).clear();
            }
            this.f131998a.put(bnoa.f131891b, new bnqq(bnoa, obj));
        }
    }
}
