package p000;

/* renamed from: bdbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdbs {

    /* renamed from: a */
    public final bdbr f105286a;

    /* renamed from: b */
    public final int f105287b;

    /* renamed from: c */
    public final String f105288c;

    /* renamed from: d */
    public final String f105289d;

    public bdbs(bdbr bdbr, int i, String str, String str2) {
        this.f105286a = bdbr;
        this.f105287b = i;
        this.f105288c = str;
        this.f105289d = str2;
    }

    /* renamed from: a */
    public static bdbs m90545a(bdbr bdbr) {
        return new bdbs(bdbr, -1, null, null);
    }

    /* renamed from: a */
    public static bdbs m90546a(bdbr bdbr, String str) {
        return new bdbs(bdbr, -1, str, null);
    }

    /* renamed from: a */
    public static bdbs m90547a(bdbr bdbr, Throwable th) {
        return new bdbs(bdbr, -1, th.getMessage(), null);
    }
}
