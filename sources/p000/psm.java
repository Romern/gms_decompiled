package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: psm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class psm implements rkl {

    /* renamed from: a */
    final /* synthetic */ psn f40149a;

    /* renamed from: b */
    private final long f40150b;

    public psm(psn psn, long j) {
        this.f40149a = psn;
        this.f40150b = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = (Status) rkk;
        if (!status.mo17710c()) {
            puc puc = this.f40149a.f40152b.f40164c;
            long j = this.f40150b;
            int i = status.f30115i;
            for (pug pug : puc.f40172g) {
                pug.mo23692a(j, i);
            }
        }
    }
}
