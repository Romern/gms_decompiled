package p000;

import java.util.Arrays;

/* renamed from: abww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abww {

    /* renamed from: d */
    private static final bnhe f58660d = bnhe.m109410a(1, "_no_gsa", 2, "", 3, "_cross_device");

    /* renamed from: a */
    public final abvg f58661a;

    /* renamed from: b */
    public final String f58662b;

    /* renamed from: c */
    public final int f58663c;

    public abww(abvg abvg, String str, int i) {
        StringBuilder sb = new StringBuilder(69);
        sb.append("The scope of this indexable is not valid, scope value is ");
        sb.append(i);
        sb.append(".");
        sdo.m34975b(brib.m114025a(i), sb.toString());
        this.f58661a = abvg;
        this.f58662b = str;
        this.f58663c = i;
    }

    /* renamed from: a */
    public static abww m48411a(String str, String str2, abxt abxt) {
        if (str.startsWith("internal.3p:")) {
            return m48414b(str.substring(12), str2, abxt);
        }
        return null;
    }

    /* renamed from: b */
    public static abww m48414b(String str, String str2, abxt abxt) {
        abwv c = m48416c(str);
        return new abww(abxt.mo32425b(c.f58658a), str2, c.f58659b);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof abww) {
            abww abww = (abww) obj;
            return sdg.m34949a(this.f58661a.f58531b, abww.f58661a.f58531b) && sdg.m34949a(this.f58662b, abww.f58662b) && sdg.m34949a(Integer.valueOf(this.f58663c), Integer.valueOf(abww.f58663c));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f58661a.f58531b, this.f58662b, Integer.valueOf(this.f58663c)});
    }

    /* renamed from: b */
    public static String m48415b(String str) {
        return m48416c(str).f58658a;
    }

    /* renamed from: c */
    private static abwv m48416c(String str) {
        int i;
        int i2;
        if (!str.endsWith("_no_gsa")) {
            i = str.endsWith("_cross_device") ? 3 : 2;
        } else {
            i = 1;
        }
        String str2 = (String) f58660d.get(Integer.valueOf(i));
        if (str2 != null) {
            i2 = str2.length();
        } else {
            i2 = 0;
        }
        return new abwv(str.substring(0, str.length() - i2), i);
    }

    /* renamed from: b */
    public final String mo32395b() {
        String valueOf = String.valueOf(mo32396c());
        return valueOf.length() == 0 ? new String("internal.3p:") : "internal.3p:".concat(valueOf);
    }

    /* renamed from: a */
    public static String m48412a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_seq_table");
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m48413a(String str) {
        return str.startsWith("internal.3p:");
    }

    /* renamed from: a */
    public final String mo32394a() {
        return m48412a(mo32396c(), this.f58662b);
    }

    /* renamed from: c */
    public final String mo32396c() {
        String valueOf = String.valueOf(this.f58661a.f58531b);
        String valueOf2 = String.valueOf((String) f58660d.get(Integer.valueOf(this.f58663c)));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }
}
