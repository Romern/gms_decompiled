package p000;

import android.graphics.Bitmap;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: avgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avgx extends ryw implements ImageLoader.ImageCache {
    public avgx(int i) {
        super(i);
    }

    public final Bitmap getBitmap(String str) {
        return (Bitmap) mo15546a(str);
    }

    public final void putBitmap(String str, Bitmap bitmap) {
        mo15547a(str, bitmap);
    }
}
