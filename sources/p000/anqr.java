package p000;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: anqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anqr implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ anqt f77462a;

    public anqr(anqt anqt) {
        this.f77462a = anqt;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 66 || !this.f77462a.f77469d.isClickable()) {
            return false;
        }
        this.f77462a.f77469d.performClick();
        return true;
    }
}
