package p000;

/* renamed from: acei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acei {

    /* renamed from: a */
    public final cijl f59648a;

    /* renamed from: b */
    public final cijl f59649b;

    public acei(cijl cijl, cijl cijl2) {
        m48988a(cijl, 1);
        this.f59648a = cijl;
        m48988a(cijl2, 2);
        this.f59649b = cijl2;
    }

    /* renamed from: a */
    public static void m48988a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
