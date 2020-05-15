package p000;

/* renamed from: caum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caum {

    /* renamed from: a */
    public cauk f176045a;

    /* renamed from: b */
    public caui f176046b;

    /* renamed from: c */
    public int f176047c;

    /* renamed from: d */
    public String f176048d;

    /* renamed from: e */
    public caua f176049e;

    /* renamed from: f */
    public caub f176050f;

    /* renamed from: g */
    public cauo f176051g;

    /* renamed from: h */
    public caun f176052h;

    /* renamed from: i */
    public caun f176053i;

    /* renamed from: j */
    public caun f176054j;

    public caum() {
        this.f176047c = -1;
        this.f176050f = new caub();
    }

    /* renamed from: a */
    public static final void m127246a(String str, caun caun) {
        if (caun.f176061g != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        } else if (caun.f176062h != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        } else if (caun.f176063i != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        } else if (caun.f176064j != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    /* renamed from: a */
    public final void mo74917a(caun caun) {
        if (caun == null || caun.f176061g == null) {
            this.f176054j = caun;
            return;
        }
        throw new IllegalArgumentException("priorResponse.body != null");
    }

    public caum(caun caun) {
        this.f176047c = -1;
        this.f176045a = caun.f176055a;
        this.f176046b = caun.f176056b;
        this.f176047c = caun.f176057c;
        this.f176048d = caun.f176058d;
        this.f176049e = caun.f176059e;
        this.f176050f = caun.f176060f.mo74874b();
        this.f176051g = caun.f176061g;
        this.f176052h = caun.f176062h;
        this.f176053i = caun.f176063i;
        this.f176054j = caun.f176064j;
    }

    /* renamed from: a */
    public final caun mo74915a() {
        if (this.f176045a == null) {
            throw new IllegalStateException("request == null");
        } else if (this.f176046b != null) {
            int i = this.f176047c;
            if (i >= 0) {
                return new caun(this);
            }
            StringBuilder sb = new StringBuilder(21);
            sb.append("code < 0: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        } else {
            throw new IllegalStateException("protocol == null");
        }
    }

    /* renamed from: a */
    public final void mo74916a(cauc cauc) {
        this.f176050f = cauc.mo74874b();
    }

    /* renamed from: a */
    public final void mo74918a(String str, String str2) {
        this.f176050f.mo74869b(str, str2);
    }
}
