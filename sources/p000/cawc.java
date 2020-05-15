package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: cawc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cawc implements Closeable {

    /* renamed from: a */
    public static final ExecutorService f176195a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), cavk.m127319b("OkHttp FramedConnection"));

    /* renamed from: b */
    public final caui f176196b;

    /* renamed from: c */
    final boolean f176197c;

    /* renamed from: d */
    public final Map f176198d = new HashMap();

    /* renamed from: e */
    public final String f176199e;

    /* renamed from: f */
    public int f176200f;

    /* renamed from: g */
    public int f176201g;

    /* renamed from: h */
    public boolean f176202h;

    /* renamed from: i */
    public final ExecutorService f176203i;

    /* renamed from: j */
    long f176204j;

    /* renamed from: k */
    long f176205k;

    /* renamed from: l */
    public final cawx f176206l;

    /* renamed from: m */
    final cawx f176207m;

    /* renamed from: n */
    public boolean f176208n;

    /* renamed from: o */
    final caxb f176209o;

    /* renamed from: p */
    final Socket f176210p;

    /* renamed from: q */
    public final cavo f176211q;

    /* renamed from: r */
    final cawb f176212r;

    /* renamed from: s */
    public final Set f176213s;

    public cawc(cavw cavw) {
        System.nanoTime();
        this.f176204j = 0;
        this.f176206l = new cawx();
        this.f176207m = new cawx();
        this.f176208n = false;
        this.f176213s = new LinkedHashSet();
        caui caui = cavw.f176186f;
        this.f176196b = caui;
        this.f176197c = true;
        this.f176201g = 1;
        if (caui == caui.HTTP_2) {
            this.f176201g += 2;
        }
        this.f176206l.mo75032a(7, 0, 16777216);
        this.f176199e = cavw.f176182b;
        if (this.f176196b == caui.HTTP_2) {
            this.f176209o = new cawp();
            this.f176203i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), cavk.m127319b(String.format("OkHttp %s Push Observer", this.f176199e)));
            this.f176207m.mo75032a(7, 0, 65535);
            this.f176207m.mo75032a(5, 0, AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
        } else if (this.f176196b == caui.SPDY_3) {
            this.f176209o = new caxa();
            this.f176203i = null;
        } else {
            throw new AssertionError(this.f176196b);
        }
        this.f176205k = (long) this.f176207m.mo75036c();
        this.f176210p = cavw.f176181a;
        this.f176211q = this.f176209o.mo75028a(cavw.f176184d, this.f176197c);
        this.f176212r = new cawb(this, this.f176209o.mo75027a(cavw.f176183c, this.f176197c));
        new Thread(this.f176212r).start();
    }

    /* renamed from: a */
    public static final synchronized void m127360a(boolean z) {
        synchronized (cawc.class) {
            if (z) {
                System.nanoTime();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized cawg mo74990b(int i) {
        cawg cawg;
        cawg = (cawg) this.f176198d.remove(Integer.valueOf(i));
        if (cawg != null && this.f176198d.isEmpty()) {
            m127360a(true);
        }
        notifyAll();
        return cawg;
    }

    /* renamed from: c */
    public final boolean mo74993c(int i) {
        return this.f176196b == caui.HTTP_2 && i != 0 && (i & 1) == 0;
    }

    public final void close() {
        mo74989a(cavl.NO_ERROR, cavl.CANCEL);
    }

    /* renamed from: a */
    public final synchronized int mo74984a() {
        cawx cawx;
        cawx = this.f176207m;
        return (cawx.f176290a & 16) != 0 ? cawx.f176293d[4] : Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public final void mo74991b() {
        this.f176211q.mo74981b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized cawg mo74985a(int i) {
        return (cawg) this.f176198d.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo74992b(int i, cavl cavl) {
        this.f176211q.mo74976a(i, cavl);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo74986a(int i, long j) {
        f176195a.execute(new cavq(this, "OkHttp Window Update %s stream %d", new Object[]{this.f176199e, Integer.valueOf(i)}, i, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo74987a(int i, cavl cavl) {
        f176195a.submit(new cavp(this, "OkHttp %s stream %d", new Object[]{this.f176199e, Integer.valueOf(i)}, i, cavl));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f176211q.mo74983c());
        r6 = (long) r3;
        r8.f176205k -= r6;
     */
    /* renamed from: a */
    public final void mo74988a(int i, boolean z, cipu cipu, long j) {
        int min;
        long j2;
        boolean z2;
        if (j != 0) {
            while (j > 0) {
                synchronized (this) {
                    while (true) {
                        try {
                            long j3 = this.f176205k;
                            if (j3 > 0) {
                                break;
                            } else if (this.f176198d.containsKey(Integer.valueOf(i))) {
                                wait();
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (InterruptedException e) {
                            throw new InterruptedIOException();
                        }
                    }
                }
                j -= j2;
                cavo cavo = this.f176211q;
                if (!z || j != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                cavo.mo74979a(z2, i, cipu, min);
            }
            return;
        }
        this.f176211q.mo74979a(z, i, cipu, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0074  */
    /* renamed from: a */
    public final void mo74989a(cavl cavl, cavl cavl2) {
        int i;
        cawg[] cawgArr = null;
        try {
            synchronized (this.f176211q) {
                synchronized (this) {
                    if (!this.f176202h) {
                        this.f176202h = true;
                        int i2 = this.f176200f;
                        this.f176211q.mo74977a(i2, cavl, cavk.f176137a);
                        e = null;
                    } else {
                        e = null;
                    }
                }
                if (cawgArr != null) {
                    for (cawg cawg : cawgArr) {
                        try {
                            cawg.mo75002a(cavl2);
                        } catch (IOException e) {
                            if (e != null) {
                                e = e;
                            }
                        }
                    }
                }
                try {
                    this.f176211q.close();
                } catch (IOException e2) {
                    if (e == null) {
                        e = e2;
                    }
                }
                try {
                    this.f176210p.close();
                } catch (IOException e3) {
                    e = e3;
                }
                if (e == null) {
                    throw e;
                }
                return;
            }
        } catch (IOException e4) {
            e = e4;
        }
        synchronized (this) {
            if (!this.f176198d.isEmpty()) {
                cawgArr = (cawg[]) this.f176198d.values().toArray(new cawg[this.f176198d.size()]);
                this.f176198d.clear();
                m127360a(false);
            }
            if (cawgArr != null) {
            }
            this.f176211q.close();
            this.f176210p.close();
            if (e == null) {
            }
        }
    }
}
