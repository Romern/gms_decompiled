package p000;

import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.google.android.chimera.WebView;

/* renamed from: abhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abhq implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ WebSettings f57506a;

    /* renamed from: b */
    final /* synthetic */ WebView f57507b;

    public abhq(WebSettings webSettings, WebView webView) {
        this.f57506a = webSettings;
        this.f57507b = webView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() <= 1) {
            return false;
        }
        this.f57506a.setSupportZoom(true);
        this.f57507b.getParent().requestDisallowInterceptTouchEvent(true);
        this.f57506a.setBuiltInZoomControls(true);
        return false;
    }
}
