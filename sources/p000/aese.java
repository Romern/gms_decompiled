package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: aese */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aese implements rkl {

    /* renamed from: a */
    final /* synthetic */ aesg f63717a;

    /* renamed from: b */
    final /* synthetic */ Object f63718b;

    /* renamed from: c */
    final /* synthetic */ aesh f63719c;

    public aese(aesh aesh, aesg aesg, Object obj) {
        this.f63719c = aesh;
        this.f63717a = aesg;
        this.f63718b = obj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        if (((Status) rkk).mo17710c() && !this.f63717a.f63720e) {
            synchronized (this.f63719c.f63723b) {
                if (this.f63719c.f63723b.get(this.f63718b) == this.f63717a) {
                    this.f63719c.f63723b.remove(this.f63718b);
                }
            }
        }
    }
}
