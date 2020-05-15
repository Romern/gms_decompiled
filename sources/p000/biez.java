package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: biez */
final /* synthetic */ class biez implements aubq {

    /* renamed from: a */
    private final bifa f120423a;

    public biez(bifa bifa) {
        this.f120423a = bifa;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bifa bifa = this.f120423a;
        if (aucb.mo50384b()) {
            bifa.mo64577b(Status.f30107a);
        } else {
            bifa.mo64577b(Status.f30109c);
        }
    }
}
