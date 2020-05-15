package p000;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;

/* renamed from: rdu */
public final /* synthetic */ class rdu implements Runnable {

    /* renamed from: a */
    public static final Runnable f42764a = new rdu();

    private rdu() {
    }

    public final void run() {
        rds rds = null;
        try {
            rds = rds.m33429c();
            try {
                rdp a = rds.mo24518a();
                if (a != null) {
                    a.mo24482a(1);
                }
            } catch (SQLiteException | IOException e) {
                e = e;
                try {
                    Log.e("WallClockChangedIntentOperation", "Could not write internal log event.", e);
                    srz.m36176b(rds);
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (SQLiteException | IOException e2) {
            e = e2;
            Log.e("WallClockChangedIntentOperation", "Could not write internal log event.", e);
            srz.m36176b(rds);
        } catch (Throwable th2) {
            th = th2;
            srz.m36176b(rds);
            throw th;
        }
        srz.m36176b(rds);
    }
}
