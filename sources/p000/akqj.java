package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: akqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akqj implements akqi {

    /* renamed from: a */
    final /* synthetic */ akql f72435a;

    /* renamed from: b */
    private final bmzq f72436b;

    /* renamed from: c */
    private bmza f72437c;

    public akqj(akql akql, bmzq bmzq) {
        this.f72435a = akql;
        this.f72436b = bmzq;
    }

    /* renamed from: a */
    public final void mo39677a(int i) {
        if (i == 2) {
            this.f72435a.f72447i.mo39781j();
            this.f72437c = bmza.m108659b(this.f72436b);
        } else if (i == 3) {
            this.f72435a.f72447i.mo39782k();
            bmza bmza = this.f72437c;
            if (bmza != null) {
                this.f72435a.f72447i.mo39776g(bmza.mo66928a(TimeUnit.MILLISECONDS));
                this.f72437c = null;
            }
        }
    }
}
