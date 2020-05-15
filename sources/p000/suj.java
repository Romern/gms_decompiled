package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: suj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class suj {

    /* renamed from: a */
    private static final Paint f45167a = new Paint(2);

    /* renamed from: b */
    private static final Paint f45168b;

    /* renamed from: c */
    private static Bitmap f45169c;

    /* renamed from: d */
    private static final Map f45170d = new HashMap();

    static {
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        f45168b = paint;
    }

    /* renamed from: a */
    private static Bitmap m36367a(Context context, int i) {
        if (f45169c == null) {
            f45169c = ((BitmapDrawable) context.getApplicationContext().getResources().getDrawable(C0126R.C0127drawable.common_round_mask)).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int width = f45169c.getWidth();
            m36370a(canvas, f45169c, new Rect(0, 0, width, width), new Rect(0, 0, i, i));
            return createBitmap;
        } catch (OutOfMemoryError e) {
            StringBuilder sb = new StringBuilder(57);
            sb.append("getRoundMask OutOfMemoryError for image size: ");
            sb.append(i);
            Log.w("AvatarImageUtils", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m36368a(Context context, Bitmap bitmap, Paint paint) {
        Bitmap bitmap2;
        int width = bitmap.getWidth();
        Bitmap createBitmap = Bitmap.createBitmap(width, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Map map = f45170d;
        Integer valueOf = Integer.valueOf(width);
        if (map.containsKey(valueOf)) {
            bitmap2 = (Bitmap) f45170d.get(valueOf);
        } else {
            bitmap2 = m36367a(context, width);
            f45170d.put(valueOf, bitmap2);
        }
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, f45168b);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m36369a(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            if (createBitmap == null) {
                return null;
            }
            Canvas canvas = new Canvas(createBitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width == i && height == i) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            } else {
                int min = Math.min(width, height);
                int i2 = (width - min) / 2;
                int i3 = (height - min) / 2;
                m36370a(canvas, bitmap, new Rect(i2, i3, i2 + min, min + i3), new Rect(0, 0, i, i));
            }
            return createBitmap;
        } catch (OutOfMemoryError e) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("resizeToSquareBitmap OutOfMemoryError for image size: ");
            sb.append(i);
            Log.w("AvatarImageUtils", sb.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private static void m36370a(Canvas canvas, Bitmap bitmap, Rect rect, Rect rect2) {
        canvas.drawBitmap(bitmap, rect, rect2, f45167a);
    }
}
