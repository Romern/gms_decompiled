package p000;

/* renamed from: acdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acdx {

    /* renamed from: a */
    public final cijl f59614a;

    public acdx(cijl cijl) {
        m48972a(cijl, 1);
        this.f59614a = cijl;
    }

    /* renamed from: a */
    public static void m48972a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
