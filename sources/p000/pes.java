package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pes {

    /* renamed from: a */
    public static pes f38974a;

    /* renamed from: b */
    public static pes f38975b;

    /* renamed from: c */
    public static final qav f38976c = new qav("CastComponent");

    /* renamed from: d */
    public static final long f38977d = ccxv.f180201a.mo6606a().mo77028n();

    /* renamed from: n */
    private static int f38978n = 0;

    /* renamed from: o */
    private static ScheduledExecutorService f38979o;

    /* renamed from: p */
    private static ScheduledExecutorService f38980p;

    /* renamed from: e */
    public final qat f38981e;

    /* renamed from: f */
    public final phy f38982f;

    /* renamed from: g */
    public final pnl f38983g;

    /* renamed from: h */
    public final pmx f38984h = new pmx(this.f38991r);

    /* renamed from: i */
    public final pvv f38985i;

    /* renamed from: j */
    public final pmh f38986j;

    /* renamed from: k */
    public final pin f38987k;

    /* renamed from: l */
    public final pva f38988l;

    /* renamed from: m */
    public final pwp f38989m;

    /* renamed from: q */
    private final pma f38990q;

    /* renamed from: r */
    private final poj f38991r;

    /* renamed from: s */
    private Thread f38992s;

    private pes(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f38981e = new qat(applicationContext);
        adzt adzt = new adzt(Looper.getMainLooper());
        SharedPreferences b = qay.m31785b(applicationContext);
        this.f38983g = new pnl(new pnw(new pnv(applicationContext), b), this.f38981e);
        ScheduledExecutorService a = m30266a();
        pnl pnl = this.f38983g;
        pnl.getClass();
        a.execute(new peq(pnl));
        this.f38982f = new phy(applicationContext, this.f38981e);
        this.f38991r = new poj(applicationContext, this.f38983g);
        pma pma = new pma(applicationContext, this.f38983g, this.f38991r, this.f38984h, this.f38981e, this.f38982f);
        this.f38990q = pma;
        this.f38991r.f39919c = pma.f39650d;
        pzd pzd = new pzd(applicationContext, adzt, this.f38983g, a);
        pzi pzi = new pzi(applicationContext, this.f38983g, new psy(applicationContext, m30269c()), a);
        this.f38986j = new pmh(applicationContext, a, this.f38983g, this.f38991r, this.f38990q, new pmn(applicationContext, a, this.f38991r), this.f38982f, this.f38981e);
        piy piy = new piy(applicationContext, a, this.f38982f, this.f38991r, srb.f45012a, pzd, pzi, this.f38984h, this.f38986j.f39678f);
        this.f38987k = new pin(piy, new pkc(this.f38984h, piy, a), this.f38984h);
        this.f38985i = new pvv(applicationContext, this.f38984h, new qam(applicationContext, "CastMediaRouteProvider"), piy);
        this.f38988l = new pva(context, a, this.f38985i, this.f38984h, new qbw(), new qbv());
        this.f38989m = new pwp(new pwn(this.f38984h, this.f38985i, piy, a, this.f38981e, b), this.f38981e);
        phy phy = this.f38982f;
        pnl pnl2 = this.f38983g;
        pmx pmx = this.f38984h;
        if (ccxd.f180145a.mo6606a().mo76969e()) {
            phy.f39161f = new pic(pnl2, pmx, phy.f39157a);
        }
    }

    /* renamed from: a */
    public static synchronized ScheduledExecutorService m30266a() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (pes.class) {
            if (f38979o == null) {
                f38979o = snp.m35703a(1, 10);
            }
            scheduledExecutorService = f38979o;
        }
        return scheduledExecutorService;
    }

    /* renamed from: b */
    public static sqv m30268b() {
        return srb.f45012a;
    }

    /* renamed from: c */
    private static synchronized ScheduledExecutorService m30269c() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (pes.class) {
            if (f38980p == null) {
                f38980p = snp.m35703a((int) ccyb.f180249a.mo6606a().mo77062e(), 10);
            }
            scheduledExecutorService = f38980p;
        }
        return scheduledExecutorService;
    }

    /* renamed from: a */
    public static pes m30267a(Context context, String str) {
        pes pes;
        synchronized (pes.class) {
            if (f38978n == 0) {
                if (f38975b == null) {
                    f38976c.mo23861b("creating a new instance");
                    f38974a = new pes(context);
                } else {
                    f38976c.mo23861b("reusing a lame duck state instance");
                    pes pes2 = f38975b;
                    pes2.f38992s.interrupt();
                    pes2.f38992s = null;
                    f38974a = f38975b;
                    f38975b = null;
                }
            }
            int i = f38978n + 1;
            f38978n = i;
            f38976c.mo23857a("acquireReference from %s, ref = %d", str, Integer.valueOf(i));
            pes = f38974a;
        }
        return pes;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo22984a(String str) {
        synchronized (pes.class) {
            if (f38978n != 0) {
                int i = f38978n - 1;
                f38978n = i;
                f38976c.mo23857a("releaseReference from %s, ref = %d", str, Integer.valueOf(i));
                if (f38978n == 0) {
                    f38976c.mo23861b("entering lame duck mode");
                    pes pes = f38974a;
                    f38975b = pes;
                    per per = new per(pes);
                    pes.f38992s = per;
                    per.start();
                    f38974a = null;
                }
            } else {
                f38976c.mo23677d("releaseReference from %s when ref count is zero!", str);
            }
        }
    }
}
