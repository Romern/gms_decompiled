package p000;

/* renamed from: fdw */
final /* synthetic */ class fdw implements epg {

    /* renamed from: a */
    static final epg f16351a = new fdw();

    private fdw() {
    }

    /* renamed from: a */
    public final Object mo10390a(Object obj, Object obj2) {
        Throwable th = ((eps) obj2).f15499c;
        String str = (String) ((bmxv) obj).mo66815c();
        evk a = evk.m11192a(th, rpr.m34216b());
        if (a == null) {
            if (str != null) {
                bxvd da = bswh.f147430g.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bswh bswh = (bswh) da.f164949b;
                bswh.f147432a |= 1;
                bswh.f147433b = 19;
                a = new evk(str, null, null, (bswh) da.mo74062i(), false, null);
            } else {
                a = null;
            }
        }
        return bmxv.m108567c(a);
    }
}
