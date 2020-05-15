package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: avos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avos implements avpv {

    /* renamed from: a */
    private static final Logger f93669a = avpq.m79018e("DefaultFileProvider");

    /* renamed from: b */
    private final Context f93670b;

    /* renamed from: c */
    private final String f93671c;

    /* renamed from: d */
    private final Object f93672d = new Object();

    /* renamed from: e */
    private final boolean f93673e;

    /* renamed from: f */
    private String f93674f;

    private avos(Context context, String str, String str2, boolean z) {
        sdo.m34959a(context);
        this.f93670b = context;
        sdo.m34977c(str);
        this.f93671c = str;
        this.f93674f = str2;
        this.f93673e = z;
    }

    /* renamed from: a */
    public static avos m78951a(Context context, String str, String str2, boolean z) {
        return new avos(context, str, str2, z);
    }

    /* renamed from: b */
    private final File m78953b(String str, long j, boolean z) {
        long a = avov.m78962a(this.f93670b, "/cache", z);
        if (a - j < ((Long) avlt.f93329b.mo51364a()).longValue()) {
            f93669a.mo25414c("Not enough space under /cache, available: %d, file size: %d, required min space: %d.", Long.valueOf(a), Long.valueOf(j), avlt.f93329b.mo51364a());
            return null;
        } else if (avov.m78962a(this.f93670b, "/data", z) >= ((Long) avlt.f93328a.mo51364a()).longValue()) {
            return new File(avov.m78968b(), str);
        } else {
            f93669a.mo25414c("Not enough space under /data, available: %d, required min space: %d.", Long.valueOf(a), avlt.f93328a.mo51364a());
            return null;
        }
    }

    /* renamed from: a */
    private final File m78952a(String str, long j, boolean z) {
        long a = avov.m78962a(this.f93670b, "/data", z);
        if (a - j < ((Long) avlt.f93328a.mo51364a()).longValue()) {
            f93669a.mo25414c("Not enough space under /data, available: %d, file size: %d, required min space: %d.", Long.valueOf(a), Long.valueOf(j), avlt.f93328a.mo51364a());
            return null;
        }
        File a2 = avov.m78963a();
        if (a2.exists()) {
            return new File(a2, str);
        }
        if (avls.m78732a() || new File("/system/bin/uncrypt").exists()) {
            return new File(avov.m78964a(this.f93670b), str);
        }
        return null;
    }

    /* renamed from: a */
    public final RandomAccessFile mo51459a(long j) {
        File file;
        try {
            String a = mo51460a();
            if (!bmxx.m108577a(a)) {
                return new RandomAccessFile(a, "rw");
            }
            if (avls.m78732a()) {
                file = m78952a(this.f93671c, j, this.f93673e);
            } else if (!cfsd.f185543a.mo6606a().mo82606n()) {
                file = m78953b(this.f93671c, j, this.f93673e);
                if (file == null) {
                    file = m78952a(this.f93671c, j, this.f93673e);
                }
            } else {
                file = m78952a(this.f93671c, j, this.f93673e);
                if (file == null) {
                    file = m78953b(this.f93671c, j, this.f93673e);
                }
            }
            if (file != null) {
                String absolutePath = file.getAbsolutePath();
                synchronized (this.f93672d) {
                    this.f93674f = absolutePath;
                }
                return avov.m78965a(this.f93670b, file, j, this.f93673e);
            }
            throw new avpu("Unable to create the file.");
        } catch (IOException e) {
            throw new avpu("Unable to create the file.", e);
        }
    }

    /* renamed from: a */
    public final String mo51460a() {
        String str;
        synchronized (this.f93672d) {
            str = this.f93674f;
        }
        return str;
    }
}
