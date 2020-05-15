package p000;

/* renamed from: afxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afxn {

    /* renamed from: a */
    public final cijl f64935a;

    /* renamed from: b */
    public final cijl f64936b;

    /* renamed from: c */
    public final cijl f64937c;

    /* renamed from: d */
    public final cijl f64938d;

    /* renamed from: e */
    public final cijl f64939e;

    /* renamed from: f */
    public final cijl f64940f;

    /* renamed from: g */
    public final cijl f64941g;

    public afxn(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5, cijl cijl6, cijl cijl7) {
        m53651a(cijl, 1);
        this.f64935a = cijl;
        m53651a(cijl2, 2);
        this.f64936b = cijl2;
        m53651a(cijl3, 3);
        this.f64937c = cijl3;
        m53651a(cijl4, 4);
        this.f64938d = cijl4;
        m53651a(cijl5, 5);
        this.f64939e = cijl5;
        m53651a(cijl6, 6);
        this.f64940f = cijl6;
        m53651a(cijl7, 7);
        this.f64941g = cijl7;
    }

    /* renamed from: a */
    public static void m53651a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
