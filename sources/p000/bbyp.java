package p000;

/* renamed from: bbyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbyp {

    /* renamed from: a */
    public bmxv f103761a;

    /* renamed from: b */
    public bmxv f103762b;

    /* renamed from: c */
    public bmxv f103763c;

    /* renamed from: d */
    public int f103764d;

    public bbyp() {
    }

    /* renamed from: a */
    public final bbyq mo56550a() {
        String str = this.f103764d == 0 ? " status" : "";
        if (str.isEmpty()) {
            return new bbyc(this.f103764d, this.f103761a, this.f103762b, this.f103763c);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    public bbyp(byte[] bArr) {
        this.f103761a = bmvz.f131120a;
        this.f103762b = bmvz.f131120a;
        this.f103763c = bmvz.f131120a;
    }
}
