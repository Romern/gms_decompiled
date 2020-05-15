package p000;

import android.os.Build;
import android.widget.FrameLayout;

/* renamed from: aoab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aoab {

    /* renamed from: a */
    public final boolean f77971a;

    /* renamed from: b */
    public final int f77972b;

    /* renamed from: c */
    public final int f77973c;

    /* renamed from: d */
    public final int f77974d;

    /* renamed from: e */
    public final int f77975e;

    /* renamed from: f */
    public final int f77976f;

    public aoab(aoac aoac, FrameLayout frameLayout) {
        frameLayout.measure(0, 0);
        int[] iArr = new int[2];
        aoac.f77944b.getLocationOnScreen(iArr);
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int measuredHeight = (aoac.f77944b.getMeasuredHeight() + i2) - aoac.f77944b.getPaddingBottom();
        int measuredHeight2 = frameLayout.getMeasuredHeight();
        int i3 = Build.VERSION.SDK_INT;
        this.f77971a = (measuredHeight2 + measuredHeight) + 48 <= aoac.f77991l.getHeight() ? false : z;
        int measuredWidth = frameLayout.getMeasuredWidth() + i;
        int width = aoac.f77991l.getWidth();
        int measuredWidth2 = (frameLayout.getMeasuredWidth() / 2) + i + (aoac.f77944b.getMeasuredWidth() / 2);
        int width2 = aoac.f77991l.getWidth();
        int measuredWidth3 = (aoac.f77944b.getMeasuredWidth() / 2) - (aoac.f77994o.getDrawable().getIntrinsicWidth() / 2);
        if (measuredWidth < width) {
            if (this.f77971a) {
                this.f77974d = 80;
            } else {
                this.f77974d = 48;
            }
            this.f77972b = measuredWidth3;
            this.f77973c = 0;
        } else {
            boolean z2 = this.f77971a;
            if (measuredWidth2 >= width2) {
                this.f77974d = z2 ? 85 : 53;
                this.f77972b = 0;
                this.f77973c = measuredWidth3;
            } else {
                this.f77974d = z2 ? 81 : 49;
                this.f77972b = 0;
                this.f77973c = 0;
            }
        }
        if (measuredWidth < width) {
            this.f77975e = i;
        } else if (measuredWidth2 < width2) {
            this.f77975e = (i - (frameLayout.getMeasuredWidth() / 2)) + (aoac.f77944b.getMeasuredWidth() / 2);
        } else {
            this.f77975e = (i - frameLayout.getMeasuredWidth()) + aoac.f77944b.getMeasuredWidth();
        }
        this.f77976f = this.f77971a ? (i2 - frameLayout.getMeasuredHeight()) - aoac.f77944b.getPaddingTop() : measuredHeight;
    }
}
