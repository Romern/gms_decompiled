package p000;

import java.util.Collection;

/* renamed from: alp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alp implements aku {

    /* renamed from: a */
    final /* synthetic */ alt f845a;

    public alp(alt alt) {
        this.f845a = alt;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo928a(akv akv, Collection r7) {
        int i;
        alt alt = this.f845a;
        if (akv == alt.f859k) {
            alv alv = alt.f858j;
            alv.f885n.clear();
            int size = r7.size();
            for (int i2 = 0; i2 < size; i2++) {
                akt akt = (akt) r7.get(i2);
                alv a = alv.f872a.mo992a(akt.f790a.mo896a());
                if (a != null && ((i = akt.f791b) == 2 || i == 3)) {
                    alv.f885n.add(a);
                }
            }
            alw.f893a.f855g.mo983a(259, alv);
        }
    }
}
