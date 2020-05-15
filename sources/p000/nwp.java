package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

/* renamed from: nwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nwp {

    /* renamed from: a */
    public static nwp f36819a;

    /* renamed from: b */
    public long f36820b;

    /* renamed from: c */
    public final HandlerThread f36821c = new HandlerThread(nwp.class.getSimpleName(), 10);

    /* renamed from: d */
    public final Handler f36822d;

    /* renamed from: e */
    public int f36823e = 0;

    /* renamed from: f */
    public final ArrayList f36824f = new ArrayList(16);

    /* renamed from: g */
    private final Runnable f36825g = new nwk(this);

    /* renamed from: h */
    private final Runnable f36826h = new nwl(this);

    private nwp() {
        this.f36821c.start();
        this.f36822d = new adzt(this.f36821c.getLooper());
    }

    /* renamed from: a */
    public static synchronized void m28031a(Handler handler, Runnable runnable) {
        nwn c;
        synchronized (nwp.class) {
            if (!(f36819a == null || (c = f36819a.m28038c(handler, runnable)) == null)) {
                f36819a.m28034a(c);
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m28035b(Handler handler, Runnable runnable) {
        nwn c;
        synchronized (nwp.class) {
            while (f36819a != null && (c = f36819a.m28038c(handler, runnable)) != null) {
                f36819a.m28034a(c);
            }
        }
    }

    /* renamed from: c */
    private final nwn m28038c(Handler handler, Runnable runnable) {
        for (int i = 0; i < this.f36824f.size(); i++) {
            nwm nwm = (nwm) this.f36824f.get(i);
            if (nwm instanceof nwn) {
                nwn nwn = (nwn) nwm;
                if (nwn.f36814b == handler && nwn.f36815c == runnable) {
                    return nwn;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private final void m28039c() {
        this.f36820b = SystemClock.elapsedRealtime();
        this.f36822d.postDelayed(this.f36826h, 500);
    }

    /* renamed from: a */
    public static synchronized void m28032a(Handler handler, Runnable runnable, long j) {
        synchronized (nwp.class) {
            if (j < 500) {
                StringBuilder sb = new StringBuilder(59);
                sb.append("add timeout value too small:");
                sb.append(j);
                sb.append(" min is:500");
                Log.w("CAR.TIME", sb.toString());
            }
            int i = ((int) (j + 250)) / 500;
            boolean b = m28036b();
            nwp nwp = f36819a;
            if (i == 0) {
                i = 1;
            }
            if (nwp.m28038c(handler, runnable) != null && nly.m26778a("CAR.TIME", 3)) {
                Log.d("CAR.TIME", "Duplicate handler and runnable added, future cancels may be ambiguous");
            }
            nwn nwn = new nwn(handler, runnable);
            nwn.f36813a = i + nwp.f36823e;
            nwp.f36824f.add(nwn);
            nwp.f36822d.removeCallbacks(nwp.f36825g);
            if (b) {
                f36819a.m28039c();
            }
        }
    }

    /* renamed from: b */
    private static boolean m28036b() {
        if (f36819a != null) {
            return false;
        }
        f36819a = new nwp();
        return true;
    }

    /* renamed from: b */
    public static boolean m28037b(Semaphore semaphore) {
        nwo nwo;
        if (semaphore.tryAcquire()) {
            return true;
        }
        synchronized (nwp.class) {
            boolean b = m28036b();
            nwp nwp = f36819a;
            nwo = new nwo(semaphore);
            nwo.f36813a = nwp.f36823e + 40;
            nwp.f36824f.add(nwo);
            nwp.f36822d.removeCallbacks(nwp.f36825g);
            if (b) {
                f36819a.m28039c();
            }
        }
        boolean b2 = nwo.mo21756b();
        synchronized (nwp.class) {
            if (f36819a != null) {
                f36819a.m28034a(nwo);
            }
        }
        return b2;
    }

    /* renamed from: a */
    public static synchronized void m28033a(Semaphore semaphore) {
        nwo nwo;
        synchronized (nwp.class) {
            if (f36819a != null) {
                nwp nwp = f36819a;
                int i = 0;
                while (true) {
                    if (i >= nwp.f36824f.size()) {
                        nwo = null;
                        break;
                    }
                    nwm nwm = (nwm) nwp.f36824f.get(i);
                    if (nwm instanceof nwo) {
                        nwo = (nwo) nwm;
                        if (!nwo.f36818d && nwo.f36816b == semaphore) {
                            break;
                        }
                    }
                    i++;
                }
                if (nwo == null) {
                    semaphore.release();
                } else {
                    nwo.mo21757c();
                }
            } else {
                semaphore.release();
            }
        }
    }

    /* renamed from: a */
    private final void m28034a(nwm nwm) {
        this.f36824f.remove(nwm);
        mo21758a();
    }

    /* renamed from: a */
    public final boolean mo21758a() {
        if (!this.f36824f.isEmpty()) {
            return false;
        }
        this.f36822d.postDelayed(this.f36825g, 2000);
        return true;
    }
}
