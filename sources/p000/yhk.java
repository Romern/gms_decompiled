package p000;

/* renamed from: yhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yhk {
    /* renamed from: a */
    private static boolean m44109a(caae caae) {
        return yxy.m44966b(yyd.m44986a(caae));
    }

    /* renamed from: a */
    public static boolean m44110a(caae caae, caaq caaq) {
        caap caap = caap.WATCH;
        caap a = caap.m126421a(caaq.f172360c);
        if (a == null) {
            a = caap.UNKNOWN;
        }
        if (!caap.equals(a)) {
            return false;
        }
        if ((caae.f172325a & 32) != 0) {
            caap caap2 = caap.PHONE;
            caaq caaq2 = caae.f172331g;
            if (caaq2 == null) {
                caaq2 = caaq.f172356h;
            }
            caap a2 = caap.m126421a(caaq2.f172360c);
            if (a2 == null) {
                a2 = caap.UNKNOWN;
            }
            if (caap2.equals(a2)) {
                return true;
            }
        }
        if ((caae.f172325a & 32) != 0 || m44109a(caae)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m44111a(caae caae, ygw ygw, caaq caaq) {
        caaq caaq2;
        int a;
        if (ygw != null && !ygw.f53782b) {
            return false;
        }
        String str = caae.f172328d;
        if (!yhj.m44108a(caae) && !"session_activity_segment".equals(str)) {
            if ((caae.f172325a & 32) != 0) {
                caaq2 = caae.f172331g;
                if (caaq2 == null) {
                    caaq2 = caaq.f172356h;
                }
            } else {
                caaq2 = null;
            }
            if (m44109a(caae) && caaq2 == null) {
                return true;
            }
            if (caaq2 != null && yxy.m44967c(yyd.m44986a(caae)) && caaq.f172363f.equals(caaq2.f172363f) && caaq.f172362e.equals(caaq2.f172362e)) {
                return false;
            }
            if (yxy.m44965a(yyd.m44986a(caae))) {
                caah caah = caae.f172330f;
                if (caah == null) {
                    caah = caah.f172333d;
                }
                if (caah.equals(bzzn.f172079S)) {
                    return true;
                }
            }
            if (caaq2 == null || caaq.f172359b.equals(caaq2.f172359b) || ((a = caan.m126419a(caaq2.f172364g)) != 0 && a == 2)) {
                return false;
            }
            caap a2 = caap.m126421a(caaq.f172360c);
            if (a2 == null) {
                a2 = caap.UNKNOWN;
            }
            boolean a3 = m44112a(a2);
            caap a4 = caap.m126421a(caaq2.f172360c);
            if (a4 == null) {
                a4 = caap.UNKNOWN;
            }
            if (a3 == m44112a(a4)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m44112a(caap caap) {
        return caap == caap.PHONE || caap == caap.TABLET;
    }
}
