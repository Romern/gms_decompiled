package p000;

/* renamed from: achp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achp {

    /* renamed from: a */
    public final cijl f59864a;

    /* renamed from: b */
    public final cijl f59865b;

    public achp(cijl cijl, cijl cijl2) {
        m49129a(cijl, 1);
        this.f59864a = cijl;
        m49129a(cijl2, 2);
        this.f59865b = cijl2;
    }

    /* renamed from: a */
    public static Object m49129a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
