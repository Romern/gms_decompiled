package p000;

/* renamed from: acgp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acgp {

    /* renamed from: a */
    public final cijl f59799a;

    /* renamed from: b */
    public final cijl f59800b;

    /* renamed from: c */
    public final cijl f59801c;

    /* renamed from: d */
    public final cijl f59802d;

    public acgp(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5) {
        m49079a(cijl, 1);
        m49079a(cijl2, 2);
        this.f59799a = cijl2;
        m49079a(cijl3, 3);
        this.f59800b = cijl3;
        m49079a(cijl4, 4);
        this.f59801c = cijl4;
        m49079a(cijl5, 5);
        this.f59802d = cijl5;
    }

    /* renamed from: a */
    public static void m49079a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
