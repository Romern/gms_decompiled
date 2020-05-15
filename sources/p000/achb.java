package p000;

/* renamed from: achb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achb {

    /* renamed from: a */
    public final cijl f59829a;

    /* renamed from: b */
    public final cijl f59830b;

    /* renamed from: c */
    public final cijl f59831c;

    /* renamed from: d */
    public final cijl f59832d;

    public achb(cijl cijl, cijl cijl2, cijl cijl3, cijl cijl4) {
        m49100a(cijl, 1);
        this.f59829a = cijl;
        m49100a(cijl2, 2);
        this.f59830b = cijl2;
        m49100a(cijl3, 3);
        this.f59831c = cijl3;
        m49100a(cijl4, 4);
        this.f59832d = cijl4;
    }

    /* renamed from: a */
    public static void m49100a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
