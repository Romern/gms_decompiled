package p000;

import android.support.p002v7.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: zv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1553zv {

    /* renamed from: a */
    int f27802a;

    /* renamed from: b */
    int f27803b;

    /* renamed from: c */
    int[] f27804c;

    /* renamed from: d */
    int f27805d;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16643a() {
        int[] iArr = this.f27804c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f27805d = 0;
    }

    /* renamed from: a */
    public final void mo16644a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 >= 0) {
            int i3 = this.f27805d;
            int i4 = i3 + i3;
            int[] iArr = this.f27804c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f27804c = iArr2;
                Arrays.fill(iArr2, -1);
            } else {
                int length = iArr.length;
                if (i4 >= length) {
                    int[] iArr3 = new int[(i4 + i4)];
                    this.f27804c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, length);
                }
            }
            int[] iArr4 = this.f27804c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.f27805d++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16645a(RecyclerView recyclerView, boolean z) {
        this.f27805d = 0;
        int[] iArr = this.f27804c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        abu abu = recyclerView.mLayout;
        if (recyclerView.mAdapter != null && abu != null && abu.f127y) {
            if (z) {
                if (!recyclerView.mAdapterHelper.mo16490d()) {
                    abu.mo54a(recyclerView.mAdapter.mo161a(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                abu.mo53a(this.f27802a, this.f27803b, recyclerView.mState, this);
            }
            int i = this.f27805d;
            if (i > abu.f128z) {
                abu.f128z = i;
                abu.f112A = z;
                recyclerView.mRecycler.mo283b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo16646a(int i) {
        if (this.f27804c != null) {
            int i2 = this.f27805d;
            int i3 = i2 + i2;
            for (int i4 = 0; i4 < i3; i4 += 2) {
                if (this.f27804c[i4] == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
