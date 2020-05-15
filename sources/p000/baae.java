package p000;

/* renamed from: baae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baae {

    /* renamed from: a */
    public final cijl f100363a;

    public baae(cijl cijl) {
        m86449a(cijl, 1);
        this.f100363a = cijl;
    }

    /* renamed from: a */
    public static void m86449a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
