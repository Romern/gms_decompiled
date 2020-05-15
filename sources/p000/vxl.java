package p000;

import java.io.File;

/* renamed from: vxl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vxl {
    /* renamed from: a */
    public static boolean m41539a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                m41539a(file2);
            }
        }
        return file.delete();
    }
}
