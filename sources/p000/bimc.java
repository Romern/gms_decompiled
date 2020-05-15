package p000;

import android.widget.FrameLayout;

/* renamed from: bimc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bimc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bime f120882a;

    public bimc(bime bime) {
        this.f120882a = bime;
    }

    public final void run() {
        bime bime = this.f120882a;
        bimy bimy = bime.f120885a;
        int b = bime.f120887c.mo71328b(binq.f121027b);
        bimo bimo = (bimo) bimy.f120938e;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bimo.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, b);
        bimo.requestLayout();
    }
}
