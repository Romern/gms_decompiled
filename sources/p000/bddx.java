package p000;

import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: bddx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bddx {
    /* renamed from: a */
    public static int m90628a(ImageView imageView) {
        int i;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null || layoutParams.width <= 0) {
            i = imageView.getWidth();
        } else {
            i = layoutParams.width;
        }
        int paddingLeft = i - (imageView.getPaddingLeft() + imageView.getPaddingRight());
        if (paddingLeft >= 0) {
            return paddingLeft;
        }
        return 0;
    }
}
