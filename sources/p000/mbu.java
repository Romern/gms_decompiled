package p000;

import android.content.Context;
import java.io.File;
import java.util.Locale;

/* renamed from: mbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mbu {

    /* renamed from: a */
    public static final sek f33376a = new lvn("BackupLogDumper");

    /* renamed from: b */
    public final File f33377b;

    public mbu(Context context) {
        this.f33377b = new File(context.getFilesDir(), "backup_cloud_logs");
    }

    /* renamed from: a */
    public final File mo19818a(long j, int i) {
        return new File(this.f33377b, String.format(Locale.US, "cloud_event_%010d_%d", Long.valueOf(j), Integer.valueOf(i)));
    }
}
