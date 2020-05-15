package p000;

import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.stats.radio.RadiosTracingLoggerProvider;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: smk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class smk implements RadiosTracingLoggerProvider.Logger {

    /* renamed from: a */
    protected final String f44764a;

    /* renamed from: b */
    protected final sqj f44765b;

    public smk() {
        this.f44764a = null;
        this.f44765b = null;
    }

    public final int deleteEntries(String str, long j, long j2) {
        if (isNopLogger()) {
            return 0;
        }
        return this.f44765b.mo25969a(this.f44764a, String.valueOf(str).concat(" BETWEEN ? AND ?"), new String[]{String.valueOf(j), String.valueOf(j2)});
    }

    public final boolean isNopLogger() {
        return this.f44765b == null;
    }

    public final void logAsync(Object obj) {
        if (!isNopLogger()) {
            this.f44765b.mo25972a(obj);
        }
    }

    public smk(SQLiteOpenHelper sQLiteOpenHelper, String str, sqh sqh, ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit, int i) {
        this.f44764a = str;
        this.f44765b = new sqj(sQLiteOpenHelper, str, sqh, scheduledExecutorService, j, timeUnit, i);
    }
}
