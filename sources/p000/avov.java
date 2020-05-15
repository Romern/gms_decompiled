package p000;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.system.Os;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.regex.Pattern;

/* renamed from: avov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avov {

    /* renamed from: a */
    private static final Logger f93680a = avpq.m79018e("PackageFiles");

    /* renamed from: b */
    private static final Pattern f93681b = Pattern.compile("(.*)(/cache)(/.*|$)");

    /* renamed from: a */
    public static long m78962a(Context context, String str, boolean z) {
        if (cftt.m143037b()) {
            int i = Build.VERSION.SDK_INT;
            if (!m78967a(str)) {
                StorageManager storageManager = (StorageManager) context.getSystemService("storage");
                if (z) {
                    try {
                        return storageManager.getAllocatableBytes(storageManager.getUuidForPath(new File(str)), 1);
                    } catch (SecurityException e) {
                        f93680a.mo25415d("Failed to getAllocatableBytes using aggressive flag for %s, falling back to regular getAllocatableBytes.", e, str);
                    }
                }
                return storageManager.getAllocatableBytes(storageManager.getUuidForPath(new File(str)));
            }
        }
        StatFs statFs = new StatFs(str);
        int i2 = Build.VERSION.SDK_INT;
        return statFs.getAvailableBytes();
    }

    /* renamed from: b */
    public static File m78968b() {
        File file = new File("/cache");
        file.mkdirs();
        return file;
    }

    /* renamed from: b */
    public static void m78969b(Context context) {
        if (((Boolean) ((avtn) avtn.f93892a.mo51589b()).mo51607b(avnp.f93536k)).booleanValue()) {
            m78970b(m78963a());
            m78970b(m78964a(context));
            srj.m36120a(new File(m78968b(), "update.zip"));
            srj.m36120a(new File(m78968b(), "update_s.zip"));
            srj.m36120a(new File(m78968b(), "care_map.pb"));
            srj.m36120a(new File(m78968b(), "care_map.txt"));
            srj.m36120a(new File(m78968b(), "metadata"));
            ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93536k.mo51602b(false));
        }
    }

    /* renamed from: b */
    private static void m78970b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                srj.m36120a(file2);
            }
        }
    }

    /* renamed from: a */
    public static File m78963a() {
        return new File("/data/ota_package");
    }

    /* renamed from: a */
    public static File m78964a(Context context) {
        return context.getDir("download", 0);
    }

    /* renamed from: a */
    public static RandomAccessFile m78965a(Context context, File file, long j, boolean z) {
        ((avtn) avtn.f93892a.mo51589b()).mo51605a(avnp.f93536k.mo51602b(true));
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        if (cftt.m143037b()) {
            int i = Build.VERSION.SDK_INT;
            if (!m78967a(file.getAbsolutePath())) {
                StorageManager storageManager = (StorageManager) context.getSystemService("storage");
                if (z) {
                    try {
                        f93680a.mo25414c("Aggressive allocating space for file %s with size %d.", file.getAbsolutePath(), Long.valueOf(j));
                        storageManager.allocateBytes(randomAccessFile.getFD(), j, 1);
                        return randomAccessFile;
                    } catch (SecurityException e) {
                        f93680a.mo25415d("Failed to aggressive allocate space for %s using StorageManager, falling back to regular allocate using StorageManager.", e, file.getName());
                    }
                }
                f93680a.mo25414c("Allocating space for file %s with size %d.", file.getAbsolutePath(), Long.valueOf(j));
                storageManager.allocateBytes(randomAccessFile.getFD(), j);
                return randomAccessFile;
            }
        }
        f93680a.mo25414c("Allocating file %s with size %d.", file.getAbsolutePath(), Long.valueOf(j));
        int i2 = Build.VERSION.SDK_INT;
        try {
            Os.posix_fallocate(randomAccessFile.getFD(), 0, j);
            randomAccessFile.setLength(j);
            return randomAccessFile;
        } catch (Exception e2) {
            throw new IOException("Unable to allocate the file.", e2);
        }
    }

    /* renamed from: a */
    public static void m78966a(File file) {
        int i = Build.VERSION.SDK_INT;
        String path = file.getPath();
        int gidForName = Process.getGidForName("cache");
        if (gidForName != -1) {
            try {
                Os.chown(path, Os.getuid(), gidForName);
                Os.chmod(path, 416);
            } catch (Exception e) {
                f93680a.mo25417e("Failed to set group owner for the file: %s.", e, path);
            }
        }
    }

    /* renamed from: a */
    private static boolean m78967a(String str) {
        return f93681b.matcher(str).matches();
    }
}
