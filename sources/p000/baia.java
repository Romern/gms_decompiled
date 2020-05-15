package p000;

/* renamed from: baia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baia {

    /* renamed from: a */
    public final cijl f100929a;

    public baia(cijl cijl) {
        m86926a(cijl, 1);
        this.f100929a = cijl;
    }

    /* renamed from: a */
    public static void m86926a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
