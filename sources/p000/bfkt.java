package p000;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* renamed from: bfkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkt {
    /* renamed from: a */
    public static void m97150a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: b */
    public static void m97152b(File file) {
        File[] listFiles;
        if (file != null && file.exists()) {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    m97152b(file2);
                }
            }
            file.delete();
        }
    }

    /* renamed from: a */
    public static boolean m97151a(File file) {
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            return true;
        }
        if (file.exists()) {
            file.delete();
        }
        return file.mkdirs();
    }
}
