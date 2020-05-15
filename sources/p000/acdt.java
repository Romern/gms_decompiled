package p000;

/* renamed from: acdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acdt {

    /* renamed from: a */
    public final cijl f59608a;

    public acdt(cijl cijl) {
        m48966a(cijl, 1);
        this.f59608a = cijl;
    }

    /* renamed from: a */
    public static Object m48966a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
