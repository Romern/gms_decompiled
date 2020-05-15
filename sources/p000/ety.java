package p000;

import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

/* renamed from: ety */
final /* synthetic */ class ety implements Runnable {

    /* renamed from: a */
    private final etz f15694a;

    /* renamed from: b */
    private final HorizontalScrollView f15695b;

    /* renamed from: c */
    private final LinearLayout f15696c;

    public ety(etz etz, HorizontalScrollView horizontalScrollView, LinearLayout linearLayout) {
        this.f15694a = etz;
        this.f15695b = horizontalScrollView;
        this.f15696c = linearLayout;
    }

    public final void run() {
        etz etz = this.f15694a;
        HorizontalScrollView horizontalScrollView = this.f15695b;
        LinearLayout linearLayout = this.f15696c;
        if (evi.m11187a(etz.f15699c.f15672e)) {
            horizontalScrollView.scrollTo(linearLayout.getWidth(), 0);
        } else {
            horizontalScrollView.scrollTo(0, 0);
        }
    }
}
