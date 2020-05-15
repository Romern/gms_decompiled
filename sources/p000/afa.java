package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* renamed from: afa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class afa implements Icon.OnDrawableLoadedListener {

    /* renamed from: a */
    final /* synthetic */ afe f357a;

    public afa(afe afe) {
        this.f357a = afe;
    }

    public final void onDrawableLoaded(Drawable drawable) {
        if (drawable != null) {
            afe afe = this.f357a;
            afe.f383g = drawable;
            afe.mo564a();
        }
    }
}
