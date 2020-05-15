package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;

/* renamed from: kad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kad implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ kae f23648a;

    public kad(kae kae) {
        this.f23648a = kae;
    }

    public final void onGlobalLayout() {
        boolean z;
        int i;
        kae kae = this.f23648a;
        Rect rect = new Rect();
        kae.f23649a.getWindowVisibleDisplayFrame(rect);
        if (rect.width() != kae.f23651c) {
            kae.f23651c = rect.width();
            z = true;
        } else {
            z = false;
        }
        if (rect.height() != kae.f23652d) {
            kae.f23652d = rect.height();
        } else if (!z) {
            return;
        }
        for (jyy jyy : kae.f23650b) {
            int i2 = kae.f23651c;
            int i3 = kae.f23652d;
            MinuteMaidChimeraActivity.f11545a.mo25412b(String.format("onSizeChanged %d %d", Integer.valueOf(i2), Integer.valueOf(i3)), new Object[0]);
            int identifier = jyy.f23554a.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = jyy.f23554a.getResources().getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            View findViewById = jyy.f23554a.findViewById(16908290);
            findViewById.getLayoutParams().height = i3 + i;
            findViewById.requestLayout();
        }
    }
}
