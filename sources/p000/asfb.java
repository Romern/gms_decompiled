package p000;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: asfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfb {

    /* renamed from: n */
    public static volatile asez f88804n = new asev();

    /* renamed from: o */
    private static final long f88805o = TimeUnit.DAYS.toMillis(366);

    /* renamed from: y */
    private static ScheduledExecutorService f88806y;

    /* renamed from: a */
    public final Object f88807a;

    /* renamed from: b */
    public int f88808b;

    /* renamed from: c */
    public final Set f88809c;

    /* renamed from: d */
    public boolean f88810d;

    /* renamed from: e */
    public long f88811e;

    /* renamed from: f */
    public boolean f88812f;

    /* renamed from: g */
    public boolean f88813g;

    /* renamed from: h */
    adyw f88814h;

    /* renamed from: i */
    public final int f88815i;

    /* renamed from: j */
    public final String f88816j;

    /* renamed from: k */
    public final String f88817k;

    /* renamed from: l */
    public final String f88818l;

    /* renamed from: m */
    public final Context f88819m;

    /* renamed from: p */
    private final PowerManager.WakeLock f88820p;

    /* renamed from: q */
    private Future f88821q;

    /* renamed from: r */
    private long f88822r;

    /* renamed from: s */
    private int f88823s;

    /* renamed from: t */
    private WorkSource f88824t;

    /* renamed from: u */
    private String f88825u;

    /* renamed from: v */
    private final String f88826v;

    /* renamed from: w */
    private final Map f88827w;

    /* renamed from: x */
    private AtomicInteger f88828x;

    /* JADX WARNING: Illegal instructions before constructor call */
    public asfb(Context context, int i, String str) {
        this(context, i, str, null, r6);
        String str2;
        if (context != null) {
            str2 = context.getPackageName();
        } else {
            str2 = null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    private static long m73915a(String str, String str2, long j) {
        long max = Math.max(Math.min(f88804n.mo25710a(str, str2), f88805o), 1L);
        return j > 0 ? Math.min(j, max) : max;
    }

    /* renamed from: c */
    private final void m73917c(String str, long j) {
        boolean z;
        long a = m73915a(this.f88826v, str, j);
        if (a == j) {
            z = true;
        } else {
            z = false;
        }
        synchronized (this.f88807a) {
            if (!mo49124e()) {
                this.f88814h = adyw.m51454a(f88804n.mo25714d(), f88804n.mo25715e());
                this.f88820p.acquire();
                this.f88811e = SystemClock.elapsedRealtime();
            }
            this.f88808b++;
            this.f88823s++;
            String d = m73918d(str);
            asex asex = (asex) this.f88827w.get(d);
            if (asex == null) {
                asex = new asex();
                this.f88827w.put(d, asex);
            }
            Runnable h = f88804n.mo25718h();
            if (asex.f88797b != null) {
                asex.mo49108a();
            }
            asex.f88797b = h;
            int i = asex.f88796a + 1;
            asex.f88796a = i;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = Long.MAX_VALUE;
            if (Long.MAX_VALUE - elapsedRealtime > a) {
                j2 = elapsedRealtime + a;
            }
            if (j2 > this.f88822r) {
                this.f88822r = j2;
                this.f88812f = z;
                Future future = this.f88821q;
                if (future != null) {
                    future.cancel(false);
                }
                this.f88821q = f88806y.schedule(new aseu(this), a, TimeUnit.MILLISECONDS);
            }
            this.f88813g = false;
            if (i == 1) {
                m73916a(7, d, a);
            }
        }
    }

    /* renamed from: d */
    private final String m73918d(String str) {
        return (!this.f88810d || TextUtils.isEmpty(str)) ? this.f88817k : str;
    }

    /* renamed from: b */
    public final asfa mo49116b(String str, long j) {
        asfa asfa = new asfa(this, str);
        long a = m73915a(this.f88826v, str, j);
        synchronized (this.f88807a) {
            m73917c(str, a);
            this.f88809c.add(asfa);
            asfa.f88801b = f88806y.schedule(new asew(new WeakReference(asfa)), a, TimeUnit.MILLISECONDS);
        }
        return asfa;
    }

    /* renamed from: e */
    public final boolean mo49124e() {
        boolean z;
        synchronized (this.f88807a) {
            z = this.f88808b > 0;
        }
        return z;
    }

    /* renamed from: f */
    public final void mo49125f() {
        int i;
        int i2;
        float f;
        boolean z;
        synchronized (this.f88807a) {
            if (mo49124e()) {
                if (this.f88810d) {
                    int i3 = this.f88808b - 1;
                    this.f88808b = i3;
                    if (i3 > 0) {
                        return;
                    }
                } else {
                    this.f88808b = 0;
                }
                mo49123d();
                for (asex asex : this.f88827w.values()) {
                    asex.f88796a = 0;
                    asex.mo49108a();
                }
                this.f88827w.clear();
                Future future = this.f88821q;
                if (future != null) {
                    future.cancel(false);
                    this.f88821q = null;
                    this.f88822r = 0;
                }
                sla g = f88804n.mo25717g();
                if (g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - this.f88811e;
                    if (this.f88813g) {
                        i = this.f88812f ? 2 : 3;
                    } else {
                        i = 1;
                    }
                    Context context = this.f88819m;
                    String str = this.f88816j;
                    int i4 = this.f88815i;
                    int i5 = this.f88823s;
                    if (cdpl.m134607b()) {
                        double a = cdpl.f181520a.mo6606a().mo78148a();
                        if (i == 1) {
                            i2 = i5;
                            f = (float) (cdpl.f181520a.mo6606a().mo78152e() * a);
                        } else if (i != 2) {
                            i2 = i5;
                            f = (float) (a * cdpl.f181520a.mo6606a().mo78149b());
                        } else {
                            i2 = i5;
                            f = (float) (cdpl.f181520a.mo6606a().mo78155h() * a);
                        }
                        skz skz = g.f44666b;
                        if (f > 0.0f && ((skx) skz).f44653b.nextFloat() < f) {
                            boolean b = srf.m36093b(context);
                            boolean d = srf.m36095d(context);
                            if (!cdpl.f181520a.mo6606a().mo78154g() || !srf.m36094c(context)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            g.f44665a.submit(new sky(context, currentTimeMillis, str, i, f, i4, i2, elapsedRealtime, b, d, z));
                        }
                    }
                }
                this.f88823s = 0;
                if (!this.f88820p.isHeld()) {
                    Log.e("WakeLock", String.valueOf(this.f88816j).concat(" should be held!"));
                } else {
                    try {
                        int i6 = Build.VERSION.SDK_INT;
                        this.f88820p.release();
                        adyw adyw = this.f88814h;
                        if (adyw != null) {
                            adyw.close();
                            this.f88814h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f88816j).concat(" failed to release!"), e);
                            adyw adyw2 = this.f88814h;
                            if (adyw2 != null) {
                                adyw2.close();
                            }
                            return;
                        }
                        throw e;
                    } catch (Throwable th) {
                        adyw adyw3 = this.f88814h;
                        if (adyw3 != null) {
                            adyw3.close();
                            this.f88814h = null;
                        }
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private final void m73919d(WorkSource workSource) {
        try {
            this.f88820p.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public asfb(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, str2, str3, null);
    }

    /* renamed from: a */
    private final void m73916a(int i, String str, long j) {
        Context context = this.f88819m;
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(this.f88820p))));
        String valueOf2 = String.valueOf(TextUtils.isEmpty(str) ? "" : str);
        slw.m35611a(context, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2), i, this.f88816j, str, this.f88818l, this.f88815i, mo49110a(), j);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public asfb(Context context, int i, String str, String str2, String str3, String str4) {
        this.f88807a = new Object();
        this.f88808b = 0;
        this.f88809c = new HashSet();
        this.f88810d = true;
        this.f88827w = new HashMap();
        this.f88828x = new AtomicInteger(0);
        sdo.m34966a(context, "WakeLock: context must not be null");
        sdo.m34969a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.f88815i = i;
        this.f88817k = str2;
        this.f88818l = str4;
        this.f88819m = context.getApplicationContext();
        this.f88826v = str;
        this.f88814h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f88816j = valueOf.length() == 0 ? new String("*gcore*:") : "*gcore*:".concat(valueOf);
        } else if (!f88804n.mo25713c() || "com.google.android.gms".equals(str3)) {
            this.f88816j = str;
        } else {
            String valueOf2 = String.valueOf(str);
            this.f88816j = valueOf2.length() == 0 ? new String("*gcore*:") : "*gcore*:".concat(valueOf2);
        }
        this.f88820p = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (stx.m36339a(context)) {
            if (stm.m36302d(str3)) {
                if (rtc.m34382b()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57);
                    sb.append("callingPackage is not supposed to be empty for wakelock ");
                    sb.append(str);
                    sb.append("!");
                    Log.w("WakeLock", sb.toString(), new IllegalArgumentException());
                    str3 = "com.google.android.gms";
                } else {
                    str3 = context.getPackageName();
                }
            }
            if (f88804n.mo25712b()) {
                asey f = f88804n.mo25716f();
                if (f != null) {
                    str3 = str3 == null ? f.f88799b : str3;
                    if (str4 == null) {
                        str4 = f.f88798a;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
            }
            if (!f88804n.mo25711a() || str3 == null || str4 == null) {
                this.f88824t = stx.m36335a(context, str3);
            } else {
                this.f88825u = str3;
                this.f88824t = stx.m36336a(context, str3, str4);
            }
            mo49112a(this.f88824t);
        }
        if (f88806y == null) {
            f88806y = adzl.f62962b.mo25877a(1, 2);
        }
    }

    /* renamed from: d */
    public final void mo49123d() {
        if (!this.f88809c.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f88809c);
            this.f88809c.clear();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((asfa) arrayList.get(i)).mo49109a();
            }
        }
    }

    /* renamed from: a */
    public final List mo49110a() {
        List b = stx.m36340b(this.f88824t);
        if (this.f88825u == null) {
            return b;
        }
        ArrayList arrayList = new ArrayList(b);
        arrayList.add(this.f88825u);
        return arrayList;
    }

    /* renamed from: b */
    public final void mo49117b() {
        this.f88828x.incrementAndGet();
        m73917c(null, 0);
    }

    /* renamed from: b */
    public final void mo49118b(WorkSource workSource) {
        if (stx.m36339a(this.f88819m)) {
            try {
                WorkSource workSource2 = this.f88824t;
                if (workSource2 != null) {
                    workSource2.remove(workSource);
                }
                m73919d(this.f88824t);
            } catch (ArrayIndexOutOfBoundsException e) {
                Log.e("WakeLock", e.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo49111a(long j) {
        this.f88828x.incrementAndGet();
        m73917c(null, j);
    }

    /* renamed from: a */
    public final void mo49112a(WorkSource workSource) {
        if (workSource != null && stx.m36339a(this.f88819m)) {
            WorkSource workSource2 = this.f88824t;
            if (workSource2 != null) {
                workSource2.add(workSource);
            } else {
                this.f88824t = workSource;
            }
            m73919d(this.f88824t);
        }
    }

    /* renamed from: b */
    public final void mo49119b(String str) {
        synchronized (this.f88807a) {
            String d = m73918d(str);
            if (!this.f88827w.containsKey(d)) {
                Log.w("WakeLock", String.valueOf(this.f88816j).concat(" counter does not exist"));
            } else {
                asex asex = (asex) this.f88827w.get(d);
                if (asex != null) {
                    int i = asex.f88796a - 1;
                    asex.f88796a = i;
                    if (i == 0) {
                        asex.mo49108a();
                    }
                    if (asex.f88796a == 0) {
                        this.f88827w.remove(d);
                        m73916a(8, d, 0);
                    }
                }
            }
            mo49125f();
        }
    }

    /* renamed from: a */
    public final void mo49113a(String str) {
        this.f88828x.incrementAndGet();
        m73917c(str, 0);
    }

    /* renamed from: a */
    public final void mo49114a(String str, long j) {
        this.f88828x.incrementAndGet();
        m73917c(str, j);
    }

    /* renamed from: a */
    public final void mo49115a(boolean z) {
        synchronized (this.f88807a) {
            this.f88810d = z;
        }
    }

    /* renamed from: c */
    public final void mo49120c() {
        mo49122c((String) null);
    }

    /* renamed from: c */
    public final void mo49121c(WorkSource workSource) {
        if (stx.m36339a(this.f88819m)) {
            m73919d(workSource);
            this.f88824t = workSource;
            this.f88825u = null;
        }
    }

    /* renamed from: c */
    public final void mo49122c(String str) {
        if (this.f88828x.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f88816j).concat(" release without a matched acquire!"));
        }
        mo49119b(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public asfb(Context context, String str, String str2) {
        this(context, 1, str, str2, r6);
        String str3;
        if (context != null) {
            str3 = context.getPackageName();
        } else {
            str3 = null;
        }
    }
}
