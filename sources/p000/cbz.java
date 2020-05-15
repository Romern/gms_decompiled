package p000;

import android.widget.ImageView;

/* renamed from: cbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final /* synthetic */ class cbz {

    /* renamed from: a */
    static final /* synthetic */ int[] f6446a;

    /* renamed from: b */
    static final /* synthetic */ int[] f6447b;

    static {
        int[] iArr = new int[cbs.values().length];
        f6447b = iArr;
        try {
            iArr[cbs.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f6447b[cbs.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f6447b[cbs.HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f6447b[cbs.IMMEDIATE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        f6446a = iArr2;
        try {
            iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f6446a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f6446a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f6446a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
        } catch (NoSuchFieldError e8) {
        }
        try {
            f6446a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
        } catch (NoSuchFieldError e9) {
        }
        try {
            f6446a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
        } catch (NoSuchFieldError e10) {
        }
        try {
            f6446a[ImageView.ScaleType.CENTER.ordinal()] = 7;
        } catch (NoSuchFieldError e11) {
        }
        try {
            f6446a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
        } catch (NoSuchFieldError e12) {
        }
    }
}
