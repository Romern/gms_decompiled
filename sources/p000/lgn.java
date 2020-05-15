package p000;

import com.google.android.gms.common.api.Status;
import java.time.Duration;

/* renamed from: lgn */
final /* synthetic */ class lgn implements bqeh {

    /* renamed from: a */
    private final lgr f26045a;

    public lgn(lgr lgr) {
        this.f26045a = lgr;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        lgr lgr = this.f26045a;
        if (!((Boolean) obj).booleanValue()) {
            return bqga.m112770a();
        }
        if (!cckh.f179230a.mo6606a().mo76179d()) {
            return bqga.m112775a(lib.m19157a(null, Status.f30108b.f30115i));
        }
        lic lic = lgr.f26052b;
        lic.f26138b.mo12793a();
        return lqv.m19546a(lic.f26137a, Duration.ofMillis(cckh.f179230a.mo6606a().mo76181f()));
    }
}
