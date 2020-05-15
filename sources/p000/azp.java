package p000;

import android.graphics.Path;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: azp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azp implements azq, azn {

    /* renamed from: a */
    private final Path f2684a = new Path();

    /* renamed from: b */
    private final Path f2685b = new Path();

    /* renamed from: c */
    private final Path f2686c = new Path();

    /* renamed from: d */
    private final List f2687d = new ArrayList();

    /* renamed from: e */
    private final bbt f2688e;

    public azp(bbt bbt) {
        int i = Build.VERSION.SDK_INT;
        this.f2688e = bbt;
    }

    /* renamed from: a */
    private final void m2526a(Path.Op op) {
        this.f2685b.reset();
        this.f2684a.reset();
        for (int size = this.f2687d.size() - 1; size > 0; size--) {
            azq azq = (azq) this.f2687d.get(size);
            if (azq instanceof azh) {
                azh azh = (azh) azq;
                List c = azh.mo2931c();
                for (int size2 = c.size() - 1; size2 >= 0; size2--) {
                    Path e = ((azq) c.get(size2)).mo2933e();
                    e.transform(azh.mo2932d());
                    this.f2685b.addPath(e);
                }
            } else {
                this.f2685b.addPath(azq.mo2933e());
            }
        }
        azq azq2 = (azq) this.f2687d.get(0);
        if (azq2 instanceof azh) {
            azh azh2 = (azh) azq2;
            List c2 = azh2.mo2931c();
            for (int i = 0; i < c2.size(); i++) {
                Path e2 = ((azq) c2.get(i)).mo2933e();
                e2.transform(azh2.mo2932d());
                this.f2684a.addPath(e2);
            }
        } else {
            this.f2684a.set(azq2.mo2933e());
        }
        this.f2686c.op(this.f2684a, this.f2685b, op);
    }

    /* renamed from: b */
    public final String mo2930b() {
        throw null;
    }

    /* renamed from: e */
    public final Path mo2933e() {
        this.f2686c.reset();
        bbt bbt = this.f2688e;
        if (bbt.f2877a) {
            return this.f2686c;
        }
        int i = bbt.f2878b;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                for (int i3 = 0; i3 < this.f2687d.size(); i3++) {
                    this.f2686c.addPath(((azq) this.f2687d.get(i3)).mo2933e());
                }
            } else if (i2 == 1) {
                m2526a(Path.Op.UNION);
            } else if (i2 == 2) {
                m2526a(Path.Op.REVERSE_DIFFERENCE);
            } else if (i2 == 3) {
                m2526a(Path.Op.INTERSECT);
            } else if (i2 == 4) {
                m2526a(Path.Op.XOR);
            }
            return this.f2686c;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo2927a(List list, List list2) {
        for (int i = 0; i < this.f2687d.size(); i++) {
            ((azq) this.f2687d.get(i)).mo2927a(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0007  */
    /* renamed from: a */
    public final void mo2934a(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
            while (listIterator.hasPrevious()) {
                while (listIterator.hasPrevious()) {
                }
            }
        }
        while (listIterator.hasPrevious()) {
            azg azg = (azg) listIterator.previous();
            if (azg instanceof azq) {
                this.f2687d.add((azq) azg);
                listIterator.remove();
            }
        }
    }
}
