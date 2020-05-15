package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: biex */
final /* synthetic */ class biex implements aubq {

    /* renamed from: a */
    private final biey f120418a;

    public biex(biey biey) {
        this.f120418a = biey;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        biey biey = this.f120418a;
        if (aucb.mo50384b()) {
            biey.mo64576b(Status.f30107a);
        } else {
            biey.mo64576b(Status.f30109c);
        }
    }
}
