package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.lang.ref.SoftReference;

/* renamed from: bizf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bizf extends Drawable {

    /* renamed from: a */
    private static SoftReference f122362a;

    /* renamed from: b */
    private static Path[] f122363b;

    /* renamed from: c */
    private static int[] f122364c;

    /* renamed from: d */
    private final int f122365d;

    /* renamed from: e */
    private final Paint f122366e = new Paint(1);

    public bizf(int i) {
        this.f122365d = Color.argb(204, Color.red(i), Color.green(i), Color.blue(i));
        invalidateSelf();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [int, float]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (((float) r8) < 1152.0f) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (((float) r7) < 2049.0f) goto L_0x003d;
     */
    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        SoftReference softReference = f122362a;
        Bitmap bitmap = null;
        Bitmap bitmap2 = softReference != null ? (Bitmap) softReference.get() : null;
        if (bitmap2 != null) {
            int width2 = bitmap2.getWidth();
            int height2 = bitmap2.getHeight();
            if (width > width2) {
            }
            if (height > height2) {
            }
        }
        bitmap = bitmap2;
        if (bitmap == null) {
            this.f122366e.reset();
            float min = Math.min(1.5f, Math.max(((float) width) / 1366.0f, ((float) height) / 768.0f));
            bitmap = Bitmap.createBitmap((int) (min * 1366.0f), (int) (min * 768.0f), Bitmap.Config.ALPHA_8);
            Canvas canvas3 = new Canvas(bitmap);
            canvas3.save();
            canvas3.scale(min, min);
            this.f122366e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
            if (f122363b == null) {
                Path[] pathArr = new Path[7];
                f122363b = pathArr;
                f122364c = new int[]{10, 40, 51, 66, 91, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, 130};
                Path path = new Path();
                pathArr[0] = path;
                path.moveTo(1029.4f, 357.5f);
                path.lineTo(1366.0f, 759.1f);
                path.lineTo(1366.0f, 0.0f);
                path.lineTo(1137.7f, 0.0f);
                path.close();
                Path[] pathArr2 = f122363b;
                Path path2 = new Path();
                pathArr2[1] = path2;
                path2.moveTo(1138.1f, 0.0f);
                path2.rLineTo(-144.8f, 768.0f);
                path2.rLineTo(372.7f, 0.0f);
                path2.rLineTo(0.0f, -524.0f);
                path2.cubicTo(1290.7f, 121.6f, 1219.2f, 41.1f, 1178.7f, 0.0f);
                path2.close();
                Path[] pathArr3 = f122363b;
                Path path3 = new Path();
                pathArr3[2] = path3;
                path3.moveTo(949.8f, 768.0f);
                path3.rCubicTo(92.6f, -170.6f, 213.0f, -440.3f, 269.4f, -768.0f);
                path3.lineTo(585.0f, 0.0f);
                path3.rLineTo(2.1f, 766.0f);
                path3.close();
                Path[] pathArr4 = f122363b;
                Path path4 = new Path();
                pathArr4[3] = path4;
                path4.moveTo(471.1f, 768.0f);
                path4.rMoveTo(704.5f, 0.0f);
                path4.cubicTo(1123.6f, 563.3f, 1027.4f, 275.2f, 856.2f, 0.0f);
                path4.lineTo(476.4f, 0.0f);
                path4.rLineTo(-5.3f, 768.0f);
                path4.close();
                Path[] pathArr5 = f122363b;
                Path path5 = new Path();
                pathArr5[4] = path5;
                path5.moveTo(323.1f, 768.0f);
                path5.moveTo(777.5f, 768.0f);
                path5.cubicTo(661.9f, 348.8f, 427.2f, 21.4f, 401.2f, 25.4f);
                path5.lineTo(323.1f, 768.0f);
                path5.close();
                Path[] pathArr6 = f122363b;
                Path path6 = new Path();
                pathArr6[5] = path6;
                path6.moveTo(178.44286f, 766.8571f);
                path6.lineTo(308.7f, 768.0f);
                path6.cubicTo(381.7f, 604.6f, 481.6f, 344.3f, 562.2f, 0.0f);
                path6.lineTo(0.0f, 0.0f);
                path6.close();
                Path[] pathArr7 = f122363b;
                Path path7 = new Path();
                pathArr7[6] = path7;
                path7.moveTo(146.0f, 0.0f);
                path7.lineTo(0.0f, 0.0f);
                path7.lineTo(0.0f, 768.0f);
                path7.lineTo(394.2f, 768.0f);
                path7.cubicTo(327.7f, 475.3f, 228.5f, 201.0f, 146.0f, 0.0f);
                path7.close();
            }
            for (int i = 0; i < 7; i++) {
                this.f122366e.setColor(f122364c[i] << 24);
                canvas3.drawPath(f122363b[i], this.f122366e);
            }
            canvas3.restore();
            this.f122366e.reset();
            f122362a = new SoftReference(bitmap);
            this.f122366e.reset();
        }
        canvas.save();
        canvas2.clipRect(bounds);
        int width3 = bitmap.getWidth();
        int height3 = bitmap.getHeight();
        float f = (float) width3;
        float width4 = ((float) bounds.width()) / f;
        float f2 = (float) height3;
        float height4 = ((float) bounds.height()) / f2;
        canvas2.scale(width4, height4);
        if (height4 > width4) {
            canvas2.scale(height4 / width4, 1.0f, f * 0.146f, 0.0f);
        } else if (width4 > height4) {
            canvas2.scale(1.0f, width4 / height4, 0.0f, f2 * 0.228f);
        }
        canvas2.drawColor(-16777216);
        this.f122366e.setColor(-1);
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, this.f122366e);
        canvas2.drawColor(this.f122365d);
        canvas.restore();
    }

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
