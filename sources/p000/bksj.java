package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: bksj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bksj extends bksb implements bkqp {

    /* renamed from: c */
    private StringBuilder f125212c;

    private bksj(bksj bksj, bksl bksl) {
        super(bksj.f125188a, bksl, true);
        this.f125212c = bksj.f125212c;
    }

    /* renamed from: b */
    private final blhg m106458b(int i, int i2) {
        return bksz.m106566a(mo66247d(), i, i2);
    }

    /* renamed from: a */
    public final int mo66257a() {
        return this.f125212c.length();
    }

    /* renamed from: a */
    public final void mo66298a(String str, bkqw bkqw, bksc bksc) {
    }

    /* renamed from: g */
    public final blhg mo66250g() {
        return bksz.m106570a(mo66247d(), bksz.f125257c);
    }

    /* renamed from: i */
    public final blhg mo66252i() {
        if (this.f125212c.length() > 0) {
            return m106458b(0, this.f125212c.length());
        }
        return bksz.m106563a();
    }

    /* renamed from: k */
    public final List mo66254k() {
        if (this.f125212c.length() > 0) {
            return Collections.singletonList(m106459b(0, this.f125212c.toString()));
        }
        return Collections.emptyList();
    }

    /* renamed from: l */
    public final int mo66255l() {
        return this.f125212c.length() + 16;
    }

    /* renamed from: o */
    public final Iterable mo66303o() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo66306r() {
        this.f125212c = new StringBuilder(this.f125212c);
    }

    public bksj(bksl bksl, blhp blhp) {
        super(blhp, bksl, false);
        this.f125212c = new StringBuilder();
    }

    /* renamed from: b */
    private final blhg m106459b(int i, String str) {
        return bksz.m106568a(mo66247d(), i, str);
    }

    /* renamed from: a */
    public final int mo66243a(bkqr bkqr) {
        return this.f125212c.toString().hashCode();
    }

    /* renamed from: a */
    public final bkqi mo66258a(int i, int i2) {
        if (i2 != i) {
            return this.f125189b.mo66103a(m106458b(i, i2), bkqw.f125126d);
        }
        return bkqi.f125113a;
    }

    /* renamed from: b */
    public final String mo66246b(bkqr bkqr) {
        return this.f125212c.toString();
    }

    /* renamed from: a */
    public final bkqi mo66259a(int i, String str) {
        return this.f125189b.mo66103a(m106459b(i, str), bkqw.f125126d);
    }

    /* renamed from: a */
    public final bkqi mo66260a(String str) {
        blhg a = bksz.m106564a(bkxc.m106794a(new bkxd(this.f125212c), new bkxe(str), mo66247d()).f125368a);
        if (bksz.m106583b(a)) {
            return bkqi.f125113a;
        }
        return this.f125189b.mo66103a(a, bkqw.f125126d);
    }

    /* renamed from: a */
    public final bksb mo66294a(bksl bksl) {
        mo66304p();
        return new bksj(this, bksl);
    }

    /* renamed from: a */
    public final blhg mo66244a(blhg blhg) {
        blhf blhf = blhf.KIND_NOT_SET;
        int ordinal = blhg.f126522b.ordinal();
        if (ordinal == 3) {
            blhb b = blhg.mo66531b();
            int i = b.f126493b;
            return m106458b(i, b.f126495d.length() + i);
        } else if (ordinal == 5) {
            blgu c = blhg.mo66532c();
            int i2 = c.f126475b;
            return m106459b(i2, this.f125212c.substring(i2, c.f126476c));
        } else {
            throw new IllegalStateException(blhg.toString());
        }
    }

    /* renamed from: a */
    public final void mo66295a(blhg blhg, bkqw bkqw, bksc bksc) {
        boolean z;
        mo66305q();
        blhf blhf = blhf.KIND_NOT_SET;
        int ordinal = blhg.f126522b.ordinal();
        if (ordinal == 3) {
            blhb b = blhg.mo66531b();
            int i = b.f126493b;
            int a = mo66257a();
            String str = b.f126495d;
            if (i <= a) {
                this.f125212c.insert(i, str);
                if (bksc.f125195a) {
                    bksc.mo66309a(new bkrr(this, bkqw, bksc.mo66313d(), i, str));
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(75);
            sb.append("Insert at index ");
            sb.append(i);
            sb.append(" starts after end of string (length ");
            sb.append(a);
            sb.append(")");
            throw new bkrf(sb.toString());
        } else if (ordinal != 5) {
            mo66299b(blhg);
        } else {
            blgu c = blhg.mo66532c();
            int i2 = c.f126475b;
            int i3 = c.f126476c;
            int a2 = mo66257a();
            if (i3 >= i2) {
                z = true;
            } else {
                z = false;
            }
            bkww.m106782a(z, "Delete endIndex must be >= startIndex");
            if (i3 <= a2) {
                if (bksc.f125195a) {
                    bksc.mo66309a(new bkrq(this, bkqw, bksc.mo66313d(), i2, this.f125212c.subSequence(i2, i3).toString()));
                }
                this.f125212c.delete(i2, i3);
                return;
            }
            StringBuilder sb2 = new StringBuilder(78);
            sb2.append("Delete [");
            sb2.append(i2);
            sb2.append(",");
            sb2.append(i3);
            sb2.append(") ends after end of string (length ");
            sb2.append(a2);
            sb2.append(")");
            throw new bkrf(sb2.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo66245a(bkrx bkrx, bkqo bkqo) {
        if (bkqo instanceof bkqp) {
            return this.f125212c.toString().equals(((bkqp) bkqo).toString());
        }
        return false;
    }
}
