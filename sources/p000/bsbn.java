package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: bsbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsbn {

    /* renamed from: a */
    final List f143981a = new ArrayList();

    /* renamed from: b */
    private final long f143982b;

    public bsbn(long j) {
        this.f143982b = j;
    }

    /* renamed from: a */
    public final int mo70203a(int i, long j) {
        if (i < 0) {
            return i;
        }
        this.f143981a.add(new bsbm(i, j));
        ListIterator listIterator = this.f143981a.listIterator();
        int i2 = 0;
        long j2 = 0;
        while (listIterator.hasNext()) {
            bsbm bsbm = (bsbm) listIterator.next();
            if (Math.abs(j - bsbm.f143980b) <= this.f143982b) {
                j2 += (long) bsbm.f143979a;
                i2++;
            } else {
                listIterator.remove();
            }
        }
        return i2 > 0 ? (int) (j2 / ((long) i2)) : i;
    }

    /* renamed from: a */
    public final void mo70204a() {
        this.f143981a.clear();
    }
}
