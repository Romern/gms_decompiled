package p000;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: bnty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnty extends bntm {

    /* renamed from: a */
    public static final AtomicReference f132147a = new AtomicReference();

    /* renamed from: c */
    private static final AtomicLong f132148c = new AtomicLong();

    /* renamed from: d */
    private static final ConcurrentLinkedQueue f132149d = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private volatile bnsx f132150b;

    public bnty(String str) {
        super(str);
        boolean z;
        boolean z2 = false;
        if (Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT)) {
            z = true;
        } else {
            z = false;
        }
        this.f132150b = (!z && !(("goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE)) ? true : z2)) ? null : new bntn().mo25075a(mo68471a());
    }

    /* renamed from: b */
    public static void m110420b() {
        while (true) {
            bnty bnty = (bnty) bntw.f132144a.poll();
            if (bnty != null) {
                bnty.f132150b = ((bntp) f132147a.get()).mo25075a(bnty.mo68471a());
            } else {
                m110421c();
                return;
            }
        }
    }

    /* renamed from: c */
    private static void m110421c() {
        while (true) {
            bntx bntx = (bntx) f132149d.poll();
            if (bntx != null) {
                f132148c.getAndDecrement();
                bnsx bnsx = bntx.f132145a;
                bnsw bnsw = bntx.f132146b;
                if (bnsw.mo68445j() || bnsx.mo8545a(bnsw.mo68438c())) {
                    bnsx.mo8544a(bnsw);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo8544a(bnsw bnsw) {
        if (this.f132150b == null) {
            if (f132148c.incrementAndGet() > 20) {
                f132149d.poll();
                Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
            }
            f132149d.offer(new bntx(this, bnsw));
            if (this.f132150b != null) {
                m110421c();
                return;
            }
            return;
        }
        this.f132150b.mo8544a(bnsw);
    }

    /* renamed from: a */
    public final boolean mo8545a(Level level) {
        if (this.f132150b != null) {
            return this.f132150b.mo8545a(level);
        }
        return true;
    }
}
