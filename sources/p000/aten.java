package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: aten */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aten {
    /* renamed from: a */
    public static Bitmap m75739a(Bitmap bitmap) {
        int i = Build.VERSION.SDK_INT;
        return bitmap.getConfig() != Bitmap.Config.HARDWARE ? bitmap.copy(Bitmap.Config.HARDWARE, false) : bitmap;
    }

    /* renamed from: a */
    public static Bitmap m75740a(Drawable drawable, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        return m75739a(createBitmap);
    }

    /* renamed from: a */
    public static void m75741a() {
        int i = Build.VERSION.SDK_INT;
    }
}
