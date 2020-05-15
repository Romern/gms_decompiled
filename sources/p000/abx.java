package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.widget.Scroller;

/* renamed from: abx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abx {

    /* renamed from: a */
    public RecyclerView f133a;

    /* renamed from: b */
    public Scroller f134b;

    /* renamed from: c */
    public final abz f135c;

    /* renamed from: d */
    private aaw f136d;

    /* renamed from: e */
    private aaw f137e;

    public abx() {
    }

    /* renamed from: a */
    private static int m370a(View view, aaw aaw) {
        return (aaw.mo125d(view) + (aaw.mo118a(view) / 2)) - (aaw.mo122c() + (aaw.mo124d() / 2));
    }

    /* renamed from: b */
    public final aaw mo265b(abu abu) {
        aaw aaw = this.f136d;
        if (aaw == null || aaw.f87a != abu) {
            this.f136d = aaw.m168b(abu);
        }
        return this.f136d;
    }

    /* renamed from: c */
    public final aaw mo266c(abu abu) {
        aaw aaw = this.f137e;
        if (aaw == null || aaw.f87a != abu) {
            this.f137e = aaw.m167a(abu);
        }
        return this.f137e;
    }

    /* renamed from: a */
    private static View m371a(abu abu, aaw aaw) {
        int u = abu.mo250u();
        View view = null;
        if (u != 0) {
            int c = aaw.mo122c() + (aaw.mo124d() / 2);
            int i = Integer.MAX_VALUE;
            int i2 = 0;
            while (i2 < u) {
                View i3 = abu.mo245i(i2);
                int abs = Math.abs((aaw.mo125d(i3) + (aaw.mo118a(i3) / 2)) - c);
                int i4 = abs < i ? abs : i;
                if (abs < i) {
                    view = i3;
                }
                i2++;
                i = i4;
            }
        }
        return view;
    }

    public abx(byte[] bArr) {
        this.f135c = new adh(this);
    }

    /* renamed from: a */
    public final int mo261a(abu abu, aaw aaw, int i, int i2) {
        int max;
        this.f134b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f134b.getFinalX(), this.f134b.getFinalY()};
        int u = abu.mo250u();
        float f = 1.0f;
        if (u != 0) {
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            View view = null;
            View view2 = null;
            for (int i5 = 0; i5 < u; i5++) {
                View i6 = abu.mo245i(i5);
                int i7 = abu.m288i(i6);
                if (i7 != -1) {
                    int i8 = i7 < i3 ? i7 : i3;
                    if (i7 < i3) {
                        view = i6;
                    }
                    if (i7 > i4) {
                        view2 = i6;
                        i4 = i7;
                    }
                    i3 = i8;
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(aaw.mo123c(view), aaw.mo123c(view2)) - Math.min(aaw.mo125d(view), aaw.mo125d(view2))) == 0)) {
                f = ((float) max) / ((float) ((i4 - i3) + 1));
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(iArr[0]) <= Math.abs(iArr[1]) ? iArr[1] : iArr[0])) / f);
    }

    /* renamed from: a */
    public final View mo262a(abu abu) {
        if (abu.mo78k()) {
            return m371a(abu, mo265b(abu));
        }
        if (abu.mo77j()) {
            return m371a(abu, mo266c(abu));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo263a() {
        abu layoutManager;
        View a;
        RecyclerView recyclerView = this.f133a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (a = mo262a(layoutManager)) != null) {
            int[] a2 = mo264a(layoutManager, a);
            int i = a2[0];
            if (i != 0 || a2[1] != 0) {
                this.f133a.smoothScrollBy(i, a2[1]);
            }
        }
    }

    /* renamed from: a */
    public final int[] mo264a(abu abu, View view) {
        int[] iArr = new int[2];
        if (abu.mo77j()) {
            iArr[0] = m370a(view, mo266c(abu));
        } else {
            iArr[0] = 0;
        }
        if (abu.mo78k()) {
            iArr[1] = m370a(view, mo265b(abu));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
