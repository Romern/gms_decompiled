package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: bkjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkjh implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final ViewGroup f124377a;

    public bkjh(ViewGroup viewGroup) {
        this.f124377a = viewGroup;
    }

    public final void onGlobalLayout() {
        int measuredWidth = (this.f124377a.getMeasuredWidth() - C1280ps.m19925i(this.f124377a)) - C1280ps.m19927j(this.f124377a);
        if (measuredWidth > 0) {
            int childCount = this.f124377a.getChildCount();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < childCount) {
                View childAt = this.f124377a.getChildAt(i);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                if ((childAt instanceof ImageWithCaptionView) && marginLayoutParams.height > 0) {
                    i2 += childAt.getMeasuredWidth();
                    i3 += C1260oz.m19820a(marginLayoutParams) + C1260oz.m19822b(marginLayoutParams);
                    i++;
                } else {
                    return;
                }
            }
            if (i2 > 0) {
                int i4 = measuredWidth - i3;
                if (i2 >= i4) {
                    float f = 0.0f;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) this.f124377a.getChildAt(i5);
                        Drawable drawable = imageWithCaptionView.getDrawable();
                        f += (((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight())) * ((float) imageWithCaptionView.getLayoutParams().height);
                    }
                    float f2 = ((float) i4) / f;
                    for (int i6 = 0; i6 < childCount; i6++) {
                        ImageWithCaptionView imageWithCaptionView2 = (ImageWithCaptionView) this.f124377a.getChildAt(i6);
                        ViewGroup.LayoutParams layoutParams = imageWithCaptionView2.getLayoutParams();
                        layoutParams.height = (int) (((float) layoutParams.height) * f2);
                        imageWithCaptionView2.setLayoutParams(layoutParams);
                    }
                    this.f124377a.requestLayout();
                }
                this.f124377a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }
}
