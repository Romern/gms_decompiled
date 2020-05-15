package p000;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ayky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayky {

    /* renamed from: a */
    public final beoq f97878a;

    /* renamed from: b */
    public final bmzi f97879b = bmzn.m108681a((bmzi) new aykw(this));

    /* renamed from: c */
    private final beoo f97880c;

    /* renamed from: d */
    private final bmzi f97881d = bmzn.m108681a((bmzi) new aykv(this));

    /* renamed from: e */
    private final bmzi f97882e = bmzn.m108681a((bmzi) new aykx(this));

    private ayky(ScheduledExecutorService scheduledExecutorService, beor beor, Application application, String str) {
        beoq a = beoq.m95364a(str);
        this.f97878a = a;
        beoo beoo = a.f111953c;
        if (beoo != null) {
            this.f97880c = beoo;
            ((beox) beoo).f111961b = beor;
            return;
        }
        this.f97880c = beox.m95372a(beor, scheduledExecutorService, this.f97878a, application);
    }

    /* renamed from: a */
    public static ayky m84210a(ScheduledExecutorService scheduledExecutorService, beor beor, Application application) {
        return new ayky(scheduledExecutorService, beor, application, "gmscore_auth_api_account_transfer");
    }

    /* renamed from: a */
    public final void mo54073a(String str, String str2) {
        ((beon) this.f97882e.mo6606a()).mo60861b(str, str2);
    }

    /* renamed from: a */
    public final void mo54074a(String str, String str2, int i) {
        ((beon) this.f97881d.mo6606a()).mo60861b(str, str2, Integer.valueOf(i));
    }
}
