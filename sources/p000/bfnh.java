package p000;

/* renamed from: bfnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnh {

    /* renamed from: a */
    public int f114470a = Integer.MIN_VALUE;

    /* renamed from: b */
    public String f114471b = "";

    /* renamed from: c */
    private final int f114472c;

    /* renamed from: d */
    private final int f114473d;

    /* renamed from: e */
    private final int f114474e;

    /* renamed from: f */
    private float f114475f = bfni.f114478a.floatValue();

    /* renamed from: g */
    private float f114476g = -1.0f;

    /* renamed from: h */
    private String f114477h = "";

    public bfnh(int i, int i2, int i3) {
        this.f114472c = i;
        this.f114473d = i2;
        this.f114474e = i3;
    }

    /* renamed from: a */
    public final bfni mo61977a() {
        if (this.f114475f == bfni.f114478a.floatValue() && this.f114476g == -1.0f && "".equals(this.f114477h) && this.f114470a == Integer.MIN_VALUE && "".equals(this.f114471b)) {
            return new bfni(this.f114472c, this.f114473d, this.f114474e);
        }
        return new bfnr(this.f114472c, this.f114473d, this.f114474e, this.f114475f, this.f114476g, this.f114477h, this.f114470a, this.f114471b);
    }

    /* renamed from: a */
    public final void mo61979a(String str) {
        if (str == null) {
            str = "";
        }
        this.f114477h = str;
    }

    /* renamed from: a */
    public final void mo61978a(float f, float f2) {
        if (f == bfni.f114478a.floatValue() || f2 == -1.0f) {
            f = bfni.f114478a.floatValue();
            f2 = -1.0f;
        }
        this.f114475f = f;
        this.f114476g = f2;
    }
}
