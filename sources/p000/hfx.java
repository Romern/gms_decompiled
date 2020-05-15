package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: hfx */
final /* synthetic */ class hfx implements C0038ax {

    /* renamed from: a */
    private final hgj f19691a;

    public hfx(hgj hgj) {
        this.f19691a = hgj;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hgj hgj = this.f19691a;
        Status status = (Status) obj;
        if (status.f30115i != 0) {
            hgj.f19711i.mo12426d();
            hgj.f19704b.mo12457a(new hgk(status, bmvz.f131120a));
            return;
        }
        hgj.f19711i.mo12425c();
    }
}
