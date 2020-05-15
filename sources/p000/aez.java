package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* renamed from: aez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aez implements Icon.OnDrawableLoadedListener {

    /* renamed from: a */
    final /* synthetic */ afe f356a;

    public aez(afe afe) {
        this.f356a = afe;
    }

    public final void onDrawableLoaded(Drawable drawable) {
        if (drawable != null) {
            afe afe = this.f356a;
            afe.f382f = drawable;
            afe.mo564a();
        }
    }
}
