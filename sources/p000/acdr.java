package p000;

/* renamed from: acdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acdr {

    /* renamed from: a */
    public final cijl f59604a;

    public acdr(cijl cijl) {
        m48963a(cijl, 1);
        this.f59604a = cijl;
    }

    /* renamed from: a */
    public static void m48963a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
