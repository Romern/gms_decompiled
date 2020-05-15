package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: cmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cmw {

    /* renamed from: a */
    public static final Lock f7089a;

    /* renamed from: b */
    private static final Paint f7090b = new Paint(6);

    /* renamed from: c */
    private static final Paint f7091c;

    /* renamed from: d */
    private static final Set f7092d;

    static {
        new Paint(7);
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f7092d = hashSet;
        f7089a = !hashSet.contains(Build.MODEL) ? new cmv() : new ReentrantLock();
        Paint paint = new Paint(7);
        f7091c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static int m4560a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static Bitmap m4565b(cgt cgt, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            return bitmap;
        }
        Bitmap a = cgt.mo3878a((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m4561a(bitmap));
        m4563a(bitmap, a);
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m4564a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: b */
    public static boolean m4566b(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: c */
    public static Bitmap m4567c(cgt cgt, Bitmap bitmap, int i, int i2) {
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? m4565b(cgt, bitmap, i, i2) : bitmap;
    }

    /* renamed from: a */
    public static Bitmap.Config m4561a(Bitmap bitmap) {
        return bitmap.getConfig() == null ? Bitmap.Config.ARGB_8888 : bitmap.getConfig();
    }

    /* renamed from: a */
    public static Bitmap m4562a(cgt cgt, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap a = cgt.mo3878a(i, i2, m4561a(bitmap));
        m4563a(bitmap, a);
        m4564a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: a */
    public static void m4563a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* renamed from: a */
    public static void m4564a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f7089a.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f7090b);
            canvas.setBitmap(null);
        } finally {
            f7089a.unlock();
        }
    }
}
