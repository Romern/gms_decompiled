package p000;

/* renamed from: bcur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcur {

    /* renamed from: a */
    private Integer f104955a;

    /* renamed from: b */
    private String f104956b;

    /* renamed from: c */
    private bmxv f104957c;

    /* renamed from: d */
    private bcov f104958d;

    /* renamed from: e */
    private String f104959e;

    public bcur() {
    }

    /* renamed from: a */
    public final bcus mo57571a() {
        String str = this.f104955a == null ? " id" : "";
        if (this.f104956b == null) {
            str = str.concat(" text");
        }
        if (this.f104958d == null) {
            str = String.valueOf(str).concat(" action");
        }
        if (this.f104959e == null) {
            str = String.valueOf(str).concat(" secondaryText");
        }
        if (str.isEmpty()) {
            return new bcsd(this.f104955a.intValue(), this.f104956b, this.f104957c, this.f104958d, this.f104959e);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57576b(String str) {
        if (str != null) {
            this.f104956b = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    public bcur(byte[] bArr) {
        this.f104957c = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57572a(int i) {
        this.f104955a = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo57573a(bcov bcov) {
        if (bcov != null) {
            this.f104958d = bcov;
            return;
        }
        throw new NullPointerException("Null action");
    }

    /* renamed from: a */
    public final void mo57574a(bcsz bcsz) {
        this.f104957c = bmxv.m108566b(bcsz);
    }

    /* renamed from: a */
    public final void mo57575a(String str) {
        if (str != null) {
            this.f104959e = str;
            return;
        }
        throw new NullPointerException("Null secondaryText");
    }
}
