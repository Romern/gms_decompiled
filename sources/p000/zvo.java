package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: zvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvo {

    /* renamed from: a */
    public static final AtomicLong f56032a = new AtomicLong(0);

    /* renamed from: a */
    public static long m46575a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            return 0;
        }
    }
}
