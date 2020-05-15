package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* renamed from: aex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aex implements Icon.OnDrawableLoadedListener {

    /* renamed from: a */
    final /* synthetic */ afe f354a;

    public aex(afe afe) {
        this.f354a = afe;
    }

    public final void onDrawableLoaded(Drawable drawable) {
        if (drawable != null) {
            afe afe = this.f354a;
            afe.f380d = drawable;
            afe.f380d.mutate();
            this.f354a.mo564a();
        }
    }
}
