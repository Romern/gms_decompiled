package p000;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: bdeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdeg implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ Drawable f105406a;

    /* renamed from: b */
    final /* synthetic */ bdeh f105407b;

    public bdeg(bdeh bdeh, Drawable drawable) {
        this.f105407b = bdeh;
        this.f105406a = drawable;
    }

    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        this.f105407b.mo57940b(this.f105406a);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
