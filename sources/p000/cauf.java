package p000;

import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: cauf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cauf implements Cloneable {

    /* renamed from: a */
    public static final List f175998a = cavk.m127307a(caui.HTTP_2, caui.SPDY_3, caui.HTTP_1_1);

    /* renamed from: b */
    public static final List f175999b = cavk.m127307a(catv.f175967a, catv.f175968b, catv.f175969c);

    /* renamed from: u */
    private static SSLSocketFactory f176000u;

    /* renamed from: c */
    public Proxy f176001c;

    /* renamed from: d */
    public List f176002d;

    /* renamed from: e */
    public List f176003e;

    /* renamed from: f */
    public ProxySelector f176004f;

    /* renamed from: g */
    public CookieHandler f176005g;

    /* renamed from: h */
    public SocketFactory f176006h;

    /* renamed from: i */
    public SSLSocketFactory f176007i;

    /* renamed from: j */
    public HostnameVerifier f176008j;

    /* renamed from: k */
    public cato f176009k;

    /* renamed from: l */
    public catt f176010l;

    /* renamed from: m */
    public catz f176011m;

    /* renamed from: n */
    public boolean f176012n;

    /* renamed from: o */
    public boolean f176013o;

    /* renamed from: p */
    public boolean f176014p;

    /* renamed from: q */
    public int f176015q;

    /* renamed from: r */
    public int f176016r;

    /* renamed from: s */
    public int f176017s;

    /* renamed from: t */
    public caxc f176018t;

    /* renamed from: v */
    private final cavi f176019v;

    /* renamed from: w */
    private final catx f176020w;

    /* renamed from: x */
    private final List f176021x;

    /* renamed from: y */
    private final List f176022y;

    static {
        cavb.f176116b = new cavb();
    }

    public cauf() {
        this.f176021x = new ArrayList();
        this.f176022y = new ArrayList();
        this.f176012n = true;
        this.f176013o = true;
        this.f176014p = true;
        this.f176015q = 10000;
        this.f176016r = 10000;
        this.f176017s = 10000;
        this.f176019v = new cavi();
        this.f176020w = new catx();
    }

    /* renamed from: b */
    public static final synchronized SSLSocketFactory m127231b() {
        SSLSocketFactory sSLSocketFactory;
        synchronized (cauf.class) {
            if (f176000u == null) {
                try {
                    SSLContext instance = SSLContext.getInstance("TLS");
                    instance.init(null, null, null);
                    f176000u = instance.getSocketFactory();
                } catch (GeneralSecurityException e) {
                    throw new AssertionError();
                }
            }
            sSLSocketFactory = f176000u;
        }
        return sSLSocketFactory;
    }

    /* renamed from: a */
    public final cauf clone() {
        return new cauf(this);
    }

    public cauf(cauf cauf) {
        this.f176021x = new ArrayList();
        this.f176022y = new ArrayList();
        this.f176012n = true;
        this.f176013o = true;
        this.f176014p = true;
        this.f176015q = 10000;
        this.f176016r = 10000;
        this.f176017s = 10000;
        this.f176019v = cauf.f176019v;
        this.f176020w = cauf.f176020w;
        this.f176001c = cauf.f176001c;
        this.f176002d = cauf.f176002d;
        this.f176003e = cauf.f176003e;
        this.f176021x.addAll(cauf.f176021x);
        this.f176022y.addAll(cauf.f176022y);
        this.f176004f = cauf.f176004f;
        this.f176005g = cauf.f176005g;
        this.f176006h = cauf.f176006h;
        this.f176007i = cauf.f176007i;
        this.f176008j = cauf.f176008j;
        this.f176009k = cauf.f176009k;
        this.f176018t = cauf.f176018t;
        this.f176010l = cauf.f176010l;
        this.f176011m = cauf.f176011m;
        this.f176012n = cauf.f176012n;
        this.f176013o = cauf.f176013o;
        this.f176014p = cauf.f176014p;
        this.f176015q = cauf.f176015q;
        this.f176016r = cauf.f176016r;
        this.f176017s = cauf.f176017s;
    }
}
