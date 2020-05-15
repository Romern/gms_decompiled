package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arex implements rlf {

    /* renamed from: a */
    private final aucf f87551a;

    public arex(aucf aucf) {
        this.f87551a = aucf;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
        this.f87551a.mo50390a((Exception) new rjp(status));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        aqxt aqxt = (aqxt) obj;
        if (aqxt.f87046a.mo17710c()) {
            this.f87551a.mo50391a(aqxt.f87047b);
        } else {
            this.f87551a.mo50390a((Exception) new rjp(aqxt.f87046a));
        }
    }
}
