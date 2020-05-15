package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* renamed from: bqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqu extends bxb {

    /* renamed from: c */
    private static final Set f5372c = new HashSet(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    /* renamed from: a */
    public int f5373a = 127;

    static {
        bqu.class.getSimpleName();
    }

    public bqu(Map map) {
        super(map);
        bzx bzx = bzx.MSD;
    }

    /* renamed from: a */
    private final brr m3521a(int i) {
        try {
            return (brr) mo3576c(new bze((byte) 63, (byte) i));
        } catch (IllegalArgumentException e) {
            throw new bon(bop.f5263c);
        }
    }

    /* renamed from: a */
    public final boolean mo3423a() {
        return false;
    }

    /* renamed from: b */
    public final bys mo3424b() {
        if (mo3572a(bzt.f6271a)) {
            return mo3576c(bzt.f6271a);
        }
        if (mo3572a(bte.f5568a)) {
            return mo3576c(bte.f5568a);
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo3426c() {
        return mo3429d() != null;
    }

    /* renamed from: d */
    public final brn mo3428d(bxm bxm) {
        return new brn(mo3430e(bxm).mo3467a(59, 1));
    }

    /* renamed from: e */
    public final brr mo3430e(bxm bxm) {
        return m3521a(((bqx) bxm).f5376b);
    }

    /* renamed from: g */
    public final bym mo3434g() {
        if (mo3572a(bzt.f6271a)) {
            bym bym = new bym(((bzt) mo3576c(bzt.f6271a)).mo3582a(bym.f6177a));
            bym.mo3547aP();
            return bym;
        } else if (!mo3572a(bte.f5568a)) {
            return null;
        } else {
            bym bym2 = new bym(((bte) mo3576c(bte.f5568a)).mo3582a(bym.f6177a));
            bym2.mo3547aP();
            return bym2;
        }
    }

    /* renamed from: h */
    public final bxy mo3435h() {
        byte[] a = m3522a(bxy.f6067a, mo3437j());
        bxy bxy = a == null ? new bxy(new byte[0]) : new bxy(a);
        bxy.mo3547aP();
        return bxy;
    }

    /* renamed from: i */
    public final brp mo3436i() {
        bsi bsi = (bsi) mo3576c(byy.f6232a);
        bpo c = bpk.m3440c(brp.f5488b);
        if (bsi == null || !bsi.mo3615a(c)) {
            return new brp();
        }
        return new brp(bsi.mo3618b(c));
    }

    /* renamed from: j */
    public final brc mo3437j() {
        brr a = m3521a(this.f5373a);
        return new brc(a.mo3467a(27, Integer.parseInt(cbm.m3893a(a.mo3467a(26, 1)), 16)));
    }

    /* renamed from: c */
    public final byte[] mo3427c(bxm bxm) {
        return mo3430e(bxm).mo3467a(18, 6);
    }

    /* renamed from: f */
    public final boolean mo3433f() {
        if (mo3572a(bzt.f6271a)) {
            return ((bzt) mo3576c(bzt.f6271a)).mo3583b(bym.f6177a);
        }
        return false;
    }

    /* renamed from: d */
    public final byl mo3429d() {
        byte[] a = m3522a(byl.f6168a, mo3437j());
        if (a != null) {
            return new byl(a);
        }
        return null;
    }

    /* renamed from: e */
    public final byl mo3431e() {
        bsy bsy = (bsy) mo3576c(bsy.f5555a);
        return new byl(bsy.mo3474a(1, bsy.f5557b));
    }

    /* renamed from: b */
    public final byte[] mo3425b(bxm bxm) {
        return mo3430e(bxm).mo3467a(6, 6);
    }

    /* renamed from: a */
    private final byte[] m3522a(byte[] bArr, bxq bxq) {
        Set set = f5372c;
        bxq.mo3547aP();
        Iterator it = bxq.f6015d.iterator();
        LinkedList linkedList = new LinkedList();
        while (it.hasNext()) {
            bxu bxu = (bxu) it.next();
            int i = bxu.f6041c;
            for (int i2 = bxu.f6040b; i2 <= i; i2++) {
                linkedList.add(new bok((byte) i2, (byte) ((bxu.f6039a << 3) | 4)));
            }
        }
        for (bok bok : Collections.unmodifiableList(linkedList)) {
            Integer valueOf = Integer.valueOf(bok.mo3337k());
            if (set == null || set.contains(valueOf)) {
                bze bze = new bze(bok.mo3337k(), bok.mo3328d());
                if (this.f5943b.containsKey(bze) && (this.f5943b.get(bze) instanceof bzh)) {
                    bzh bzh = (bzh) this.f5943b.get(bze);
                    if (bzh.mo3583b(bArr)) {
                        return bzh.mo3582a(bArr);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final brd mo3432f(bxm bxm) {
        return new brd(mo3430e(bxm).mo3467a(24, 2));
    }
}
