package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: bdnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdnv implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ bdnw f106096a;

    /* renamed from: b */
    private View f106097b;

    public bdnv(bdnw bdnw, View view) {
        this.f106096a = bdnw;
        this.f106097b = view;
    }

    public final boolean onPreDraw() {
        try {
            if (this.f106097b != null) {
                bdnw bdnw = this.f106096a;
                bdnw.f106098a.unregisterActivityLifecycleCallbacks(bdnw);
                this.f106097b.getViewTreeObserver().removeOnPreDrawListener(this);
                beel.m91852a(new bdnu(this));
            }
            return true;
        } catch (RuntimeException e) {
            bdny bdny = bdny.f106105a;
            return true;
        } finally {
            this.f106097b = null;
        }
    }
}
