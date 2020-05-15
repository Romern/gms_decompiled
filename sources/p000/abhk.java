package p000;

import android.webkit.WebView;

/* renamed from: abhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abhk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WebView f57481a;

    /* renamed from: b */
    final /* synthetic */ abhl f57482b;

    public abhk(abhl abhl, WebView webView) {
        this.f57482b = abhl;
        this.f57481a = webView;
    }

    public final void run() {
        int contentHeight = this.f57481a.getContentHeight();
        if (contentHeight != 0) {
            this.f57481a.scrollTo(0, (int) (((float) contentHeight) * this.f57482b.f57484b.f56429d));
            this.f57482b.f57484b.f56429d = 0.0f;
            return;
        }
        this.f57481a.postDelayed(this, 10);
    }
}
