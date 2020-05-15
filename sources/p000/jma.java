package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jma implements jnt, jlj {

    /* renamed from: a */
    public static final Logger f22787a = jsy.m17256a("GcmSecureChannel");

    /* renamed from: b */
    public final ScheduledExecutorService f22788b;

    /* renamed from: c */
    public final Object f22789c;

    /* renamed from: d */
    public final String f22790d;

    /* renamed from: e */
    public final String f22791e;

    /* renamed from: f */
    public final String f22792f;

    /* renamed from: g */
    public final String f22793g;

    /* renamed from: h */
    public final boolean f22794h;

    /* renamed from: i */
    public final int f22795i;

    /* renamed from: j */
    public final Set f22796j;

    /* renamed from: k */
    public boolean f22797k;

    /* renamed from: l */
    public jmc f22798l;

    /* renamed from: m */
    public jnl f22799m;

    /* renamed from: n */
    public jih f22800n;

    /* renamed from: o */
    public long f22801o;

    /* renamed from: p */
    public int f22802p;

    /* renamed from: q */
    public final AtomicBoolean f22803q;

    /* renamed from: r */
    public final Queue f22804r;

    /* renamed from: s */
    public final AtomicInteger f22805s;

    /* renamed from: t */
    private byte[] f22806t = null;

    /* renamed from: u */
    private int f22807u;

    /* renamed from: v */
    private final AtomicInteger f22808v;

    public jma(String str, String str2, String str3, String str4, boolean z) {
        snf a = snp.m35703a(1, 10);
        f22787a.mo25414c("Creating GcmSecureChannel...", new Object[0]);
        this.f22788b = a;
        this.f22789c = new Object();
        this.f22796j = new HashSet();
        this.f22795i = (int) cchx.f179022a.mo6606a().mo75992c();
        this.f22790d = str2;
        this.f22791e = str;
        this.f22792f = str3;
        this.f22793g = str4;
        this.f22794h = z;
        this.f22805s = new AtomicInteger(0);
        this.f22808v = new AtomicInteger(0);
        this.f22804r = new PriorityQueue();
        this.f22807u = 1;
        this.f22803q = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public static String m16891a(String str) {
        return str.length() > 8 ? str.substring(str.length() - 8) : str;
    }

    /* renamed from: a */
    static /* synthetic */ void m16892a(jma jma) {
        jma.f22802p++;
    }

    /* renamed from: i */
    public static final void m16893i() {
        f22787a.mo25414c("Heartbeat failure. Disconnecting.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo13859b() {
        f22787a.mo25414c("Received a disconnect message from connected device, disconnecting...", new Object[0]);
        this.f22803q.set(true);
        mo13827g();
    }

    /* renamed from: c */
    public final int mo13822c() {
        return 4;
    }

    /* renamed from: d */
    public final String mo13824d() {
        return this.f22790d;
    }

    /* renamed from: e */
    public final int mo13825e() {
        int i;
        synchronized (this.f22789c) {
            i = this.f22807u;
        }
        return i;
    }

    /* renamed from: f */
    public final byte[] mo13826f() {
        return this.f22806t;
    }

    /* renamed from: g */
    public final void mo13827g() {
        jlk a = jlk.m16878a();
        String str = this.f22790d;
        String a2 = m16891a(this.f22792f);
        synchronized (a.f22757a) {
            Map map = (Map) a.f22758b.get(str);
            if (map != null) {
                if (equals(map.get(a2))) {
                    map.remove(a2);
                }
                if (map.isEmpty()) {
                    a.f22758b.remove(str);
                }
            }
        }
        mo13871a(0);
        this.f22805s.set(0);
        this.f22808v.set(0);
        this.f22788b.execute(new jlv(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0139, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00ec, code lost:
        return;
     */
    /* renamed from: h */
    public final void mo13873h() {
        synchronized (this.f22789c) {
            while (!this.f22804r.isEmpty() && (((jlz) this.f22804r.peek()).f22779a == this.f22808v.get() || ((jlz) this.f22804r.peek()).f22779a == -1)) {
                jlz jlz = (jlz) this.f22804r.poll();
                if (jlz.f22782d) {
                    int i = jlz.f22781c;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                f22787a.mo25418e("Unknown auth message type %s", Integer.valueOf(jlz.f22781c));
                            } else if (!this.f22794h && this.f22799m != null) {
                                jnz jnz = jlz.f22780b;
                                synchronized (this.f22789c) {
                                    try {
                                        this.f22799m.mo13911c(jnz);
                                        try {
                                            mo13871a(3);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    } catch (jmm e) {
                                        f22787a.mo25418e("Couldn't parse initiator auth message", new Object[0]);
                                        mo13827g();
                                    }
                                }
                            }
                        } else if (this.f22794h && this.f22798l != null) {
                            jnz jnz2 = jlz.f22780b;
                            synchronized (this.f22789c) {
                                try {
                                    mo13872a(3, this.f22798l.mo13874b(jnz2));
                                    this.f22806t = this.f22800n.mo13760b();
                                } catch (jmm e2) {
                                    mo13827g();
                                }
                                mo13871a(3);
                            }
                        }
                    } else if (!this.f22794h && !this.f22797k && this.f22799m != null) {
                        jnz jnz3 = jlz.f22780b;
                        synchronized (this.f22789c) {
                            this.f22797k = true;
                            try {
                                jnz b = this.f22799m.mo13910b(jnz3);
                                this.f22806t = this.f22800n.mo13760b();
                                mo13872a(2, b);
                            } catch (jmm e3) {
                                f22787a.mo25418e("Couldn't parse initiator hello message", new Object[0]);
                                mo13827g();
                            }
                        }
                    }
                } else {
                    jnz jnz4 = jlz.f22780b;
                    synchronized (this.f22789c) {
                        jih jih = this.f22800n;
                        if (jih == null) {
                            f22787a.mo25418e("Channel unauthenticated, cannot decrypt message", new Object[0]);
                            mo13827g();
                        } else {
                            try {
                                byte[] a = jih.mo13759a(jnz4);
                                for (jns jns : this.f22796j) {
                                    jns.mo13919b(this, jnz4.f22916b, a);
                                }
                            } catch (jmm e4) {
                                f22787a.mo25417e("Couldn't decrypt message", e4, new Object[0]);
                                mo13827g();
                            }
                        }
                    }
                }
                this.f22808v.incrementAndGet();
            }
        }
    }

    /* renamed from: a */
    public final void mo13856a() {
        synchronized (this.f22789c) {
            this.f22801o = SystemClock.elapsedRealtime();
            this.f22802p = 0;
            if (this.f22794h) {
                this.f22788b.execute(new jlw(this));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r11 != 3) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (((p000.sny) r10.f22788b).f44829d != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r10.f22794h != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0051, code lost:
        r1 = new p000.jly(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r1 = new p000.jlx(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r10.f22794h != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        r11 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        r0 = r10.f22788b;
        r2 = r10.f22795i;
        ((p000.sny) r0).mo25820b(r1, (long) (r11 + r2), (long) r2, java.util.concurrent.TimeUnit.SECONDS);
        r11 = r10.f22789c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r10.f22801o = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r10.f22794h != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        p000.jnm.m16980a();
        r11 = r10.f22791e;
        r0 = r10.f22790d;
        r1 = r10.f22792f;
        r2 = r10.f22793g;
        r3 = p000.rpr.m34216b().getSharedPreferences("ResponderGcmSecureChannelCrashRecoverer.PREF_FILE", 0);
        r4 = p000.bnpf.m110049a((java.lang.Iterable) r3.getStringSet("CHANNEL_SET", new p000.C1225nr()));
        r5 = p000.jnm.m16979a(r0, r2);
        r4.add(r5);
        r3.edit().putStringSet("CHANNEL_SET", r4).putString(p000.jnm.m16981b("MY_SHORT_DEVICE_ID", r5), r11).putString(p000.jnm.m16981b("REMOTE_DEVICE_ID", r5), r0).putString(p000.jnm.m16981b("PUBLIC_TOPIC_NAME", r5), r1).putString(p000.jnm.m16981b("ACCOUNT_NAME", r5), r2).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo13871a(int i) {
        synchronized (this.f22789c) {
            int i2 = this.f22807u;
            if (i2 != i) {
                if (i2 == 3) {
                    this.f22800n = null;
                    this.f22798l = null;
                    this.f22799m = null;
                }
                f22787a.mo25414c("Connection status changed from %s to %s.", ConnectionInfo.m6759a(i2), ConnectionInfo.m6759a(i));
                this.f22807u = i;
                for (jns jns : this.f22796j) {
                    jns.mo13918b(this, i2, i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13872a(int i, jnz jnz) {
        synchronized (this.f22789c) {
            rpr b = rpr.m34216b();
            String str = this.f22793g;
            String str2 = this.f22792f;
            String str3 = this.f22791e;
            int i2 = this.f22805s.get();
            Bundle a = jll.m16881a(b, str);
            if (a != null) {
                a.putString("mt", "au");
                a.putString("fDi", str3);
                a.putString("at", String.valueOf(i));
                a.putString("sp", jnz.mo13925b());
                a.putString("ptn", m16891a(str2));
                a.putString("sn", Integer.toString(i2));
                jll.m16884a(b, str2, str, str3, a);
            } else {
                jll.m16885a(str, "au");
            }
            this.f22805s.incrementAndGet();
        }
    }

    /* renamed from: a */
    public final void mo13857a(int i, jnz jnz, int i2) {
        this.f22788b.execute(new jlt(this, i2, jnz, i));
    }

    /* renamed from: a */
    public final void mo13858a(jnz jnz, int i) {
        this.f22788b.execute(new jls(this, i, jnz));
    }

    /* renamed from: a */
    public final void mo13819a(byte[] bArr, String str) {
        if (mo13825e() != 3) {
            String a = ConnectionInfo.m6759a(mo13825e());
            throw new IllegalStateException(a.length() == 0 ? new String("Expected AUTHENTICATED status, got ") : "Expected AUTHENTICATED status, got ".concat(a));
        } else {
            this.f22788b.execute(new jlu(this, bArr, str));
        }
    }
}
