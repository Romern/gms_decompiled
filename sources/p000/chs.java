package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* renamed from: chs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chs {

    /* renamed from: a */
    final ActivityManager f6878a;

    /* renamed from: b */
    float f6879b = 1.0f;

    /* renamed from: c */
    final cht f6880c;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public chs(Context context) {
        this.f6878a = (ActivityManager) context.getSystemService("activity");
        this.f6880c = new cht(context.getResources().getDisplayMetrics());
        int i = Build.VERSION.SDK_INT;
        if (chu.m4286a(this.f6878a)) {
            this.f6879b = 0.0f;
        }
    }
}
