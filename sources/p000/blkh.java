package p000;

import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;

/* renamed from: blkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blkh {

    /* renamed from: a */
    private static final ThreadLocal f126727a = new blke();

    static {
        new ArrayDeque();
        new ArrayDeque();
    }

    /* renamed from: a */
    public static bliy m107280a(blki blki) {
        bmxy.m108581a(blki);
        return m107292b();
    }

    /* renamed from: b */
    public static bljg m107292b() {
        return ((blkg) f126727a.get()).f126725b;
    }

    /* renamed from: c */
    static bljg m107296c() {
        bljg b = m107292b();
        return b == null ? new blis() : b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blkh.a(boolean, java.lang.String):void
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      blkh.a(java.lang.String, blki):bljb
      blkh.a(blkg, bljg):bljg
      blkh.a(bliy, blki):void
      blkh.a(bljg, bljg):void
      blkh.a(bljg, java.lang.String):void
      blkh.a(boolean, java.lang.String):void */
    /* renamed from: d */
    static void m107299d() {
        m107291a(true, (String) null);
    }

    /* renamed from: e */
    private static void m107301e(bljg bljg) {
        Trace.endSection();
        if (bljg.mo66573a() != null) {
            m107301e(bljg.mo66573a());
        }
    }

    /* renamed from: a */
    public static bljb m107281a(String str) {
        return m107282a(str, blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
    }

    /* renamed from: b */
    static bljg m107293b(bljg bljg) {
        return m107285a((blkg) f126727a.get(), bljg);
    }

    /* renamed from: d */
    private static void m107300d(bljg bljg) {
        if (bljg.mo66573a() != null) {
            m107300d(bljg.mo66573a());
        }
        m107298c(bljg.mo66575c());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blkh.a(boolean, java.lang.String):void
     arg types: [int, java.lang.String]
     candidates:
      blkh.a(java.lang.String, blki):bljb
      blkh.a(blkg, bljg):bljg
      blkh.a(bliy, blki):void
      blkh.a(bljg, bljg):void
      blkh.a(bljg, java.lang.String):void
      blkh.a(boolean, java.lang.String):void */
    /* renamed from: b */
    public static void m107294b(String str) {
        m107291a(false, str);
    }

    /* renamed from: c */
    public static String m107297c(bljg bljg) {
        if (bljg.mo66573a() == null) {
            return bljg.mo66575c();
        }
        String c = m107297c(bljg.mo66573a());
        String c2 = bljg.mo66575c();
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 4 + String.valueOf(c2).length());
        sb.append(c);
        sb.append(" -> ");
        sb.append(c2);
        return sb.toString();
    }

    /* renamed from: a */
    public static bljb m107282a(String str, blki blki) {
        return m107283a(str, blki, blje.f126668a);
    }

    /* renamed from: b */
    public static boolean m107295b(blki blki) {
        bmxy.m108581a(blki);
        return m107292b() != null;
    }

    /* renamed from: c */
    private static void m107298c(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* renamed from: a */
    public static bljb m107283a(String str, blki blki, bljf bljf) {
        bljg bljg;
        bmxy.m108581a(blki);
        bljg b = m107292b();
        if (b == null) {
            m107299d();
            bljg = new blit(str);
        } else {
            bljg = b.mo66580a(str, bljf);
        }
        m107293b(bljg);
        return new bljb(bljg);
    }

    /* renamed from: a */
    public static bljc m107284a(bljd bljd) {
        bljc a = bljc.m107233a(2);
        for (bljg b = m107292b(); b != null; b = b.mo66573a()) {
            a = b.mo66578a(bljd);
            a.f126665a = true;
            int i = a.f126666b - 1;
            if (i == 0 || i == 1) {
                break;
            }
        }
        return a;
    }

    /* renamed from: a */
    private static bljg m107285a(blkg blkg, bljg bljg) {
        bljg bljg2 = blkg.f126725b;
        if (bljg2 == bljg) {
            return bljg;
        }
        if (bljg2 == null) {
            int i = Build.VERSION.SDK_INT;
            blkg.f126724a = blkf.m107279a();
        }
        if (blkg.f126724a) {
            m107289a(bljg2, bljg);
        }
        if ((bljg != null && bljg.mo66583e()) || (bljg2 != null && bljg2.mo66583e())) {
            int currentThreadTimeMillis = (int) SystemClock.currentThreadTimeMillis();
            int i2 = currentThreadTimeMillis - blkg.f126726c;
            if (i2 > 0 && bljg2 != null && bljg2.mo66583e()) {
                bljg2.mo66581a(i2);
            }
            blkg.f126726c = currentThreadTimeMillis;
        }
        blkg.f126725b = bljg;
        return bljg2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blkh.a(boolean, java.lang.String):void
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      blkh.a(java.lang.String, blki):bljb
      blkh.a(blkg, bljg):bljg
      blkh.a(bliy, blki):void
      blkh.a(bljg, bljg):void
      blkh.a(bljg, java.lang.String):void
      blkh.a(boolean, java.lang.String):void */
    /* renamed from: a */
    public static void m107286a() {
        m107291a(false, (String) null);
    }

    /* renamed from: a */
    public static void m107287a(bliy bliy, blki blki) {
        bmxy.m108581a(blki);
        m107293b((bljg) bliy);
    }

    /* renamed from: a */
    static void m107288a(bljg bljg) {
        boolean z;
        bmxy.m108581a(bljg);
        blkg blkg = (blkg) f126727a.get();
        bljg bljg2 = blkg.f126725b;
        if (bljg == bljg2) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108606b(z, "Wrong trace, expected %s but got %s", bljg2.mo66575c(), bljg.mo66575c());
        m107285a(blkg, bljg2.mo66573a());
    }

    /* renamed from: a */
    private static void m107289a(bljg bljg, bljg bljg2) {
        if (bljg != null) {
            if (bljg2 != null) {
                if (bljg.mo66573a() == bljg2) {
                    Trace.endSection();
                    return;
                } else if (bljg == bljg2.mo66573a()) {
                    m107298c(bljg2.mo66575c());
                    return;
                }
            }
            m107301e(bljg);
        }
        if (bljg2 != null) {
            m107300d(bljg2);
        }
    }

    /* renamed from: a */
    static void m107290a(bljg bljg, String str) {
        if (bljg instanceof blip) {
            String c = m107297c(bljg);
            if (!"".equals(c)) {
                String valueOf = String.valueOf(c);
                c = valueOf.length() == 0 ? new String(": ") : ": ".concat(valueOf);
            }
            blin blin = new blin(c, str, ((blip) bljg).mo66577d());
            blkd.m107278a(blin);
            throw blin;
        }
        int i = Build.VERSION.SDK_INT;
        blin blin2 = new blin(str);
        blkd.m107278a(blin2);
        throw blin2;
    }

    /* renamed from: a */
    static void m107291a(boolean z, String str) {
        IllegalStateException illegalStateException;
        if (bljh.m107251a()) {
            bljg b = m107292b();
            if (b == null) {
                illegalStateException = new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.");
            } else {
                illegalStateException = b instanceof blip ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((blip) b).mo66577d()) : null;
            }
            if (illegalStateException == null) {
                return;
            }
            if (z) {
                if (str == null) {
                    str = "Tracer";
                }
                Log.e(str, "Missing trace", illegalStateException);
                return;
            }
            throw illegalStateException;
        }
    }
}
