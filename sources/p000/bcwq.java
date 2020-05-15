package p000;

/* renamed from: bcwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcwq {

    /* renamed from: a */
    public bcwp f105079a;

    /* renamed from: b */
    public String f105080b;

    /* renamed from: c */
    public bmxv f105081c;

    /* renamed from: d */
    private Integer f105082d;

    /* renamed from: e */
    private Integer f105083e;

    /* renamed from: f */
    private Integer f105084f;

    /* renamed from: g */
    private Integer f105085g;

    public bcwq() {
    }

    /* renamed from: a */
    public final bcwr mo57637a() {
        String str = this.f105082d == null ? " width" : "";
        if (this.f105083e == null) {
            str = str.concat(" height");
        }
        if (this.f105084f == null) {
            str = String.valueOf(str).concat(" size");
        }
        if (this.f105085g == null) {
            str = String.valueOf(str).concat(" downloadStatus");
        }
        if (str.isEmpty()) {
            return new bcwn(this.f105079a, this.f105080b, this.f105081c, this.f105082d.intValue(), this.f105083e.intValue(), this.f105084f.intValue(), this.f105085g.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57640b(int i) {
        this.f105083e = Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo57641c(int i) {
        this.f105084f = Integer.valueOf(i);
    }

    /* renamed from: d */
    public final void mo57642d(int i) {
        this.f105082d = Integer.valueOf(i);
    }

    public bcwq(bcwr bcwr) {
        this.f105081c = bmvz.f131120a;
        bcwn bcwn = (bcwn) bcwr;
        this.f105079a = bcwn.f105070a;
        this.f105080b = bcwn.f105071b;
        this.f105081c = bcwn.f105072c;
        this.f105082d = Integer.valueOf(bcwn.f105073d);
        this.f105083e = Integer.valueOf(bcwn.f105074e);
        this.f105084f = Integer.valueOf(bcwn.f105075f);
        this.f105085g = Integer.valueOf(bcwn.f105076g);
    }

    public bcwq(byte[] bArr) {
        this.f105081c = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57638a(int i) {
        this.f105085g = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57639a(byte[] bArr) {
        this.f105081c = bmxv.m108566b(bArr);
    }
}
