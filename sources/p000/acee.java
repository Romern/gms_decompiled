package p000;

/* renamed from: acee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acee {

    /* renamed from: a */
    public final cijl f59631a;

    /* renamed from: b */
    public final cijl f59632b;

    public acee(cijl cijl, cijl cijl2) {
        m48982a(cijl, 1);
        this.f59631a = cijl;
        m48982a(cijl2, 2);
        this.f59632b = cijl2;
    }

    /* renamed from: a */
    public static void m48982a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
