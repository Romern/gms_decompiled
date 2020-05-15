package p000;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aqxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqxl {

    /* renamed from: a */
    public final beoq f87034a;

    /* renamed from: b */
    public final bmzi f87035b = bmzn.m108681a((bmzi) new aqxe(this));

    /* renamed from: c */
    public final bmzi f87036c = bmzn.m108681a((bmzi) new aqxf(this));

    /* renamed from: d */
    public final bmzi f87037d = bmzn.m108681a((bmzi) new aqxg(this));

    /* renamed from: e */
    public final bmzi f87038e = bmzn.m108681a((bmzi) new aqxh(this));

    /* renamed from: f */
    public final bmzi f87039f = bmzn.m108681a((bmzi) new aqxj(this));

    /* renamed from: g */
    public final bmzi f87040g = bmzn.m108681a((bmzi) new aqxk(this));

    /* renamed from: h */
    private final beoo f87041h;

    /* renamed from: i */
    private final bmzi f87042i = bmzn.m108681a((bmzi) new aqxd(this));

    /* renamed from: j */
    private final bmzi f87043j = bmzn.m108681a((bmzi) new aqxi(this));

    public aqxl(ScheduledExecutorService scheduledExecutorService, beor beor, Application application, String str) {
        beoq a = beoq.m95364a(str);
        this.f87034a = a;
        beoo beoo = a.f111953c;
        if (beoo != null) {
            this.f87041h = beoo;
            ((beox) beoo).f111961b = beor;
            return;
        }
        this.f87041h = beox.m95372a(beor, scheduledExecutorService, this.f87034a, application);
    }

    /* renamed from: a */
    public final void mo48202a() {
        ((beon) this.f87042i.mo6606a()).mo60861b(new Object[0]);
    }

    /* renamed from: a */
    public final void mo48203a(int i) {
        ((beon) this.f87043j.mo6606a()).mo60861b(Integer.valueOf(i));
    }
}
