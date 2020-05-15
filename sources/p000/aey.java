package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* renamed from: aey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aey implements Icon.OnDrawableLoadedListener {

    /* renamed from: a */
    final /* synthetic */ afe f355a;

    public aey(afe afe) {
        this.f355a = afe;
    }

    public final void onDrawableLoaded(Drawable drawable) {
        if (drawable != null) {
            afe afe = this.f355a;
            afe.f381e = drawable;
            afe.f381e.mutate();
            this.f355a.mo564a();
        }
    }
}
