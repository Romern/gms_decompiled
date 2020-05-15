package p000;

/* renamed from: yyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yyo {
    /* renamed from: a */
    public static caah m45042a(cadr cadr) {
        caah caah;
        if ((cadr.f172719a & 2) != 0) {
            caah = cadr.f172721c;
            if (caah == null) {
                return caah.f172333d;
            }
        } else {
            caae caae = cadr.f172720b;
            if (caae == null) {
                caae = caae.f172323i;
            }
            caah = caae.f172330f;
            if (caah == null) {
                return caah.f172333d;
            }
        }
        return caah;
    }

    /* renamed from: b */
    public static String m45044b(cadr cadr) {
        String str;
        if (cadr == null) {
            return "Sub{null}";
        }
        Object[] objArr = new Object[1];
        if ((1 & cadr.f172719a) != 0) {
            caae caae = cadr.f172720b;
            if (caae == null) {
                caae = caae.f172323i;
            }
            str = yyd.m44990b(caae);
        } else {
            caah caah = cadr.f172721c;
            if (caah == null) {
                caah = caah.f172333d;
            }
            str = caah.f172336b;
        }
        objArr[0] = str;
        return String.format("Sub{%s}", objArr);
    }

    /* renamed from: c */
    public static String m45045c(cadr cadr) {
        String str;
        String str2;
        if (cadr == null) {
            return "null";
        }
        Object[] objArr = new Object[3];
        if ((cadr.f172719a & 1) != 0) {
            caae caae = cadr.f172720b;
            if (caae == null) {
                caae = caae.f172323i;
            }
            str = yyd.m44990b(caae);
        } else {
            caah caah = cadr.f172721c;
            if (caah == null) {
                caah = caah.f172333d;
            }
            str = caah.f172336b;
        }
        objArr[0] = str;
        objArr[1] = Long.valueOf(cadr.f172722d);
        int i = cadr.f172723e;
        if (i != 1) {
            str2 = i != 2 ? i != 3 ? "unk" : "high" : "med";
        } else {
            str2 = "low";
        }
        objArr[2] = str2;
        return String.format("Sub{%s, %sus %s}", objArr);
    }

    /* renamed from: a */
    public static boolean m45043a(cadr cadr, cadr cadr2) {
        caah caah = cadr.f172721c;
        if (caah == null) {
            caah = caah.f172333d;
        }
        caah caah2 = cadr2.f172721c;
        if (caah2 == null) {
            caah2 = caah.f172333d;
        }
        if (!bmxi.m108538a(caah, caah2)) {
            return false;
        }
        caae caae = cadr.f172720b;
        if (caae == null) {
            caae = caae.f172323i;
        }
        caae caae2 = cadr2.f172720b;
        if (caae2 == null) {
            caae2 = caae.f172323i;
        }
        if (bmxi.m108538a(caae, caae2)) {
            return true;
        }
        return false;
    }
}
