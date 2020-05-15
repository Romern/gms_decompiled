package p000;

import java.io.Serializable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: bnrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnrc extends bndo implements Serializable {

    /* renamed from: a */
    public final NavigableMap f132026a;

    /* renamed from: b */
    private transient Set f132027b;

    /* renamed from: c */
    private transient bnoc f132028c;

    public bnrc(bnrc bnrc) {
        this(new bnqv(bnrc.f132026a, bnoa.f131890a));
    }

    /* renamed from: c */
    public static bnrc m110157c() {
        return new bnrc(new TreeMap());
    }

    /* renamed from: d */
    private final void m110158d(bnoa bnoa) {
        if (bnoa.mo68177f()) {
            this.f132026a.remove(bnoa.f131891b);
        } else {
            this.f132026a.put(bnoa.f131891b, bnoa);
        }
    }

    /* renamed from: a */
    public final Set mo68181a() {
        Set set = this.f132027b;
        if (set != null) {
            return set;
        }
        bnqs bnqs = new bnqs(this.f132026a.values());
        this.f132027b = bnqs;
        return bnqs;
    }

    /* renamed from: b */
    public final bnoc mo68182b() {
        bnoc bnoc = this.f132028c;
        if (bnoc != null) {
            return bnoc;
        }
        bnrc bnrc = new bnrc(this);
        this.f132028c = bnrc;
        return bnrc;
    }

    /* renamed from: a */
    public final void mo67354a(bnoa bnoa) {
        bmxy.m108581a(bnoa);
        if (!bnoa.mo68177f()) {
            bnfa bnfa = bnoa.f131891b;
            bnfa bnfa2 = bnoa.f131892c;
            Map.Entry lowerEntry = this.f132026a.lowerEntry(bnfa);
            if (lowerEntry != null) {
                bnoa bnoa2 = (bnoa) lowerEntry.getValue();
                if (bnoa2.f131892c.compareTo(bnfa) >= 0) {
                    if (bnoa2.f131892c.compareTo(bnfa2) >= 0) {
                        bnfa2 = bnoa2.f131892c;
                    }
                    bnfa = bnoa2.f131891b;
                }
            }
            Map.Entry floorEntry = this.f132026a.floorEntry(bnfa2);
            if (floorEntry != null) {
                bnoa bnoa3 = (bnoa) floorEntry.getValue();
                if (bnoa3.f131892c.compareTo(bnfa2) >= 0) {
                    bnfa2 = bnoa3.f131892c;
                }
            }
            this.f132026a.subMap(bnfa, bnfa2).clear();
            m110158d(bnoa.m109925a(bnfa, bnfa2));
        }
    }

    /* renamed from: b */
    public final void mo67355b(bnoa bnoa) {
        bmxy.m108581a(bnoa);
        if (!bnoa.mo68177f()) {
            Map.Entry lowerEntry = this.f132026a.lowerEntry(bnoa.f131891b);
            if (lowerEntry != null) {
                bnoa bnoa2 = (bnoa) lowerEntry.getValue();
                if (bnoa2.f131892c.compareTo(bnoa.f131891b) >= 0) {
                    if (bnoa.mo68175d() && bnoa2.f131892c.compareTo(bnoa.f131892c) >= 0) {
                        m110158d(bnoa.m109925a(bnoa.f131892c, bnoa2.f131892c));
                    }
                    m110158d(bnoa.m109925a(bnoa2.f131891b, bnoa.f131891b));
                }
            }
            Map.Entry floorEntry = this.f132026a.floorEntry(bnoa.f131892c);
            if (floorEntry != null) {
                bnoa bnoa3 = (bnoa) floorEntry.getValue();
                if (bnoa.mo68175d() && bnoa3.f131892c.compareTo(bnoa.f131892c) >= 0) {
                    m110158d(bnoa.m109925a(bnoa.f131892c, bnoa3.f131892c));
                }
            }
            this.f132026a.subMap(bnoa.f131891b, bnoa.f131892c).clear();
        }
    }

    /* renamed from: c */
    public final boolean mo68183c(bnoa bnoa) {
        bmxy.m108581a(bnoa);
        Map.Entry floorEntry = this.f132026a.floorEntry(bnoa.f131891b);
        if (floorEntry == null) {
            return false;
        }
        bnoa bnoa2 = (bnoa) floorEntry.getValue();
        return bnoa2.f131891b.compareTo(bnoa.f131891b) <= 0 && bnoa2.f131892c.compareTo(bnoa.f131892c) >= 0;
    }

    public bnrc(NavigableMap navigableMap) {
        this.f132026a = navigableMap;
    }
}
