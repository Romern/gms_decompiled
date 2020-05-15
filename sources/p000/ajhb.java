package p000;

import android.view.ViewTreeObserver;

/* renamed from: ajhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajhb implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ ajhe f70611a;

    public ajhb(ajhe ajhe) {
        this.f70611a = ajhe;
    }

    public final boolean onPreDraw() {
        this.f70611a.f70617e.getViewTreeObserver().removeOnPreDrawListener(this);
        try {
            this.f70611a.startPostponedEnterTransition();
            return true;
        } catch (NullPointerException e) {
            return true;
        }
    }
}
