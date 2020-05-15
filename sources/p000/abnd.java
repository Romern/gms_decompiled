package p000;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abnd {

    /* renamed from: a */
    public static final /* synthetic */ int f57721a = 0;

    /* renamed from: b */
    private static final Set f57722b = new HashSet();

    /* renamed from: c */
    private static volatile boolean f57723c = false;

    /* renamed from: d */
    private static final Object f57724d = new Object();

    /* renamed from: e */
    private static aylp f57725e;

    /* renamed from: a */
    public static long m47940a(long j) {
        long c = cekq.m137092c();
        return c > 1 ? j - (j % c) : j;
    }

    /* renamed from: c */
    public static boolean m47946c(String str) {
        boolean contains;
        if (!f57723c) {
            m47945b();
        }
        synchronized (f57724d) {
            contains = f57722b.contains(str);
        }
        return contains;
    }

    /* renamed from: b */
    public static qxo m47944b(String str) {
        return abnc.f57720a.mo24389f(str).mo24372a();
    }

    /* renamed from: a */
    public static aylp m47941a() {
        if (f57725e == null) {
            f57725e = new aylp(adzl.f62962b.mo25877a(1, 2), new beof(new qws(rpr.m34216b(), "STREAMZ_HERREVAD", null), "STREAMZ_HERREVAD"), "gmscore_herrevad");
        }
        ((beox) f57725e.f97900b).f111962c = cekq.f182858a.mo6606a().mo79242f();
        return f57725e;
    }

    /* renamed from: b */
    public static void m47945b() {
        synchronized (f57724d) {
            f57722b.clear();
            for (String str : cekz.f182874a.mo6606a().mo79261l().split(",", -1)) {
                String trim = str.trim();
                if (trim.length() != 0) {
                    f57722b.add(trim);
                }
            }
            f57723c = true;
        }
    }

    /* renamed from: a */
    public static qws m47942a(Context context) {
        return new qws(context, "HERREVAD", null);
    }

    /* renamed from: a */
    public static void m47943a(String str) {
        new Object[1][0] = str;
        int i = eoa.f15378a;
        abnc.f57720a.mo24383c(str).mo24359a();
    }
}
