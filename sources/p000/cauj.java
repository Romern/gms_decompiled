package p000;

/* renamed from: cauj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cauj {

    /* renamed from: a */
    public caue f176032a;

    /* renamed from: b */
    public String f176033b;

    /* renamed from: c */
    public final caub f176034c;

    /* renamed from: d */
    public caul f176035d;

    /* renamed from: e */
    public Object f176036e;

    public cauj() {
        this.f176033b = "GET";
        this.f176034c = new caub();
    }

    /* renamed from: a */
    public final cauk mo74904a() {
        if (this.f176032a != null) {
            return new cauk(this);
        }
        throw new IllegalStateException("url == null");
    }

    /* renamed from: b */
    public final void mo74909b(String str, String str2) {
        this.f176034c.mo74869b(str, str2);
    }

    public cauj(cauk cauk) {
        this.f176032a = cauk.f176037a;
        this.f176033b = cauk.f176038b;
        this.f176035d = cauk.f176040d;
        this.f176036e = cauk.f176041e;
        this.f176034c = cauk.f176039c.mo74874b();
    }

    /* renamed from: a */
    public final void mo74905a(caue caue) {
        if (caue != null) {
            this.f176032a = caue;
            return;
        }
        throw new IllegalArgumentException("url == null");
    }

    /* renamed from: a */
    public final void mo74906a(String str) {
        this.f176034c.mo74867a(str);
    }

    /* renamed from: a */
    public final void mo74907a(String str, caul caul) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("method == null || method.length() == 0");
        } else if (caul != null && !caxu.m127507b(str)) {
            StringBuilder sb = new StringBuilder(str.length() + 37);
            sb.append("method ");
            sb.append(str);
            sb.append(" must not have a request body.");
            throw new IllegalArgumentException(sb.toString());
        } else if (caul == null && caxu.m127506a(str)) {
            StringBuilder sb2 = new StringBuilder(str.length() + 33);
            sb2.append("method ");
            sb2.append(str);
            sb2.append(" must have a request body.");
            throw new IllegalArgumentException(sb2.toString());
        } else {
            this.f176033b = str;
            this.f176035d = caul;
        }
    }

    /* renamed from: a */
    public final void mo74908a(String str, String str2) {
        this.f176034c.mo74870c(str, str2);
    }
}
