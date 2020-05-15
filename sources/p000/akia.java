package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.io.IOException;

/* renamed from: akia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akia {
    /* renamed from: a */
    public static Bitmap m59777a(Context context, Uri uri) {
        if (uri.toString().startsWith("file")) {
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path)) {
                return BitmapFactory.decodeFile(path);
            }
            return null;
        } else if (!uri.toString().startsWith("content")) {
            return null;
        } else {
            try {
                return MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("akia", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Failed to get bitmap from %s", uri);
                return null;
            }
        }
    }

    /* renamed from: b */
    public static Bitmap m59783b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        int width = drawable.getBounds().width();
        int i = 1;
        if (width <= 0 && (width = drawable.getIntrinsicWidth()) <= 0) {
            width = 1;
        }
        int height = drawable.getBounds().height();
        if (height <= 0) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > 0) {
                i = intrinsicHeight;
            }
        } else {
            i = height;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m59778a(Activity activity) {
        try {
            View rootView = activity.getWindow().getDecorView().getRootView();
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.RGB_565);
            rootView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (OutOfMemoryError e) {
            return null;
        }
    }

    /* renamed from: a */
    public static BitmapDrawable m59779a(Context context, Bitmap bitmap) {
        Drawable a = m59780a(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0126R.dimen.sharing_icon_badge_offset_x);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(C0126R.dimen.sharing_icon_badge_offset_y);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(C0126R.dimen.sharing_icon_badge_shadow_radius);
        int dimensionPixelOffset4 = context.getResources().getDimensionPixelOffset(C0126R.dimen.sharing_icon_badge_shadow_offset_y);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + dimensionPixelOffset + dimensionPixelOffset3, bitmap.getHeight() + dimensionPixelOffset2 + dimensionPixelOffset3 + dimensionPixelOffset4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), (Paint) null);
        akhy k = akhz.m59766k();
        k.mo39481a(context);
        k.f72038a = a;
        k.mo39482b(bitmap.getWidth());
        k.mo39480a(bitmap.getHeight());
        k.mo39485e(akim.m59828a(context, 2));
        k.mo39483c(dimensionPixelOffset);
        k.mo39484d(dimensionPixelOffset2);
        k.mo39487g(dimensionPixelOffset3);
        k.mo39486f(dimensionPixelOffset4);
        m59782a(canvas, k.mo39479a());
        return new BitmapDrawable(context.getResources(), createBitmap);
    }

    /* renamed from: a */
    public static Drawable m59780a(Context context) {
        Drawable drawable = context.getDrawable(C0126R.C0127drawable.quantum_ic_settings_vd_theme_24);
        if (drawable != null) {
            drawable.setTint(akim.m59829b(context));
            int a = akim.m59828a(context, 14);
            drawable.setBounds(0, 0, a, a);
            return drawable;
        }
        throw new IllegalArgumentException("Invalid badgeResId");
    }

    /* renamed from: a */
    public static Icon m59781a(Drawable drawable) {
        return Icon.createWithBitmap(m59783b(drawable));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    /* renamed from: a */
    public static void m59782a(Canvas canvas, akhz akhz) {
        akhx akhx = (akhx) akhz;
        Drawable drawable = akhx.f72029b;
        int i = akhx.f72032e;
        int width = drawable.getBounds().width();
        int i2 = width - (i + i);
        Bitmap b = m59783b(drawable);
        int width2 = b.getWidth();
        int height = b.getHeight();
        if (!(width2 == i2 && height == i2)) {
            Matrix matrix = new Matrix();
            float f = (float) i2;
            matrix.postScale(f / ((float) width2), f / ((float) height));
            b = Bitmap.createBitmap(b, 0, 0, width2, height, matrix, false);
        }
        int i3 = (akhx.f72030c - width) + akhx.f72033f;
        int i4 = (akhx.f72031d - width) + akhx.f72034g;
        int i5 = width / 2;
        Paint paint = new Paint();
        paint.setColor(akim.m59830b(akhx.f72028a, C0126R.attr.colorPrimary));
        paint.setStyle(Paint.Style.FILL);
        paint.setShadowLayer((float) akhx.f72035h, (float) akhx.f72036i, (float) akhx.f72037j, Color.argb(230, Color.red(-16777216), Color.green(-16777216), Color.blue(-16777216)));
        canvas.drawCircle((float) (i3 + i5), (float) (i4 + i5), (float) i5, paint);
        int i6 = i3 + i;
        int i7 = i4 + i;
        canvas.drawBitmap(b, (Rect) null, new Rect(i6, i7, b.getWidth() + i6, b.getHeight() + i7), (Paint) null);
    }
}
