package p000;

import android.graphics.Bitmap;
import com.android.volley.toolbox.ImageLoader;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: axky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axky extends ryw implements ImageLoader.ImageCache {
    public axky() {
        super(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
    }

    public final Bitmap getBitmap(String str) {
        return (Bitmap) mo15546a(str);
    }

    public final void putBitmap(String str, Bitmap bitmap) {
        mo15547a(str, bitmap);
    }
}
