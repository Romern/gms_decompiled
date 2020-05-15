package p000;

import android.util.Log;
import android.widget.ScrollView;
import com.google.android.setupdesign.view.BottomScrollView;

/* renamed from: bjat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjat implements bjar {

    /* renamed from: a */
    public final bjas f122444a;

    /* renamed from: b */
    private final BottomScrollView f122445b;

    public bjat(bjas bjas, ScrollView scrollView) {
        this.f122444a = bjas;
        if (scrollView instanceof BottomScrollView) {
            this.f122445b = (BottomScrollView) scrollView;
            return;
        }
        String valueOf = String.valueOf(scrollView);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Cannot set non-BottomScrollView. Found=");
        sb.append(valueOf);
        Log.w("ScrollViewDelegate", sb.toString());
        this.f122445b = null;
    }

    /* renamed from: a */
    public final void mo64943a() {
        BottomScrollView bottomScrollView = this.f122445b;
        if (bottomScrollView == null) {
            Log.w("ScrollViewDelegate", "Cannot require scroll. Scroll view is null.");
        } else {
            bottomScrollView.f151514a = this;
        }
    }

    /* renamed from: b */
    public final void mo64944b() {
        BottomScrollView bottomScrollView = this.f122445b;
        if (bottomScrollView != null) {
            bottomScrollView.pageScroll(130);
        }
    }
}
