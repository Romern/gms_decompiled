package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.HashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ImageLoader {

    /* renamed from: a */
    public final HashMap f7331a = new HashMap();

    /* renamed from: b */
    public final HashMap f7332b = new HashMap();

    /* renamed from: c */
    public Runnable f7333c;

    /* renamed from: d */
    private final RequestQueue f7334d;

    /* renamed from: e */
    private int f7335e = 100;

    /* renamed from: f */
    private final ImageCache f7336f;

    /* renamed from: g */
    private final Handler f7337g = new Handler(Looper.getMainLooper());

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface ImageCache {
        Bitmap getBitmap(String str);

        void putBitmap(String str, Bitmap bitmap);
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ImageContainer {

        /* renamed from: a */
        public Bitmap f7338a;

        /* renamed from: b */
        public final ImageListener f7339b;

        /* renamed from: d */
        private final String f7341d;

        /* renamed from: e */
        private final String f7342e;

        public ImageContainer(Bitmap bitmap, String str, String str2, ImageListener imageListener) {
            this.f7338a = bitmap;
            this.f7342e = str;
            this.f7341d = str2;
            this.f7339b = imageListener;
        }

        public void cancelRequest() {
            boh.m3401a();
            if (this.f7339b != null) {
                boe boe = (boe) ImageLoader.this.f7331a.get(this.f7341d);
                if (boe == null) {
                    boe boe2 = (boe) ImageLoader.this.f7332b.get(this.f7341d);
                    if (boe2 != null) {
                        boe2.mo3322a(this);
                        if (boe2.f5233c.size() == 0) {
                            ImageLoader.this.f7332b.remove(this.f7341d);
                        }
                    }
                } else if (boe.mo3322a(this)) {
                    ImageLoader.this.f7331a.remove(this.f7341d);
                }
            }
        }

        public Bitmap getBitmap() {
            return this.f7338a;
        }

        public String getRequestUrl() {
            return this.f7342e;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface ImageListener extends Response.ErrorListener {
        void onResponse(ImageContainer imageContainer, boolean z);
    }

    public ImageLoader(RequestQueue requestQueue, ImageCache imageCache) {
        this.f7334d = requestQueue;
        this.f7336f = imageCache;
    }

    /* renamed from: a */
    private static String m4788a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("#W");
        sb.append(i);
        sb.append("#H");
        sb.append(i2);
        sb.append("#S");
        sb.append(scaleType.ordinal());
        sb.append(str);
        return sb.toString();
    }

    public static ImageListener getImageListener(ImageView imageView, int i, int i2) {
        return new boa(i2, imageView, i);
    }

    public ImageContainer get(String str, ImageListener imageListener) {
        return get(str, imageListener, 0, 0);
    }

    public boolean isCached(String str, int i, int i2) {
        return isCached(str, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    /* access modifiers changed from: protected */
    public Request makeImageRequest(String str, int i, int i2, ImageView.ScaleType scaleType, String str2) {
        return new ImageRequest(str, new bob(this, str2), i, i2, scaleType, Bitmap.Config.RGB_565, new boc(this, str2));
    }

    public void onGetImageError(String str, VolleyError volleyError) {
        boe boe = (boe) this.f7331a.remove(str);
        if (boe != null) {
            boe.f5232b = volleyError;
            m4789a(str, boe);
        }
    }

    public void onGetImageSuccess(String str, Bitmap bitmap) {
        this.f7336f.putBitmap(str, bitmap);
        boe boe = (boe) this.f7331a.remove(str);
        if (boe != null) {
            boe.f5231a = bitmap;
            m4789a(str, boe);
        }
    }

    public void setBatchedResponseDelay(int i) {
        this.f7335e = i;
    }

    /* renamed from: a */
    private final void m4789a(String str, boe boe) {
        this.f7332b.put(str, boe);
        if (this.f7333c == null) {
            bod bod = new bod(this);
            this.f7333c = bod;
            this.f7337g.postDelayed(bod, (long) this.f7335e);
        }
    }

    public ImageContainer get(String str, ImageListener imageListener, int i, int i2) {
        return get(str, imageListener, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    public boolean isCached(String str, int i, int i2, ImageView.ScaleType scaleType) {
        boh.m3401a();
        return this.f7336f.getBitmap(m4788a(str, i, i2, scaleType)) != null;
    }

    public ImageContainer get(String str, ImageListener imageListener, int i, int i2, ImageView.ScaleType scaleType) {
        ImageListener imageListener2 = imageListener;
        boh.m3401a();
        String a = m4788a(str, i, i2, scaleType);
        Bitmap bitmap = this.f7336f.getBitmap(a);
        if (bitmap != null) {
            ImageContainer imageContainer = new ImageContainer(bitmap, str, null, null);
            imageListener2.onResponse(imageContainer, true);
            return imageContainer;
        }
        ImageContainer imageContainer2 = new ImageContainer(null, str, a, imageListener);
        imageListener2.onResponse(imageContainer2, true);
        boe boe = (boe) this.f7331a.get(a);
        if (boe == null) {
            boe = (boe) this.f7332b.get(a);
        }
        if (boe == null) {
            Request makeImageRequest = makeImageRequest(str, i, i2, scaleType, a);
            this.f7334d.add(makeImageRequest);
            this.f7331a.put(a, new boe(makeImageRequest, imageContainer2));
            return imageContainer2;
        }
        boe.f5233c.add(imageContainer2);
        return imageContainer2;
    }
}
