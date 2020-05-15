package p000;

import android.graphics.Bitmap;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: ryw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ryw extends C1231nx implements ImageLoader.ImageCache {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo15551b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    public Bitmap getBitmap(String str) {
        return (Bitmap) mo15546a(str);
    }

    public void putBitmap(String str, Bitmap bitmap) {
        mo15547a(str, bitmap);
    }

    public ryw() {
        super(3145728);
    }

    public ryw(int i) {
        super(i);
    }
}
