package p000;

import android.content.Context;

/* renamed from: bdqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bdqu {
    @Deprecated
    /* renamed from: a */
    public static bdqu m91313a(Context context, String str) {
        return m91314a(context.getPackageName(), str);
    }

    /* renamed from: a */
    public abstract String mo58303a();

    /* renamed from: b */
    public abstract String mo58304b();

    /* renamed from: c */
    public abstract String mo58305c();

    /* renamed from: d */
    public final String mo58306d() {
        String a = mo58303a();
        String c = mo58305c();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(c).length());
        sb.append(a);
        sb.append("#");
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo58307e() {
        String a = mo58303a();
        String b = mo58304b();
        String c = mo58305c();
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(b).length() + String.valueOf(c).length());
        sb.append(a);
        sb.append("#");
        sb.append(b);
        sb.append("#");
        sb.append(c);
        return sb.toString();
    }

    /* renamed from: a */
    public static bdqu m91314a(String str, String str2) {
        return new bdra(str, str2);
    }
}
