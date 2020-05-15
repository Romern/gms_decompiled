package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aeti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeti {

    /* renamed from: a */
    public static int f63770a;

    /* renamed from: b */
    public static Bitmap f63771b;

    /* renamed from: c */
    public static Paint f63772c;

    /* renamed from: d */
    private static boolean f63773d;

    /* renamed from: a */
    public static Bitmap m52533a(Context context) {
        m52534b(context);
        return f63771b;
    }

    /* renamed from: b */
    public static void m52534b(Context context) {
        if (!f63773d) {
            f63773d = true;
            Resources resources = context.getApplicationContext().getResources();
            Paint paint = new Paint();
            f63772c = paint;
            paint.setFilterBitmap(true);
            Paint paint2 = f63772c;
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.99f);
            paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            f63770a = resources.getDimensionPixelSize(C0126R.dimen.location_sharing_avatar_dimension);
            f63771b = suj.m36368a(context, suj.m36369a(((BitmapDrawable) resources.getDrawable(C0126R.C0127drawable.product_logo_avatar_square_blue_color_48)).getBitmap(), f63770a), f63772c);
        }
    }
}
