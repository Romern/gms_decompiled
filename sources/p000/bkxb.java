package p000;

import java.util.Collections;

/* renamed from: bkxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxb {

    /* renamed from: a */
    public final blgn f125368a = blgo.m107143b();

    /* renamed from: b */
    private final String f125369b;

    /* renamed from: c */
    private int f125370c = 0;

    /* renamed from: d */
    private blhb f125371d;

    /* renamed from: e */
    private blgu f125372e;

    public bkxb(String str) {
        this.f125369b = str;
    }

    /* renamed from: a */
    private final void m106787a(blhg blhg) {
        this.f125368a.mo66498a(blhg);
    }

    /* renamed from: b */
    private final void m106788b(blhg blhg) {
        blgn blgn = this.f125368a;
        blgn.f126447a.set(blgn.mo66497a() - 1, blhg);
    }

    /* renamed from: a */
    public final void mo66409a(int i) {
        this.f125370c += i;
        this.f125371d = null;
        this.f125372e = null;
    }

    /* renamed from: a */
    public final void mo66410a(bkxb bkxb) {
        int i;
        int i2 = 0;
        for (blhg blhg : Collections.unmodifiableList(bkxb.f125368a.f126447a)) {
            blhf blhf = blhf.KIND_NOT_SET;
            int ordinal = blhg.f126522b.ordinal();
            if (ordinal == 3) {
                i = blhg.mo66531b().f126493b;
            } else if (ordinal == 5) {
                i = blhg.mo66532c().f126475b;
            } else {
                throw new IllegalArgumentException();
            }
            if (i2 < i) {
                int i3 = i - i2;
                mo66409a(i3);
                i2 += i3;
            }
            int ordinal2 = blhg.f126522b.ordinal();
            if (ordinal2 == 3) {
                blhb b = blhg.mo66531b();
                this.f125372e = null;
                blhb blhb = this.f125371d;
                if (blhb == null) {
                    blha c = b.mo66524c();
                    c.f126489a = this.f125370c;
                    blhb a = c.mo66520a();
                    this.f125371d = a;
                    m106787a(bksz.m106573a(this.f125369b, a));
                } else {
                    blha c2 = blhb.mo66524c();
                    if (!b.mo66523b().isEmpty()) {
                        c2.mo66521a(b.mo66523b());
                    } else {
                        String valueOf = String.valueOf(this.f125371d.f126495d);
                        String valueOf2 = String.valueOf(b.f126495d);
                        c2.f126491c = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                    }
                    blhb a2 = c2.mo66520a();
                    this.f125371d = a2;
                    m106788b(bksz.m106573a(this.f125369b, a2));
                }
                int a3 = bksz.m106560a(b);
                this.f125370c += a3;
                i2 += a3;
            } else if (ordinal2 == 5) {
                mo66412b(blhg.mo66532c().f126476c - blhg.mo66532c().f126475b);
            } else {
                throw new IllegalArgumentException();
            }
        }
        int i4 = bkxb.f125370c;
        if (i2 < i4) {
            mo66409a(i4 - i2);
        }
    }

    /* renamed from: b */
    public final void mo66412b(int i) {
        this.f125371d = null;
        blgu blgu = this.f125372e;
        if (blgu == null) {
            blgt b = blgu.m107150b();
            int i2 = this.f125370c;
            b.f126472a = i2;
            b.f126473b = i2 + i;
            blgu a = b.mo66508a();
            this.f125372e = a;
            m106787a(bksz.m106571a(this.f125369b, a));
            return;
        }
        blgt a2 = blgu.mo66509a();
        a2.f126473b = this.f125372e.f126476c + i;
        blgu a3 = a2.mo66508a();
        this.f125372e = a3;
        m106788b(bksz.m106571a(this.f125369b, a3));
    }

    /* renamed from: a */
    public final void mo66411a(bkxf bkxf) {
        if (!bkxf.mo66416c()) {
            this.f125372e = null;
            blhb blhb = this.f125371d;
            if (blhb == null) {
                blha d = blhb.m107158d();
                d.f126489a = this.f125370c;
                bkxf.mo66414a(d);
                blhb a = d.mo66520a();
                this.f125371d = a;
                m106787a(bksz.m106573a(this.f125369b, a));
            } else {
                blha c = blhb.mo66524c();
                bkxf.mo66414a(c);
                blhb a2 = c.mo66520a();
                this.f125371d = a2;
                m106788b(bksz.m106573a(this.f125369b, a2));
            }
            this.f125370c += bkxf.mo66415b();
            return;
        }
        throw new IllegalArgumentException("valuesToInsert must not be empty");
    }
}
