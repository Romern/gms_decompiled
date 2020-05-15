package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* renamed from: bnrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnrb extends bndn {

    /* renamed from: a */
    public final bnoa f132022a;

    /* renamed from: b */
    public final bnoa f132023b;

    /* renamed from: c */
    private final NavigableMap f132024c;

    /* renamed from: d */
    private final NavigableMap f132025d;

    public bnrb(bnoa bnoa, bnoa bnoa2, NavigableMap navigableMap) {
        bmxy.m108581a(bnoa);
        this.f132022a = bnoa;
        bmxy.m108581a(bnoa2);
        this.f132023b = bnoa2;
        bmxy.m108581a(navigableMap);
        this.f132024c = navigableMap;
        this.f132025d = new bnqy(navigableMap);
    }

    /* renamed from: a */
    private final NavigableMap m110153a(bnoa bnoa) {
        if (!bnoa.mo68170a(this.f132022a)) {
            return bnim.f131668b;
        }
        return new bnrb(this.f132022a.mo68171b(bnoa), this.f132023b, this.f132024c);
    }

    /* renamed from: b */
    public final Iterator mo68058b() {
        Iterator it;
        if (this.f132023b.mo68177f() || this.f132022a.f131892c.mo67481a((Comparable) this.f132023b.f131891b)) {
            return bnjl.f131707a;
        }
        boolean z = false;
        if (this.f132022a.f131891b.mo67481a((Comparable) this.f132023b.f131891b)) {
            it = this.f132025d.tailMap(this.f132023b.f131891b, false).values().iterator();
        } else {
            NavigableMap navigableMap = this.f132024c;
            bnfa bnfa = (bnfa) this.f132022a.f131891b.mo67479a();
            if (this.f132022a.mo68173c() == bndx.CLOSED) {
                z = true;
            }
            it = navigableMap.tailMap(bnfa, z).values().iterator();
        }
        return new bnqz(this, it, (bnfa) bnnt.f131877a.mo68160a(this.f132022a.f131892c, bnfa.m109221b(this.f132023b.f131892c)));
    }

    public final Comparator comparator() {
        return bnnt.f131877a;
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnoa.a(java.lang.Comparable, bndx):bnoa
     arg types: [bnfa, bndx]
     candidates:
      bnoa.a(bnfa, bnfa):bnoa
      bnoa.a(java.lang.Comparable, java.lang.Comparable):bnoa
      bnoa.a(java.lang.Comparable, bndx):bnoa */
    public final /* bridge */ /* synthetic */ NavigableMap headMap(Object obj, boolean z) {
        return m110153a(bnoa.m109927a((Comparable) ((bnfa) obj), bndx.m109112a(z)));
    }

    public final int size() {
        return bnjr.m109616b(mo68058b());
    }

    public final /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m110153a(bnoa.m109928a((bnfa) obj, bndx.m109112a(z), (bnfa) obj2, bndx.m109112a(z2)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnoa.b(java.lang.Comparable, bndx):bnoa
     arg types: [bnfa, bndx]
     candidates:
      bnoa.b(java.lang.Comparable, java.lang.Comparable):bnoa
      bnoa.b(bnfa, bnfa):java.lang.String
      bnoa.b(java.lang.Comparable, bndx):bnoa */
    public final /* bridge */ /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        return m110153a(bnoa.m109931b((Comparable) ((bnfa) obj), bndx.m109112a(z)));
    }

    /* renamed from: a */
    public final bnoa get(Object obj) {
        Object obj2;
        if (obj instanceof bnfa) {
            try {
                bnfa bnfa = (bnfa) obj;
                if (!this.f132022a.mo6527a(bnfa) || bnfa.compareTo(this.f132023b.f131891b) < 0 || bnfa.compareTo(this.f132023b.f131892c) >= 0) {
                    return null;
                }
                if (!bnfa.equals(this.f132023b.f131891b)) {
                    bnoa bnoa = (bnoa) this.f132024c.get(bnfa);
                    if (bnoa != null) {
                        return bnoa.mo68171b(this.f132023b);
                    }
                } else {
                    Map.Entry floorEntry = this.f132024c.floorEntry(bnfa);
                    if (floorEntry != null) {
                        obj2 = floorEntry.getValue();
                    } else {
                        obj2 = null;
                    }
                    bnoa bnoa2 = (bnoa) obj2;
                    if (bnoa2 != null && bnoa2.f131892c.compareTo(this.f132023b.f131891b) > 0) {
                        return bnoa2.mo68171b(this.f132023b);
                    }
                }
            } catch (ClassCastException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Iterator mo67332a() {
        boolean z;
        if (this.f132023b.mo68177f()) {
            return bnjl.f131707a;
        }
        bnfa bnfa = (bnfa) bnnt.f131877a.mo68160a(this.f132022a.f131892c, bnfa.m109221b(this.f132023b.f131892c));
        NavigableMap navigableMap = this.f132024c;
        bnfa bnfa2 = (bnfa) bnfa.mo67479a();
        if (bnfa.mo67484c() == bndx.CLOSED) {
            z = true;
        } else {
            z = false;
        }
        return new bnra(this, navigableMap.headMap(bnfa2, z).descendingMap().values().iterator());
    }
}
