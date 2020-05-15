package p000;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;

/* renamed from: rap */
public final /* synthetic */ class rap implements Runnable {

    /* renamed from: a */
    public static final Runnable f42570a = new rap();

    private rap() {
    }

    public final void run() {
        rds rds = null;
        try {
            rds = rds.m33429c();
            try {
                rdp a = rds.mo24518a();
                if (a != null) {
                    a.mo24482a(2);
                }
            } catch (SQLiteException | IOException e) {
                e = e;
                try {
                    Log.e("ClearcutBootCompleteIntentOperation", "Could not write internal log event: ", e);
                    srz.m36176b(rds);
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (SQLiteException | IOException e2) {
            e = e2;
            Log.e("ClearcutBootCompleteIntentOperation", "Could not write internal log event: ", e);
            srz.m36176b(rds);
        } catch (Throwable th2) {
            th = th2;
            srz.m36176b(rds);
            throw th;
        }
        srz.m36176b(rds);
    }
}
