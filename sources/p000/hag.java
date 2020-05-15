package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: hag */
final /* synthetic */ class hag implements C0038ax {

    /* renamed from: a */
    private final hav f19344a;

    public hag(hav hav) {
        this.f19344a = hav;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        hav hav = this.f19344a;
        Status status = (Status) obj;
        if (status.f30115i != 0) {
            hav.f19362a.mo12426d();
            hav.f19363b.mo12368a(haz.m14158b(status.f30116j));
            return;
        }
        hav.f19362a.mo12425c();
    }
}
