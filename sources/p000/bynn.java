package p000;

/* renamed from: bynn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bynn {

    /* renamed from: a */
    public final cijl f167124a;

    public bynn(cijl cijl, cijl cijl2) {
        m124997a(cijl, 1);
        this.f167124a = cijl;
        m124997a(cijl2, 2);
    }

    /* renamed from: a */
    public static void m124997a(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }
}
