package p000;

import android.view.ViewTreeObserver;

/* renamed from: bhip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhip implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ bhiv f118733a;

    public bhip(bhiv bhiv) {
        this.f118733a = bhiv;
    }

    public final boolean onPreDraw() {
        bhiv bhiv = this.f118733a;
        float rotation = bhiv.f118749B.getRotation();
        if (bhiv.f118773r == rotation) {
            return true;
        }
        bhiv.f118773r = rotation;
        bhiv.mo63840j();
        return true;
    }
}
