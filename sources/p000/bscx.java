package p000;

import java.util.NoSuchElementException;

/* renamed from: bscx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bscx {

    /* renamed from: b */
    private static final double[] f144136b = {0.3d, 0.3d, 0.4d};

    /* renamed from: c */
    private static final boolean[] f144137c = {true, true, false};

    /* renamed from: a */
    public bscs f144138a = bscs.UNKNOWN;

    /* renamed from: d */
    private bscs f144139d = bscs.UNKNOWN;

    /* renamed from: e */
    private final ayvi f144140e;

    /* renamed from: f */
    private final ayve f144141f;

    /* renamed from: g */
    private final ayve f144142g;

    /* renamed from: h */
    private final ayve f144143h;

    /* renamed from: i */
    private final ayve f144144i;

    public bscx() {
        double[] dArr = f144136b;
        ayvg ayvg = new ayvg();
        ayvg.mo54447a(0, 0, 0.6d);
        ayvg.mo54447a(0, 1, 0.39d);
        ayvg.mo54447a(0, 2, 0.01d);
        ayvg.mo54447a(1, 0, 0.3d);
        ayvg.mo54447a(1, 1, 0.6d);
        ayvg.mo54447a(1, 2, 0.1d);
        ayvg.mo54447a(2, 0, 0.39d);
        ayvg.mo54447a(2, 1, 0.01d);
        ayvg.mo54447a(2, 2, 0.6d);
        this.f144140e = new ayvi(dArr, ayvg);
        ayvf ayvf = new ayvf();
        ayvf.mo54446a(0, 2, 0.925d);
        ayvf.mo54446a(0, 3, 0.065d);
        ayvf.mo54446a(0, 0, 0.95d);
        ayvf.mo54446a(0, 1, 0.01d);
        ayvf.mo54446a(1, 2, 0.925d);
        ayvf.mo54446a(1, 3, 0.065d);
        ayvf.mo54446a(1, 0, 0.1d);
        ayvf.mo54446a(1, 1, 0.95d);
        ayvf.mo54446a(2, 2, 0.037d);
        ayvf.mo54446a(2, 3, 0.955d);
        ayvf.mo54446a(2, 0, 0.1d);
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 3) {
                if (i2 == 2 || ayvf.f98538a[i][i2] != 2) {
                    i2++;
                } else {
                    throw new IllegalArgumentException(String.format("Can't link state %s because state %s already links to it", 2, Integer.valueOf(i2)));
                }
            }
            byte[] bArr = ayvf.f98538a[i];
            if (bArr[1] != 1) {
                throw new IllegalArgumentException(String.format("Can't link to a state that already has a link: state=%s", 1));
            } else if (i == 1 || bArr[2] == 2) {
                i++;
            } else {
                throw new IllegalArgumentException(String.format("Can't link more than one observation on state %s, obs1=%s, obs2=%s", 1, 1, Integer.valueOf(i)));
            }
        }
        ayvf.f98538a[1][2] = 1;
        this.f144141f = ayvf.mo54445a(2);
        this.f144142g = ayvf.mo54445a(3);
        this.f144143h = ayvf.mo54445a(1);
        this.f144144i = ayvf.mo54445a(0);
    }

    /* renamed from: a */
    public final void mo70255a() {
        this.f144140e.mo54448a();
        this.f144139d = bscs.UNKNOWN;
    }

    /* renamed from: a */
    public final void mo70256a(bsbl bsbl) {
        if (!bsbl.mo70190e()) {
            return;
        }
        if (bsbl.f143969e >= 5.0f) {
            this.f144140e.mo54449a(this.f144144i);
        } else {
            this.f144140e.mo54449a(this.f144143h);
        }
    }

    /* renamed from: a */
    public final void mo70257a(bscs bscs) {
        if (bscs.equals(bscs.ON_BICYCLE) || bscs.equals(bscs.IN_VEHICLE)) {
            this.f144140e.mo54449a(this.f144141f);
        } else if (bscs.equals(bscs.ON_FOOT)) {
            this.f144140e.mo54449a(this.f144142g);
        }
        ayvi ayvi = this.f144140e;
        ayvh ayvh = ayvi.f98549c;
        ayvh.f98544c = ayvi.f98552f;
        ayvi ayvi2 = ayvh.f98545d;
        ayvh.f98542a = ayvi2.f98550d;
        ayvh.f98546e = ayvi2.f98553g;
        ayvh.f98543b = ayvi2.f98551e + 1;
        boolean[] zArr = f144137c;
        int i = ayvh.f98543b;
        if (i > 0) {
            int i2 = ayvh.f98544c;
            int i3 = i - 1;
            ayvh.f98543b = i3;
            if (i3 > 0) {
                int i4 = ayvh.f98542a - 1;
                ayvh.f98542a = i4;
                if (i4 < 0) {
                    i4 = ayvh.f98545d.f98551e - 1;
                    ayvh.f98542a = i4;
                }
                ayvi ayvi3 = ayvh.f98545d;
                ayvh.f98544c = ayvi3.f98547a[i2][i4];
                ayvh.f98546e = (ayve) ayvi3.f98548b.get(i4);
            }
            bscs bscs2 = (!zArr[i2] || this.f144139d == bscs.UNKNOWN) ? bscs : this.f144139d;
            if (bscs.equals(bscs.IN_VEHICLE) || bscs.equals(bscs.ON_BICYCLE)) {
                this.f144139d = bscs;
            }
            this.f144138a = bscs2;
            return;
        }
        throw new NoSuchElementException("No more elements to iterate");
    }
}
