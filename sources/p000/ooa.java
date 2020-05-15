package p000;

import java.io.File;

/* renamed from: ooa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ooa {
    /* renamed from: a */
    public static boolean m29295a(File file) {
        boolean z;
        if (file != null) {
            if (file.isDirectory()) {
                z = true;
                for (File file2 : file.listFiles()) {
                    z &= m29295a(file2);
                }
            } else {
                z = true;
            }
            if (!file.delete() || !z) {
                return false;
            }
        }
        return true;
    }
}
