package p000;

import java.util.Iterator;

/* renamed from: ygv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ygv {

    /* renamed from: a */
    public static final ygd f53771a = m44048a(ygm.f53761a, "IsGmscore");

    /* renamed from: b */
    public static final ygd f53772b = m44048a(ygn.f53762a, "IsPlatform");

    /* renamed from: c */
    public static final ygd f53773c = m44048a(ygo.f53763a, "IsUserInput");

    /* renamed from: d */
    public static final ygd f53774d = m44048a(ygp.f53764a, "IsServer");

    /* renamed from: e */
    public static final ygd f53775e = m44048a(ygf.f53754a, "IsLocal");

    /* renamed from: f */
    public static final ygd f53776f = new ygt("Derived");

    /* renamed from: g */
    public static final ygd f53777g = m44052a("live_location");

    /* renamed from: h */
    public static final ygd f53778h = m44052a("live_gps_speed");

    /* renamed from: i */
    public static final ygd f53779i = m44048a(ygg.f53755a, "true");

    /* renamed from: j */
    private static final ygd f53780j = m44048a(ygh.f53756a, "false");

    /* renamed from: a */
    public static String m44047a(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        String str2 = "";
        while (it.hasNext()) {
            sb.append(str2);
            m44054a(sb, (ygd) it.next());
            str2 = str;
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static ygd m44055b(String str) {
        ygj ygj = new ygj(str);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("DataTypeName{");
        sb.append(str);
        sb.append("}");
        return m44048a(ygj, sb.toString());
    }

    /* renamed from: b */
    public static ygd m44056b(ygd ygd) {
        ygd ygd2 = f53779i;
        if (ygd != ygd2) {
            return ygd != f53780j ? new ygr(ygd) : ygd2;
        }
        return f53780j;
    }

    /* renamed from: b */
    public static ygd m44057b(String... strArr) {
        bnic a = bnic.m109496a((Object[]) strArr);
        ygk ygk = new ygk(a);
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("DataStreamPrefix{");
        sb.append(valueOf);
        sb.append("}");
        return m44048a(ygk, sb.toString());
    }

    /* renamed from: a */
    private static ygd m44048a(bmxz bmxz, String str) {
        return new ygq(bmxz, str);
    }

    /* renamed from: b */
    public static ygd m44058b(ygd... ygdArr) {
        bngx a = bngx.m109370a((Object[]) ygdArr);
        bnia j = bnic.m109500j();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ygd ygd = (ygd) a.get(i);
            if (ygd instanceof ygu) {
                j.mo67752b((Iterable) ((ygu) ygd).f53770a);
            } else {
                ygd ygd2 = f53779i;
                if (ygd == ygd2) {
                    return ygd2;
                }
                if (ygd != f53780j) {
                    j.mo67629b(ygd);
                }
            }
        }
        bnic a2 = j.mo67751a();
        if (a2.isEmpty()) {
            return f53780j;
        }
        if (a2.size() == 1) {
            return (ygd) a2.iterator().next();
        }
        return new ygu(a2);
    }

    /* renamed from: a */
    public static ygd m44049a(caaq caaq) {
        String str;
        ygl ygl = new ygl(caaq);
        if (caaq != null) {
            Object[] objArr = new Object[4];
            objArr[0] = caaq.f172363f;
            objArr[1] = caaq.f172362e;
            objArr[2] = caaq.f172359b;
            caap a = caap.m126421a(caaq.f172360c);
            if (a == null) {
                a = caap.UNKNOWN;
            }
            objArr[3] = a.name();
            str = String.format("Device[manufacturer=%s, model=%s, uid=%s, type=%s]", objArr);
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8);
        sb.append("Device{");
        sb.append(str);
        sb.append("}");
        return m44048a(ygl, sb.toString());
    }

    /* renamed from: a */
    public static ygd m44050a(String str) {
        ygi ygi = new ygi(str);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("GmsStreamNameEquals{");
        sb.append(str);
        sb.append("}");
        return m44048a(ygi, sb.toString());
    }

    /* renamed from: a */
    public static ygd m44051a(ygd ygd) {
        return m44053a(ygd, m44056b(m44057b("platform_spliced")), m44056b(m44057b("pd_")));
    }

    /* renamed from: a */
    public static ygd m44052a(String... strArr) {
        bnic a = bnic.m109496a((Object[]) strArr);
        yge yge = new yge(a);
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("GmsPrefix{");
        sb.append(valueOf);
        sb.append("}");
        return m44048a(yge, sb.toString());
    }

    /* renamed from: a */
    public static ygd m44053a(ygd... ygdArr) {
        bngx a = bngx.m109370a((Object[]) ygdArr);
        bnia j = bnic.m109500j();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ygd ygd = (ygd) a.get(i);
            if (ygd instanceof ygs) {
                j.mo67752b((Iterable) ((ygs) ygd).f53768a);
            } else {
                ygd ygd2 = f53780j;
                if (ygd == ygd2) {
                    return ygd2;
                }
                if (ygd != f53779i) {
                    j.mo67629b(ygd);
                }
            }
        }
        bnic a2 = j.mo67751a();
        if (a2.isEmpty()) {
            return f53779i;
        }
        if (a2.size() == 1) {
            return (ygd) a2.iterator().next();
        }
        return new ygs(a2);
    }

    /* renamed from: a */
    public static void m44054a(StringBuilder sb, ygd ygd) {
        boolean z = true;
        if (!(ygd instanceof ygs) && !(ygd instanceof ygu)) {
            z = false;
        }
        if (z) {
            sb.append("(");
        }
        sb.append(ygd);
        if (z) {
            sb.append(")");
        }
    }
}
