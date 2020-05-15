package p000;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: bjau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjau {
    /* renamed from: a */
    public static InsetDrawable m103127a(Drawable drawable, int i, int i2, View view) {
        int i3 = Build.VERSION.SDK_INT;
        boolean z = true;
        if (view.getLayoutDirection() != 1) {
            z = false;
        }
        return m103128a(drawable, i, i2, z);
    }

    /* renamed from: a */
    public static InsetDrawable m103128a(Drawable drawable, int i, int i2, boolean z) {
        if (!z) {
            return new InsetDrawable(drawable, i, 0, i2, 0);
        }
        return new InsetDrawable(drawable, i2, 0, i, 0);
    }
}
