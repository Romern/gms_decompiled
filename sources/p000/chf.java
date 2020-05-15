package p000;

import android.graphics.Bitmap;

/* renamed from: chf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final /* synthetic */ class chf {

    /* renamed from: a */
    static final /* synthetic */ int[] f6853a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        f6853a = iArr;
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f6853a[Bitmap.Config.RGB_565.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f6853a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f6853a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
    }
}
