package p000;

import android.os.Build;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: sls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sls implements asez {

    /* renamed from: a */
    private static final Callable f44706a = slr.f44705a;

    /* renamed from: b */
    private final bmzi f44707b;

    /* renamed from: c */
    private final sla f44708c;

    public sls() {
        this(null);
    }

    /* renamed from: a */
    public final long mo25710a(String str, String str2) {
        sgn sgn = (sgn) this.f44707b.mo6606a();
        long j = 0;
        for (int i = 0; i < sgn.f44428a.size(); i++) {
            sgm sgm = (sgm) sgn.f44428a.get(i);
            int i2 = sgm.f44422a;
            if ((i2 & 4) != 0 && (i2 & 1) != 0 && sgm.f44423b.equals(str) && (((sgm.f44422a & 2) != 0 && "__any__".equals(sgm.f44424c)) || ((str2 == null && (sgm.f44422a & 2) == 0) || ((sgm.f44422a & 2) != 0 && sgm.f44424c.equals(str2))))) {
                j = sgm.f44425d;
                if ((sgm.f44422a & 2) == 0 || !"__any__".equals(sgm.f44424c)) {
                    return j;
                }
            }
        }
        return j <= 0 ? ((Long) skl.f44629d.mo58455c()).longValue() : j;
    }

    /* renamed from: b */
    public final boolean mo25712b() {
        return mo25711a() && cdpo.f181530a.mo78156b().mo78157a();
    }

    /* renamed from: c */
    public final boolean mo25713c() {
        return cdkf.f181108a.mo6606a().mo77791b();
    }

    /* renamed from: d */
    public final boolean mo25714d() {
        return cdme.m134016b();
    }

    /* renamed from: f */
    public final asey mo25716f() {
        String str;
        zzq b = aach.m21087b();
        String str2 = null;
        if (b == null) {
            return null;
        }
        if ((b.f56324a & 4) != 0) {
            zzr zzr = b.f56327d;
            if (zzr == null) {
                zzr = zzr.f56329d;
            }
            str = zzr.f56332b;
        } else {
            str = null;
        }
        if ((b.f56324a & 1) != 0) {
            zzp zzp = b.f56325b;
            if (zzp == null) {
                zzp = zzp.f56314g;
            }
            str2 = zzp.f56317b;
        }
        if (str2 == null) {
            str2 = "com.google.android.gms";
        }
        return new asey(str, str2);
    }

    /* renamed from: g */
    public final sla mo25717g() {
        return this.f44708c;
    }

    /* renamed from: h */
    public final Runnable mo25718h() {
        blkh.m107294b("WakeLock");
        if (!cdoz.f181455a.mo6606a().mo78089B()) {
            return null;
        }
        bljb a = blkh.m107281a("WakeLock");
        try {
            aabt aabt = aabs.f27896b;
            bqgh a2 = bqgh.m112796a(f44706a);
            aabt.mo16702a(a, a2);
            if (a != null) {
                a.close();
            }
            return a2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    public sls(sla sla) {
        bdyx bdyx = skl.f44631f;
        bdyx.getClass();
        this.f44707b = bmzn.m108682a(new slq(bdyx), 1, TimeUnit.HOURS);
        this.f44708c = sla;
    }

    /* renamed from: e */
    public final adyy mo25715e() {
        if (cdme.m134016b()) {
            return sej.m35079a();
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo25711a() {
        int i = Build.VERSION.SDK_INT;
        return ((Boolean) skl.f44630e.mo58455c()).booleanValue();
    }
}
