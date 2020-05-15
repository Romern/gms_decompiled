package p000;

/* renamed from: acgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acgg {

    /* renamed from: a */
    public final cijl f59763a;

    /* renamed from: b */
    public final cijl f59764b;

    /* renamed from: c */
    public final cijl f59765c;

    /* renamed from: d */
    public final cijl f59766d;

    public acgg(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4, cijl cijl5) {
        m49053a(cijl, 1);
        m49053a(cijl2, 2);
        this.f59763a = cijl2;
        m49053a(cijl3, 3);
        this.f59764b = cijl3;
        m49053a(cijl4, 4);
        this.f59765c = cijl4;
        m49053a(cijl5, 5);
        this.f59766d = cijl5;
    }

    /* renamed from: a */
    public static void m49053a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
