package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* renamed from: bocg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bocg extends bqdt {

    /* renamed from: a */
    public static final Logger f132537a = Logger.getLogger(bocg.class.getCanonicalName());

    /* renamed from: b */
    public static final Object f132538b = new Object();

    /* renamed from: i */
    static final bobw f132539i = new bobw();

    /* renamed from: c */
    public final bmzi f132540c;

    /* renamed from: d */
    public final bobv f132541d;

    /* renamed from: e */
    public final bmxz f132542e;

    /* renamed from: f */
    public final bmza f132543f;

    /* renamed from: g */
    public final bqgk f132544g;

    /* renamed from: h */
    public volatile int f132545h = 0;

    /* renamed from: l */
    private final Executor f132546l;

    /* renamed from: m */
    private final AtomicReference f132547m = new AtomicReference(bqga.m112775a(new Object()));

    public bocg(bmzi bmzi, bobv bobv, bmxz bmxz, Executor executor, ScheduledExecutorService scheduledExecutorService, bmzq bmzq) {
        bmxy.m108581a(bmzi);
        this.f132540c = bmzi;
        bmxy.m108581a(bobv);
        this.f132541d = bobv;
        bmxy.m108581a(bmxz);
        this.f132542e = bmxz;
        bmxy.m108581a(executor);
        this.f132546l = new boby(this, executor);
        this.f132544g = bqgs.m112812a(scheduledExecutorService);
        this.f132543f = bmza.m108659b(bmzq);
        mo68903a(0, TimeUnit.MILLISECONDS);
        mo741a(new bobx(), this.f132546l);
    }

    /* renamed from: a */
    public final void mo68903a(long j, TimeUnit timeUnit) {
        bqgy c = bqgy.m112818c();
        bqgg bqgg = (bqgg) this.f132547m.getAndSet(c);
        if (j != 0) {
            bqgg = bqdx.m112674a(bqgg, new boca(this, j, timeUnit), bqfb.INSTANCE);
        }
        bqgg a = bqdx.m112674a(bqgg, new bocb(this), this.f132546l);
        c.mo69137b(bqdf.m112620a(a, Exception.class, new bocc(this, a), this.f132546l));
        c.mo741a(new bocd(this, c), bqfb.INSTANCE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        bqgg bqgg = (bqgg) this.f132547m.getAndSet(bqga.m112770a());
        if (bqgg != null) {
            boolean z = true;
            if (isCancelled() && !mo69140e()) {
                z = false;
            }
            bqgg.cancel(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public final String mo60815bi() {
        String str;
        bqgg bqgg = (bqgg) this.f132547m.get();
        String obj = bqgg.toString();
        String valueOf = String.valueOf(this.f132540c);
        String valueOf2 = String.valueOf(this.f132542e);
        String valueOf3 = String.valueOf(this.f132541d);
        int i = this.f132545h;
        if (!bqgg.isDone()) {
            StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 14);
            sb.append(", activeTry=[");
            sb.append(obj);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "";
        }
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb2 = new StringBuilder(length + 70 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb2.append("futureSupplier=[");
        sb2.append(valueOf);
        sb2.append("], shouldContinue=[");
        sb2.append(valueOf2);
        sb2.append("], strategy=[");
        sb2.append(valueOf3);
        sb2.append("], tries=[");
        sb2.append(i);
        sb2.append("]");
        sb2.append(str);
        return sb2.toString();
    }
}
