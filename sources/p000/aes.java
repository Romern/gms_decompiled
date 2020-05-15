package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: aes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final /* synthetic */ class aes {

    /* renamed from: a */
    public static final /* synthetic */ int[] f351a;

    static {
        int[] iArr = new int[TimeUnit.values().length];
        f351a = iArr;
        try {
            iArr[TimeUnit.MILLISECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f351a[TimeUnit.SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f351a[TimeUnit.MINUTES.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f351a[TimeUnit.HOURS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f351a[TimeUnit.DAYS.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
