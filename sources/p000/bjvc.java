package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.volley.toolbox.ImageLoader;

/* renamed from: bjvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjvc extends C1231nx implements ImageLoader.ImageCache {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo15551b(Object obj, Object obj2) {
        String str = (String) obj;
        int i = Build.VERSION.SDK_INT;
        return ((Bitmap) obj2).getAllocationByteCount() / 1024;
    }

    public final Bitmap getBitmap(String str) {
        return (Bitmap) mo15546a(str);
    }

    public final void putBitmap(String str, Bitmap bitmap) {
        mo15547a(str, bitmap);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bjvc(Context context, int i) {
        super(Math.min((r0 * 1024) / 8, (((int) (r6 * r1)) * 4) / 1024));
        int memoryClass = ((ActivityManager) context.getSystemService("activity")).getMemoryClass();
        int i2 = Build.VERSION.SDK_INT;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        double d = (double) i;
        double d2 = (double) displayMetrics.densityDpi;
        Double.isNaN(d2);
        double pow = Math.pow(d2 / 160.0d, 2.0d);
        Double.isNaN(d);
    }
}
