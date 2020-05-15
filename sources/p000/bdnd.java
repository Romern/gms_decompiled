package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;

/* renamed from: bdnd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdnd {

    /* renamed from: a */
    public final long f106029a;

    /* renamed from: b */
    public long f106030b;

    /* renamed from: c */
    public long f106031c;

    /* renamed from: d */
    public int f106032d;

    /* renamed from: e */
    public int f106033e;

    /* renamed from: f */
    public final String f106034f;

    /* renamed from: g */
    public final String f106035g;

    /* renamed from: h */
    public final boolean f106036h;

    /* renamed from: i */
    public String f106037i;

    /* renamed from: j */
    public int f106038j;

    /* renamed from: k */
    public String f106039k;

    /* renamed from: l */
    public String[] f106040l;

    /* renamed from: m */
    public cioa f106041m;

    /* renamed from: n */
    public cimz f106042n;

    /* renamed from: o */
    public int f106043o;

    /* renamed from: p */
    public int f106044p;

    /* renamed from: q */
    public int f106045q;

    /* renamed from: r */
    public int f106046r;

    /* renamed from: s */
    public int f106047s;

    /* renamed from: t */
    public int f106048t;

    /* renamed from: u */
    public int f106049u;

    /* renamed from: v */
    public int f106050v;

    static {
        int i = aytg.f98445a;
    }

    /* renamed from: a */
    public final void mo58202a(int i) {
        if (i >= 0) {
            this.f106038j = i;
        }
    }

    public bdnd(String str) {
        this(str, false);
    }

    /* renamed from: a */
    static void m91133a(bdnd bdnd, Context context) {
        NetworkInfo activeNetworkInfo;
        bdnd.f106041m = bdjc.m90894a(null, context);
        bnrt bnrt = bdna.f106024a;
        int i = -1;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
                i = activeNetworkInfo.getType();
            }
        } catch (SecurityException e) {
            bnrq bnrq = (bnrq) bdna.f106024a.mo68388c();
            bnrq.mo68437a(e);
            bnrq.mo68432a("bdna", "a", 36, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
        }
        int a = cinh.m150631a(i);
        if (a == 0) {
            a = 1;
        }
        bdnd.f106049u = a;
    }

    public bdnd(String str, boolean z) {
        this.f106050v = 1;
        this.f106035g = null;
        if (str == null) {
            str = null;
        } else if (str.isEmpty()) {
            str = null;
        }
        this.f106034f = str;
        this.f106036h = z;
        this.f106029a = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    static boolean m91134a(bdnd bdnd) {
        if (bdnd.f106031c > 0 || bdnd.f106032d > 0 || bdnd.f106033e > 0 || bdnd.f106045q > 0) {
            return true;
        }
        int i = bdnd.f106050v;
        int i2 = bdnd.f106048t;
        return false;
    }

    /* renamed from: a */
    public final void mo58201a() {
        this.f106030b = SystemClock.elapsedRealtime() - this.f106029a;
    }

    /* renamed from: a */
    public final void mo58203a(int i, int i2) {
        this.f106031c = SystemClock.elapsedRealtime() - this.f106029a;
        this.f106032d = i;
        this.f106033e = i2;
    }

    /* renamed from: a */
    public final void mo58204a(String str) {
        if (str != null && !str.isEmpty()) {
            this.f106039k = str;
        }
    }
}
