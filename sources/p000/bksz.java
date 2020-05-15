package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: bksz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bksz {

    /* renamed from: a */
    public static final blgr f125255a;

    /* renamed from: b */
    public static final blgr f125256b;

    /* renamed from: c */
    public static final blgr f125257c;

    /* renamed from: d */
    public static final blgr f125258d;

    /* renamed from: e */
    private static final blhf f125259e = blhg.f126521a.f126522b;

    static {
        blgp b = blgr.m107146b();
        blhl blhl = blhl.f126540a;
        b.f126454a = blgq.MAP;
        b.f126455b = blhl;
        f125255a = b.mo66504a();
        blgp b2 = blgr.m107146b();
        blhk blhk = blhk.f126537a;
        b2.f126454a = blgq.LIST;
        b2.f126455b = blhk;
        f125256b = b2.mo66504a();
        blgp b3 = blgr.m107146b();
        blhm blhm = blhm.f126543a;
        b3.f126454a = blgq.STRING;
        b3.f126455b = blhm;
        f125257c = b3.mo66504a();
        blgp b4 = blgr.m107146b();
        blhj blhj = blhj.f126532a;
        b4.f126454a = blgq.INDEX_REFERENCE;
        b4.f126455b = blhj;
        f125258d = b4.mo66504a();
    }

    /* renamed from: a */
    public static int m106560a(blhb blhb) {
        if (blhb.mo66523b().isEmpty()) {
            return blhb.f126495d.length();
        }
        return blhb.mo66522a();
    }

    /* renamed from: b */
    public static blhg m106581b(String str) {
        blgv blgv = blgv.f126477a;
        blhe i = blhg.m107164i();
        i.f126504b = str;
        i.f126503a = blhf.DESTROY_OBJECT;
        i.f126505c = blgv;
        return i.mo66529a();
    }

    /* renamed from: b */
    public static boolean m106583b(blhg blhg) {
        return blhg.f126522b == f125259e;
    }

    /* renamed from: c */
    public static blhg m106584c(String str) {
        return m106576a(str, "", -1, blgs.SHIFT_AFTER_DELETE);
    }

    /* renamed from: a */
    public static int m106561a(blhg blhg) {
        blhd f = blhg.mo66536f();
        String str = blhg.f126523c;
        int i = f.f126500b;
        String str2 = f.f126502d;
        int i2 = f.f126501c;
        return (i2 <= i || !str.equals(str2)) ? i2 : i2 - 1;
    }

    /* renamed from: b */
    public static blhg m106582b(String str, int i, Iterable iterable) {
        blhu c = blhv.m107183c();
        c.f126581a = i;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c.f126582b.add((blhp) it.next());
        }
        return m106574a(str, c.mo66561a());
    }

    /* renamed from: a */
    public static blgr m106562a(String str) {
        if ("List".equals(str)) {
            return f125256b;
        }
        if ("Map".equals(str)) {
            return f125255a;
        }
        if ("EditableString".equals(str)) {
            return f125257c;
        }
        if ("IndexReference".equals(str)) {
            return f125258d;
        }
        blgp b = blgr.m107146b();
        blhh a = blhi.m107173a();
        a.f126527c = str;
        blhi blhi = new blhi(a);
        a.f126525a = "";
        a.f126526b = new HashMap();
        a.f126527c = "";
        b.f126454a = blgq.CUSTOM;
        b.f126455b = blhi;
        return b.mo66504a();
    }

    /* renamed from: a */
    public static final blhg m106563a() {
        return blhg.f126521a;
    }

    /* renamed from: a */
    public static blhg m106564a(blgn blgn) {
        if (blgn.f126448b.isEmpty() && !blgn.f126449c) {
            if (blgn.mo66497a() == 0) {
                return blhg.f126521a;
            }
            if (blgn.mo66497a() == 1) {
                return (blhg) blgn.f126447a.get(0);
            }
        }
        return m106565a(blgn.mo66500b());
    }

    /* renamed from: a */
    public static final blhg m106565a(blgo blgo) {
        blhe i = blhg.m107164i();
        i.f126503a = blhf.COMPOUND;
        i.f126505c = blgo;
        return i.mo66529a();
    }

    /* renamed from: a */
    public static blhg m106566a(String str, int i, int i2) {
        blgt b = blgu.m107150b();
        b.f126472a = i;
        b.f126473b = i2;
        return m106571a(str, b.mo66508a());
    }

    /* renamed from: a */
    public static blhg m106567a(String str, int i, Iterable iterable) {
        blha d = blhb.m107158d();
        d.f126489a = i;
        d.mo66521a(iterable);
        return m106573a(str, d.mo66520a());
    }

    /* renamed from: a */
    public static blhg m106568a(String str, int i, String str2) {
        blha d = blhb.m107158d();
        d.f126489a = i;
        d.f126491c = str2;
        return m106573a(str, d.mo66520a());
    }

    /* renamed from: a */
    public static blhg m106569a(String str, int i, String str2, int i2) {
        blhc a = blhd.m107162a();
        a.f126496a = i;
        a.f126498c = str2;
        a.f126497b = i2;
        blhd blhd = new blhd(a);
        a.f126496a = 0;
        a.f126497b = 0;
        a.f126498c = "";
        blhe i3 = blhg.m107164i();
        i3.f126504b = str;
        i3.f126503a = blhf.MOVE;
        i3.f126505c = blhd;
        return i3.mo66529a();
    }

    /* renamed from: a */
    public static final blhg m106570a(String str, blgr blgr) {
        blhe i = blhg.m107164i();
        i.f126504b = str;
        i.f126503a = blhf.CREATE;
        i.f126505c = blgr;
        return i.mo66529a();
    }

    /* renamed from: a */
    public static final blhg m106571a(String str, blgu blgu) {
        blhe i = blhg.m107164i();
        i.f126504b = str;
        i.f126503a = blhf.DELETE;
        i.f126505c = blgu;
        return i.mo66529a();
    }

    /* renamed from: a */
    public static final blhg m106572a(String str, blgz blgz) {
        blhe i = blhg.m107164i();
        i.f126504b = str;
        i.f126503a = blhf.INDEX;
        i.f126505c = blgz;
        return i.mo66529a();
    }

    /* renamed from: a */
    public static final blhg m106573a(String str, blhb blhb) {
        blhe i = blhg.m107164i();
        i.f126504b = str;
        i.f126503a = blhf.INSERT;
        i.f126505c = blhb;
        return i.mo66529a();
    }

    /* renamed from: a */
    public static final blhg m106574a(String str, blhv blhv) {
        blhe i = blhg.m107164i();
        i.f126504b = str;
        i.f126503a = blhf.SET;
        i.f126505c = blhv;
        return i.mo66529a();
    }

    /* renamed from: a */
    public static blhg m106575a(String str, String str2) {
        return m106570a(str, m106562a(str2));
    }

    /* renamed from: a */
    public static blhg m106576a(String str, String str2, int i, blgs blgs) {
        blgy b = blgz.m107154b();
        b.f126482a = str2;
        b.f126483b = i;
        b.f126484c = blgs;
        return m106572a(str, b.mo66516a());
    }

    /* renamed from: a */
    public static final blhg m106577a(String str, String str2, blhp blhp) {
        blhw a = blhx.m107186a();
        a.f126586a = str2;
        a.f126587b = blhp;
        blhx blhx = new blhx(a);
        a.f126586a = "";
        a.f126587b = blhp.f126557a;
        blhe i = blhg.m107164i();
        i.f126504b = str;
        i.f126503a = blhf.UPDATE;
        i.f126505c = blhx;
        return i.mo66529a();
    }

    /* renamed from: a */
    public static blhg m106578a(List list) {
        if (list.isEmpty()) {
            return blhg.f126521a;
        }
        if (list.size() == 1) {
            return (blhg) list.get(0);
        }
        blgn b = blgo.m107143b();
        b.mo66499a(list);
        return m106564a(b);
    }

    /* renamed from: a */
    public static String m106579a(blgr blgr) {
        blgq blgq = blgq.KIND_NOT_SET;
        int ordinal = blgr.f126464b.ordinal();
        if (ordinal == 1) {
            return "Map";
        }
        if (ordinal == 2) {
            return "List";
        }
        if (ordinal == 3) {
            return "EditableString";
        }
        if (ordinal == 4) {
            return "IndexReference";
        }
        if (ordinal == 5) {
            return blgr.mo66505a().f126529b;
        }
        throw new bkrm(m106570a("", blgr));
    }

    /* renamed from: a */
    public static void m106580a(List list, String str) {
        int i = 0;
        while (i < list.size()) {
            if (bkta.m106589a(str, (blhp) list.get(i))) {
                list.remove(i);
                i--;
            }
            i++;
        }
    }
}
