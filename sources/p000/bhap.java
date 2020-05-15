package p000;

import android.widget.ScrollView;

/* renamed from: bhap */
public final /* synthetic */ class bhap implements Runnable {

    /* renamed from: a */
    private final ScrollView f118203a;

    public bhap(ScrollView scrollView) {
        this.f118203a = scrollView;
    }

    public final void run() {
        this.f118203a.fullScroll(130);
    }
}
