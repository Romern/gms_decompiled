package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: bush */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bush {
    /* renamed from: a */
    public static Bitmap m120378a(Context context, Bitmap bitmap) {
        if (!cfoj.f184966a.mo6606a().mo82173f()) {
            busr busr = busr.f154819a;
            return bitmap;
        } else if (bitmap == null) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68432a("bush", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("IconUtils: Bitmap is null, not adding background.");
            return null;
        } else if (bitmap.getWidth() != bitmap.getHeight()) {
            bnsl bnsl2 = (bnsl) busr.f154819a.mo68388c();
            bnsl2.mo68432a("bush", "a", 76, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68411a("IconUtils: Bitmap dimentions not square, skipping background: %s x %s", bitmap.getWidth(), bitmap.getHeight());
            return bitmap;
        } else {
            double width = (double) bitmap.getWidth();
            double ax = cfog.f184854a.mo6606a().mo82015ax();
            Double.isNaN(width);
            int i = (int) (width * ax);
            int i2 = i + i;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + i2, bitmap.getHeight() + i2, bitmap.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColor(C1165lm.m19355b(-1, (int) (cfog.f184854a.mo6606a().mo82014aw() * 255.0d)));
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            canvas.drawCircle((float) (createBitmap.getWidth() / 2), (float) (createBitmap.getHeight() / 2), (float) (createBitmap.getWidth() / 2), paint);
            float f = (float) i;
            canvas.drawBitmap(bitmap, f, f, (Paint) null);
            return createBitmap;
        }
    }

    /* renamed from: a */
    public static boolean m120379a(Bitmap bitmap) {
        if (bitmap != null) {
            int M = (int) cfod.f184793a.mo6606a().mo81891M();
            int d = (int) cfod.m141144d();
            if (bitmap.getWidth() >= M && bitmap.getWidth() < d && bitmap.getHeight() >= M && bitmap.getHeight() < d) {
                return true;
            }
            int d2 = (int) cfod.m141144d();
            if (bitmap.getWidth() < d2 || bitmap.getHeight() < d2) {
                return false;
            }
            return true;
        }
        return false;
    }
}
