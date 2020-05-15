package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bdiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdiz {

    /* renamed from: a */
    public static final bnrt f105719a = bnrt.m110178a("bdiz");

    /* renamed from: a */
    public static long m90882a(File[] fileArr) {
        long j = 0;
        try {
            int length = fileArr.length;
            int i = 0;
            while (i < length) {
                try {
                    File file = fileArr[i];
                    if (!m90885a(file)) {
                        if (file.isFile()) {
                            j += file.length();
                        } else if (!file.isDirectory()) {
                            bnrq bnrq = (bnrq) f105719a.mo68388c();
                            bnrq.mo68432a("bdiz", "a", 41, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnrq.mo68420a("not a link / dir / regular file: %s", file);
                        } else {
                            j += m90882a(file.listFiles());
                        }
                    }
                    i++;
                } catch (IOException | SecurityException e) {
                    e = e;
                    bnrq bnrq2 = (bnrq) f105719a.mo68388c();
                    bnrq2.mo68437a(e);
                    bnrq2.mo68432a("bdiz", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnrq2.mo68405a("failure computing subtree size");
                    return j;
                }
            }
        } catch (IOException | SecurityException e2) {
            e = e2;
            bnrq bnrq22 = (bnrq) f105719a.mo68388c();
            bnrq22.mo68437a(e);
            bnrq22.mo68432a("bdiz", "a", 45, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq22.mo68405a("failure computing subtree size");
            return j;
        }
        return j;
    }

    /* renamed from: a */
    public static bngx m90883a(Context context, int i, bngx bngx) {
        File file;
        beel.m91856c();
        ArrayList arrayList = new ArrayList();
        try {
            file = new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).dataDir);
        } catch (PackageManager.NameNotFoundException e) {
            try {
                bnrq bnrq = (bnrq) f105719a.mo68388c();
                bnrq.mo68432a("bdiz", "a", 193, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Failed to use package manager getting data directory from context instead.");
                File filesDir = context.getFilesDir();
                if (filesDir != null) {
                    file = filesDir.getParentFile();
                } else {
                    file = null;
                }
            } catch (Exception e2) {
                bnrq bnrq2 = (bnrq) f105719a.mo68388c();
                bnrq2.mo68437a(e2);
                bnrq2.mo68432a("bdiz", "a", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq2.mo68405a("Failed to retrieve DirStats.");
                return bngx.m109376e();
            }
        }
        if (file == null) {
            return bngx.m109376e();
        }
        m90884a(file, arrayList, i, bngx);
        return bngx.m109368a((Collection) arrayList);
    }

    /* renamed from: a */
    public static void m90884a(File file, List list, int i, bngx bngx) {
        bdiy bdiy = new bdiy(file, list, i, bngx);
        bdiy.mo58077a(new bdix(bdiy));
    }

    /* renamed from: a */
    static boolean m90885a(File file) {
        int i = Build.VERSION.SDK_INT;
        return Files.isSymbolicLink(file.toPath());
    }
}
