package p000;

import java.net.CookieHandler;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: caxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caxt {

    /* renamed from: a */
    public static final cauo f176350a = new caxs();

    /* renamed from: b */
    public final cauf f176351b;

    /* renamed from: c */
    public final cayf f176352c;

    /* renamed from: d */
    public final caun f176353d;

    /* renamed from: e */
    public caxv f176354e;

    /* renamed from: f */
    public long f176355f = -1;

    /* renamed from: g */
    public boolean f176356g;

    /* renamed from: h */
    public final boolean f176357h;

    /* renamed from: i */
    public final cauk f176358i;

    /* renamed from: j */
    public cauk f176359j;

    /* renamed from: k */
    public caun f176360k;

    /* renamed from: l */
    public caun f176361l;

    /* renamed from: m */
    public ciqq f176362m;

    /* renamed from: n */
    public cipv f176363n;

    /* renamed from: o */
    public caxd f176364o;

    /* renamed from: p */
    public caxf f176365p;

    public caxt(cauf cauf, cauk cauk, boolean z, cayf cayf, cayb cayb, caun caun) {
        cayf cayf2;
        cato cato;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        cauf cauf2 = cauf;
        cauk cauk2 = cauk;
        this.f176351b = cauf2;
        this.f176358i = cauk2;
        this.f176357h = z;
        if (cayf == null) {
            catt catt = cauf2.f176010l;
            if (cauk.mo74913c()) {
                SSLSocketFactory sSLSocketFactory2 = cauf2.f176007i;
                hostnameVerifier = cauf2.f176008j;
                sSLSocketFactory = sSLSocketFactory2;
                cato = cauf2.f176009k;
            } else {
                sSLSocketFactory = null;
                hostnameVerifier = null;
                cato = null;
            }
            caue caue = cauk2.f176037a;
            cayf2 = new cayf(catt, new catk(caue.f175991b, caue.f175992c, cauf2.f176011m, cauf2.f176006h, sSLSocketFactory, hostnameVerifier, cato, cauf2.f176018t, cauf2.f176001c, cauf2.f176002d, cauf2.f176003e, cauf2.f176004f));
        } else {
            cayf2 = cayf;
        }
        this.f176352c = cayf2;
        this.f176362m = cayb;
        this.f176353d = caun;
    }

    /* renamed from: a */
    public static caun m127494a(caun caun) {
        if (caun == null || caun.f176061g == null) {
            return caun;
        }
        caum a = caun.mo74919a();
        a.f176051g = null;
        return a.mo74915a();
    }

    /* renamed from: c */
    public static boolean m127495c(caun caun) {
        if (caun.f176055a.f176038b.equals("HEAD")) {
            return false;
        }
        int i = caun.f176057c;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && caxx.m127518a(caun) == -1 && !"chunked".equalsIgnoreCase(caun.mo74920a("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: b */
    public final caun mo75059b(caun caun) {
        cauo cauo;
        if (!this.f176356g || !"gzip".equalsIgnoreCase(this.f176361l.mo74920a("Content-Encoding")) || (cauo = caun.f176061g) == null) {
            return caun;
        }
        ciqc ciqc = new ciqc(cauo.mo74924b());
        caub b = caun.f176060f.mo74874b();
        b.mo74867a("Content-Encoding");
        b.mo74867a("Content-Length");
        cauc a = b.mo74866a();
        caum a2 = caun.mo74919a();
        a2.mo74916a(a);
        a2.f176051g = new caxy(ciqh.m150828a(ciqc));
        return a2.mo74915a();
    }

    /* renamed from: c */
    public final boolean mo75061c() {
        return this.f176361l != null;
    }

    /* renamed from: d */
    public final caun mo75062d() {
        caun caun = this.f176361l;
        if (caun != null) {
            return caun;
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final catr mo75063e() {
        return this.f176352c.mo75075b();
    }

    /* renamed from: f */
    public final cayf mo75064f() {
        cipv cipv = this.f176363n;
        if (cipv == null) {
            ciqq ciqq = this.f176362m;
            if (ciqq != null) {
                cavk.m127310a(ciqq);
            }
        } else {
            cavk.m127310a(cipv);
        }
        caun caun = this.f176361l;
        if (caun != null) {
            cavk.m127310a(caun.f176061g);
        } else {
            this.f176352c.mo75078e();
        }
        return this.f176352c;
    }

    /* renamed from: a */
    public final void mo75055a() {
        if (this.f176355f == -1) {
            this.f176355f = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo75056a(cauc cauc) {
        CookieHandler cookieHandler = this.f176351b.f176005g;
        if (cookieHandler != null) {
            cookieHandler.put(this.f176358i.mo74911a(), caxx.m127520a(cauc, (String) null));
        }
    }

    /* renamed from: b */
    public final ciqq mo75060b() {
        if (this.f176365p != null) {
            return this.f176362m;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final boolean mo75057a(caue caue) {
        caue caue2 = this.f176358i.f176037a;
        return caue2.f175991b.equals(caue.f175991b) && caue2.f175992c == caue.f175992c && caue2.f175990a.equals(caue.f175990a);
    }

    /* renamed from: a */
    public final boolean mo75058a(cauk cauk) {
        return caxu.m127507b(cauk.f176038b);
    }
}
