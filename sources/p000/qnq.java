package p000;

import java.util.List;
import java.util.Set;

/* renamed from: qnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class qnq {

    /* renamed from: a */
    private final boolean f41791a;

    /* renamed from: d */
    final dky f41792d;

    /* renamed from: e */
    final dky f41793e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dky.a(java.lang.Iterable, java.util.Comparator):dky
     arg types: [bxwc, java.util.Comparator]
     candidates:
      bnfo.a(java.lang.Object, java.lang.Object):void
      bmzu.a(java.lang.Object, java.lang.Object):void
      dky.a(java.lang.Iterable, java.util.Comparator):dky */
    public qnq(qmo qmo, boolean z) {
        this.f41792d = dgk.m8394a(dky.m8762a((Iterable) qmo.f41730e, dgk.f13060b));
        this.f41793e = dgk.m8394a(dky.m8762a((Iterable) qmo.f41729d, dgk.f13060b));
        boolean z2 = false;
        if (z && cdjl.f180997a.mo6606a().mo77710p()) {
            z2 = true;
        }
        this.f41791a = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r2 = r7;
     */
    /* renamed from: a */
    public static boolean m32520a(djc djc, List list, Set set) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            qmt qmt = (qmt) list.get(i);
            dhs a = qnm.m32494a(qmt);
            bxwc bxwc = qmt.f41738c;
            int size2 = bxwc.size();
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                if (i2 >= size2) {
                    break;
                }
                djd djd = (djd) bxwc.get(i2);
                if (djc.f13310b.equals(djd.f13317b) && djc.f13311c == djd.f13318c && !set.contains(a)) {
                    return false;
                }
                i2++;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo24137a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo24138a(djc djc, qmk qmk);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo24139a(qng qng, boolean z) {
        if (!this.f41792d.contains(qng.f41769a)) {
            return !z || !this.f41791a;
        }
        return false;
    }
}
