package p000;

import android.text.TextUtils;

/* renamed from: gzk */
final /* synthetic */ class gzk implements bqeh {

    /* renamed from: a */
    private final gzz f19294a;

    public gzk(gzz gzz) {
        this.f19294a = gzz;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        gzz gzz = this.f19294a;
        Void voidR = (Void) obj;
        if ((cccr.f178761a.mo6606a().mo75778d() || TextUtils.isEmpty(gzz.f19327p.f10233g.f10253f)) && gzz.f19328q.size() > 1 && gzz.f19327p.mo7477a()) {
            return bqga.m112775a(bmxv.m108566b(adco.COMPLETE_SIGN_IN_AND_START_CONFIRMATION));
        }
        gzz.f19334w.mo2453l(2);
        gzz.f19332u.mo2453l(bngx.m109356a(gzz.f19327p));
        return gzz.f19323l.mo12421a(adco.COMPLETE_SIGN_IN_AND_START_CONFIRMATION);
    }
}
