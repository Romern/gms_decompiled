package p000;

import java.util.List;

/* renamed from: ysk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ysk {

    /* renamed from: a */
    static final yuw f54539a = yuq.m44880a(ysc.f54530a);

    /* renamed from: b */
    static final yuw f54540b = yuq.m44880a(ysd.f54531a);

    /* renamed from: c */
    public static final yuw f54541c = yuq.m44880a(yse.f54532a);

    /* renamed from: d */
    public static final yuw f54542d = yuq.m44880a(ysf.f54533a);

    /* renamed from: e */
    static final yuw f54543e = yuq.m44881a(ysg.f54534a, ysh.f54535a);

    /* renamed from: f */
    private static final srn f54544f = zvt.m46581a();

    /* renamed from: g */
    private static final bmyx f54545g = bmyx.m108640a(',').mo66917a();

    /* renamed from: h */
    private static final bmyx f54546h = bmyx.m108640a(':').mo66917a();

    /* renamed from: a */
    public static bnhe m44711a(String str, bnhe bnhe) {
        bnha h = bnhe.m109414h();
        for (String str2 : f54546h.mo66918a((CharSequence) str)) {
            List c = f54545g.mo66925c((CharSequence) str2);
            if (c.size() == 3) {
                try {
                    h.mo67695b(ysi.m44707a((String) c.get(0), (String) c.get(1)), ysj.m44710a((String) c.get(2)));
                } catch (IllegalArgumentException e) {
                    bnsl bnsl = (bnsl) f54544f.mo68387b();
                    bnsl.mo68432a("ysk", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Malformed flag: %s", str);
                    return bnoj.f131912b;
                }
            } else {
                bnsl bnsl2 = (bnsl) f54544f.mo68387b();
                bnsl2.mo68432a("ysk", "a", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Malformed flag: %s", str);
                return bnoj.f131912b;
            }
        }
        return h.mo67618b();
    }
}
