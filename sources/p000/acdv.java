package p000;

/* renamed from: acdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acdv {

    /* renamed from: a */
    public final cijl f59611a;

    public acdv(cijl cijl) {
        m48969a(cijl, 1);
        this.f59611a = cijl;
    }

    /* renamed from: a */
    public static void m48969a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
