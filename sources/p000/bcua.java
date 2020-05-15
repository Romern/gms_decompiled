package p000;

/* renamed from: bcua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcua {

    /* renamed from: a */
    private String f104905a;

    /* renamed from: b */
    private bmxv f104906b;

    /* renamed from: c */
    private bmxv f104907c;

    /* renamed from: d */
    private bmxv f104908d;

    public bcua() {
    }

    /* renamed from: a */
    public final bcub mo57559a() {
        String str = this.f104905a == null ? " rawText" : "";
        if (str.isEmpty()) {
            return new bcsb(this.f104905a, this.f104906b, this.f104907c, this.f104908d);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: b */
    public final void mo57563b(bngx bngx) {
        this.f104907c = bmxv.m108566b(bngx);
    }

    public bcua(byte[] bArr) {
        this.f104906b = bmvz.f131120a;
        this.f104907c = bmvz.f131120a;
        this.f104908d = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo57560a(bcui bcui) {
        this.f104906b = bmxv.m108566b(bcui);
    }

    /* renamed from: a */
    public final void mo57561a(bngx bngx) {
        this.f104908d = bmxv.m108566b(bngx);
    }

    /* renamed from: a */
    public final void mo57562a(String str) {
        if (str != null) {
            this.f104905a = str;
            return;
        }
        throw new NullPointerException("Null rawText");
    }
}
