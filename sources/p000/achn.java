package p000;

/* renamed from: achn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achn {

    /* renamed from: a */
    public final cijl f59861a;

    public achn(cijl cijl) {
        m49125a(cijl, 1);
        this.f59861a = cijl;
    }

    /* renamed from: a */
    public static void m49125a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
