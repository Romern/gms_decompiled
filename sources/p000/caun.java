package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: caun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caun {

    /* renamed from: a */
    public final cauk f176055a;

    /* renamed from: b */
    public final caui f176056b;

    /* renamed from: c */
    public final int f176057c;

    /* renamed from: d */
    public final String f176058d;

    /* renamed from: e */
    public final caua f176059e;

    /* renamed from: f */
    public final cauc f176060f;

    /* renamed from: g */
    public final cauo f176061g;

    /* renamed from: h */
    public final caun f176062h;

    /* renamed from: i */
    public final caun f176063i;

    /* renamed from: j */
    public final caun f176064j;

    public caun(caum caum) {
        this.f176055a = caum.f176045a;
        this.f176056b = caum.f176046b;
        this.f176057c = caum.f176047c;
        this.f176058d = caum.f176048d;
        this.f176059e = caum.f176049e;
        this.f176060f = caum.f176050f.mo74866a();
        this.f176061g = caum.f176051g;
        this.f176062h = caum.f176052h;
        this.f176063i = caum.f176053i;
        this.f176064j = caum.f176054j;
    }

    /* renamed from: a */
    public final caum mo74919a() {
        return new caum(this);
    }

    /* renamed from: b */
    public final List mo74921b() {
        String str;
        int i = this.f176057c;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else if (i != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return caxx.m127522b(this.f176060f, str);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f176056b);
        int i = this.f176057c;
        String str = this.f176058d;
        String str2 = this.f176055a.f176037a.f175994e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("Response{protocol=");
        sb.append(valueOf);
        sb.append(", code=");
        sb.append(i);
        sb.append(", message=");
        sb.append(str);
        sb.append(", url=");
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo74920a(String str) {
        String a = this.f176060f.mo74873a(str);
        if (a == null) {
            return null;
        }
        return a;
    }
}
