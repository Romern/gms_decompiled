package p000;

/* renamed from: acdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acdz {

    /* renamed from: a */
    public final cijl f59617a;

    public acdz(cijl cijl) {
        m48975a(cijl, 1);
        this.f59617a = cijl;
    }

    /* renamed from: a */
    public static void m48975a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
