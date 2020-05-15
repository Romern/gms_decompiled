package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: dky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dky extends bnfl implements RandomAccess {

    /* renamed from: a */
    public final Comparator f13433a;

    /* renamed from: b */
    private final bngx f13434b;

    private dky(Iterable iterable, Comparator comparator, boolean z) {
        iterable = iterable instanceof dky ? ((dky) iterable).f13434b : iterable;
        if (!z && !bner.m109180a(iterable, comparator)) {
            this.f13434b = bngx.m109369a(comparator, iterable);
        } else {
            this.f13434b = bngx.m109355a(iterable);
        }
        this.f13433a = comparator;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.a(java.lang.Iterable, java.util.Comparator):dky
     arg types: [java.lang.Iterable, bnnt]
     candidates:
      bnfo.a(java.lang.Object, java.lang.Object):void
      bmzu.a(java.lang.Object, java.lang.Object):void
      dky.a(java.lang.Iterable, java.util.Comparator):dky */
    /* renamed from: a */
    public static dky m8761a(Iterable iterable) {
        return m8762a(iterable, (Comparator) bnnt.f131877a);
    }

    /* renamed from: b */
    public static dky m8764b(Iterable iterable) {
        return m8765b(iterable, bnnt.f131877a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final List mo9242a() {
        return this.f13434b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Collection mo9243b() {
        return this.f13434b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo9244c() {
        return this.f13434b;
    }

    public final boolean contains(Object obj) {
        if (obj == null || isEmpty() || mo9239a(obj) < 0) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dky) {
            dky dky = (dky) obj;
            return this.f13433a.equals(dky.f13433a) && bnkn.m109669a(this.f13434b, dky.f13434b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13434b, this.f13433a});
    }

    /* renamed from: a */
    public static dky m8762a(Iterable iterable, Comparator comparator) {
        return new dky(iterable, comparator, true);
    }

    /* renamed from: b */
    public static dky m8765b(Iterable iterable, Comparator comparator) {
        boolean z = false;
        if ((iterable instanceof Collection) && ((Collection) iterable).size() < 2) {
            z = true;
        }
        return new dky(iterable, comparator, z);
    }

    /* renamed from: a */
    public static dky m8763a(Comparator comparator) {
        return new dky(bngx.m109376e(), comparator, true);
    }

    /* renamed from: a */
    public final int mo9239a(Object obj) {
        return Collections.binarySearch(this.f13434b, obj, this.f13433a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [java.util.Comparator, java.util.Collection]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
     arg types: [bngx, java.util.Comparator]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable */
    /* renamed from: a */
    public final dky mo9240a(Collection collection) {
        if (collection.isEmpty()) {
            return this;
        }
        int size = size();
        int size2 = collection.size();
        bngs b = bngx.m109371b(size + size2);
        if (size2 == 1) {
            Object b2 = bnjd.m109587b(collection);
            int a = mo9239a(b2);
            if (a < 0) {
                a = -(a + 1);
            }
            b.mo67666b((Iterable) this.f13434b.subList(0, a));
            b.mo67668c(b2);
            b.mo67666b((Iterable) this.f13434b.subList(a, size));
            return new dky(b.mo67664a(), this.f13433a, true);
        }
        if (!bner.m109180a(collection, this.f13433a)) {
            collection = bngx.m109369a(this.f13433a, (Iterable) collection);
        }
        b.mo67666b(bnjd.m109576a((Iterable) bngx.m109357a(this.f13434b, collection), this.f13433a));
        return new dky(b.mo67664a(), this.f13433a, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bngx, dkx]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final dky mo9241a(Set set) {
        return !set.isEmpty() ? new dky(bnjd.m109586b((Iterable) this.f13434b, (bmxz) new dkx(set)), this.f13433a, true) : this;
    }
}
