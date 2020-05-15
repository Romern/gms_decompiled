package p000;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: bnka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnka implements ListIterator {

    /* renamed from: a */
    int f131740a;

    /* renamed from: b */
    bnjz f131741b;

    /* renamed from: c */
    bnjz f131742c;

    /* renamed from: d */
    bnjz f131743d;

    /* renamed from: e */
    int f131744e = this.f131745f.f131756e;

    /* renamed from: f */
    final /* synthetic */ bnkc f131745f;

    public bnka(bnkc bnkc, int i) {
        this.f131745f = bnkc;
        int i2 = bnkc.f131755d;
        bmxy.m108599b(i, i2);
        if (i < i2 / 2) {
            this.f131741b = bnkc.f131752a;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i3;
            }
        } else {
            this.f131743d = bnkc.f131753b;
            this.f131740a = i2;
            while (true) {
                int i4 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i4;
            }
        }
        this.f131742c = null;
    }

    /* renamed from: c */
    private final void m109629c() {
        if (this.f131745f.f131756e != this.f131744e) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public final bnjz next() {
        m109629c();
        bnkc.m109633g(this.f131741b);
        bnjz bnjz = this.f131741b;
        this.f131742c = bnjz;
        this.f131743d = bnjz;
        this.f131741b = bnjz.f131736c;
        this.f131740a++;
        return this.f131742c;
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final bnjz previous() {
        m109629c();
        bnkc.m109633g(this.f131743d);
        bnjz bnjz = this.f131743d;
        this.f131742c = bnjz;
        this.f131741b = bnjz;
        this.f131743d = bnjz.f131737d;
        this.f131740a--;
        return this.f131742c;
    }

    public final boolean hasNext() {
        m109629c();
        return this.f131741b != null;
    }

    public final boolean hasPrevious() {
        m109629c();
        return this.f131743d != null;
    }

    public final int nextIndex() {
        return this.f131740a;
    }

    public final int previousIndex() {
        return this.f131740a - 1;
    }

    public final void remove() {
        boolean z;
        m109629c();
        if (this.f131742c != null) {
            z = true;
        } else {
            z = false;
        }
        bndz.m109115a(z);
        bnjz bnjz = this.f131742c;
        if (bnjz != this.f131741b) {
            this.f131743d = bnjz.f131737d;
            this.f131740a--;
        } else {
            this.f131741b = bnjz.f131736c;
        }
        this.f131745f.mo67901a(bnjz);
        this.f131742c = null;
        this.f131744e = this.f131745f.f131756e;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }
}
