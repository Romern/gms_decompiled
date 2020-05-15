package p000;

import android.os.SystemClock;

/* renamed from: sgf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class sgf {

    /* renamed from: a */
    public static final sgf f44164a = new sge();

    /* renamed from: b */
    private final long f44165b;

    /* renamed from: c */
    private final long f44166c;

    /* renamed from: d */
    private long f44167d;

    public sgf(int i, int i2, int i3) {
        long j = ((long) i) * 1000;
        this.f44165b = j;
        this.f44166c = ((long) i3) * j;
        this.f44167d = SystemClock.elapsedRealtime() + (((long) (1 - i2)) * this.f44165b);
    }

    /* renamed from: a */
    public boolean mo25492a() {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f44167d;
            if (elapsedRealtime < j) {
                return false;
            }
            this.f44167d = Math.max(j, elapsedRealtime - this.f44166c) + this.f44165b;
            return true;
        }
    }
}
