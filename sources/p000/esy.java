package p000;

import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* renamed from: esy */
final /* synthetic */ class esy implements Runnable {

    /* renamed from: a */
    private final esz f15657a;

    /* renamed from: b */
    private final HorizontalScrollView f15658b;

    /* renamed from: c */
    private final LinearLayout f15659c;

    public esy(esz esz, HorizontalScrollView horizontalScrollView, LinearLayout linearLayout) {
        this.f15657a = esz;
        this.f15658b = horizontalScrollView;
        this.f15659c = linearLayout;
    }

    public final void run() {
        esz esz = this.f15657a;
        HorizontalScrollView horizontalScrollView = this.f15658b;
        LinearLayout linearLayout = this.f15659c;
        if (evi.m11187a(esz.f15662c.f15672e)) {
            horizontalScrollView.scrollTo(linearLayout.getWidth(), 0);
        } else {
            horizontalScrollView.scrollTo(0, 0);
        }
    }
}
