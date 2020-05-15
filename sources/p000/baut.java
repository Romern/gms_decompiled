package p000;

/* renamed from: baut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baut {

    /* renamed from: a */
    public Boolean f101838a;

    /* renamed from: b */
    private Boolean f101839b;

    /* renamed from: c */
    private bmxv f101840c;

    /* renamed from: d */
    private bmxv f101841d;

    baut() {
    }

    /* renamed from: a */
    public final bauu mo55988a() {
        String str = this.f101839b == null ? " includeAllGroups" : "";
        if (this.f101838a == null) {
            str = str.concat(" groupWithNoAccountOnly");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        }
        baud baud = new baud(this.f101839b.booleanValue(), this.f101838a.booleanValue(), this.f101840c, this.f101841d);
        if (baud.f101756a) {
            bmxy.m108588a(!baud.f101758c.mo66813a());
            bmxy.m108588a(!baud.f101759d.mo66813a());
        } else {
            bmxy.m108588a(baud.f101758c.mo66813a());
        }
        if (baud.f101757b) {
            bmxy.m108588a(!baud.f101759d.mo66813a());
        }
        return baud;
    }

    public baut(byte[] bArr) {
        this.f101840c = bmvz.f131120a;
        this.f101841d = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo55989a(boolean z) {
        this.f101839b = Boolean.valueOf(z);
    }
}
