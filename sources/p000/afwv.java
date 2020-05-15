package p000;

/* renamed from: afwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afwv {

    /* renamed from: a */
    public final cijl f64893a;

    /* renamed from: b */
    public final cijl f64894b;

    /* renamed from: c */
    public final cijl f64895c;

    /* renamed from: d */
    public final cijl f64896d;

    /* renamed from: e */
    public final cijl f64897e;

    public afwv(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5) {
        m53629a(cijl, 1);
        this.f64893a = cijl;
        m53629a(cijl2, 2);
        this.f64894b = cijl2;
        m53629a(cijl3, 3);
        this.f64895c = cijl3;
        m53629a(cijl4, 4);
        this.f64896d = cijl4;
        m53629a(cijl5, 5);
        this.f64897e = cijl5;
    }

    /* renamed from: a */
    public static void m53629a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
