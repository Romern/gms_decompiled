package p000;

import java.io.Closeable;
import java.io.File;

/* renamed from: bhcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhcy {
    /* renamed from: a */
    public static boolean m100661a(Closeable closeable) {
        if (closeable == null) {
            return false;
        }
        try {
            closeable.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r5 != false) goto L_0x002d;
     */
    /* renamed from: a */
    public static boolean m100662a(File file) {
        if (!file.isDirectory()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            boolean z = true;
            for (File file2 : listFiles) {
                if (file2 != null) {
                    z = z && m100662a(file2);
                }
            }
        }
        return file.delete();
    }
}
