package p000;

/* renamed from: bdhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdhj {

    /* renamed from: a */
    public bdmd f105650a;

    /* renamed from: b */
    public bmxv f105651b;

    /* renamed from: c */
    public bmxv f105652c;

    /* renamed from: d */
    public bmxv f105653d;

    /* renamed from: e */
    public bmxv f105654e;

    /* renamed from: f */
    public bmxv f105655f;

    /* renamed from: g */
    private cijl f105656g;

    /* renamed from: h */
    private bmxv f105657h;

    /* renamed from: i */
    private bmxv f105658i;

    /* renamed from: j */
    private bmxv f105659j;

    /* renamed from: k */
    private bmxv f105660k;

    /* renamed from: l */
    private bmxv f105661l;

    bdhj() {
    }

    /* renamed from: a */
    public final bdhk mo58040a() {
        String str = this.f105656g == null ? " metricTransmitterProvider" : "";
        if (this.f105650a == null) {
            str = str.concat(" memoryConfigurations");
        }
        if (str.isEmpty()) {
            return new bdfg(this.f105656g, this.f105657h, this.f105650a, this.f105651b, this.f105658i, this.f105652c, this.f105653d, this.f105659j, this.f105654e, this.f105660k, this.f105661l, this.f105655f);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public bdhj(byte[] bArr) {
        this.f105657h = bmvz.f131120a;
        this.f105651b = bmvz.f131120a;
        this.f105658i = bmvz.f131120a;
        this.f105652c = bmvz.f131120a;
        this.f105653d = bmvz.f131120a;
        this.f105659j = bmvz.f131120a;
        this.f105654e = bmvz.f131120a;
        this.f105660k = bmvz.f131120a;
        this.f105661l = bmvz.f131120a;
        this.f105655f = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo58041a(cijl cijl) {
        if (cijl != null) {
            this.f105656g = cijl;
            return;
        }
        throw new NullPointerException("Null metricTransmitterProvider");
    }
}
