package p000;

import android.graphics.Bitmap;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: hsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hsn extends ryw implements ImageLoader.ImageCache {
    public hsn() {
        super(3145728);
    }

    public final Bitmap getBitmap(String str) {
        return (Bitmap) mo15546a(str);
    }

    public final void putBitmap(String str, Bitmap bitmap) {
        mo15547a(str, bitmap);
    }
}
