package p000;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: avox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avox implements avpv {

    /* renamed from: a */
    private static final sek f93683a = avpq.m79018e("PropertyFileProvider");

    /* renamed from: b */
    private final String f93684b;

    /* renamed from: c */
    private final Context f93685c;

    /* renamed from: d */
    private final boolean f93686d;

    private avox(Context context, String str, boolean z) {
        sdo.m34970a(avls.m78732a());
        int i = Build.VERSION.SDK_INT;
        sdo.m34970a(true);
        this.f93685c = context;
        sdo.m34977c(str);
        this.f93684b = str;
        this.f93686d = z;
    }

    /* renamed from: a */
    public static avox m78972a(Context context, String str, boolean z) {
        return new avox(context, str, z);
    }

    /* renamed from: a */
    public final RandomAccessFile mo51459a(long j) {
        File file;
        try {
            String str = this.f93684b;
            long a = avov.m78962a(this.f93685c, "/data", this.f93686d);
            if (a < j) {
                f93683a.mo25414c("Not enough space under /data, available: %d, property file size: %d.", Long.valueOf(a), Long.valueOf(j));
                file = null;
            } else {
                file = new File(avov.m78963a(), str);
            }
            if (file != null) {
                return avov.m78965a(this.f93685c, file, j, this.f93686d);
            }
            throw new avpu("Unable to create the file.");
        } catch (IOException e) {
            throw new avpu("Unable to create the file.", e);
        }
    }
}
