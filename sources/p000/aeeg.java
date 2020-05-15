package p000;

/* renamed from: aeeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aeeg {
    @Deprecated
    /* renamed from: a */
    public static aeeg m51722a(String str, String str2, String str3) {
        return new aecq(str, str2, str3, null);
    }

    /* renamed from: a */
    public abstract String mo34053a();

    /* renamed from: b */
    public abstract String mo34054b();

    /* renamed from: c */
    public abstract String mo34055c();

    /* renamed from: d */
    public abstract bmzi mo34056d();

    /* renamed from: a */
    public static aeeg m51723a(String str, String str2, String str3, bmzi bmzi) {
        return new aecq(str, str2, str3, bmzi);
    }

    @Deprecated
    /* renamed from: a */
    public final int mo34092a(String str) {
        if (!str.equals(mo34055c())) {
            return !str.equals(mo34054b()) ? 1 : 3;
        }
        return 2;
    }
}
