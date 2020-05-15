package p000;

/* renamed from: achr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class achr {

    /* renamed from: a */
    public final cijl f59868a;

    /* renamed from: b */
    public final cijl f59869b;

    /* renamed from: c */
    public final cijl f59870c;

    public achr(cijl cijl, cijl cijl2, cijl cijl3) {
        m49133a(cijl, 1);
        this.f59868a = cijl;
        m49133a(cijl2, 2);
        this.f59869b = cijl2;
        m49133a(cijl3, 3);
        this.f59870c = cijl3;
    }

    /* renamed from: a */
    public static Object m49133a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
