package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: ykz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ykz implements yjf {

    /* renamed from: a */
    public static final bngx f54007a = bngx.m109358a(caap.WATCH, caap.PHONE, caap.TABLET);

    /* renamed from: b */
    public final boolean f54008b;

    /* renamed from: c */
    private final boolean f54009c;

    /* renamed from: d */
    private final boolean f54010d;

    /* renamed from: e */
    private final boolean f54011e;

    /* renamed from: f */
    private final boolean f54012f;

    /* renamed from: g */
    private final bngx f54013g;

    /* renamed from: h */
    private final bngx f54014h;

    /* renamed from: i */
    private final bngx f54015i;

    public ykz(yky yky) {
        bmxy.m108589a(!yky.f54004f.isEmpty(), "Device type order must be provided");
        this.f54008b = yky.f53999a;
        this.f54010d = yky.f54001c;
        this.f54009c = yky.f54000b;
        this.f54012f = yky.f54002d;
        this.f54011e = yky.f54003e;
        this.f54014h = bngx.m109368a((Collection) yky.f54004f);
        this.f54013g = bngx.m109368a((Collection) yky.f54005g);
        this.f54015i = bngx.m109368a((Collection) yky.f54006h);
    }

    /* renamed from: a */
    private final int m44303a(caaq caaq) {
        if (caaq == null) {
            return Integer.MAX_VALUE;
        }
        bngx bngx = this.f54014h;
        caap a = caap.m126421a(caaq.f172360c);
        if (a == null) {
            a = caap.UNKNOWN;
        }
        int indexOf = bngx.indexOf(a);
        return indexOf == -1 ? this.f54014h.size() : indexOf;
    }

    /* renamed from: b */
    private final int m44308b(yfr yfr) {
        int a = m44305a(this.f54015i, yfr.mo30427f());
        return a == -1 ? this.f54015i.size() : a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (r3 == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
        if (r3 == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x012c, code lost:
        if (r7.mo30427f().contains("detailed") != false) goto L_0x0159;
     */
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int a;
        int a2;
        yfr yfr = (yfr) obj;
        yfr yfr2 = (yfr) obj2;
        bmxy.m108589a(yfr.mo30423c().equals(yfr2.mo30423c()), "Cannot compare sensors of dissimilar data type");
        if (yfs.m43996c(yfr) && yfs.m43996c(yfr2)) {
            return m44307a(yfr, yfr2);
        }
        if (yfs.m43996c(yfr)) {
            return -1;
        }
        if (!yfs.m43996c(yfr2)) {
            int b = m44308b(yfr);
            int b2 = m44308b(yfr2);
            if (b != b2) {
                return bqcn.m112576a(b, b2);
            }
            if (this.f54008b) {
                boolean a3 = yfs.m43994a(yfr);
                boolean a4 = yfs.m43994a(yfr2);
                if (a3 && !a4) {
                    return 1;
                }
                if (a4 && !a3) {
                    return -1;
                }
            }
            if (this.f54009c) {
                boolean z = !yfr.mo30422b().mo30411c();
                boolean z2 = !yfr2.mo30422b().mo30411c();
                if (z && z2) {
                    return m44307a(yfr, yfr2);
                }
                if (z) {
                    return -1;
                }
            }
            if (yfs.m43997d(yfr) && yfs.m43997d(yfr2)) {
                return m44307a(yfr, yfr2);
            }
            if (yfs.m43997d(yfr)) {
                return -1;
            }
            if (!yfs.m43997d(yfr2)) {
                if (this.f54010d) {
                    boolean b3 = yfs.m43995b(yfr);
                    boolean b4 = yfs.m43995b(yfr2);
                    if (b3 && b4) {
                        return 0;
                    }
                    if (b3) {
                        return -1;
                    }
                }
                int a5 = m44306a(yfr);
                int a6 = m44306a(yfr2);
                if (a5 != a6) {
                    return bqcn.m112576a(a5, a6);
                }
                if (this.f54011e && (a2 = m44304a(yfr.mo30428g(), yfr2.mo30428g())) != 0) {
                    return a2;
                }
                if (yfr.mo30429h() == 1 && yfr.mo30429h() == yfr2.mo30429h()) {
                    if ("com.google.activity.segment".equals(yfr.mo30423c())) {
                        if (yfr.mo30427f().contains("detailed") && yfr2.mo30427f().contains("default")) {
                            return -1;
                        }
                        if (yfr.mo30427f().contains("default")) {
                        }
                    }
                    if (this.f54011e || (a = m44304a(yfr.mo30428g(), yfr2.mo30428g())) == 0) {
                        return m44309b(yfr, yfr2);
                    }
                    return a;
                } else if (yfr.mo30429h() == 1) {
                    return -1;
                } else {
                    if (yfr2.mo30429h() == 1) {
                        return 1;
                    }
                    return m44307a(yfr, yfr2);
                }
            }
            return 1;
        }
        return 1;
    }

    /* renamed from: b */
    private static int m44309b(yfr yfr, yfr yfr2) {
        return yfr.mo30425e().compareTo(yfr2.mo30425e());
    }

    /* renamed from: a */
    private final int m44304a(caaq caaq, caaq caaq2) {
        int i;
        int i2;
        if (this.f54012f) {
            if (caaq == null || (i = caan.m126419a(caaq.f172364g)) == 0) {
                i = 1;
            }
            if (caaq2 == null || (i2 = caan.m126419a(caaq2.f172364g)) == 0) {
                i2 = 1;
            }
            if (i == 2 && i2 != 2) {
                return -1;
            }
            if (i != 2 && i2 == 2) {
                return 1;
            }
        }
        return m44303a(caaq) - m44303a(caaq2);
    }

    /* renamed from: a */
    private static int m44305a(List list, String str) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (str.startsWith((String) list.get(i2))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private final int m44306a(yfr yfr) {
        int a = m44305a(this.f54013g, yfr.mo30427f());
        return a == -1 ? this.f54013g.size() : a;
    }

    /* renamed from: a */
    private final int m44307a(yfr yfr, yfr yfr2) {
        int a = m44304a(yfr.mo30428g(), yfr2.mo30428g());
        return a == 0 ? m44309b(yfr, yfr2) : a;
    }
}
