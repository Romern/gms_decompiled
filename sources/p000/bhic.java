package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: bhic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhic {
    /* renamed from: a */
    public static PorterDuffColorFilter m100928a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
