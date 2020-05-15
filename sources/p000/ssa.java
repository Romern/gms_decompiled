package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.felicanetworks.mfc.C0126R;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: ssa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssa {

    /* renamed from: a */
    public static final SimpleDateFormat f45067a = new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US);

    /* renamed from: b */
    private static Thread f45068b;

    /* renamed from: c */
    private static final Paint f45069c = new Paint(2);

    /* renamed from: d */
    private static final Paint f45070d = new Paint(2);

    /* renamed from: a */
    private static int m36179a(aka aka) {
        if (aka == null) {
            return 0;
        }
        int a = aka.mo866a("Orientation", 1);
        if (a == 3) {
            return 180;
        }
        if (a != 6) {
            return a != 8 ? 0 : 270;
        }
        return 90;
    }

    /* renamed from: b */
    public static boolean m36191b(String str) {
        return str != null && str.startsWith("image/");
    }

    /* renamed from: c */
    public static boolean m36192c(String str) {
        return str != null && str.startsWith("video/");
    }

    /* renamed from: a */
    public static int m36180a(Context context) {
        return context.getResources().getDimensionPixelSize(C0126R.dimen.common_mini_kind_max_dimension);
    }

    /* renamed from: a */
    public static int m36181a(String str) {
        aka aka = null;
        try {
            aka = new aka(str);
        } catch (IOException e) {
            if (Log.isLoggable("ImageUtils", 5)) {
                String valueOf = String.valueOf(str);
                Log.w("ImageUtils", valueOf.length() == 0 ? new String("failed to create ExifInterface for ") : "failed to create ExifInterface for ".concat(valueOf));
            }
        }
        return m36179a(aka);
    }

    /* renamed from: a */
    public static Bitmap m36182a(ContentResolver contentResolver, Uri uri, int i, boolean z) {
        BitmapFactory.Options options;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (i > 0) {
            try {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                try {
                    options2.inJustDecodeBounds = true;
                    inputStream = contentResolver.openInputStream(uri);
                    m36188a(inputStream, options2);
                    Point point = new Point(options2.outWidth, options2.outHeight);
                    srz.m36171a((Closeable) inputStream);
                    options = new BitmapFactory.Options();
                    options.inSampleSize = Math.max(point.x / i, point.y / i);
                } catch (Throwable th) {
                    th = th;
                    inputStream = null;
                    srz.m36171a((Closeable) inputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                srz.m36171a((Closeable) inputStream2);
                throw th;
            }
        } else {
            options = null;
        }
        inputStream2 = contentResolver.openInputStream(uri);
        try {
            Bitmap a = m36183a(contentResolver, uri, m36188a(inputStream2, options), z);
            srz.m36171a((Closeable) inputStream2);
            return a;
        } catch (Throwable th3) {
            th = th3;
            srz.m36171a((Closeable) inputStream2);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0025 A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* renamed from: a */
    public static Bitmap m36183a(ContentResolver contentResolver, Uri uri, Bitmap bitmap, boolean z) {
        int i;
        InputStream inputStream;
        if (bitmap != null) {
            if (z) {
                aka aka = null;
                InputStream inputStream2 = null;
                try {
                    inputStream = contentResolver.openInputStream(uri);
                    try {
                        aka aka2 = new aka(inputStream);
                        srz.m36171a((Closeable) inputStream);
                        aka = aka2;
                    } catch (IOException e) {
                        try {
                            if (Log.isLoggable("ImageUtils", 5)) {
                                String valueOf = String.valueOf(uri);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                                sb.append("failed to create ExifInterface for ");
                                sb.append(valueOf);
                                Log.w("ImageUtils", sb.toString());
                            }
                            srz.m36171a((Closeable) inputStream);
                            i = m36179a(aka);
                            if (i != 0) {
                            }
                            return bitmap;
                        } catch (Throwable th) {
                            th = th;
                            inputStream2 = inputStream;
                            srz.m36171a((Closeable) inputStream2);
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    inputStream = null;
                    if (Log.isLoggable("ImageUtils", 5)) {
                    }
                    srz.m36171a((Closeable) inputStream);
                    i = m36179a(aka);
                    if (i != 0) {
                    }
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                    srz.m36171a((Closeable) inputStream2);
                    throw th;
                }
                i = m36179a(aka);
            } else if (ssg.m36211a(uri) || m36190a(uri)) {
                i = m36181a(!m36190a(uri) ? ssg.m36210a(contentResolver, uri) : uri.getPath());
            } else {
                i = 0;
            }
            if (i != 0) {
                return m36186a(bitmap, i);
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    public static Bitmap m36184a(Context context, Uri uri, int i, int i2, boolean z) {
        ContentResolver contentResolver = context.getContentResolver();
        String a = m36189a(contentResolver, uri);
        try {
            if (m36191b(a)) {
                return m36182a(contentResolver, uri, Math.max(i, i2), z);
            }
            if (Log.isLoggable("ImageUtils", 5)) {
                String valueOf = String.valueOf(a);
                Log.w("ImageUtils", valueOf.length() == 0 ? new String("loadLocalBytes unknown mimeType=") : "loadLocalBytes unknown mimeType=".concat(valueOf));
            }
            return null;
        } catch (IOException e) {
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e("ImageUtils", "could not load image", e2);
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m36185a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-16777216);
        canvas.drawCircle(((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f, ((float) bitmap.getWidth()) / 2.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap}
     arg types: [android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, int]
     candidates:
      ClspMth{android.graphics.Bitmap.createBitmap(android.util.DisplayMetrics, int[], int, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap}
      ClspMth{android.graphics.Bitmap.createBitmap(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix, boolean):android.graphics.Bitmap} */
    /* renamed from: a */
    private static Bitmap m36186a(Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        matrix.setRotate((float) i, ((float) width) / 2.0f, ((float) height) / 2.0f);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            if (bitmap == createBitmap) {
                return bitmap;
            }
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError e) {
            if (!Log.isLoggable("ImageUtils", 5)) {
                return bitmap;
            }
            Log.w("ImageUtils", "could not rotate bitmap", e);
            return bitmap;
        }
    }

    /* renamed from: a */
    public static Bitmap m36187a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            if (createBitmap == null) {
                return null;
            }
            Canvas canvas = new Canvas(createBitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
                width = (bitmap.getHeight() * i) / i2;
            } else {
                height = (bitmap.getWidth() * i2) / i;
            }
            int width2 = (bitmap.getWidth() - width) / 2;
            int height2 = (bitmap.getHeight() - height) / 2;
            Rect rect = new Rect(width2, height2, width + width2, height + height2);
            Rect rect2 = new Rect(0, 0, i, i2);
            if (f45068b == null) {
                f45068b = Looper.getMainLooper().getThread();
            }
            if (Thread.currentThread() != f45068b) {
                synchronized (f45070d) {
                    canvas.drawBitmap(bitmap, rect, rect2, f45070d);
                }
            } else {
                canvas.drawBitmap(bitmap, rect, rect2, f45069c);
            }
            return createBitmap;
        } catch (OutOfMemoryError e) {
            if (Log.isLoggable("ImageUtils", 5)) {
                StringBuilder sb = new StringBuilder(78);
                sb.append("resizeAndCropBitmap OutOfMemoryError for image size: ");
                sb.append(i);
                sb.append(" x ");
                sb.append(i2);
                Log.w("ImageUtils", sb.toString(), e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m36188a(InputStream inputStream, BitmapFactory.Options options) {
        try {
            return BitmapFactory.decodeStream(inputStream, null, options);
        } catch (OutOfMemoryError e) {
            Log.e("ImageUtils", "decodeStream(InputStream, Rect, Options) threw an OOME", e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static String m36189a(ContentResolver contentResolver, Uri uri) {
        String str = null;
        try {
            str = contentResolver.getType(uri);
        } catch (Exception e) {
            try {
                if (Log.isLoggable("ImageUtils", 5)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
                    sb.append("safeGetMimeType failed for uri=");
                    sb.append(valueOf);
                    Log.w("ImageUtils", sb.toString(), e);
                }
            } catch (Exception e2) {
                e = e2;
                if (Log.isLoggable("ImageUtils", 5)) {
                    return str;
                }
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                sb2.append("getMimeType failed for uri=");
                sb2.append(valueOf2);
                Log.w("ImageUtils", sb2.toString(), e);
                return str;
            }
        }
        try {
            return TextUtils.isEmpty(str) ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString())) : str;
        } catch (Exception e3) {
            e = e3;
            if (Log.isLoggable("ImageUtils", 5)) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m36190a(Uri uri) {
        return uri != null && "file".equals(uri.getScheme());
    }
}
