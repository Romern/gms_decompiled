package p000;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: dhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dhg {

    /* renamed from: a */
    public final String f13110a;

    /* renamed from: b */
    public final Queue f13111b = new ArrayDeque();

    /* renamed from: c */
    public boolean f13112c = false;

    /* renamed from: d */
    final /* synthetic */ dhm f13113d;

    public dhg(dhm dhm, String str) {
        this.f13113d = dhm;
        this.f13110a = str;
    }

    /* renamed from: a */
    public final void mo9004a() {
        dhf dhf = (dhf) this.f13111b.peek();
        bmzs.m108696a(dhf);
        dhe a = dhf.mo9003a();
        boolean z = true;
        if (a == null) {
            if (dhf.f13106c <= 0 && dhf.f13108e) {
                z = false;
            }
            bmzs.m108698a(z);
            return;
        }
        do {
            int i = dhf.f13106c;
            if (i == 0) {
                dhf.f13107d = a.f13102f;
            } else if (a.f13102f != dhf.f13107d || i >= 3) {
                return;
            }
            dhf.f13106c++;
            dhm dhm = dhf.f13109f.f13113d;
            dhm.f13145h++;
            dhm.f13146i.add((dhe) dhf.f13105b.remove());
            dhm dhm2 = dhf.f13109f.f13113d;
            dhm2.f13141d.execute(dhm2.f13151n);
            a = dhf.mo9003a();
        } while (a != null);
    }

    /* renamed from: b */
    public final void mo9005b() {
        this.f13111b.remove();
        if (this.f13111b.isEmpty()) {
            dhg dhg = (dhg) this.f13113d.f13144g.remove(this.f13110a);
            boolean z = false;
            this.f13112c = false;
            if (dhg == this) {
                z = true;
            }
            bmzs.m108698a(z);
            return;
        }
        mo9004a();
    }
}
