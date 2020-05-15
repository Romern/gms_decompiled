package p000;

import android.widget.PopupWindow;

/* renamed from: anzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anzt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aoac f77964a;

    public anzt(aoac aoac) {
        this.f77964a = aoac;
    }

    public final void run() {
        PopupWindow popupWindow;
        aoac aoac = this.f77964a;
        if (aoac.f77993n && (popupWindow = aoac.f77992m) != null) {
            popupWindow.dismiss();
            this.f77964a.f77992m = null;
        }
    }
}
