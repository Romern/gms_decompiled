package p000;

import java.util.Collection;
import java.util.Set;

/* renamed from: bskp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bskp implements bsla {

    /* renamed from: a */
    private final Set f144885a;

    public bskp(Set set) {
        this.f144885a = set;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo70665a(Collection r9) {
        boolean z = true;
        bmxy.m108589a(!r9.isEmpty(), "Cannot build an AffiliatedGroup with no passwords.");
        bsjw d = bsjx.m115872d();
        int size = r9.size();
        bytz bytz = null;
        for (int i = 0; i < size; i++) {
            bsjx bsjx = (bsjx) r9.get(i);
            if (bytz == null || (z && !this.f144885a.contains(bsjx))) {
                bytz b = bsjx.mo70637b();
                bytz = b;
                z = this.f144885a.contains(bsjx);
            }
            d.mo70635a(bsjx.mo70638c());
        }
        d.mo70633a(bytz);
        return d.mo70632a();
    }
}
