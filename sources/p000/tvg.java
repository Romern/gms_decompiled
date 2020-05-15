package p000;

import android.graphics.Bitmap;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: tvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tvg implements ImageLoader.ImageCache {

    /* renamed from: a */
    final /* synthetic */ C1231nx f46711a;

    public tvg(C1231nx nxVar) {
        this.f46711a = nxVar;
    }

    public final Bitmap getBitmap(String str) {
        return (Bitmap) this.f46711a.mo15546a(str);
    }

    public final void putBitmap(String str, Bitmap bitmap) {
        this.f46711a.mo15547a(str, bitmap);
    }
}
