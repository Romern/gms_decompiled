package p000;

import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* renamed from: etw */
public final /* synthetic */ class etw implements Runnable {

    /* renamed from: a */
    private final FrameLayout f15691a;

    /* renamed from: b */
    private final LinearLayout.LayoutParams f15692b;

    public etw(FrameLayout frameLayout, LinearLayout.LayoutParams layoutParams) {
        this.f15691a = frameLayout;
        this.f15692b = layoutParams;
    }

    public final void run() {
        this.f15691a.setLayoutParams(this.f15692b);
    }
}
