package p000;

import java.util.NoSuchElementException;

/* renamed from: acfp */
final /* synthetic */ class acfp implements bmxj {

    /* renamed from: a */
    private final acfq f59720a;

    public acfp(acfq acfq) {
        this.f59720a = acfq;
    }

    public final Object apply(Object obj) {
        bmxv bmxv = (bmxv) obj;
        if (((Boolean) this.f59720a.f59723a.mo32596a()).booleanValue()) {
            try {
                boolean z = false;
                if (bmxv.mo66813a() && ((byip) ((basd) bmxv.mo66814b()).mo55930a()).f166590a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } catch (bxwf e) {
                throw new RuntimeException(e);
            }
        } else if (bmxv.mo66813a()) {
            try {
                return Boolean.valueOf(((byip) ((basd) bmxv.mo66814b()).mo55930a()).f166590a);
            } catch (bxwf e2) {
                throw new RuntimeException(e2);
            }
        } else {
            throw new NoSuchElementException("No footprint matching given secondary ID");
        }
    }
}
