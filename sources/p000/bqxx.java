package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: bqxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqxx {
    /* renamed from: a */
    public static Context m113736a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
    }
}
