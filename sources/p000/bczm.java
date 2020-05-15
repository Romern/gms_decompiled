package p000;

/* renamed from: bczm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bczm {

    /* renamed from: a */
    private String f105188a;

    /* renamed from: b */
    private bmxv f105189b;

    /* renamed from: c */
    private bcov f105190c;

    /* renamed from: d */
    private Integer f105191d;

    /* renamed from: e */
    private Integer f105192e;

    /* renamed from: f */
    private Integer f105193f;

    /* renamed from: g */
    private Boolean f105194g;

    public bczm() {
    }

    /* renamed from: a */
    public final bczn mo57791a() {
        String str = this.f105188a == null ? " text" : "";
        if (this.f105190c == null) {
            str = str.concat(" action");
        }
        if (this.f105191d == null) {
            str = String.valueOf(str).concat(" textColor");
        }
        if (this.f105192e == null) {
            str = String.valueOf(str).concat(" backgroundColor");
        }
        if (this.f105193f == null) {
            str = String.valueOf(str).concat(" borderColor");
        }
        if (this.f105194g == null) {
            str = String.valueOf(str).concat(" enabled");
        }
        if (str.isEmpty()) {
            return new bcys(this.f105188a, this.f105189b, this.f105190c, this.f105191d.intValue(), this.f105192e.intValue(), this.f105193f.intValue(), this.f105194g.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57797b(int i) {
        this.f105193f = Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo57798c(int i) {
        this.f105191d = Integer.valueOf(i);
    }

    public bczm(byte[] bArr) {
        this.f105189b = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57792a(int i) {
        this.f105192e = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57793a(bcov bcov) {
        if (bcov != null) {
            this.f105190c = bcov;
            return;
        }
        throw new NullPointerException("Null action");
    }

    /* renamed from: a */
    public final void mo57794a(bcsz bcsz) {
        this.f105189b = bmxv.m108566b(bcsz);
    }

    /* renamed from: a */
    public final void mo57795a(String str) {
        if (str != null) {
            this.f105188a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: a */
    public final void mo57796a(boolean z) {
        this.f105194g = Boolean.valueOf(z);
    }
}
