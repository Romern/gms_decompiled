package p000;

/* renamed from: bbyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbyj {

    /* renamed from: a */
    public bmxv f103754a;

    /* renamed from: b */
    public int f103755b;

    public bbyj() {
    }

    /* renamed from: a */
    public final bbyk mo56546a() {
        String str = this.f103755b == 0 ? " status" : "";
        if (str.isEmpty()) {
            return new bbxz(this.f103755b, this.f103754a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    public bbyj(byte[] bArr) {
        this.f103754a = bmvz.f131120a;
    }
}
