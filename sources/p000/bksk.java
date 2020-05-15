package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bksk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bksk extends bksb implements Comparable, bkqt {

    /* renamed from: d */
    private static final blgz f125213d = bksz.m106584c("").mo66537g();

    /* renamed from: c */
    public String f125214c;

    /* renamed from: e */
    private int f125215e;

    /* renamed from: f */
    private blgs f125216f;

    private bksk(bksk bksk, bksl bksl) {
        super(bksk.f125188a, bksl, false);
        this.f125215e = bksk.f125215e;
        this.f125214c = bksk.f125214c;
        this.f125216f = bksk.f125216f;
    }

    /* renamed from: a */
    private final blhg m106477a(String str, int i, blgs blgs) {
        return bksz.m106576a(mo66247d(), str, i, blgs);
    }

    /* renamed from: a */
    public final String mo66263a() {
        return this.f125214c;
    }

    /* renamed from: b */
    public final int mo66265b() {
        return this.f125215e;
    }

    /* renamed from: c */
    public final boolean mo66266c() {
        return this.f125216f == blgs.SHIFT_TO_INVALID;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return bkqt.f125124DC.compare(this, (bksk) obj);
    }

    /* renamed from: g */
    public final blhg mo66250g() {
        return bksz.m106570a(mo66247d(), bksz.f125258d);
    }

    /* renamed from: i */
    public final blhg mo66252i() {
        if (this.f125214c.isEmpty() && this.f125215e == -1) {
            return bksz.m106563a();
        }
        return m106477a("", -1, blgs.SHIFT_AFTER_DELETE);
    }

    /* renamed from: k */
    public final List mo66254k() {
        if (this.f125214c.isEmpty() && this.f125215e == -1 && this.f125216f == blgs.SHIFT_AFTER_DELETE) {
            return Collections.emptyList();
        }
        return Collections.singletonList(m106477a(this.f125214c, this.f125215e, this.f125216f));
    }

    /* renamed from: l */
    public final int mo66255l() {
        return this.f125214c.length() + 32;
    }

    /* renamed from: n */
    public final blgs mo66267n() {
        return this.f125216f;
    }

    /* renamed from: o */
    public final Iterable mo66303o() {
        if (this.f125214c.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.f125189b.mo66329b(this.f125214c).f125188a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo66306r() {
    }

    public bksk(bksl bksl, blhp blhp) {
        super(blhp, bksl, false);
        this.f125215e = f125213d.f126487c;
        this.f125214c = f125213d.f126486b;
        this.f125216f = f125213d.f126488d;
    }

    /* renamed from: a */
    private final void m106478a(int i, bkqw bkqw, String str, bksc bksc) {
        String str2;
        if (this.f125215e != i || !bkwv.m106779a(this.f125214c, str)) {
            String str3 = this.f125214c;
            int i2 = this.f125215e;
            this.f125215e = i;
            if (!bkwv.m106779a(str, str3)) {
                if (!this.f125214c.isEmpty()) {
                    mo66300b(this.f125189b.mo66329b(this.f125214c).f125188a);
                }
                Map map = (Map) ((bksp) this.f125189b).f125231b.f125217a.get(this.f125214c);
                if (map != null) {
                    map.remove(mo66247d());
                }
                this.f125214c = str;
                if (!str.isEmpty()) {
                    bksb b = this.f125189b.mo66329b(this.f125214c);
                    if (b == null) {
                        mo66298a(this.f125214c, bkqw, bksc);
                    } else {
                        mo66297a(b.mo66248e());
                        ((bksp) this.f125189b).f125231b.mo66333a(this);
                    }
                }
                str2 = str;
            } else {
                str2 = str3;
            }
            if (bksc.f125195a) {
                bksc.mo66309a(new bkrp(this, bkqw, bksc.mo66313d(), str2, i, i2, str3));
            }
        }
    }

    /* renamed from: b */
    public final String mo66246b(bkqr bkqr) {
        String d = mo66247d();
        String str = this.f125214c;
        int i = this.f125215e;
        String valueOf = String.valueOf(this.f125216f);
        int length = String.valueOf(d).length();
        StringBuilder sb = new StringBuilder(length + 28 + String.valueOf(str).length() + String.valueOf(valueOf).length());
        sb.append("IndexRef [");
        sb.append(d);
        sb.append(" -> ");
        sb.append(str);
        sb.append("@");
        sb.append(i);
        sb.append(" ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo66243a(bkqr bkqr) {
        return Arrays.hashCode(new Object[]{mo66247d(), Integer.valueOf(this.f125215e), this.f125216f});
    }

    /* renamed from: a */
    public final bksb mo66294a(bksl bksl) {
        return new bksk(this, bksl);
    }

    /* renamed from: a */
    public final blhg mo66244a(blhg blhg) {
        mo66296a(blhg, blhf.INDEX);
        return m106477a(this.f125214c, this.f125215e, this.f125216f);
    }

    /* renamed from: a */
    public final void mo66264a(int i) {
        this.f125189b.mo66103a(m106477a(this.f125214c, i, this.f125216f), bkqw.f125126d);
    }

    /* renamed from: a */
    public final void mo66295a(blhg blhg, bkqw bkqw, bksc bksc) {
        blhf blhf = blhf.KIND_NOT_SET;
        int ordinal = blhg.f126522b.ordinal();
        if (ordinal == 3) {
            blhb b = blhg.mo66531b();
            int i = this.f125215e;
            if (i >= b.f126493b) {
                i += bksz.m106560a(b);
            }
            m106478a(i, bkqw, this.f125214c, bksc);
        } else if (ordinal == 5) {
            blgu c = blhg.mo66532c();
            int i2 = c.f126475b;
            int i3 = c.f126476c;
            int i4 = i3 - i2;
            int i5 = this.f125215e;
            if (i5 < i2 || i5 >= i3) {
                if (i5 >= i3) {
                    i5 -= i4;
                }
            } else if (bkqw.mo66269a()) {
                mo66299b(bksz.m106571a("", c));
            } else {
                i5 = bkqu.m106334a(this.f125215e, c, this.f125216f, 2);
            }
            m106478a(i5, bkqw, this.f125214c, bksc);
        } else if (ordinal == 6) {
        } else {
            if (ordinal == 8) {
                blhd f = blhg.mo66536f();
                int i6 = this.f125215e;
                if (blhg.f126523c.equals(this.f125214c)) {
                    int i7 = f.f126500b;
                    int i8 = this.f125215e;
                    if (i7 == i8) {
                        m106478a(bksz.m106561a(blhg), bkqw, f.f126502d, bksc);
                        return;
                    } else if (i7 < i8) {
                        i6--;
                    }
                }
                if (f.f126502d.equals(this.f125214c) && f.f126501c <= this.f125215e) {
                    i6++;
                }
                if (i6 != this.f125215e) {
                    m106478a(i6, bkqw, this.f125214c, bksc);
                }
            } else if (ordinal != 9) {
                mo66299b(blhg);
            } else {
                blgz g = blhg.mo66537g();
                this.f125216f = g.f126488d;
                m106478a(g.f126487c, bkqw, g.f126486b, bksc);
            }
        }
    }

    /* renamed from: a */
    public final void mo66298a(String str, bkqw bkqw, bksc bksc) {
        if (this.f125214c.equals(str)) {
            this.f125214c = "";
            this.f125215e = -1;
            this.f125216f = blgs.SHIFT_AFTER_DELETE;
        }
    }

    /* renamed from: a */
    public final boolean mo66245a(bkrx bkrx, bkqo bkqo) {
        if (!(bkqo instanceof bkqt)) {
            return false;
        }
        bkqt bkqt = (bkqt) bkqo;
        return bkwv.m106780a(this.f125214c, bkqt.mo66263a(), Integer.valueOf(this.f125215e), Integer.valueOf(bkqt.mo66265b()), this.f125216f, bkqt.mo66267n());
    }
}
