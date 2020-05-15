package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: chtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chtx {

    /* renamed from: a */
    public final int f189162a;

    /* renamed from: b */
    public final chun f189163b;

    /* renamed from: c */
    public final chvc f189164c;

    /* renamed from: d */
    public final chud f189165d;

    /* renamed from: e */
    public final Executor f189166e;

    /* renamed from: f */
    private final ScheduledExecutorService f189167f;

    /* renamed from: g */
    private final chqq f189168g;

    public chtx(Integer num, chun chun, chvc chvc, chud chud, ScheduledExecutorService scheduledExecutorService, chqq chqq, Executor executor) {
        bmxy.m108582a(num, "defaultPort not set");
        this.f189162a = num.intValue();
        bmxy.m108582a(chun, "proxyDetector not set");
        this.f189163b = chun;
        bmxy.m108582a(chvc, "syncContext not set");
        this.f189164c = chvc;
        bmxy.m108582a(chud, "serviceConfigParser not set");
        this.f189165d = chud;
        this.f189167f = scheduledExecutorService;
        this.f189168g = chqq;
        this.f189166e = executor;
    }

    public final String toString() {
        bmxt a = bmxu.m108563a(this);
        a.mo66883a("defaultPort", this.f189162a);
        a.mo66885a("proxyDetector", this.f189163b);
        a.mo66885a("syncContext", this.f189164c);
        a.mo66885a("serviceConfigParser", this.f189165d);
        a.mo66885a("scheduledExecutorService", this.f189167f);
        a.mo66885a("channelLogger", this.f189168g);
        a.mo66885a("executor", this.f189166e);
        return a.toString();
    }
}
