package p000;

import android.graphics.Bitmap;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: fgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fgo implements ImageLoader.ImageCache {

    /* renamed from: a */
    private final C1231nx f16519a;

    public fgo(C1231nx nxVar) {
        this.f16519a = nxVar;
    }

    public final Bitmap getBitmap(String str) {
        return (Bitmap) this.f16519a.mo15546a(str);
    }

    public final void putBitmap(String str, Bitmap bitmap) {
        this.f16519a.mo15547a(str, bitmap);
    }
}
