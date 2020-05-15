package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: ijx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ijx implements rkl {

    /* renamed from: a */
    final /* synthetic */ ijy f21157a;

    public ijx(ijy ijy) {
        this.f21157a = ijy;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Bitmap bitmap;
        ParcelFileDescriptor b = ((allh) rkk).mo40486b();
        if (b != null) {
            Bitmap a = alls.m61238a(b);
            if (a != null) {
                int width = a.getWidth();
                int height = a.getHeight();
                int min = Math.min(width, height);
                sdo.m34961a(min);
                if (width != height) {
                    a = Bitmap.createBitmap(a, (width - min) / 2, (height - min) / 2, min, min);
                }
                if (min > 200) {
                    a = Bitmap.createScaledBitmap(a, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, false);
                }
                bitmap = Bitmap.createBitmap(a.getWidth(), a.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                Paint paint = new Paint();
                Rect rect = new Rect(0, 0, a.getWidth(), a.getHeight());
                paint.setAntiAlias(true);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setColor(-12434878);
                canvas.drawCircle((float) (a.getWidth() / 2), (float) (a.getHeight() / 2), (float) (a.getWidth() / 2), paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(a, rect, rect, paint);
            } else {
                bitmap = null;
            }
            ijy ijy = this.f21157a;
            if (bitmap != null) {
                ijy.f21159b.setImageBitmap(bitmap);
            }
        }
    }
}
