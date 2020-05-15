package p000;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;

/* renamed from: befg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befg {
    /* renamed from: a */
    public static File m94951a(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }

    /* renamed from: b */
    public static File m94952b(Context context) {
        return m94951a(context.createDeviceProtectedStorageContext()).getParentFile();
    }
}
