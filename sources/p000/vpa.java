package p000;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;

/* renamed from: vpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpa {

    /* renamed from: b */
    private static final sbw f49697b = new sbw("FileSystemUtils", "");

    /* renamed from: a */
    public final Context f49698a;

    /* renamed from: c */
    private final sfr f49699c;

    public vpa(Context context) {
        sfr sfr = sfr.f44142a;
        sdo.m34959a(context);
        this.f49698a = context;
        sdo.m34959a(sfr);
        this.f49699c = sfr;
    }

    /* renamed from: g */
    private final boolean m40977g() {
        return this.f49699c.mo25481a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: b */
    public final long mo28714b() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long a = m40975a(statFs);
        int i = Build.VERSION.SDK_INT;
        return a * statFs.getBlockCountLong();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: c */
    public final long mo28715c() {
        long longValue = ((Long) twy.f46897x.mo58455c()).longValue();
        double doubleValue = ((Double) twy.f46898y.mo58455c()).doubleValue();
        long b = mo28714b();
        long max = Math.max(0L, mo28713a() - ((Long) twy.f46899z.mo58455c()).longValue());
        double d = (double) b;
        Double.isNaN(d);
        return Math.min(Math.min(longValue, (long) (doubleValue * d)), max);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return null;
     */
    /* renamed from: d */
    public final synchronized File mo28716d() {
        File externalFilesDir;
        if (m40977g() && (externalFilesDir = this.f49698a.getExternalFilesDir(null)) != null) {
            File file = new File(externalFilesDir, "pinned_docs_files_do_not_edit");
            if (file.exists() && file.isDirectory()) {
                return file;
            }
        }
    }

    /* renamed from: e */
    public final File mo28717e() {
        File dir = this.f49698a.getDir("drive_content_do_not_modify", 0);
        m40976a(dir);
        return dir;
    }

    /* renamed from: f */
    public final File mo28718f() {
        File externalFilesDir;
        if (!m40977g()) {
            return null;
        }
        try {
            if (Environment.isExternalStorageEmulated() || (externalFilesDir = this.f49698a.getExternalFilesDir(null)) == null) {
                return null;
            }
            try {
                File file = new File(externalFilesDir, "drive_content_do_not_modify");
                m40976a(file);
                return file;
            } catch (IOException e) {
                f49697b.mo25378c("FileSystemUtils", "Unable to create shared content directory; disabling shared storage.", e);
                return null;
            }
        } catch (IllegalArgumentException e2) {
            f49697b.mo25378c("FileSystemUtils", "Unable to locate external storage device; disabling shared storage.", e2);
            return null;
        }
    }

    /* renamed from: a */
    private static final long m40975a(StatFs statFs) {
        int i = Build.VERSION.SDK_INT;
        return statFs.getBlockSizeLong();
    }

    /* renamed from: a */
    private static final void m40976a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 42);
                sb.append("Unable to create directory: ");
                sb.append(absolutePath);
                sb.append(" - file exists");
                throw new IOException(sb.toString());
            }
        }
        if (!file.mkdirs()) {
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new IOException(valueOf.length() == 0 ? new String("Unable to create cache directory: ") : "Unable to create cache directory: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    public final long mo28713a() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long a = m40975a(statFs);
        int i = Build.VERSION.SDK_INT;
        return a * statFs.getAvailableBlocksLong();
    }
}
