package p000;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: tws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tws {

    /* renamed from: d */
    public static final /* synthetic */ int f46766d = 0;

    /* renamed from: e */
    private static final sbw f46767e = new sbw("DriveInitializer", "");

    /* renamed from: f */
    private static tws f46768f;

    /* renamed from: a */
    public final uho f46769a;

    /* renamed from: b */
    public final uan f46770b;

    /* renamed from: c */
    public final CountDownLatch f46771c;

    private tws(Context context) {
        Context applicationContext = context.getApplicationContext();
        Context applicationContext2 = applicationContext.getApplicationContext();
        synchronized (vpu.class) {
            if (vpu.f49741a == null) {
                vpu.f49741a = new vpu(applicationContext2);
            } else if (vpu.f49741a.f49755b != applicationContext2) {
                throw new IllegalStateException("attempted to initialize Singletons multiple times with different application context instances.");
            }
        }
        vpu a = vpu.m41034a();
        this.f46769a = new uho(a.f49757d, a.f49761h, applicationContext);
        this.f46770b = new uan(a);
        if (vav.m39898a()) {
            vav.m39899b();
        }
        this.f46771c = new CountDownLatch(1);
        new twr(this, "Background initialization thread", a).start();
    }

    /* renamed from: a */
    public static tws m37567a() {
        tws tws;
        synchronized (tws.class) {
            tws = f46768f;
            sdo.m34966a(tws, "Must call init(Context) before calling get() for the first time");
        }
        return tws;
    }

    /* renamed from: b */
    public static boolean m37569b(Context context) {
        tws tws;
        sdo.m34973b("Must not be called from UI thread");
        synchronized (tws.class) {
            m37568a(context);
            tws = f46768f;
        }
        return tws.mo26849b();
    }

    /* renamed from: a */
    public static void m37568a(Context context) {
        synchronized (tws.class) {
            if (f46768f == null) {
                f46768f = new tws(context);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo26849b() {
        if (this.f46771c.getCount() <= 0) {
            return false;
        }
        f46767e.mo25372b("DriveInitializer", "Awaiting to be initialized");
        this.f46771c.await();
        return true;
    }
}
