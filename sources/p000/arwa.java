package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arwa implements rlf {

    /* renamed from: a */
    private final aucf f88352a;

    /* renamed from: b */
    private final arvz f88353b;

    public arwa(aucf aucf, arvz arvz) {
        this.f88352a = aucf;
        this.f88353b = arvz;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
        this.f88352a.mo50390a((Exception) new rjp(status));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        rkk rkk = (rkk) obj;
        if (rkk.mo7183bo().mo17710c()) {
            this.f88352a.mo50391a(this.f88353b.mo48871a(rkk));
        } else {
            this.f88352a.mo50390a((Exception) new rjp(rkk.mo7183bo()));
        }
    }
}
