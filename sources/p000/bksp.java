package p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: bksp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bksp extends bkxk implements bksl {

    /* renamed from: a */
    public boolean f125230a = true;

    /* renamed from: b */
    public bksm f125231b;

    /* renamed from: c */
    public bkqy f125232c;

    /* renamed from: d */
    public bkqj f125233d = new bkso();

    /* renamed from: e */
    private bkse f125234e;

    /* renamed from: f */
    private final int f125235f;

    /* renamed from: g */
    private final int f125236g;

    /* renamed from: h */
    private boolean f125237h = true;

    /* renamed from: i */
    private final bkse f125238i;

    public bksp(int i, bkrb bkrb, int i2) {
        this.f125235f = i;
        this.f125236g = i2;
        this.f125231b = new bksm(new bksr(this), this);
        this.f125238i = new bksf(this.f125231b);
        this.f125232c = new bksw(this, bkrb, i2, this.f125231b);
    }

    /* renamed from: a */
    private final bkqi m106516a(blhg blhg, boolean z, bkse bkse) {
        int i;
        int i2;
        int i3;
        if (z) {
            i = this.f125231b.f125222f;
        } else {
            i = 0;
        }
        bkqi a = bkse.mo66315a(blhg);
        if (!z || (i2 = this.f125231b.f125222f) <= (i3 = this.f125235f) || i2 <= i) {
            return a;
        }
        throw new bkrg(i2, i3);
    }

    /* renamed from: d */
    private final void m106517d() {
        bkse bkse = this.f125234e;
        if (bkse == null || !bkse.mo66320b()) {
            this.f125234e = null;
        }
    }

    /* renamed from: b */
    public final bksb mo66227a(String str) {
        return this.f125231b.mo66330a(str);
    }

    /* renamed from: c */
    public final bkqn mo66268c() {
        return this.f125231b.mo66268c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bksp)) {
            return false;
        }
        return bkwv.m106780a(mo66268c(), ((bksp) obj).mo66268c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo66268c()});
    }

    public final String toString() {
        String valueOf = String.valueOf(mo66268c());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("ModelImpl (root = ");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public final boolean mo66228b() {
        return mo66268c() != null;
    }

    /* renamed from: a */
    public final bkqi mo66226a() {
        bkww.m106783b(this.f125234e != null, "Not in a compound operation.");
        bkqi a = this.f125234e.mo66314a();
        bkqj bkqj = this.f125233d;
        bkqw bkqw = bkqw.f125125c;
        bkqj.mo27175a(a);
        m106517d();
        return a;
    }

    public bksp(bksp bksp) {
        this.f125230a = bksp.f125230a;
        this.f125235f = bksp.f125235f;
        this.f125236g = bksp.f125236g;
        this.f125237h = bksp.f125237h;
        bksm bksm = bksp.f125231b;
        bksm.f125219c = this;
        if (bksm.f125220d.size() > 100) {
            bksm.mo66336d();
        }
        synchronized (bksm.f125221e) {
            if (bksm.f125221e.isEmpty()) {
                bksm.f125221e = bksm.f125220d;
                bksm.f125220d = new HashMap();
            }
        }
        this.f125231b = new bksm(bksm, this);
        this.f125232c = new bksw(this, bkrb.f125152a, this.f125236g, this.f125231b);
        this.f125238i = new bksf(this.f125231b);
    }

    /* renamed from: a */
    public final bkqi mo66103a(blhg blhg, bkqw bkqw) {
        bkqi bkqi;
        if (bkqw.mo66271c()) {
            bkqi = m106516a(blhg, bkqw.mo66270b(), this.f125238i);
        } else {
            try {
                boolean a = bkqw.mo66269a();
                if (a) {
                    bkww.m106783b(this.f125230a, "Unable to apply local operation because document is in read-only mode.");
                }
                if (this.f125234e != null) {
                    if ((bkqw.f125131b & 12) != 0) {
                        throw new bkrd("Undo and Redo calls are not permitted inside a compound operation.");
                    }
                } else if (!a) {
                    this.f125234e = new bkst(this.f125231b, this.f125232c, bkqw, this.f125237h);
                } else {
                    this.f125234e = new bksn(this.f125231b, this.f125232c, bkqw, this.f125237h);
                }
                bkqi = m106516a(blhg, bkqw.mo66270b(), this.f125234e);
            } finally {
                m106517d();
            }
        }
        this.f125233d.mo27175a(bkqi);
        return bkqi;
    }

    /* renamed from: a */
    public final bkqq mo66337a(blgr blgr, String str) {
        mo66103a(bksz.m106570a(str, blgr), bkqw.f125126d);
        return new bkqq(this.f125231b.mo66330a(str));
    }

    /* renamed from: a */
    public final void mo66104a(Iterable iterable, bkqw bkqw) {
        if (bkqw.mo66271c()) {
            boolean b = bkqw.mo66270b();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m106516a((blhg) it.next(), b, this.f125238i);
            }
            bkqi bkqi = bkqi.f125113a;
            return;
        }
        blgn b2 = blgo.m107143b();
        b2.mo66499a(iterable);
        mo66103a(bksz.m106565a(b2.mo66500b()), bkqw);
    }

    /* renamed from: a */
    public final void mo66338a(String str, bksd bksd) {
        if (this.f125234e == null) {
            this.f125234e = new bksn(this.f125231b, this.f125232c, bkqw.f125126d, this.f125237h);
        }
        this.f125234e.mo66317a(str, bksd);
    }
}
