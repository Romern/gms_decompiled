package p000;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: bkjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkjg implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final ViewGroup f124375a;

    /* renamed from: b */
    private final bmot f124376b;

    public bkjg(ViewGroup viewGroup, bmot bmot) {
        this.f124375a = viewGroup;
        this.f124376b = bmot;
    }

    public final void onGlobalLayout() {
        if ((this.f124375a.getMeasuredWidth() - C1280ps.m19925i(this.f124375a)) - C1280ps.m19927j(this.f124375a) > 0) {
            int size = this.f124376b.f130260d.size();
            int childCount = this.f124375a.getChildCount();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                int measuredWidth = this.f124375a.getChildAt(i4).getMeasuredWidth();
                if (i2 >= this.f124376b.f130260d.size() || i4 != (this.f124376b.f130260d.mo74151b(i2) - this.f124376b.f130257a) + i2) {
                    i += measuredWidth;
                } else {
                    i3 += measuredWidth;
                    i2++;
                }
            }
            if (i > 0) {
                if (i3 <= 0) {
                    for (int i5 = 0; i5 < size; i5++) {
                        this.f124375a.removeViewAt(this.f124376b.f130260d.mo74151b(i5) - this.f124376b.f130257a);
                    }
                }
                this.f124375a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }
}
