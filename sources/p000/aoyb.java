package p000;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aoyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoyb {

    /* renamed from: a */
    public final beoq f83828a;

    /* renamed from: b */
    public final bmzi f83829b = bmzn.m108681a((bmzi) new aoxw(this));

    /* renamed from: c */
    public final bmzi f83830c = bmzn.m108681a((bmzi) new aoxx(this));

    /* renamed from: d */
    public final bmzi f83831d = bmzn.m108681a((bmzi) new aoxy(this));

    /* renamed from: e */
    public final bmzi f83832e = bmzn.m108681a((bmzi) new aoxz(this));

    /* renamed from: f */
    public final bmzi f83833f = bmzn.m108681a((bmzi) new aoya(this));

    /* renamed from: g */
    private final beoo f83834g;

    public aoyb(ScheduledExecutorService scheduledExecutorService, beor beor, Application application, String str) {
        beoq a = beoq.m95364a(str);
        this.f83828a = a;
        beoo beoo = a.f111953c;
        if (beoo != null) {
            this.f83834g = beoo;
            ((beox) beoo).f111961b = beor;
            return;
        }
        this.f83834g = beox.m95372a(beor, scheduledExecutorService, this.f83828a, application);
    }
}
