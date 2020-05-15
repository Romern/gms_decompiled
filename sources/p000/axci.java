package p000;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: axci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axci {

    /* renamed from: a */
    final ArrayList f95765a;

    /* renamed from: b */
    int f95766b = 0;

    /* renamed from: c */
    int f95767c;

    /* renamed from: d */
    private final bwin f95768d;

    public axci(bwin bwin) {
        this.f95768d = bwin;
        int size = bwin.f159654a.size();
        for (int i = 0; i < size; i++) {
            this.f95767c += ((bwij) bwin.f159654a.get(i)).f159640b.size();
        }
        this.f95765a = new ArrayList(Math.min(50, this.f95767c));
    }

    /* renamed from: a */
    public final bwig mo53007a(int i) {
        axch c = mo53009c(i);
        bwin bwin = this.f95768d;
        int i2 = c.f95763a;
        return (bwig) ((bwij) bwin.f159654a.get(i2)).f159640b.get(c.f95764b);
    }

    /* renamed from: b */
    public final bwij mo53008b(int i) {
        bwin bwin = this.f95768d;
        return (bwij) bwin.f159654a.get(mo53009c(i).f95763a);
    }

    /* renamed from: c */
    public final axch mo53009c(int i) {
        if (i < this.f95767c) {
            this.f95765a.ensureCapacity(i);
            while (i >= this.f95765a.size()) {
                int size = ((bwij) this.f95768d.f159654a.get(this.f95766b)).f159640b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f95765a.add(new axch(this.f95766b, i2));
                }
                this.f95766b++;
            }
            return (axch) this.f95765a.get(i);
        }
        throw new IndexOutOfBoundsException(String.format(Locale.US, "Cell index %d out of range of total cells %d in the table.", Integer.valueOf(i), Integer.valueOf(this.f95767c)));
    }

    /* renamed from: d */
    public final bwij mo53010d(int i) {
        if (i < this.f95768d.f159654a.size()) {
            return (bwij) this.f95768d.f159654a.get(i);
        }
        return null;
    }
}
