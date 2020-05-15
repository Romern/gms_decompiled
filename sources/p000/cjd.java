package p000;

import java.net.URL;
import java.security.MessageDigest;

/* renamed from: cjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cjd implements cdg {

    /* renamed from: b */
    public final cje f6924b;

    /* renamed from: c */
    public final URL f6925c;

    /* renamed from: d */
    public final String f6926d;

    /* renamed from: e */
    public String f6927e;

    /* renamed from: f */
    public URL f6928f;

    /* renamed from: g */
    private volatile byte[] f6929g;

    /* renamed from: h */
    private int f6930h;

    public cjd(String str) {
        cje cje = cje.f6931a;
        this.f6925c = null;
        crb.m7384a(str);
        this.f6926d = str;
        crb.m7382a(cje);
        this.f6924b = cje;
    }

    /* renamed from: a */
    public final String mo3937a() {
        String str = this.f6926d;
        if (str != null) {
            return str;
        }
        URL url = this.f6925c;
        crb.m7382a(url);
        return url.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cjd) {
            cjd cjd = (cjd) obj;
            return mo3937a().equals(cjd.mo3937a()) && this.f6924b.equals(cjd.f6924b);
        }
    }

    public final int hashCode() {
        int i = this.f6930h;
        if (i != 0) {
            return i;
        }
        int hashCode = mo3937a().hashCode();
        this.f6930h = hashCode;
        int hashCode2 = (hashCode * 31) + this.f6924b.hashCode();
        this.f6930h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return mo3937a();
    }

    /* renamed from: a */
    public final void mo3732a(MessageDigest messageDigest) {
        if (this.f6929g == null) {
            this.f6929g = mo3937a().getBytes(f6570a);
        }
        messageDigest.update(this.f6929g);
    }

    public cjd(URL url) {
        cje cje = cje.f6931a;
        crb.m7382a(url);
        this.f6925c = url;
        this.f6926d = null;
        crb.m7382a(cje);
        this.f6924b = cje;
    }
}
