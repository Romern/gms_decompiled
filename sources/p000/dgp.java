package p000;

import java.util.BitSet;

/* renamed from: dgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dgp extends bnch {

    /* renamed from: a */
    final /* synthetic */ dgq f13075a;

    /* renamed from: b */
    private final BitSet f13076b = new BitSet(this.f13075a.f13078a.size());

    /* renamed from: c */
    private int f13077c = 0;

    public dgp(dgq dgq) {
        this.f13075a = dgq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8969a() {
        while (this.f13076b.get(this.f13077c)) {
            this.f13077c++;
        }
        String a = this.f13075a.f13079b.mo9222a();
        int i = -1;
        while (a != null) {
            int i2 = this.f13077c;
            while (true) {
                if (i2 < this.f13075a.f13078a.size()) {
                    if (!this.f13076b.get(i2) && ((dgr) this.f13075a.f13078a.get(i2)).mo8971a().equals(a)) {
                        i = i2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (i != -1) {
                break;
            }
            a = this.f13075a.f13079b.mo9222a();
        }
        if (i == -1) {
            int i3 = this.f13077c;
            while (true) {
                if (i3 >= this.f13075a.f13078a.size()) {
                    break;
                }
                if (!this.f13076b.get(i3)) {
                    dgq dgq = this.f13075a;
                    if (!dgq.f13080c.contains(((dgr) dgq.f13078a.get(i3)).mo8971a())) {
                        i = i3;
                        break;
                    }
                }
                i3++;
            }
        }
        if (i == -1) {
            return (dgr) mo67118d();
        }
        this.f13076b.set(i);
        return (dgr) this.f13075a.f13078a.get(i);
    }
}
