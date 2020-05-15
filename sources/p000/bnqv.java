package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* renamed from: bnqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnqv extends bndn {

    /* renamed from: a */
    public final bnoa f132008a;

    /* renamed from: b */
    private final NavigableMap f132009b;

    /* renamed from: c */
    private final NavigableMap f132010c;

    public bnqv(NavigableMap navigableMap, bnoa bnoa) {
        this.f132009b = navigableMap;
        this.f132010c = new bnqy(navigableMap);
        this.f132008a = bnoa;
    }

    /* renamed from: a */
    private final NavigableMap m110140a(bnoa bnoa) {
        if (!this.f132008a.mo68170a(bnoa)) {
            return bnim.f131668b;
        }
        return new bnqv(this.f132009b, bnoa.mo68171b(this.f132008a));
    }

    /* renamed from: b */
    public final Iterator mo68058b() {
        Collection collection;
        bnfa bnfa;
        boolean z;
        if (this.f132008a.mo68169a()) {
            NavigableMap navigableMap = this.f132010c;
            bnfa bnfa2 = (bnfa) this.f132008a.mo68172b();
            if (this.f132008a.mo68173c() == bndx.CLOSED) {
                z = true;
            } else {
                z = false;
            }
            collection = navigableMap.tailMap(bnfa2, z).values();
        } else {
            collection = this.f132010c.values();
        }
        bnjq h = bnjr.m109626h(collection.iterator());
        if (this.f132008a.mo6527a(bney.f131550a) && (!h.hasNext() || ((bnoa) h.mo67862a()).f131891b != bney.f131550a)) {
            bnfa = bney.f131550a;
        } else if (!h.hasNext()) {
            return bnjl.f131707a;
        } else {
            bnfa = ((bnoa) h.next()).f131892c;
        }
        return new bnqt(this, bnfa, h);
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
        return m110140a(bnoa.m109927a((Comparable) ((bnfa) obj), bndx.m109112a(z)));
    }

    public final int size() {
        return bnjr.m109616b(mo68058b());
    }

    public final /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m110140a(bnoa.m109928a((bnfa) obj, bndx.m109112a(z), (bnfa) obj2, bndx.m109112a(z2)));
    }

    /* renamed from: a */
    public final bnoa get(Object obj) {
        if (obj instanceof bnfa) {
            try {
                bnfa bnfa = (bnfa) obj;
                Map.Entry firstEntry = tailMap(bnfa, true).firstEntry();
                if (firstEntry != null && ((bnfa) firstEntry.getKey()).equals(bnfa)) {
                    return (bnoa) firstEntry.getValue();
                }
            } catch (ClassCastException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Iterator mo67332a() {
        Object obj;
        bnfa bnfa;
        if (this.f132008a.mo68175d()) {
            obj = (bnfa) this.f132008a.mo68176e();
        } else {
            obj = bnew.f131549a;
        }
        boolean z = false;
        if (this.f132008a.mo68175d() && this.f132008a.f131892c.mo67484c() == bndx.CLOSED) {
            z = true;
        }
        bnjq h = bnjr.m109626h(this.f132010c.headMap(obj, z).descendingMap().values().iterator());
        if (h.hasNext()) {
            bnfa = ((bnoa) h.mo67862a()).f131892c == bnew.f131549a ? ((bnoa) h.next()).f131891b : (bnfa) this.f132009b.higherKey(((bnoa) h.mo67862a()).f131892c);
        } else if (!this.f132008a.mo6527a(bney.f131550a) || this.f132009b.containsKey(bney.f131550a)) {
            return bnjl.f131707a;
        } else {
            bnfa = (bnfa) this.f132009b.higherKey(bney.f131550a);
        }
        return new bnqu(this, (bnfa) bmxu.m108565a(bnfa, bnew.f131549a), h);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnoa.b(java.lang.Comparable, bndx):bnoa
     arg types: [bnfa, bndx]
     candidates:
      bnoa.b(java.lang.Comparable, java.lang.Comparable):bnoa
      bnoa.b(bnfa, bnfa):java.lang.String
      bnoa.b(java.lang.Comparable, bndx):bnoa */
    /* renamed from: a */
    public final NavigableMap tailMap(bnfa bnfa, boolean z) {
        return m110140a(bnoa.m109931b((Comparable) bnfa, bndx.m109112a(z)));
    }
}
