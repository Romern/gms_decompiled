package p000;

/* renamed from: achj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achj {

    /* renamed from: a */
    public final cijl f59853a;

    public achj(cijl cijl) {
        m49116a(cijl, 1);
        this.f59853a = cijl;
    }

    /* renamed from: a */
    public static void m49116a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
