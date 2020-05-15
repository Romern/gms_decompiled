package p000;

/* renamed from: yhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yhb {

    /* renamed from: a */
    public bmxv f53808a;

    /* renamed from: b */
    private ygd f53809b;

    /* renamed from: c */
    private ynn f53810c;

    /* renamed from: d */
    private Boolean f53811d;

    public yhb() {
    }

    /* renamed from: a */
    public final yhc mo30486a() {
        String str = this.f53809b == null ? " dataSourcePredicate" : "";
        if (this.f53810c == null) {
            str = str.concat(" dataStreamOrigin");
        }
        if (this.f53811d == null) {
            str = String.valueOf(str).concat(" supplemental");
        }
        if (str.isEmpty()) {
            return new yfx(this.f53809b, this.f53810c, this.f53811d.booleanValue(), this.f53808a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    public yhb(byte[] bArr) {
        this.f53808a = bmvz.f131120a;
    }

    /* renamed from: a */
    public final void mo30487a(ygd ygd) {
        if (ygd != null) {
            this.f53809b = ygd;
            return;
        }
        throw new NullPointerException("Null dataSourcePredicate");
    }

    /* renamed from: a */
    public final void mo30488a(ynn ynn) {
        if (ynn != null) {
            this.f53810c = ynn;
            return;
        }
        throw new NullPointerException("Null dataStreamOrigin");
    }

    /* renamed from: a */
    public final void mo30489a(boolean z) {
        this.f53811d = Boolean.valueOf(z);
    }
}
