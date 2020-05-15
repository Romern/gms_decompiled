package p000;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: chu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chu {

    /* renamed from: a */
    public final int f6882a;

    /* renamed from: b */
    public final int f6883b;

    /* renamed from: c */
    public final int f6884c;

    public chu(chs chs) {
        int i;
        float f;
        if (!m4286a(chs.f6878a)) {
            i = 4194304;
        } else {
            i = 2097152;
        }
        this.f6884c = i;
        ActivityManager activityManager = chs.f6878a;
        float memoryClass = (float) (activityManager.getMemoryClass() * 1048576);
        if (!m4286a(activityManager)) {
            f = 0.4f;
        } else {
            f = 0.33f;
        }
        int round = Math.round(memoryClass * f);
        float f2 = (float) (chs.f6880c.f6881a.widthPixels * chs.f6880c.f6881a.heightPixels * 4);
        int round2 = Math.round(chs.f6879b * f2);
        int round3 = Math.round(f2 + f2);
        int i2 = round - this.f6884c;
        if (round3 + round2 > i2) {
            float f3 = ((float) i2) / (chs.f6879b + 2.0f);
            this.f6883b = Math.round(f3 + f3);
            this.f6882a = Math.round(f3 * chs.f6879b);
            return;
        }
        this.f6883b = round3;
        this.f6882a = round2;
    }

    /* renamed from: a */
    static boolean m4286a(ActivityManager activityManager) {
        int i = Build.VERSION.SDK_INT;
        return activityManager.isLowRamDevice();
    }
}
