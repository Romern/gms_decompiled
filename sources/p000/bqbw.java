package p000;

import java.util.List;

/* renamed from: bqbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqbw {

    /* renamed from: a */
    public static final bmxr f140436a = bmxr.m108543a('.');

    /* renamed from: e */
    private static final bmwx f140437e = bmwx.m108504f(".。．｡");

    /* renamed from: f */
    private static final bmyx f140438f = bmyx.m108640a('.');

    /* renamed from: g */
    private static final bmwx f140439g = bmwx.m108504f("-_");

    /* renamed from: h */
    private static final bmwx f140440h = bmwx.m108500a('0', '9');

    /* renamed from: i */
    private static final bmwx f140441i;

    /* renamed from: j */
    private static final bmwx f140442j;

    /* renamed from: b */
    public final String f140443b;

    /* renamed from: c */
    public final bngx f140444c;

    /* renamed from: d */
    public final int f140445d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmwx.a(char, char):bmwx
     arg types: [int, int]
     candidates:
      bmwx.a(java.lang.CharSequence, int):int
      bmwx.a(char, char):bmwx */
    static {
        bmwx b = bmwx.m108500a('a', 'z').mo66834b(bmwx.m108500a('A', 'Z'));
        f140441i = b;
        f140442j = f140440h.mo66834b(b).mo66834b(f140439g);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bqbw.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      bqbw.a(bmxv, bmxv):boolean
      bqbw.a(java.lang.String, boolean):boolean */
    public bqbw(String str) {
        boolean z;
        boolean z2;
        String a = bmwb.m108442a(f140437e.mo66838e(str));
        boolean z3 = false;
        a = a.endsWith(".") ? a.substring(0, a.length() - 1) : a;
        if (a.length() <= 253) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108596a(z, "Domain name too long: '%s':", a);
        this.f140443b = a;
        bngx a2 = bngx.m109355a(f140438f.mo66918a((CharSequence) a));
        this.f140444c = a2;
        if (a2.size() <= 127) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108596a(z2, "Domain has too many parts: '%s'", a);
        bngx bngx = this.f140444c;
        int size = bngx.size() - 1;
        if (m112544a((String) bngx.get(size), true)) {
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!m112544a((String) bngx.get(i), false)) {
                        break;
                    }
                    i++;
                } else {
                    z3 = true;
                    break;
                }
            }
        }
        bmxy.m108596a(z3, "Not a valid domain name: '%s'", a);
        this.f140445d = m112541a(bmvz.f131120a);
        m112541a(bmxv.m108566b(bzrr.REGISTRY));
    }

    /* renamed from: a */
    private final int m112541a(bmxv bmxv) {
        int size = this.f140444c.size();
        for (int i = 0; i < size; i++) {
            String a = f140436a.mo66874a((Iterable) this.f140444c.subList(i, size));
            if (m112543a(bmxv, bmxv.m108567c((bzrr) bzrq.f171186a.get(a)))) {
                return i;
            }
            if (bzrq.f171188c.containsKey(a)) {
                return i + 1;
            }
            List c = f140438f.mo66921b(2).mo66925c((CharSequence) a);
            if (c.size() == 2 && m112543a(bmxv, bmxv.m108567c((bzrr) bzrq.f171187b.get(c.get(1))))) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqbw) {
            return this.f140443b.equals(((bqbw) obj).f140443b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f140443b.hashCode();
    }

    public final String toString() {
        return this.f140443b;
    }

    /* renamed from: a */
    public static bqbw m112542a(String str) {
        bmxy.m108581a(str);
        return new bqbw(str);
    }

    /* renamed from: a */
    private static boolean m112543a(bmxv bmxv, bmxv bmxv2) {
        return !bmxv.mo66813a() ? bmxv2.mo66813a() : bmxv.equals(bmxv2);
    }

    /* renamed from: a */
    private static boolean m112544a(String str, boolean z) {
        if (str.length() > 0 && str.length() <= 63) {
            if (f140442j.mo66835b(bmwk.f131140a.mo66832a().mo66837d(str)) && !f140439g.mo66828a(str.charAt(0)) && !f140439g.mo66828a(str.charAt(str.length() - 1))) {
                if (!z || !f140440h.mo66828a(str.charAt(0))) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
