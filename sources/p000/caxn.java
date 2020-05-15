package p000;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.logging.Logger;

/* renamed from: caxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caxn implements caxv {

    /* renamed from: a */
    public final cayf f176325a;

    /* renamed from: b */
    public final cipw f176326b;

    /* renamed from: c */
    public final cipv f176327c;

    /* renamed from: d */
    public int f176328d = 0;

    /* renamed from: e */
    private caxt f176329e;

    public caxn(cayf cayf, cipw cipw, cipv cipv) {
        this.f176325a = cayf;
        this.f176326b = cipw;
        this.f176327c = cipv;
    }

    /* renamed from: a */
    public static final void m127472a(ciqb ciqb) {
        ciqt ciqt = ciqb.f191224a;
        ciqb.f191224a = ciqt.f191261f;
        ciqt.mo86360i();
        ciqt.mo86359h();
    }

    /* renamed from: a */
    public final void mo75048a(caxt caxt) {
        this.f176329e = caxt;
    }

    /* renamed from: b */
    public final caum mo75050b() {
        return mo75052d();
    }

    /* renamed from: c */
    public final void mo75051c() {
        this.f176327c.flush();
    }

    /* renamed from: d */
    public final caum mo75052d() {
        caye a;
        caum caum;
        int i = this.f176328d;
        if (i == 1 || i == 3) {
            do {
                try {
                    a = caye.m127534a(this.f176326b.mo86326l());
                    caum = new caum();
                    caum.f176046b = a.f176387a;
                    caum.f176047c = a.f176388b;
                    caum.f176048d = a.f176389c;
                    caum.mo74916a(mo75053e());
                } catch (EOFException e) {
                    String valueOf = String.valueOf(this.f176325a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb.append("unexpected end of stream on ");
                    sb.append(valueOf);
                    IOException iOException = new IOException(sb.toString());
                    iOException.initCause(e);
                    throw iOException;
                }
            } while (a.f176388b == 100);
            this.f176328d = 4;
            return caum;
        }
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("state: ");
        sb2.append(i);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: e */
    public final cauc mo75053e() {
        caub caub = new caub();
        while (true) {
            String l = this.f176326b.mo86326l();
            if (l.length() == 0) {
                return caub.mo74866a();
            }
            Logger logger = cavb.f176115a;
            int indexOf = l.indexOf(":", 1);
            if (indexOf != -1) {
                caub.mo74868a(l.substring(0, indexOf), l.substring(indexOf + 1));
            } else if (l.startsWith(":")) {
                caub.mo74868a("", l.substring(1));
            } else {
                caub.mo74868a("", l);
            }
        }
    }

    /* renamed from: a */
    public final cauo mo75042a(caun caun) {
        ciqr ciqr;
        if (!caxt.m127495c(caun)) {
            ciqr = mo75044a(0);
        } else if (!"chunked".equalsIgnoreCase(caun.mo74920a("Transfer-Encoding"))) {
            long a = caxx.m127518a(caun);
            if (a != -1) {
                ciqr = mo75044a(a);
            } else {
                int i = this.f176328d;
                if (i == 4) {
                    cayf cayf = this.f176325a;
                    if (cayf != null) {
                        this.f176328d = 5;
                        cayf.mo75077d();
                        ciqr = new caxm(this);
                    } else {
                        throw new IllegalStateException("streamAllocation == null");
                    }
                } else {
                    StringBuilder sb = new StringBuilder(18);
                    sb.append("state: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            }
        } else {
            caxt caxt = this.f176329e;
            int i2 = this.f176328d;
            if (i2 == 4) {
                this.f176328d = 5;
                ciqr = new caxj(this, caxt);
            } else {
                StringBuilder sb2 = new StringBuilder(18);
                sb2.append("state: ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
        }
        return new caxy(ciqh.m150828a(ciqr));
    }

    /* renamed from: a */
    public final ciqq mo75043a(cauk cauk, long j) {
        if ("chunked".equalsIgnoreCase(cauk.mo74910a("Transfer-Encoding"))) {
            int i = this.f176328d;
            if (i == 1) {
                this.f176328d = 2;
                return new caxi(this);
            }
            StringBuilder sb = new StringBuilder(18);
            sb.append("state: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else if (j != -1) {
            int i2 = this.f176328d;
            if (i2 == 1) {
                this.f176328d = 2;
                return new caxk(this, j);
            }
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("state: ");
            sb2.append(i2);
            throw new IllegalStateException(sb2.toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    /* renamed from: a */
    public final ciqr mo75044a(long j) {
        int i = this.f176328d;
        if (i == 4) {
            this.f176328d = 5;
            return new caxl(this, j);
        }
        StringBuilder sb = new StringBuilder(18);
        sb.append("state: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo75045a() {
        cayl b = this.f176325a.mo75075b();
        if (b != null) {
            b.mo75175a();
        }
    }

    /* renamed from: a */
    public final void mo75046a(cauc cauc, String str) {
        int i = this.f176328d;
        if (i == 0) {
            cipv cipv = this.f176327c;
            cipv.mo86293b(str);
            cipv.mo86293b("\r\n");
            int a = cauc.mo74871a();
            for (int i2 = 0; i2 < a; i2++) {
                cipv cipv2 = this.f176327c;
                cipv2.mo86293b(cauc.mo74872a(i2));
                cipv2.mo86293b(": ");
                cipv2.mo86293b(cauc.mo74875b(i2));
                cipv2.mo86293b("\r\n");
            }
            this.f176327c.mo86293b("\r\n");
            this.f176328d = 1;
            return;
        }
        StringBuilder sb = new StringBuilder(18);
        sb.append("state: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo75047a(cauk cauk) {
        this.f176329e.mo75055a();
        Proxy.Type type = ((cayl) this.f176329e.mo75063e()).f176411a.f176066b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(cauk.f176038b);
        sb.append(' ');
        if (!cauk.mo74913c() && type == Proxy.Type.HTTP) {
            sb.append(cauk.f176037a);
        } else {
            sb.append(caya.m127524a(cauk.f176037a));
        }
        sb.append(" HTTP/1.1");
        mo75046a(cauk.f176039c, sb.toString());
    }

    /* renamed from: a */
    public final void mo75049a(cayb cayb) {
        int i = this.f176328d;
        if (i == 1) {
            this.f176328d = 3;
            cayb.mo75067a(this.f176327c);
            return;
        }
        StringBuilder sb = new StringBuilder(18);
        sb.append("state: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
