package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: ben */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ben {

    /* renamed from: a */
    public static final float[] f3096a = new float[4];

    /* renamed from: b */
    private static final PathMeasure f3097b = new PathMeasure();

    /* renamed from: c */
    private static final Path f3098c = new Path();

    /* renamed from: d */
    private static final Path f3099d = new Path();

    /* renamed from: e */
    private static final float f3100e = ((float) Math.sqrt(2.0d));

    /* renamed from: f */
    private static float f3101f = -1.0f;

    /* renamed from: a */
    public static float m2828a() {
        if (f3101f == -1.0f) {
            f3101f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f3101f;
    }

    /* renamed from: a */
    public static int m2831a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: a */
    public static boolean m2838a(int i, int i2, int i3) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 >= 4) {
            return i2 > 4 || i3 >= 0;
        }
        return false;
    }

    /* renamed from: a */
    public static float m2829a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: a */
    public static float m2830a(Matrix matrix) {
        float[] fArr = f3096a;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f3100e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        float[] fArr2 = f3096a;
        return ((float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]))) / 2.0f;
    }

    /* renamed from: a */
    public static Bitmap m2832a(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: a */
    public static Path m2833a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: a */
    public static void m2834a(Canvas canvas, RectF rectF, Paint paint) {
        int i = Build.VERSION.SDK_INT;
        canvas.saveLayer(rectF, paint);
        axq.m2409a();
    }

    /* renamed from: a */
    public static void m2835a(Path path, float f, float f2, float f3) {
        f3097b.setPath(path, false);
        float length = f3097b.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            axq.m2409a();
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 4.0f)) < 0.01d) {
            axq.m2409a();
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) bem.m2820a(min, length);
                max = (float) bem.m2820a(max, length);
            }
            if (min < 0.0f) {
                min = (float) bem.m2820a(min, length);
            }
            if (max < 0.0f) {
                max = (float) bem.m2820a(max, length);
            }
            if (min == max) {
                path.reset();
                axq.m2409a();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            f3098c.reset();
            f3097b.getSegment(min, max, f3098c, true);
            if (max > length) {
                f3099d.reset();
                f3097b.getSegment(0.0f, max % length, f3099d, true);
                f3098c.addPath(f3099d);
            } else if (min < 0.0f) {
                f3099d.reset();
                f3097b.getSegment(min + length, length, f3099d, true);
                f3098c.addPath(f3099d);
            }
            path.set(f3098c);
            axq.m2409a();
        }
    }

    /* renamed from: a */
    public static void m2836a(Path path, azw azw) {
        if (azw != null && !azw.f2734a) {
            m2835a(path, ((baa) azw.f2735b).mo2946g() / 100.0f, ((baa) azw.f2736c).mo2946g() / 100.0f, ((baa) azw.f2737d).mo2946g() / 360.0f);
        }
    }

    /* renamed from: a */
    public static void m2837a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m2839a(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }
}
