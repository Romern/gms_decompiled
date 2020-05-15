package p000;

import android.graphics.Bitmap;

/* renamed from: uxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final /* synthetic */ class uxt {

    /* renamed from: a */
    static final /* synthetic */ int[] f48705a;

    static {
        int[] iArr = new int[Bitmap.CompressFormat.values().length];
        f48705a = iArr;
        try {
            iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f48705a[Bitmap.CompressFormat.PNG.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f48705a[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
    }
}
