package p000;

/* renamed from: achd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achd {

    /* renamed from: a */
    public final cijl f59835a;

    public achd(cijl cijl) {
        m49104a(cijl, 1);
        this.f59835a = cijl;
    }

    /* renamed from: a */
    public static void m49104a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
