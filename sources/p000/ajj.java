package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: ajj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ajk f645a;

    public ajj(ajk ajk) {
        this.f645a = ajk;
    }

    public final void run() {
        int i;
        View view;
        ajk ajk = this.f645a;
        int i2 = ajk.f647b.f26940h;
        int i3 = ajk.f646a;
        if (i3 != 3) {
            view = ajk.f648c.mo1910a(5);
            i = ajk.f648c.getWidth() - i2;
        } else {
            view = ajk.f648c.mo1910a(3);
            i = (view != null ? -view.getWidth() : 0) + i2;
        }
        if (view == null) {
            return;
        }
        if (((i3 == 3 && view.getLeft() < i) || (i3 != 3 && view.getLeft() > i)) && ajk.f648c.mo1908a(view) == 0) {
            ajk.f647b.mo15830a(view, i, view.getTop());
            ((ajh) view.getLayoutParams()).f643c = true;
            ajk.f648c.invalidate();
            ajk.mo830e();
            DrawerLayout drawerLayout = ajk.f648c;
            if (!drawerLayout.f1515e) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                int childCount = drawerLayout.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    drawerLayout.getChildAt(i4).dispatchTouchEvent(obtain);
                }
                obtain.recycle();
                drawerLayout.f1515e = true;
            }
        }
    }
}
