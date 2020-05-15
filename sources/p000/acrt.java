package p000;

/* renamed from: acrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acrt {

    /* renamed from: a */
    public final cijl f60643a;

    public acrt(cijl cijl) {
        m49779a(cijl, 1);
        this.f60643a = cijl;
    }

    /* renamed from: a */
    public static void m49779a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
