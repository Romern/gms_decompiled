package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: bjbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbf extends abh {

    /* renamed from: a */
    public final abh f122465a;

    /* renamed from: d */
    public View f122466d;

    /* renamed from: e */
    private final abj f122467e;

    public bjbf(abh abh) {
        bjbe bjbe = new bjbe(this);
        this.f122467e = bjbe;
        this.f122465a = abh;
        abh.mo166a(bjbe);
        mo170a(this.f122465a.f103b);
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        if (this.f122466d != null) {
            i--;
        }
        if (i >= 0) {
            return this.f122465a.mo157L(i);
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: a */
    public final int mo161a() {
        int a = this.f122465a.mo161a();
        return this.f122466d != null ? a + 1 : a;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        if (this.f122466d != null) {
            i--;
        }
        if (i >= 0) {
            return this.f122465a.mo162a(i);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        if (i != Integer.MAX_VALUE) {
            return this.f122465a.mo163a(viewGroup, i);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new bjbg(frameLayout);
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        View view = this.f122466d;
        if (view != null) {
            i--;
        }
        if (!(acm instanceof bjbg)) {
            this.f122465a.mo168a(acm, i);
        } else if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.f122466d.getParent()).removeView(this.f122466d);
            }
            ((FrameLayout) acm.f201a).addView(this.f122466d);
        } else {
            throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
        }
    }
}
