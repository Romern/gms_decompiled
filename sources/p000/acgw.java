package p000;

/* renamed from: acgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acgw {

    /* renamed from: a */
    public final cijl f59820a;

    /* renamed from: b */
    public final cijl f59821b;

    public acgw(cijl cijl, cijl cijl2) {
        m49092a(cijl, 1);
        this.f59820a = cijl;
        m49092a(cijl2, 2);
        this.f59821b = cijl2;
    }

    /* renamed from: a */
    public static void m49092a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
