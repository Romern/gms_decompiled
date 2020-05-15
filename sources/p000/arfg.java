package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: arfg */
final /* synthetic */ class arfg implements aubq {

    /* renamed from: a */
    private final arfh f87581a;

    /* renamed from: b */
    private final arjf f87582b;

    public arfg(arfh arfh, arjf arjf) {
        this.f87581a = arfh;
        this.f87582b = arjf;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        Status status;
        arfh arfh = this.f87581a;
        arjf arjf = this.f87582b;
        if (aucb.mo50384b()) {
            status = Status.f30107a;
        } else {
            status = new Status(10557);
        }
        arfh.f87591i = false;
        arfh.f87590h = null;
        arfh.mo48481a();
        arfh.m72645d(arjf, status);
    }
}
