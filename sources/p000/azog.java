package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: azog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azog {
    /* renamed from: a */
    public static BitmapDrawable m85914a(Context context, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        float max = ((float) Math.max(rect.width(), rect.height())) * 0.07272727f;
        Object[] objArr = {Float.valueOf(16.0f), Float.valueOf(max)};
        canvas.drawRoundRect(rectF, max, max, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
