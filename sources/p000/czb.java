package p000;

import java.util.Map;

/* renamed from: czb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class czb extends cyz {

    /* renamed from: a */
    final cvp f12432a;

    /* renamed from: e */
    final Map f12433e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public czb(cys cys, cwg cwg, cvp cvp, Map map, cxc cxc) {
        super(cys, cwg, cxc == null ? cxc.TEAR : cxc);
        this.f12432a = cvp;
        this.f12433e = map;
    }

    /* renamed from: a */
    public cvv mo8342a() {
        return cvv.m7695a(cyy.f12426a, mo8455c().mo8395a(this.f12429d).mo8421a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public cyp mo8455c() {
        return new cyp(this.f12427b, this.f12428c, this.f12432a, this.f12433e);
    }

    /* renamed from: c */
    public czb mo8452a(cxc cxc) {
        return new czb(this.f12427b, this.f12428c, this.f12432a, this.f12433e, this.f12429d.mo8382a(cxc));
    }

    /* renamed from: a */
    public final cvv mo8343a(byte[] bArr) {
        return cvq.m7687a(((cxh) this.f12432a.f12202c).f12372d.mo8338a(), cuf.m7596a(bArr), mo8455c());
    }
}
