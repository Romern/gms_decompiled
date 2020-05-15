package p000;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

/* renamed from: dhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dhb {
    /* renamed from: a */
    public static void m8472a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: b */
    private static void m8478b(File file, File file2) {
        String valueOf = String.valueOf(file);
        String valueOf2 = String.valueOf(file2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(valueOf2).length());
        sb.append("Sync stats from ");
        sb.append(valueOf);
        sb.append(" to ");
        sb.append(valueOf2);
        sb.toString();
        m8473a(file, file2);
        int i = Build.VERSION.SDK_INT;
        try {
            Os.chmod(file2.getAbsolutePath(), Os.stat(file.getAbsolutePath()).st_mode);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IOException("Unable to sync perms", e);
        }
    }

    /* renamed from: c */
    public static void m8480c(File file) {
        if (!m8479b(file) && !file.setExecutable(true, false)) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Failed to set world executable: ");
            sb.append(valueOf);
            Log.w("FileUtils", sb.toString());
        }
    }

    /* renamed from: a */
    static void m8473a(File file, File file2) {
        long lastModified = file.lastModified();
        if (lastModified >= 0) {
            file2.setLastModified(lastModified);
        }
    }

    /* renamed from: d */
    public static void m8481d(File file) {
        int i = Build.VERSION.SDK_INT;
        if (!m8477a(file, OsConstants.S_IRUSR | OsConstants.S_IRGRP | OsConstants.S_IROTH) && !file.setReadable(true, false)) {
            String valueOf = String.valueOf(file);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Failed to set world readable: ");
            sb.append(valueOf);
            Log.w("FileUtils", sb.toString());
        }
    }

    /* renamed from: a */
    public static void m8474a(File file, File file2, Set set, byte[] bArr) {
        bmxy.m108581a(file);
        bmxy.m108581a(file2);
        bmxy.m108581a(bArr);
        if (file.isDirectory()) {
            if (file2.exists()) {
                if (!file2.isDirectory()) {
                    throw new IOException("Target is not a directory");
                }
            } else if (!file2.mkdirs()) {
                String valueOf = String.valueOf(file2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Cannot create target directory: ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    File file3 = new File(file, str);
                    File file4 = new File(file2, str);
                    if (!file3.isDirectory()) {
                        m8475a(file3, file4, bArr);
                    } else if (!set.contains(str)) {
                        m8474a(file3, file4, set, bArr);
                    }
                }
                m8478b(file, file2);
                return;
            }
            String valueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 30);
            sb2.append("Cannot list source directory: ");
            sb2.append(valueOf2);
            throw new IOException(sb2.toString());
        }
        throw new IOException("Source is not a directory");
    }

    /* renamed from: b */
    public static boolean m8479b(File file) {
        int i = Build.VERSION.SDK_INT;
        return m8477a(file, OsConstants.S_IXUSR | OsConstants.S_IXGRP | OsConstants.S_IXOTH);
    }

    /* renamed from: a */
    public static void m8475a(File file, File file2, byte[] bArr) {
        String str;
        FileOutputStream fileOutputStream;
        bmxy.m108581a(file);
        bmxy.m108581a(file2);
        bmxy.m108581a(bArr);
        if (file.isDirectory()) {
            throw new IOException("Source is a directory");
        } else if (!file2.isDirectory()) {
            String parent = file2.getParent();
            String valueOf = String.valueOf(file2.getName());
            File file3 = new File(parent, valueOf.length() == 0 ? new String(".tmp") : ".tmp".concat(valueOf));
            int i = Build.VERSION.SDK_INT;
            try {
                str = Os.readlink(file.getAbsolutePath());
            } catch (Exception e) {
                if (!(e instanceof RuntimeException)) {
                    str = null;
                } else {
                    throw ((RuntimeException) e);
                }
            }
            if (str != null) {
                String valueOf2 = String.valueOf(file);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 12 + str.length());
                sb.append("Symlink ");
                sb.append(valueOf2);
                sb.append(" -> ");
                sb.append(str);
                sb.toString();
                String valueOf3 = String.valueOf(file3);
                StringBuilder sb2 = new StringBuilder(str.length() + 15 + String.valueOf(valueOf3).length());
                sb2.append("Symlinking ");
                sb2.append(str);
                sb2.append(" to ");
                sb2.append(valueOf3);
                sb2.toString();
                try {
                    Os.symlink(str, file3.getAbsolutePath());
                    m8473a(file, file3);
                } catch (Exception e2) {
                    if (e2 instanceof RuntimeException) {
                        throw ((RuntimeException) e2);
                    }
                    throw new IOException("Unable to copy symlink", e2);
                }
            } else {
                String valueOf4 = String.valueOf(file);
                String valueOf5 = String.valueOf(file3);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 12 + String.valueOf(valueOf5).length());
                sb3.append("Copying ");
                sb3.append(valueOf4);
                sb3.append(" to ");
                sb3.append(valueOf5);
                sb3.toString();
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileOutputStream = new FileOutputStream(file3);
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                    fileInputStream.close();
                    m8478b(file, file3);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        bqye.m113761a(th, th2);
                    }
                    throw th;
                }
            }
            String valueOf6 = String.valueOf(file3);
            String valueOf7 = String.valueOf(file2);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf6).length() + 13 + String.valueOf(valueOf7).length());
            sb4.append("Renaming ");
            sb4.append(valueOf6);
            sb4.append(" to ");
            sb4.append(valueOf7);
            sb4.toString();
            if (!file3.renameTo(file2)) {
                file3.delete();
                String valueOf8 = String.valueOf(file3);
                String valueOf9 = String.valueOf(file2);
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf8).length() + 21 + String.valueOf(valueOf9).length());
                sb5.append("Failed to rename ");
                sb5.append(valueOf8);
                sb5.append(" to ");
                sb5.append(valueOf9);
                throw new IOException(sb5.toString());
            }
            return;
        } else {
            throw new IOException("Target is a directory");
        }
        throw th;
    }

    /* renamed from: a */
    public static boolean m8476a(File file) {
        if (file == null) {
            return true;
        }
        if (file.isDirectory()) {
            if (!file.canRead()) {
                file.setReadable(true);
            }
            if (!file.canWrite()) {
                file.setWritable(true);
            }
            if (!file.canExecute()) {
                file.setExecutable(true);
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    m8476a(file2);
                }
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    public static boolean m8477a(File file, int i) {
        try {
            return (Os.stat(file.getAbsolutePath()).st_mode & i) == i;
        } catch (Exception e) {
            if (!(e instanceof RuntimeException)) {
                return false;
            }
            throw ((RuntimeException) e);
        }
    }
}
