package p000;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: giy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class giy {

    /* renamed from: a */
    public final beoq f18319a;

    /* renamed from: b */
    public final bmzi f18320b = bmzn.m108681a((bmzi) new giv(this));

    /* renamed from: c */
    public final bmzi f18321c = bmzn.m108681a((bmzi) new giw(this));

    /* renamed from: d */
    public final bmzi f18322d = bmzn.m108681a((bmzi) new gix(this));

    /* renamed from: e */
    private final beoo f18323e;

    public giy(ScheduledExecutorService scheduledExecutorService, beor beor, Application application, String str) {
        beoq a = beoq.m95364a(str);
        this.f18319a = a;
        beoo beoo = a.f111953c;
        if (beoo != null) {
            this.f18323e = beoo;
            ((beox) beoo).f111961b = beor;
            return;
        }
        this.f18323e = beox.m95372a(beor, scheduledExecutorService, this.f18319a, application);
    }
}
