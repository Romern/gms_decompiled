package p000;

import java.util.ListIterator;

/* renamed from: bnkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnkb implements ListIterator {

    /* renamed from: a */
    final Object f131746a;

    /* renamed from: b */
    int f131747b;

    /* renamed from: c */
    bnjz f131748c;

    /* renamed from: d */
    bnjz f131749d;

    /* renamed from: e */
    bnjz f131750e;

    /* renamed from: f */
    final /* synthetic */ bnkc f131751f;

    public bnkb(bnkc bnkc, Object obj) {
        this.f131751f = bnkc;
        this.f131746a = obj;
        bnjy bnjy = (bnjy) bnkc.f131754c.get(obj);
        this.f131748c = bnjy != null ? bnjy.f131731a : null;
    }

    public final void add(Object obj) {
        this.f131750e = this.f131751f.mo67900a(this.f131746a, obj, this.f131748c);
        this.f131747b++;
        this.f131749d = null;
    }

    public final boolean hasNext() {
        return this.f131748c != null;
    }

    public final boolean hasPrevious() {
        return this.f131750e != null;
    }

    public final Object next() {
        bnkc.m109633g(this.f131748c);
        bnjz bnjz = this.f131748c;
        this.f131749d = bnjz;
        this.f131750e = bnjz;
        this.f131748c = bnjz.f131738e;
        this.f131747b++;
        return this.f131749d.f131735b;
    }

    public final int nextIndex() {
        return this.f131747b;
    }

    public final Object previous() {
        bnkc.m109633g(this.f131750e);
        bnjz bnjz = this.f131750e;
        this.f131749d = bnjz;
        this.f131748c = bnjz;
        this.f131750e = bnjz.f131739f;
        this.f131747b--;
        return this.f131749d.f131735b;
    }

    public final int previousIndex() {
        return this.f131747b - 1;
    }

    public final void remove() {
        boolean z;
        if (this.f131749d != null) {
            z = true;
        } else {
            z = false;
        }
        bndz.m109115a(z);
        bnjz bnjz = this.f131749d;
        if (bnjz != this.f131748c) {
            this.f131750e = bnjz.f131739f;
            this.f131747b--;
        } else {
            this.f131748c = bnjz.f131738e;
        }
        this.f131751f.mo67901a(bnjz);
        this.f131749d = null;
    }

    public final void set(Object obj) {
        bmxy.m108600b(this.f131749d != null);
        this.f131749d.f131735b = obj;
    }

    public bnkb(bnkc bnkc, Object obj, int i) {
        int i2;
        bnjz bnjz;
        bnjz bnjz2;
        this.f131751f = bnkc;
        bnjy bnjy = (bnjy) bnkc.f131754c.get(obj);
        if (bnjy != null) {
            i2 = bnjy.f131733c;
        } else {
            i2 = 0;
        }
        bmxy.m108599b(i, i2);
        if (i >= i2 / 2) {
            if (bnjy != null) {
                bnjz = bnjy.f131732b;
            } else {
                bnjz = null;
            }
            this.f131750e = bnjz;
            this.f131747b = i2;
            while (true) {
                int i3 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i3;
            }
        } else {
            if (bnjy != null) {
                bnjz2 = bnjy.f131731a;
            } else {
                bnjz2 = null;
            }
            this.f131748c = bnjz2;
            while (true) {
                int i4 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i4;
            }
        }
        this.f131746a = obj;
        this.f131749d = null;
    }
}
