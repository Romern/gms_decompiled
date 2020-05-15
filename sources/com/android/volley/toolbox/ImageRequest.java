package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ImageRequest extends Request {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;

    /* renamed from: j */
    private static final Object f7343j = new Object();

    /* renamed from: d */
    public final Object f7344d;

    /* renamed from: e */
    private Response.Listener f7345e;

    /* renamed from: f */
    private final Bitmap.Config f7346f;

    /* renamed from: g */
    private final int f7347g;

    /* renamed from: h */
    private final int f7348h;

    /* renamed from: i */
    private final ImageView.ScaleType f7349i;

    @Deprecated
    public ImageRequest(String str, Response.Listener listener, int i, int i2, Bitmap.Config config, Response.ErrorListener errorListener) {
        this(str, listener, i, i2, ImageView.ScaleType.CENTER_INSIDE, config, errorListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if ((r6 * r0) < r4) goto L_0x0037;
     */
    /* renamed from: a */
    private static int m4790a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        double d;
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i != 0 ? i : i3;
        }
        if (i == 0) {
            double d2 = (double) i3;
            double d3 = (double) i2;
            double d4 = (double) i4;
            Double.isNaN(d3);
            Double.isNaN(d4);
            Double.isNaN(d2);
            return (int) (d2 * (d3 / d4));
        }
        if (i2 != 0) {
            double d5 = (double) i4;
            double d6 = (double) i3;
            Double.isNaN(d5);
            Double.isNaN(d6);
            double d7 = d5 / d6;
            if (scaleType != ImageView.ScaleType.CENTER_CROP) {
                d = (double) i2;
                double d8 = (double) i;
                Double.isNaN(d8);
                if (d8 * d7 <= d) {
                    return i;
                }
            } else {
                d = (double) i2;
                double d9 = (double) i;
                Double.isNaN(d9);
            }
            Double.isNaN(d);
            return (int) (d / d7);
        }
        return i;
    }

    public void cancel() {
        super.cancel();
        synchronized (this.f7344d) {
            this.f7345e = null;
        }
    }

    /* access modifiers changed from: protected */
    public void deliverResponse(Bitmap bitmap) {
        Response.Listener listener;
        synchronized (this.f7344d) {
            listener = this.f7345e;
        }
        if (listener != null) {
            listener.onResponse(bitmap);
        }
    }

    public Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (r3.getHeight() > r8) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[Catch:{ OutOfMemoryError -> 0x0098, all -> 0x0096 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[Catch:{ OutOfMemoryError -> 0x0098, all -> 0x0096 }] */
    public Response parseNetworkResponse(NetworkResponse networkResponse) {
        Bitmap bitmap;
        Response response;
        synchronized (f7343j) {
            try {
                byte[] bArr = networkResponse.data;
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.f7347g == 0) {
                    if (this.f7348h == 0) {
                        options.inPreferredConfig = this.f7346f;
                        bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                        if (bitmap != null) {
                            response = Response.error(new ParseError(networkResponse));
                        } else {
                            response = Response.success(bitmap, HttpHeaderParser.parseCacheHeaders(networkResponse));
                        }
                    }
                }
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                int a = m4790a(this.f7347g, this.f7348h, i, i2, this.f7349i);
                int a2 = m4790a(this.f7348h, this.f7347g, i2, i, this.f7349i);
                options.inJustDecodeBounds = false;
                double d = (double) i;
                double d2 = (double) a;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = d / d2;
                double d4 = (double) i2;
                double d5 = (double) a2;
                Double.isNaN(d4);
                Double.isNaN(d5);
                double min = Math.min(d3, d4 / d5);
                float f = 1.0f;
                while (true) {
                    float f2 = f + f;
                    if (((double) f2) > min) {
                        break;
                    }
                    f = f2;
                }
                options.inSampleSize = (int) f;
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                if (bitmap != null) {
                    if (bitmap.getWidth() > a) {
                    }
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, a, a2, true);
                    bitmap.recycle();
                    bitmap = createScaledBitmap;
                }
                if (bitmap != null) {
                }
            } catch (OutOfMemoryError e) {
                VolleyLog.m4765e("Caught OOM for %d byte image, url=%s", Integer.valueOf(networkResponse.data.length), getUrl());
                return Response.error(new ParseError(e));
            } catch (Throwable th) {
                throw th;
            }
        }
        return response;
    }

    public ImageRequest(String str, Response.Listener listener, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, Response.ErrorListener errorListener) {
        super(0, str, errorListener);
        this.f7344d = new Object();
        setRetryPolicy(new DefaultRetryPolicy(1000, 2, 2.0f));
        this.f7345e = listener;
        this.f7346f = config;
        this.f7347g = i;
        this.f7348h = i2;
        this.f7349i = scaleType;
    }
}
