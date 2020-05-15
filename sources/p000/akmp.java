package p000;

import android.net.RssiCurve;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: akmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akmp {

    /* renamed from: a */
    public static final bmyx f72264a = bmyx.m108640a(':');

    /* renamed from: b */
    public static final bmyx f72265b = bmyx.m108640a(',');

    /* renamed from: c */
    public static final SortedMap f72266c;

    /* renamed from: d */
    static final bmxj f72267d = akmm.f72261a;

    /* renamed from: e */
    static final bmxj f72268e = akmn.f72262a;

    /* renamed from: f */
    static final bmxj f72269f;

    /* renamed from: g */
    public static final bnhe f72270g;

    /* renamed from: h */
    private static final bmxj f72271h = akml.f72260a;

    static {
        String b = cfpd.f185332a.mo6606a().mo82437b();
        TreeMap treeMap = new TreeMap(Collections.reverseOrder());
        for (String str : f72265b.mo66925c((CharSequence) b)) {
            List c = f72264a.mo66925c((CharSequence) str);
            if (c.size() == 2) {
                try {
                    treeMap.put(Byte.valueOf(Byte.parseByte((String) c.get(0))), Long.valueOf(((long) Integer.parseInt((String) c.get(1))) * 1024));
                } catch (NumberFormatException e) {
                    eoa.m10825a("NetRec", e, "Bad format in entry %s in badging thresholds %s", str, b);
                }
            } else {
                eoa.m10824a("NetRec", "Bad format in entry %s in badging thresholds %s", str, b);
            }
        }
        f72266c = treeMap;
        bmxj bmxj = akmo.f72263a;
        f72269f = bmxj;
        f72270g = bnhe.m109410a("identity", f72267d, "monotonic", f72268e, "moving_avg_3", bmxj);
    }

    /* renamed from: a */
    public static RssiCurve m60020a(cafg cafg, bmxj bmxj) {
        if (cafg == null) {
            return null;
        }
        if (bmxj != null) {
            cafg = (cafg) bmxj.apply(cafg);
        }
        return (RssiCurve) f72271h.apply(cafg);
    }

    /* renamed from: b */
    public static boolean m60022b(cafg cafg) {
        if (cafg == null || cafg.f172901e.size() == 0 || cafg.f172899c <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final cafg m60021a(cafg cafg) {
        caff caff = (caff) cafg.f172895f.mo74144da();
        int i = cafg.f172898b;
        if (caff.f164950c) {
            caff.mo74035c();
            caff.f164950c = false;
        }
        cafg cafg2 = (cafg) caff.f164949b;
        int i2 = cafg2.f172897a | 1;
        cafg2.f172897a = i2;
        cafg2.f172898b = i;
        int i3 = cafg.f172899c;
        int i4 = i2 | 2;
        cafg2.f172897a = i4;
        cafg2.f172899c = i3;
        int i5 = cafg.f172900d;
        cafg2.f172897a = i4 | 4;
        cafg2.f172900d = i5;
        bxvt bxvt = cafg.f172901e;
        cafg2.mo74638c();
        bxsy.m123078a(bxvt, cafg2.f172901e);
        return (cafg) caff.mo74062i();
    }
}
