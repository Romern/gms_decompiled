package p000;

/* renamed from: btxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxh {

    /* renamed from: a */
    public static final double f152800a = (-Math.log10(1.0E-11d));

    /* renamed from: b */
    private final btxg[] f152801b = new btxg[btxf.f152796b.length];

    public btxh(btwy btwy) {
        btxg btxg = new btxg(btwy.f152775c, 0);
        btxg[] btxgArr = this.f152801b;
        btxgArr[0] = btxg;
        btxgArr[1] = btxg;
        btxg btxg2 = new btxg(btwy.f152776d, 2);
        btxg[] btxgArr2 = this.f152801b;
        btxgArr2[2] = btxg2;
        btxgArr2[3] = btxg2;
        this.f152801b[5] = new btxg(btwy.f152777e, 5);
    }

    /* renamed from: a */
    public final btxg mo72471a(int i) {
        return this.f152801b[i];
    }
}
