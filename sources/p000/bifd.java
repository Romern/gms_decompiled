package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: bifd */
final /* synthetic */ class bifd implements aubq {

    /* renamed from: a */
    private final bife f120433a;

    public bifd(bife bife) {
        this.f120433a = bife;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        bife bife = this.f120433a;
        if (aucb.mo50384b()) {
            bife.mo64578b(Status.f30107a);
        } else {
            bife.mo64578b(Status.f30109c);
        }
    }
}
