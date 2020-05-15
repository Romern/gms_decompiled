package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* renamed from: afb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afb implements Icon.OnDrawableLoadedListener {

    /* renamed from: a */
    final /* synthetic */ afe f358a;

    public afb(afe afe) {
        this.f358a = afe;
    }

    public final void onDrawableLoaded(Drawable drawable) {
        if (drawable != null) {
            afe afe = this.f358a;
            afe.f384h = drawable;
            afe.mo564a();
        }
    }
}
