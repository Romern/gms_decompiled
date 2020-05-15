package p000;

import android.content.Context;
import android.os.Process;
import android.system.Os;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* renamed from: avou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avou {

    /* renamed from: a */
    private static final sek f93679a = avpq.m79018e("InstallationUtil");

    /* renamed from: a */
    public static avsw m78959a() {
        avtn avtn = (avtn) avtn.f93892a.mo51589b();
        bmxv bmxv = (bmxv) avtn.mo51607b(avnp.f93532g);
        if (bmxv.mo66813a()) {
            return (avsw) bmxv.mo66814b();
        }
        return avlx.m78762a((avte) avtn.mo51607b(avnp.f93531f));
    }

    /* renamed from: a */
    public static bngx m78960a(Context context) {
        bngs j = bngx.m109377j();
        if (!bmxx.m108577a(cfsg.m142823j())) {
            j.mo67668c(C1240of.m19758a("AUTHORIZATION", cfsg.m142823j()));
        }
        try {
            String b = qdf.m31915b(context);
            if (!bmxx.m108577a(b)) {
                j.mo67668c(C1240of.m19758a("DDVI", b));
            }
        } catch (Exception e) {
            f93679a.mo25415d("Failed to set ddvi as a download request property.", e, new Object[0]);
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    public static void m78961a(String str, String str2) {
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            while (nextEntry != null) {
                if (!nextEntry.isDirectory()) {
                    if (!"care_map.pb".equals(nextEntry.getName())) {
                        if (!"care_map.txt".equals(nextEntry.getName())) {
                            nextEntry = zipInputStream.getNextEntry();
                        }
                    }
                    File file = new File(str2, nextEntry.getName());
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        int gidForName = Process.getGidForName("cache");
                        int i = Os.getuid();
                        if (gidForName != -1) {
                            Os.fchown(fileOutputStream.getFD(), i, gidForName);
                            Os.fchmod(fileOutputStream.getFD(), 416);
                        }
                    } catch (Exception e) {
                        f93679a.mo25417e("Failed to set group owner.", e, new Object[0]);
                    } catch (Throwable th) {
                        fileOutputStream.close();
                        throw th;
                    }
                    fileOutputStream.close();
                    file.getAbsolutePath();
                    return;
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            zipInputStream.close();
            throw new IOException("Unable to find care_map file.");
        } finally {
            zipInputStream.close();
        }
    }
}
