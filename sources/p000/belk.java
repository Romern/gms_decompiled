package p000;

import android.net.Uri;
import android.os.Build;
import android.system.Os;
import android.system.StructStat;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: belk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class belk {
    /* renamed from: a */
    public static IOException m95257a(befa befa, Uri uri, IOException iOException) {
        try {
            behq a = behq.m95058a();
            a.mo60713b();
            File file = (File) befa.mo60643a(uri, a, new beer[0]);
            if (!file.exists()) {
                return new IOException(iOException);
            }
            if (!file.isFile()) {
                return new IOException(iOException);
            }
            if (!file.canRead()) {
                return new IOException(iOException);
            }
            return m95258a(file, iOException);
        } catch (IOException e) {
            return iOException;
        }
    }

    /* renamed from: b */
    public static IOException m95259b(befa befa, Uri uri, IOException iOException) {
        try {
            behq a = behq.m95058a();
            a.mo60713b();
            File file = (File) befa.mo60643a(uri, a, new beer[0]);
            if (file.exists() && !file.isFile()) {
                return new IOException(iOException);
            }
            if (!file.exists() || file.canWrite()) {
                return m95258a(file, iOException);
            }
            return new IOException(iOException);
        } catch (IOException e) {
            return iOException;
        }
    }

    /* renamed from: a */
    private static IOException m95258a(File file, IOException iOException) {
        try {
            String valueOf = String.valueOf(String.format(Locale.US, " canonical[%s] freeSpace[%d] exists[%b] isFile[%b] canRead[%b] canWrite[%b]", file.getCanonicalPath(), Long.valueOf(file.getFreeSpace()), Boolean.valueOf(file.exists()), Boolean.valueOf(file.isFile()), Boolean.valueOf(file.canRead()), Boolean.valueOf(file.canWrite())));
            String str = valueOf.length() == 0 ? new String("Inoperable file:") : "Inoperable file:".concat(valueOf);
            int i = Build.VERSION.SDK_INT;
            try {
                StructStat stat = Os.stat(file.getCanonicalPath());
                String valueOf2 = String.valueOf(str);
                String valueOf3 = String.valueOf(String.format(Locale.US, " mode[%d]", Integer.valueOf(stat.st_mode)));
                str = valueOf3.length() == 0 ? new String(valueOf2) : valueOf2.concat(valueOf3);
            } catch (Exception e) {
            }
            return new IOException(str, iOException);
        } catch (IOException e2) {
            return iOException;
        }
    }
}
