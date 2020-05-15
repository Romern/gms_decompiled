package p000;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;

/* renamed from: bkeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkeu implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ bkev f124102a;

    public bkeu(bkev bkev) {
        this.f124102a = bkev;
    }

    public final void onGlobalLayout() {
        if (this.f124102a.f124104b.getHeight() != 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f124102a.f124105c.getLayoutParams();
            layoutParams.setMargins(0, (this.f124102a.f124104b.getTop() + this.f124102a.f124104b.getHeight()) - this.f124102a.f124105c.getHeight(), 0, 0);
            this.f124102a.f124105c.setLayoutParams(layoutParams);
            this.f124102a.f124105c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }
}
