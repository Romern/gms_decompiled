package p000;

import android.widget.ImageView;

/* renamed from: asg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final /* synthetic */ class asg {

    /* renamed from: a */
    static final /* synthetic */ int[] f2121a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f2121a = iArr;
        try {
            iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f2121a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
    }
}
