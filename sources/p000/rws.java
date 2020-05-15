package p000;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: rws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rws extends rvd {
    public rws() {
        super("WrCrashHapFileFix", TimeUnit.MINUTES.toSeconds(5));
    }

    /* renamed from: a */
    public static File m34583a(Context context) {
        return new File(context.getFilesDir(), "CFN.now");
    }

    /* renamed from: b */
    public final rvl mo25189b(rvl rvl) {
        Log.i("WrCrashHapFileFix", "Writing the crash file!");
        File a = m34583a(rvl.f43760b);
        try {
            if (!a.exists()) {
                a.createNewFile();
            }
            rvk d = rvl.mo25205d();
            d.mo25199a(this, 3);
            return d.mo25198a();
        } catch (IOException | SecurityException e) {
            Log.e("WrCrashHapFileFix", "Unable to record to our file.", e);
            rvk d2 = rvl.mo25205d();
            d2.mo25199a(this, 5);
            return d2.mo25198a();
        }
    }

    /* renamed from: a */
    public final boolean mo25188a(rvl rvl) {
        return cdng.m134177d();
    }
}
