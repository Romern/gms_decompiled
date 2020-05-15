package p000;

/* renamed from: dff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dff {
    /* renamed from: a */
    public static int m8281a(din din, djy djy) {
        int a = dik.m8576a(din.f13232b);
        if (a == 0) {
            a = 1;
        }
        int a2 = (a - 1) - djy.mo9149a();
        if (a2 != 0 || (a2 = din.f13233c.compareTo(djy.mo9151b())) != 0) {
            return a2;
        }
        long d = djy.mo9153d();
        long j = din.f13234d;
        if (j < d) {
            return -1;
        }
        if (j > d) {
            return 1;
        }
        int h = djy.mo9157h();
        int i = din.f13238h;
        if (i < h) {
            return -1;
        }
        if (i <= h) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public static int m8282a(djy djy, djy djy2, boolean z) {
        if (djy == djy2) {
            return 0;
        }
        int a = djy.mo9149a() - djy2.mo9149a();
        if (a != 0 || (a = djy.mo9152c().compareTo(djy2.mo9152c())) != 0) {
            return a;
        }
        if (z) {
            long d = djy.mo9153d();
            long d2 = djy2.mo9153d();
            if (d < d2) {
                return -1;
            }
            if (d > d2) {
                return 1;
            }
            int h = djy.mo9157h();
            int h2 = djy2.mo9157h();
            if (h < h2) {
                return -1;
            }
            if (h > h2) {
                return 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static String m8283a(din din) {
        int a = dik.m8576a(din.f13232b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return "ApkDescriptor(CONTAINER)";
        }
        if (i == 2) {
            String str = din.f13236f;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
            sb.append("ApkDescriptor(INSTALLED, ");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        } else if (i == 3) {
            String str2 = din.f13233c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 21);
            sb2.append("ApkDescriptor(FILE, ");
            sb2.append(str2);
            sb2.append(")");
            return sb2.toString();
        } else if (i != 4) {
            return "ApkDescriptor(UNKNOWN)";
        } else {
            String str3 = din.f13244n;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 22);
            sb3.append("ApkDescriptor(SPLIT, ");
            sb3.append(str3);
            sb3.append(")");
            return sb3.toString();
        }
    }
}
