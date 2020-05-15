package p000;

import android.view.View;
import java.util.Set;

/* renamed from: euo */
final /* synthetic */ class euo implements Runnable {

    /* renamed from: a */
    private final eup f15767a;

    /* renamed from: b */
    private final int f15768b;

    /* renamed from: c */
    private final int f15769c;

    /* renamed from: d */
    private final int f15770d;

    /* renamed from: e */
    private final Set f15771e;

    public euo(eup eup, int i, int i2, int i3, Set set) {
        this.f15767a = eup;
        this.f15768b = i;
        this.f15769c = i2;
        this.f15770d = i3;
        this.f15771e = set;
    }

    public final void run() {
        eup eup = this.f15767a;
        int i = this.f15768b;
        int i2 = this.f15769c;
        int i3 = this.f15770d;
        Set set = this.f15771e;
        eup.f15775d.f15776s.setPadding(i, 0, i, 0);
        euz.m11157a(eup.f15775d.f15776s, i2, i3);
        if (set.size() == 1) {
            euq.m11145a((View) set.iterator().next(), Math.min(i2 - (i + i), i3));
        }
        if (evi.m11187a(eup.f15775d.f15779v.f15937i)) {
            euq euq = eup.f15775d;
            euq.f15776s.scrollTo(euq.f15777t.getWidth(), 0);
            return;
        }
        eup.f15775d.f15776s.scrollTo(0, 0);
    }
}
