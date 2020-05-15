package p000;

import java.util.List;

/* renamed from: bkme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkme implements bkno {

    /* renamed from: a */
    final /* synthetic */ bkmf f124876a;

    public bkme(bkmf bkmf) {
        this.f124876a = bkmf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo66110a(Object obj) {
        List list = ((bkpo) obj).f125077a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bkpq bkpq = (bkpq) list.get(i);
            if (bkpq.f125082a == bkpp.PERMISSION_CHANGED) {
                Object obj2 = bkpq.f125083b;
                boolean z = obj2 instanceof Boolean;
                String valueOf = String.valueOf(obj2.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 59);
                sb.append("PERMISSION_CHANGED events should have a Boolean value, not ");
                sb.append(valueOf);
                bkww.m106783b(z, sb.toString());
                bkmf bkmf = this.f124876a;
                bkwz bkwz = !((Boolean) bkpq.f125083b).booleanValue() ? bkwz.READ_WRITE : bkwz.READ_ONLY;
                if (bkmf.f124878b != bkwz) {
                    bkmf.f124878b = bkwz;
                    for (bkmd bkmd : bkmf.f124877a) {
                        bkmd.mo27170a(bkwz);
                    }
                }
            }
        }
    }
}
