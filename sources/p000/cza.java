package p000;

import java.util.Map;

/* renamed from: cza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cza extends czb {

    /* renamed from: f */
    private final cue f12430f;

    /* renamed from: g */
    private final cwf f12431g;

    public cza(cys cys, cwg cwg, cvp cvp, Map map, cxc cxc, cue cue, cwf cwf) {
        super(cys, cwg, cvp, map, cxc);
        this.f12430f = cue;
        this.f12431g = cwf;
    }

    /* renamed from: a */
    public final cvv mo8342a() {
        boolean z;
        cyr a = mo8455c().mo8395a(this.f12429d);
        if (this.f12429d == cxc.SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        cys cys = a.f12406a.f12399b;
        cwf b = a.mo8422b();
        cxc cxc = a.f12407b;
        a.f12406a.mo8416q();
        return cvv.m7695a(cyy.f12426a, new cxf(cys, b, z, cxc));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final cyq mo8455c() {
        return new cyq(this.f12432a, this.f12430f, this.f12427b, this.f12428c, this.f12433e, this.f12431g);
    }

    /* renamed from: b */
    public final cza mo8456c(cxc cxc) {
        return new cza(this.f12427b, this.f12428c, this.f12432a, this.f12433e, this.f12429d.mo8382a(cxc), this.f12430f, this.f12431g);
    }
}
