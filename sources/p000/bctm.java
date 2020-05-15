package p000;

/* renamed from: bctm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctm {

    /* renamed from: a */
    private bmxv f104872a;

    /* renamed from: b */
    private bmxv f104873b;

    /* renamed from: c */
    private bmxv f104874c;

    /* renamed from: d */
    private bmxv f104875d;

    /* renamed from: e */
    private Integer f104876e;

    /* renamed from: f */
    private bmxv f104877f;

    /* renamed from: g */
    private Integer f104878g;

    public bctm() {
    }

    /* renamed from: a */
    public final bctn mo57525a() {
        String str = this.f104876e == null ? " timeToLiveSec" : "";
        if (this.f104878g == null) {
            str = str.concat(" overlayStyle");
        }
        if (str.isEmpty()) {
            return new bcrw(this.f104872a, this.f104873b, this.f104874c, this.f104875d, this.f104876e.intValue(), this.f104877f, this.f104878g.intValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo57531b(int i) {
        this.f104878g = Integer.valueOf(i);
    }

    /* renamed from: c */
    public final void mo57532c(int i) {
        this.f104876e = Integer.valueOf(i);
    }

    public bctm(byte[] bArr) {
        this.f104872a = bmvz.f131120a;
        this.f104873b = bmvz.f131120a;
        this.f104874c = bmvz.f131120a;
        this.f104875d = bmvz.f131120a;
        this.f104877f = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57526a(int i) {
        this.f104877f = bmxv.m108566b(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo57527a(bcov bcov) {
        this.f104872a = bmxv.m108566b(bcov);
    }

    /* renamed from: a */
    public final void mo57528a(bcsz bcsz) {
        this.f104874c = bmxv.m108566b(bcsz);
    }

    /* renamed from: a */
    public final void mo57529a(ByteString bxtx) {
        this.f104873b = bmxv.m108566b(bxtx);
    }

    /* renamed from: a */
    public final void mo57530a(String str) {
        this.f104875d = bmxv.m108566b(str);
    }
}
