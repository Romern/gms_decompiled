package p000;

/* renamed from: abio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abio {

    /* renamed from: a */
    public final cijl f57543a;

    /* renamed from: b */
    public final cijl f57544b;

    public abio(cijl cijl, cijl cijl2) {
        m47776a(cijl, 1);
        this.f57543a = cijl;
        m47776a(cijl2, 2);
        this.f57544b = cijl2;
    }

    /* renamed from: a */
    public static void m47776a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
