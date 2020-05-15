package p000;

import android.content.Context;
import com.google.android.location.collectionlib.RealCollectorConfig;
import java.util.concurrent.CountDownLatch;

/* renamed from: bfhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfhh implements bfft {

    /* renamed from: a */
    private final bhdb f113902a;

    /* renamed from: b */
    private final Context f113903b;

    /* renamed from: c */
    private CountDownLatch f113904c;

    /* renamed from: d */
    private boolean f113905d = false;

    /* renamed from: e */
    private bfhg f113906e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005d, code lost:
        if (r3.f113482b != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0057, code lost:
        if (new java.io.File(r0).getCanonicalPath().toLowerCase(java.util.Locale.US).startsWith(android.os.Environment.getExternalStorageDirectory().getCanonicalPath().toLowerCase(java.util.Locale.US)) != false) goto L_0x005b;
     */
    public bfhh(bgns bgns, Context context, bfek bfek, bfko bfko, bgnx bgnx, Integer num, bsax bsax, bfew bfew, bhdb bhdb) {
        bmxy.m108581a(context);
        bmxy.m108581a(bfek);
        String packageName = context.getPackageName();
        packageName = bfdi.f113486a.matcher(packageName).matches() ? "com.google.android.apps.maps" : packageName;
        bfdh bfdh = (bfdh) bfdi.f113487b.get(packageName);
        if (bfdh != null) {
            RealCollectorConfig realCollectorConfig = (RealCollectorConfig) bfek;
            int i = realCollectorConfig.f150697i;
            String str = realCollectorConfig.f150692d;
            if (str != null) {
            }
            if ((i != 3 || bfdh.f113483c) && ((!realCollectorConfig.f150695g || bfdh.f113485e) && bfdh.f113484d.containsAll(realCollectorConfig.f150691c))) {
                this.f113902a = bfib.m96837a(bhdb);
                this.f113904c = new CountDownLatch(1);
                this.f113903b = context.getApplicationContext();
                this.f113906e = new bfhg(bgns, this.f113903b, bfek, this.f113904c, bfko, bgnx, bsax, num, bfew, this.f113902a);
                return;
            }
            throw new bfdj("Some features are prohibited from use by this application. Please contact lbs-team@google.com");
        }
        throw new bfdj(String.format("%s cannot access to this library. Please contact lbs-team@google.com.", packageName));
    }

    /* renamed from: a */
    public final synchronized void mo61627a() {
        bmxy.m108589a(!this.f113905d, "Start should be called only once!");
        this.f113905d = true;
        this.f113906e.start();
        try {
            this.f113904c.await();
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: b */
    public final void mo61628b() {
        bfhg bfhg = this.f113906e;
        if (bfhg != null) {
            synchronized (bfhg.f113891f) {
                bfhg.f113892g = true;
                if (bfhg.f113889d != null && bfhg.isAlive()) {
                    bfhg.f113889d.mo61650a();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo61629c() {
        bfek bfek;
        bfhg bfhg = this.f113906e;
        if (bfhg != null) {
            synchronized (bfhg.f113891f) {
                bfhg.f113892g = true;
                if (bfhg.f113889d != null && bfhg.isAlive()) {
                    bfgg bfgg = bfhg.f113889d;
                    bfgg.mo61650a();
                    bfev bfev = bfgg.f113748d;
                    if (bfev != null) {
                        bfev.mo61566a();
                    }
                    if (!(bfgg.f113751g == null || (bfek = bfgg.f113753i) == null)) {
                        for (bfgt bfgt : bfek.mo61539c()) {
                            bfgg.f113751g.mo61522a(bfgg.f113750f, bfgt);
                        }
                    }
                }
            }
        }
    }
}
