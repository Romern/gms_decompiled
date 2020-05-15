package p000;

import android.util.SparseArray;
import android.view.View;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bjcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjcf {

    /* renamed from: a */
    public final int f122517a;

    /* renamed from: b */
    final SparseArray f122518b = new SparseArray();

    /* renamed from: c */
    final List f122519c = new ArrayList();

    /* renamed from: d */
    final /* synthetic */ SpannedGridLayoutManager f122520d;

    /* renamed from: e */
    private final int[] f122521e = new int[this.f122520d.f151570b.f122497a];

    /* renamed from: f */
    private final acc f122522f;

    public bjcf(SpannedGridLayoutManager spannedGridLayoutManager, acc acc, int i) {
        this.f122520d = spannedGridLayoutManager;
        this.f122522f = acc;
        this.f122517a = i;
    }

    /* renamed from: a */
    private final void m103182a() {
        bjcg bjcg;
        int i;
        int size = this.f122519c.size();
        int size2 = this.f122518b.size();
        m103183a(size, size2);
        int i2 = size2;
        int i3 = 0;
        while (i2 < this.f122517a) {
            int a = this.f122522f.mo276a(i2);
            int i4 = 1;
            if (a == -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f122520d.mo250u()) {
                        bjcg = bjcg.f122523c;
                        break;
                    }
                    View i6 = this.f122520d.mo245i(i5);
                    if (i2 == abu.m288i(i6)) {
                        bjcc bjcc = (bjcc) i6.getLayoutParams();
                        bjcg = new bjcg(bjcc.f122504a, bjcc.f122505b);
                        break;
                    }
                    i5++;
                }
            } else {
                bwig a2 = this.f122520d.f151582n.f95762a.mo53007a(a);
                int a3 = axck.m82310a(a2);
                int i7 = a2.f159634h;
                if (i7 == 0) {
                    i7 = 1;
                }
                bjcg = new bjcg(a3, i7);
            }
            int i8 = bjcg.f122524a;
            int i9 = this.f122520d.f151570b.f122497a;
            if (i8 > i9) {
                bjcg.f122524a = i9;
                i8 = i9;
            }
            if (i8 + i3 > i9) {
                size++;
                m103183a(size, size2);
                i3 = 0;
            }
            while (this.f122521e[i] > size) {
                i++;
                if (bjcg.f122524a + i > this.f122520d.f151570b.f122497a) {
                    size++;
                    m103183a(size, size2);
                    i = 0;
                }
            }
            this.f122518b.put(i2, new bjcb(size, bjcg.f122525b, i, bjcg.f122524a));
            int i10 = bjcg.f122525b + size;
            for (int i11 = 0; i11 < bjcg.f122524a; i11++) {
                this.f122521e[i + i11] = i10;
            }
            if (bjcg.f122525b > 1) {
                for (int i12 = 1; i12 < bjcg.f122525b; i12++) {
                    m103183a(size + i12, size2);
                }
            }
            i3 = i + bjcg.f122524a;
            i2++;
            int i13 = this.f122521e[0];
            while (true) {
                if (i4 >= this.f122520d.f151570b.f122497a) {
                    return;
                }
                if (i13 == this.f122521e[i4]) {
                    i4++;
                }
            }
        }
    }

    /* renamed from: g */
    private final void m103184g(int i) {
        while (i >= this.f122519c.size() && this.f122518b.size() < this.f122517a) {
            m103182a();
        }
    }

    /* renamed from: b */
    public final int mo64990b(int i) {
        if (i < this.f122517a) {
            return mo64989a(i).f122500a;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo64991c(int i) {
        if (i >= this.f122519c.size()) {
            m103184g(i);
        }
        return i >= 0 && i < this.f122519c.size();
    }

    /* renamed from: d */
    public final int mo64992d(int i) {
        if (i >= this.f122519c.size()) {
            m103184g(i);
        }
        return ((Integer) this.f122519c.get(i)).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo64993e(int i) {
        int d = mo64992d(i);
        while (true) {
            i++;
            if (!mo64991c(i) || mo64992d(i) != d) {
                return i;
            }
        }
        return i;
    }

    /* renamed from: f */
    public final int mo64994f(int i) {
        int e = mo64993e(i);
        return (mo64991c(e) ? mo64992d(e) : this.f122517a) - 1;
    }

    /* renamed from: a */
    private final void m103183a(int i, int i2) {
        if (this.f122519c.size() < i + 1) {
            this.f122519c.add(Integer.valueOf(i2));
        }
    }

    /* renamed from: a */
    public final bjcb mo64989a(int i) {
        if (i < this.f122517a) {
            if (i >= this.f122518b.size()) {
                while (i >= this.f122518b.size()) {
                    m103182a();
                }
            }
            return (bjcb) this.f122518b.get(i);
        }
        throw new IndexOutOfBoundsException(String.format(Locale.US, "index: %d out of range.", Integer.valueOf(i)));
    }
}
