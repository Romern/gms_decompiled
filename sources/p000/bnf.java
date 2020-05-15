package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: bnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnf extends abh {

    /* renamed from: a */
    public View f5186a;

    /* renamed from: d */
    private final abh f5187d;

    /* renamed from: e */
    private final abj f5188e;

    public bnf(abh abh) {
        bne bne = new bne(this);
        this.f5188e = bne;
        this.f5187d = abh;
        abh.mo166a(bne);
        mo170a(this.f5187d.f103b);
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        if (this.f5186a != null) {
            i--;
        }
        if (i >= 0) {
            return this.f5187d.mo157L(i);
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: a */
    public final int mo161a() {
        int a = this.f5187d.mo161a();
        return this.f5186a != null ? a + 1 : a;
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        if (this.f5186a != null) {
            i--;
        }
        if (i >= 0) {
            return this.f5187d.mo162a(i);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final acm mo163a(ViewGroup viewGroup, int i) {
        if (i != Integer.MAX_VALUE) {
            return this.f5187d.mo163a(viewGroup, i);
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new bng(frameLayout);
    }

    /* renamed from: a */
    public final void mo168a(acm acm, int i) {
        View view = this.f5186a;
        if (view != null) {
            i--;
        }
        if (!(acm instanceof bng)) {
            this.f5187d.mo168a(acm, i);
        } else if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.f5186a.getParent()).removeView(this.f5186a);
            }
            ((FrameLayout) acm.f201a).addView(this.f5186a);
        } else {
            throw new IllegalStateException("HeaderViewHolder cannot find mHeader");
        }
    }
}
