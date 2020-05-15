package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: zkj */
final /* synthetic */ class zkj implements bqeh {

    /* renamed from: a */
    private final zkq f55306a;

    /* renamed from: b */
    private final asfb f55307b;

    /* renamed from: c */
    private final zla f55308c;

    public zkj(zkq zkq, asfb asfb, zla zla) {
        this.f55306a = zkq;
        this.f55307b = asfb;
        this.f55308c = zla;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        zkq zkq = this.f55306a;
        asfb asfb = this.f55307b;
        zla zla = this.f55308c;
        if (!((Boolean) obj).booleanValue()) {
            asfb.mo49120c();
            return bqga.m112775a((Object) false);
        }
        zlf zlf = zla.f55353a;
        zgh zgh = zla.f55354b;
        zgg zgg = zgh.f55012b;
        AtomicInteger atomicInteger = new AtomicInteger();
        bqgy c = bqgy.m112818c();
        zkm zkm = new zkm(zgg, atomicInteger, zla, c);
        c.mo741a(new zkn(zlf, zkm), zkq.f55324a);
        zgf zgf = zlf.f55149a;
        if (cdzm.m135646b()) {
            caae caae = zgh.f55011a;
            caah caah = caae.f172330f;
            if (caah == null) {
                caah = caah.f172333d;
            }
            if (caah.equals(bzzn.f172073M) && (caae.f172325a & 32) != 0) {
                caap caap = caap.WATCH;
                caaq caaq = caae.f172331g;
                if (caaq == null) {
                    caaq = caaq.f172356h;
                }
                caap a = caap.m126421a(caaq.f172360c);
                if (a == null) {
                    a = caap.UNKNOWN;
                }
                if (caap.equals(a)) {
                    zgh = zgh.mo31080a();
                }
            }
        }
        bqgg a2 = zgf.mo19155a(zgh.mo31081a(zkm));
        asfb.getClass();
        a2.mo741a(new zko(asfb), bqfb.INSTANCE);
        return bqdx.m112674a(a2, new zkp(c), zkq.f55324a);
    }
}
