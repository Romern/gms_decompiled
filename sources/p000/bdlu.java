package p000;

import android.app.Application;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* renamed from: bdlu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdlu implements bdkj {

    /* renamed from: a */
    private final bdfd f105919a;

    /* renamed from: b */
    private final Map f105920b;

    /* renamed from: c */
    private final bdeu f105921c;

    /* renamed from: d */
    private final bdpz f105922d;

    bdlu() {
    }

    /* renamed from: a */
    public final synchronized void mo58160a() {
        if (!this.f105920b.isEmpty()) {
            for (bdlt bdlt : this.f105920b.values()) {
                bdlt.mo58159a();
            }
            this.f105920b.clear();
        }
    }

    /* renamed from: b */
    public final void mo58031b() {
        this.f105919a.mo57956b(this.f105921c);
        mo58160a();
    }

    /* renamed from: c */
    public final void mo58086c() {
    }

    public bdlu(bdkh bdkh, Application application, cijl cijl, bdfd bdfd, int i) {
        this.f105920b = new HashMap();
        this.f105922d = new bdpz(i);
        bdkh.mo58105a((Executor) cijl.mo6445a(), this.f105922d);
        bmxy.m108581a(bdfd);
        this.f105919a = bdfd;
        bdlv bdlv = new bdlv(this);
        this.f105921c = bdlv;
        bdfd.mo57955a(bdlv);
        bdlh.m91018a(application);
    }
}
