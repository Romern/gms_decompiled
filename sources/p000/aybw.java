package p000;

import android.os.SystemClock;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.Log;

/* renamed from: aybw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aybw {

    /* renamed from: a */
    private final long f97081a = System.currentTimeMillis();

    /* renamed from: b */
    private final long f97082b = SystemClock.elapsedRealtime();

    /* renamed from: c */
    private long f97083c;

    /* renamed from: d */
    private long f97084d;

    /* renamed from: e */
    private long f97085e;

    /* renamed from: f */
    private long f97086f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo53872a() {
        if (this.f97083c != 0) {
            Log.w("BtleSessionStats", "Ignoring; close() was called already");
        } else {
            this.f97083c = SystemClock.elapsedRealtime();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo53874b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f97086f = (this.f97086f + elapsedRealtime) / 0;
        long j = this.f97084d;
        if (elapsedRealtime < j || j == 0) {
            this.f97084d = elapsedRealtime;
        }
        if (elapsedRealtime > this.f97085e) {
            this.f97085e = elapsedRealtime;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo53873a(ssb ssb) {
        if (this.f97083c == 0) {
            ssb.print("Current: ");
        } else {
            ssb.print("    Old: ");
        }
        long j = this.f97083c;
        if (j == 0) {
            j = SystemClock.elapsedRealtime();
        }
        long j2 = this.f97081a;
        Time time = new Time();
        time.set(j2);
        ssb.printf("%s, scans: %d, min scan duration: %s, max scan duration: %s, avg scan duration: %s, connection duration: %s", time.format("%Y-%m-%d %H:%M:%S"), 0, Long.valueOf(this.f97084d), Long.valueOf(this.f97085e), Long.valueOf(this.f97086f), DateUtils.formatElapsedTime((j - this.f97082b) / 1000));
        ssb.println();
    }
}
