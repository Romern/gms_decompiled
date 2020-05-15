package p000;

import java.io.File;

/* renamed from: avye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avye {
    /* renamed from: a */
    public static void m79530a(File file) {
        File[] listFiles;
        if (file != null) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    m79530a(file2);
                }
            }
            String absolutePath = file.getAbsolutePath();
            try {
                int intValue = ((Integer) Class.forName("android.os.FileUtils").getMethod("setPermissions", String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, absolutePath, 493, -1, -1)).intValue();
                if (intValue != 0) {
                    avxz.m79525a("FileUtils.setPermissions failed with error code %d for %s", Integer.valueOf(intValue), absolutePath);
                }
            } catch (Exception e) {
                avxz.m79526a(e, "Failed to chmod dir: %s", absolutePath);
            }
        }
    }
}
