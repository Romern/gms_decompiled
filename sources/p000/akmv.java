package p000;

import android.net.RssiCurve;
import java.util.List;

/* renamed from: akmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akmv {

    /* renamed from: a */
    private static final bmxr f72276a = bmxr.m108543a(',');

    /* renamed from: b */
    private static final bmyx f72277b = bmyx.m108640a(',');

    /* renamed from: a */
    public static RssiCurve m60033a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String[] split = str.split(",");
        int length = split.length;
        if (length < 3) {
            eoa.m10828c("NetRec", str.length() == 0 ? new String("Invalid curve read from DB") : "Invalid curve read from DB".concat(str), new Object[0]);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            byte[] bArr = new byte[(length - 2)];
            for (int i = 2; i < split.length; i++) {
                int parseInt3 = Integer.parseInt(split[i]);
                bArr[i - 2] = (byte) Math.min(127, Math.max(-128, parseInt3 + parseInt3));
            }
            return new RssiCurve(parseInt, parseInt2, bArr, (int) cfpd.f185332a.mo6606a().mo82429M());
        } catch (NumberFormatException e) {
            eoa.m10825a("NetRec", e, "Invalid curve read from DB: %s", str);
            return null;
        }
    }

    /* renamed from: b */
    public static cafg m60037b(String str) {
        caff caff = (caff) cafg.f172895f.mo74144da();
        if (str == null) {
            return null;
        }
        List c = f72277b.mo66925c((CharSequence) str);
        if (c.size() < 4) {
            eoa.m10824a("NetRec", "Could not parse input string '%s', too few comma-delimited fields", str);
            return null;
        }
        int parseInt = Integer.parseInt((String) c.get(0));
        if (caff.f164950c) {
            caff.mo74035c();
            caff.f164950c = false;
        }
        cafg cafg = (cafg) caff.f164949b;
        cafg.f172897a |= 1;
        cafg.f172898b = parseInt;
        int parseInt2 = Integer.parseInt((String) c.get(1));
        if (caff.f164950c) {
            caff.mo74035c();
            caff.f164950c = false;
        }
        cafg cafg2 = (cafg) caff.f164949b;
        cafg2.f172897a |= 2;
        cafg2.f172899c = parseInt2;
        int parseInt3 = Integer.parseInt((String) c.get(2));
        if (parseInt3 != 0) {
            if (caff.f164950c) {
                caff.mo74035c();
                caff.f164950c = false;
            }
            cafg cafg3 = (cafg) caff.f164949b;
            cafg3.f172897a |= 4;
            cafg3.f172900d = parseInt3;
        }
        if (c.size() >= 4) {
            for (String str2 : c.subList(3, c.size())) {
                caff.mo74636a(Integer.parseInt(str2));
            }
        }
        return (cafg) caff.mo74062i();
    }

    /* renamed from: a */
    public static String m60034a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(" IN (");
        if (i > 0) {
            sb.append("?");
        }
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m60035a(cafe cafe) {
        StringBuilder sb = new StringBuilder();
        if (cafe.f172894d.size() > 0) {
            sb.append(cafe.f172892b);
            sb.append(",");
            sb.append(cafe.f172893c);
            sb.append(",");
            bxvt bxvt = cafe.f172894d;
            int size = bxvt.size();
            for (int i = 0; i < size; i++) {
                sb.append(bxvt.get(i));
                if (i != size - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m60036a(cafg cafg) {
        if (!akmp.m60022b(cafg)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f72276a.mo66875a(Integer.valueOf(cafg.f172898b), Integer.valueOf(cafg.f172899c), Integer.valueOf(cafg.f172900d)));
        if (cafg.f172901e.size() > 0) {
            sb.append(",");
            sb.append(f72276a.mo66874a((Iterable) cafg.f172901e));
        }
        return sb.toString();
    }
}
