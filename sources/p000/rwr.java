package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: rwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rwr extends rvd {
    public rwr() {
        super("WriteRestartFix", 0);
    }

    /* renamed from: a */
    public final boolean mo25188a(rvl rvl) {
        return cdng.m134179f();
    }

    /* renamed from: b */
    public final rvl mo25189b(rvl rvl) {
        Log.i("WriteRestartFix", "applying WriteRestartFix");
        File file = new File(rvl.f43760b.getFilesDir(), "safeboot_restarts");
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder(20);
            sb.append(currentTimeMillis);
            File file2 = new File(file, sb.toString());
            if (!file2.exists()) {
                file2.createNewFile();
            }
            Log.i("WriteRestartFix", "Finished writing restart file!");
            rvk d = rvl.mo25205d();
            d.mo25199a(this, 3);
            return d.mo25198a();
        } catch (IOException | SecurityException e) {
            Log.e("WriteRestartFix", "Unable to record the restart.", e);
            rvk d2 = rvl.mo25205d();
            d2.mo25199a(this, 5);
            return d2.mo25198a();
        }
    }
}
