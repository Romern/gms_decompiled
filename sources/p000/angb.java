package p000;

/* renamed from: angb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angb {
    /* renamed from: a */
    public static String m64191a(String str) {
        int indexOf = str.indexOf(35);
        return indexOf != -1 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: b */
    public static String m64193b(String str) {
        return str.replace("_", "_u_").replace(".", "_d_").replace("#", "_p_");
    }

    /* renamed from: c */
    public static bqzy m64194c(String str) {
        beah b = cgde.f186589a.mo6606a().mo83511b();
        String valueOf = String.valueOf(m64193b(str));
        return (bqzy) b.mo58476a(valueOf.length() == 0 ? new String("ph_pkgcfg_") : "ph_pkgcfg_".concat(valueOf), bqzy.f142109d, anfz.f76794a);
    }

    /* renamed from: a */
    public static String m64192a(String str, String str2) {
        String str3;
        String str4;
        if (bmxx.m108577a(str) || str.equals("com.google.EMPTY") || str.equals("all") || !cget.m144957b() || "com.google.android.apps.mobileutilities".equals(str2)) {
            return str;
        }
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            str3 = str.substring(0, indexOf);
            str4 = str.substring(indexOf + 1);
        } else {
            str3 = str;
            str4 = str2;
        }
        bqzy c = m64194c(str3);
        if ((c.f142111a & 2) == 0) {
            return str;
        }
        bqzw bqzw = c.f142113c;
        if (bqzw == null) {
            bqzw = bqzw.f142100b;
        }
        if (!bqzw.f142102a) {
            str2 = str4;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str2).length());
        sb.append(str3);
        sb.append('#');
        sb.append(str2);
        return sb.toString();
    }
}
