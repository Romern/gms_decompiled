package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.felicanetworks.mfc.C0126R;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.util.ArrayList;
import java.util.List;

/* renamed from: azal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azal {

    /* renamed from: a */
    private static final double f98836a = (2.0d - Math.sqrt(2.0d));

    /* renamed from: a */
    public static Bitmap m85135a(Context context, int i) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0126R.dimen.default_group_avatar_size);
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        float f = ((float) dimensionPixelSize) / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        Drawable a = C1133kh.m17836a(context, (int) C0126R.C0127drawable.product_logo_avatar_anonymous_white_color_48);
        a.setBounds(new Rect(0, 0, dimensionPixelSize, dimensionPixelSize));
        a.setAlpha(170);
        a.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m85136a(Context context, Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bitmap);
        return m85138a(context, arrayList);
    }

    /* renamed from: a */
    public static Bitmap m85137a(Context context, LocalEntityId localEntityId, boolean z) {
        Bitmap bitmap;
        azdi azdi;
        cbgn cbgn;
        cbhy cbhy;
        ByteString bxtx;
        int i;
        if (!cfeo.f183719a.mo6606a().mo81093v() || (i = localEntityId.f111075b) == 1 || i == 7) {
            bitmap = azny.m85882a(context, localEntityId);
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            if (!z) {
                azdi = azdj.m85399a(context).mo54722b(localEntityId);
            } else {
                azdi = DatabaseProvider.m94522a(context.getContentResolver(), localEntityId);
            }
            if (!(azdi == null || (cbgn = azdi.f99083i) == null || (cbhy = cbgn.f177055d) == null)) {
                if (cbhy.f177216a == 1) {
                    bxtx = (ByteString) cbhy.f177217b;
                } else {
                    bxtx = bxtx.f164797b;
                }
                byte[] k = bxtx.getKey();
                if (!azpi.m86080b(k)) {
                    bitmap = BitmapFactory.decodeByteArray(k, 0, k.length);
                }
            }
        }
        return bitmap == null ? azny.m85881a(context) : bitmap;
    }

    /* renamed from: a */
    private static Bitmap m85138a(Context context, List list) {
        boolean z;
        RectF[] rectFArr;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0126R.dimen.default_group_avatar_size);
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int size = list.size();
        float width = (float) createBitmap.getWidth();
        float height = (float) createBitmap.getHeight();
        if (size > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        if (size == 1) {
            rectFArr = new RectF[]{new RectF(0.0f, 0.0f, width, height)};
        } else if (size == 2) {
            float f3 = ((float) f98836a) * width;
            rectFArr = new RectF[]{new RectF(0.0f, 0.0f, f3, f3), new RectF(width - f3, height - f3, width, height)};
        } else if (size != 3) {
            rectFArr = new RectF[]{new RectF(0.0f, 0.0f, f, f2), new RectF(f, 0.0f, width, f2), new RectF(0.0f, f2, f, height), new RectF(f, f2, width, height)};
        } else {
            float f4 = width / 4.0f;
            float f5 = height / 4.0f;
            double d = (double) f5;
            double sqrt = Math.sqrt(3.0d);
            Double.isNaN(d);
            float f6 = (height - f5) - ((float) (d * sqrt));
            rectFArr = new RectF[]{new RectF(f4, f6 - f5, f4 * 3.0f, f6 + f5), new RectF(0.0f, f2, f, height), new RectF(f, f2, width, height)};
        }
        for (int i = 0; i < rectFArr.length; i++) {
            RectF rectF = rectFArr[i];
            Bitmap bitmap = (Bitmap) list.get(i);
            BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight()), rectF, Matrix.ScaleToFit.FILL);
            bitmapShader.setLocalMatrix(matrix);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
        }
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m85139a(Context context, List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        int min = Math.min(list.size(), 4);
        for (int i = 0; i < min; i++) {
            arrayList.add(m85137a(context, (LocalEntityId) list.get(i), z));
        }
        if (arrayList.isEmpty()) {
            return azny.m85881a(context);
        }
        return m85138a(context, arrayList);
    }
}
