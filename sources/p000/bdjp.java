package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bdjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdjp {

    /* renamed from: b */
    private static final Pattern f105760b = Pattern.compile("^(\\*[a-z]+\\*).*");

    /* renamed from: a */
    final ConcurrentHashMap f105761a = new ConcurrentHashMap();

    /* renamed from: a */
    static String m90911a(String str) {
        String[] split = str.split("/");
        return (split == null || split.length != 3) ? "MALFORMED" : split[0];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final cimt mo58088a(int i, cimt cimt) {
        cimn cimn = cimt.f190787d;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        if ((cimn.f190755a & 2) == 0) {
            return cimt;
        }
        cimn cimn2 = cimt.f190787d;
        if (cimn2 == null) {
            cimn2 = cimn.f190753d;
        }
        bxvd bxvd = (bxvd) cimn2.mo74142c(5);
        bxvd.mo73625a((bxvk) cimn2);
        bxvd bxvd2 = (bxvd) cimt.mo74142c(5);
        bxvd2.mo73625a((bxvk) cimt);
        String str = ((cimn) bxvd.f164949b).f190757c;
        Long a = bdfm.m90702a(str);
        bmxy.m108581a(a);
        long longValue = a.longValue();
        ConcurrentHashMap concurrentHashMap = this.f105761a;
        Long valueOf = Long.valueOf(longValue);
        if (!concurrentHashMap.containsKey(valueOf)) {
            int i2 = i - 1;
            if (i2 == 0) {
                Matcher matcher = f105760b.matcher(str);
                if (matcher.matches()) {
                    if (str.startsWith("*sync*/")) {
                        String valueOf2 = String.valueOf(m90911a(str.substring(7)));
                        str = valueOf2.length() == 0 ? new String("*sync*/") : "*sync*/".concat(valueOf2);
                    } else {
                        str = matcher.group(1);
                    }
                }
            } else if (i2 == 1) {
                str = m90911a(str);
            } else if (i2 == 2) {
                str = "--";
            }
            Long a2 = bdfm.m90702a(str);
            if (a2 != null) {
                this.f105761a.putIfAbsent(valueOf, a2);
            }
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cimn cimn3 = (cimn) bxvd.f164949b;
        int i3 = cimn3.f190755a | 1;
        cimn3.f190755a = i3;
        cimn3.f190756b = longValue;
        cimn3.f190755a = i3 & -3;
        cimn3.f190757c = cimn.f190753d.f190757c;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        cimt cimt2 = (cimt) bxvd2.f164949b;
        cimn cimn4 = (cimn) bxvd.mo74062i();
        cimt cimt3 = cimt.f190782e;
        cimn4.getClass();
        cimt2.f190787d = cimn4;
        cimt2.f190784a |= 4;
        return (cimt) bxvd2.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final cimt mo58089a(cimt cimt) {
        cimn cimn = cimt.f190787d;
        if (cimn == null) {
            cimn = cimn.f190753d;
        }
        if ((cimn.f190755a & 1) == 0) {
            return cimt;
        }
        cimn cimn2 = cimt.f190787d;
        if (cimn2 == null) {
            cimn2 = cimn.f190753d;
        }
        bxvd bxvd = (bxvd) cimn2.mo74142c(5);
        bxvd.mo73625a((bxvk) cimn2);
        Long l = (Long) this.f105761a.get(Long.valueOf(((cimn) bxvd.f164949b).f190756b));
        bmxy.m108581a(l);
        bxvd bxvd2 = (bxvd) cimt.mo74142c(5);
        bxvd2.mo73625a((bxvk) cimt);
        long longValue = l.longValue();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        cimn cimn3 = (cimn) bxvd.f164949b;
        cimn3.f190755a |= 1;
        cimn3.f190756b = longValue;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        cimt cimt2 = (cimt) bxvd2.f164949b;
        cimn cimn4 = (cimn) bxvd.mo74062i();
        cimt cimt3 = cimt.f190782e;
        cimn4.getClass();
        cimt2.f190787d = cimn4;
        cimt2.f190784a |= 4;
        return (cimt) bxvd2.mo74062i();
    }
}
