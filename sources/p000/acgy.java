package p000;

/* renamed from: acgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acgy {

    /* renamed from: a */
    public final cijl f59824a;

    public acgy(cijl cijl) {
        m49096a(cijl, 1);
        this.f59824a = cijl;
    }

    /* renamed from: a */
    public static void m49096a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
