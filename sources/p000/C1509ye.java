package p000;

import android.os.Build;
import android.support.p002v7.widget.AppCompatSpinner;
import android.view.ViewTreeObserver;

/* renamed from: ye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1509ye implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ AppCompatSpinner f27639a;

    public C1509ye(AppCompatSpinner appCompatSpinner) {
        this.f27639a = appCompatSpinner;
    }

    public final void onGlobalLayout() {
        if (!this.f27639a.f1189b.mo16546e()) {
            this.f27639a.mo1355a();
        }
        ViewTreeObserver viewTreeObserver = this.f27639a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            int i = Build.VERSION.SDK_INT;
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
