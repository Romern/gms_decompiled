package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;

/* renamed from: bnqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnqy extends bndn {

    /* renamed from: a */
    public final bnoa f132015a;

    /* renamed from: b */
    private final NavigableMap f132016b;

    public bnqy(NavigableMap navigableMap) {
        this.f132016b = navigableMap;
        this.f132015a = bnoa.f131890a;
    }

    /* renamed from: a */
    private final NavigableMap m110147a(bnoa bnoa) {
        if (bnoa.mo68170a(this.f132015a)) {
            return new bnqy(this.f132016b, bnoa.mo68171b(this.f132015a));
        }
        return bnim.f131668b;
    }

    /* renamed from: b */
    public final Iterator mo68058b() {
        Iterator it;
        if (!this.f132015a.mo68169a()) {
            it = this.f132016b.values().iterator();
        } else {
            Map.Entry lowerEntry = this.f132016b.lowerEntry((bnfa) this.f132015a.mo68172b());
            it = lowerEntry == null ? this.f132016b.values().iterator() : this.f132015a.f131891b.mo67481a(((bnoa) lowerEntry.getValue()).f131892c) ? this.f132016b.tailMap((bnfa) lowerEntry.getKey(), true).values().iterator() : this.f132016b.tailMap((bnfa) this.f132015a.mo68172b(), true).values().iterator();
        }
        return new bnqw(this, it);
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
        return m110147a(bnoa.m109927a((Comparable) ((bnfa) obj), bndx.m109112a(z)));
    }

    public final boolean isEmpty() {
        return this.f132015a.equals(bnoa.f131890a) ? this.f132016b.isEmpty() : !mo68058b().hasNext();
    }

    public final int size() {
        if (this.f132015a.equals(bnoa.f131890a)) {
            return this.f132016b.size();
        }
        return bnjr.m109616b(mo68058b());
    }

    public final /* bridge */ /* synthetic */ NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return m110147a(bnoa.m109928a((bnfa) obj, bndx.m109112a(z), (bnfa) obj2, bndx.m109112a(z2)));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnoa.b(java.lang.Comparable, bndx):bnoa
     arg types: [bnfa, bndx]
     candidates:
      bnoa.b(java.lang.Comparable, java.lang.Comparable):bnoa
      bnoa.b(bnfa, bnfa):java.lang.String
      bnoa.b(java.lang.Comparable, bndx):bnoa */
    public final /* bridge */ /* synthetic */ NavigableMap tailMap(Object obj, boolean z) {
        return m110147a(bnoa.m109931b((Comparable) ((bnfa) obj), bndx.m109112a(z)));
    }

    private bnqy(NavigableMap navigableMap, bnoa bnoa) {
        this.f132016b = navigableMap;
        this.f132015a = bnoa;
    }

    /* renamed from: a */
    public final bnoa get(Object obj) {
        Map.Entry lowerEntry;
        if (obj instanceof bnfa) {
            try {
                bnfa bnfa = (bnfa) obj;
                if (this.f132015a.mo6527a(bnfa) && (lowerEntry = this.f132016b.lowerEntry(bnfa)) != null && ((bnoa) lowerEntry.getValue()).f131892c.equals(bnfa)) {
                    return (bnoa) lowerEntry.getValue();
                }
            } catch (ClassCastException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Iterator mo67332a() {
        Collection collection;
        if (this.f132015a.mo68175d()) {
            collection = this.f132016b.headMap((bnfa) this.f132015a.mo68176e(), false).descendingMap().values();
        } else {
            collection = this.f132016b.descendingMap().values();
        }
        bnjq h = bnjr.m109626h(collection.iterator());
        if (h.hasNext() && this.f132015a.f131892c.mo67481a((Comparable) ((bnoa) h.mo67862a()).f131892c)) {
            h.next();
        }
        return new bnqx(this, h);
    }
}
