package p000;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: bizu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bizu extends LayerDrawable {
    public bizu(Drawable[] drawableArr) {
        super(drawableArr);
    }

    public final boolean getPadding(Rect rect) {
        if (super.getPadding(rect)) {
            return (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0) ? false : true;
        }
        return false;
    }
}
