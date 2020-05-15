package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.concurrent.Executor;

/* renamed from: aphm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aphm {

    /* renamed from: c */
    private static final aecm f84389c = new aecm(aphj.f84378a);

    /* renamed from: a */
    public final aphv f84390a;

    /* renamed from: b */
    public final Executor f84391b;

    /* renamed from: d */
    private final aabl f84392d;

    public aphm(Context context, aphv aphv, Executor executor, aakr aakr) {
        this.f84390a = aphv;
        this.f84391b = executor;
        if (cdob.m134415b()) {
            this.f84392d = new aabl(getClass(), 16, "NetworkScheduler", "scheduler");
        } else {
            this.f84392d = new aabl(getClass(), 16, "scheduler");
        }
        bmxy.m108588a(aytw.m84815b(context));
        executor.execute(new aphk(1, aphv, aapx.CAUSE_UNKNOWN, null, null, null, null, -1));
        aakr.mo16945a(aphv.mo47233b(), executor);
    }

    /* renamed from: a */
    public static aphl m70301a(Context context) {
        int b = (int) ceea.m136358b();
        int k = (int) ceea.f182428a.mo6606a().mo78926k();
        int f = (int) ceea.f182428a.mo6606a().mo78921f();
        int g = (int) ceea.f182428a.mo6606a().mo78922g();
        if (b == k && f == g) {
            return new aphl(b, f);
        }
        return srf.m36091a(context) == 0 ? new aphl(b, f) : new aphl(k, g);
    }

    /* renamed from: b */
    public static void m70303b() {
        aphm aphm = apht.m70315a().f84401a;
        if (aphm != null) {
            blji b = aphm.f84392d.mo16696b("onGcmUpstreamMessage");
            try {
                aphm.f84391b.execute(bljx.m107269a(aphk.m70300b(aphm.f84390a, aapx.CLOUD_MESSAGE_SENT)));
                if (b != null) {
                    b.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: c */
    public static void m70306c() {
        aphm aphm = apht.m70315a().f84401a;
        if (aphm != null) {
            blji b = aphm.f84392d.mo16696b("onGcmDownstreamMessage");
            try {
                aphm.f84391b.execute(bljx.m107269a(aphk.m70300b(aphm.f84390a, aapx.CLOUD_MESSAGE_RECEIVED)));
                if (b != null) {
                    b.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: b */
    public static void m70304b(Context context) {
        if (apht.m70315a().f84401a != null) {
            m70302a();
        } else if (aajg.m21344d() != 0) {
            Intent intent = new Intent("com.google.android.gms.gcm.ACTION_HTTP_OK");
            intent.setPackage(context.getPackageName());
            aajg.m21336a(context, 0, intent, "com.google.android.gms.permission.INTERNAL_BROADCAST", null, null);
        }
    }

    /* renamed from: a */
    public static void m70302a() {
        aphm aphm = apht.m70315a().f84401a;
        if (aphm != null) {
            blji b = aphm.f84392d.mo16696b("onGoogleHttpClientResponseImpl");
            try {
                aphm.f84391b.execute(bljx.m107269a(aphk.m70300b(aphm.f84390a, aapx.GOOGLE_HTTP_CLIENT)));
                if (b != null) {
                    b.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: b */
    public static boolean m70305b(apid apid) {
        int i;
        int m = (int) cedr.f182397a.mo6606a().mo78900m();
        if (!apid.mo47278o() && m > 0) {
            try {
                i = apid.mo47273j().mo17016a(apht.m70315a().f84403c, 0).targetSdkVersion;
            } catch (PackageManager.NameNotFoundException e) {
                i = 0;
            }
            if (i >= m) {
                String str = apid.mo47273j().f28457a;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR);
                sb.append("The Firebase Job Dispatcher and GmsTaskScheduler are deprecated for apps targeting API ");
                sb.append(m);
                sb.append(" or newer. Application ");
                sb.append(str);
                sb.append(" has targetSdkVersion ");
                sb.append(i);
                sb.append(". Please migrate to the WorkManager or JobScheduler.");
                Log.w("NetworkScheduler", sb.toString());
                return false;
            }
        }
        return f84389c.mo6527a(apid.mo47281r());
    }

    /* renamed from: a */
    public final void mo47219a(aeco aeco) {
        this.f84391b.execute(new aphk(4, this.f84390a, aapx.CAUSE_UNKNOWN, null, aeco, null, null, -1));
    }

    /* renamed from: a */
    public final void mo47220a(apid apid) {
        this.f84391b.execute(new aphk(2, this.f84390a, aapx.CAUSE_UNKNOWN, apid, null, null, null, -1));
    }
}
