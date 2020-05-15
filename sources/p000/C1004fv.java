package p000;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: fv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1004fv {
    /* renamed from: a */
    public static IBinder m12454a(Bundle bundle, String str) {
        int i = Build.VERSION.SDK_INT;
        return bundle.getBinder(str);
    }

    /* renamed from: a */
    public static void m12455a(Bundle bundle, String str, IBinder iBinder) {
        int i = Build.VERSION.SDK_INT;
        bundle.putBinder(str, iBinder);
    }
}
