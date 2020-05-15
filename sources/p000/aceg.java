package p000;

/* renamed from: aceg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aceg {

    /* renamed from: a */
    public final cijl f59639a;

    public aceg(cijl cijl) {
        m48985a(cijl, 1);
        this.f59639a = cijl;
    }

    /* renamed from: a */
    public static void m48985a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
