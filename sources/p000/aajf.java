package p000;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aajf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aajf {

    /* renamed from: a */
    public final beoq f28252a;

    /* renamed from: b */
    public final bmzi f28253b = bmzn.m108681a((bmzi) new aaja(this));

    /* renamed from: c */
    public final bmzi f28254c;

    /* renamed from: d */
    private final beoo f28255d;

    /* renamed from: e */
    private final bmzi f28256e = bmzn.m108681a((bmzi) new aaiz(this));

    /* renamed from: f */
    private final bmzi f28257f;

    public aajf(ScheduledExecutorService scheduledExecutorService, beor beor, String str) {
        bmzn.m108681a((bmzi) new aajb(this));
        this.f28257f = bmzn.m108681a((bmzi) new aajc(this));
        bmzn.m108681a((bmzi) new aajd(this));
        this.f28254c = bmzn.m108681a((bmzi) new aaje(this));
        beoq a = beoq.m95364a(str);
        this.f28252a = a;
        beoo beoo = a.f111953c;
        if (beoo != null) {
            this.f28255d = beoo;
            ((beox) beoo).f111961b = beor;
            return;
        }
        this.f28255d = beox.m95372a(beor, scheduledExecutorService, this.f28252a, null);
    }

    /* renamed from: a */
    public final void mo16898a(String str) {
        ((beon) this.f28256e.mo6606a()).mo60861b(str);
    }

    /* renamed from: a */
    public final void mo16899a(String str, String str2, boolean z) {
        ((beon) this.f28257f.mo6606a()).mo60861b(str, str2, Boolean.valueOf(z));
    }
}
