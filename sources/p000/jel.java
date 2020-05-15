package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: jel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jel implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f22287a;

    public jel(View view) {
        this.f22287a = view;
    }

    public final boolean onPreDraw() {
        View view = this.f22287a;
        view.setSystemUiVisibility(view.getSystemUiVisibility() & -5635);
        return true;
    }
}
