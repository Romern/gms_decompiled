package p000;

import android.os.SystemClock;
import android.text.format.DateUtils;
import android.text.format.Time;

/* renamed from: axxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axxw {

    /* renamed from: a */
    public int f96719a;

    /* renamed from: b */
    public int f96720b;

    /* renamed from: c */
    private long f96721c;

    /* renamed from: d */
    private long f96722d;

    /* renamed from: e */
    private long f96723e;

    /* renamed from: a */
    public final void mo53749a() {
        this.f96719a++;
    }

    /* renamed from: b */
    public final void mo53752b() {
        this.f96720b++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53750a(ssb ssb) {
        long j = this.f96723e;
        if (j == 0) {
            j = SystemClock.elapsedRealtime();
        }
        long j2 = this.f96721c;
        Time time = new Time();
        time.set(j2);
        ssb.printf("Session: %s, (%d/%d), duration %s", time.format("%Y-%m-%d %H:%M:%S"), Integer.valueOf(this.f96719a), Integer.valueOf(this.f96720b), DateUtils.formatElapsedTime((j - this.f96722d) / 1000));
    }

    /* renamed from: a */
    public final void mo53751a(boolean z) {
        if (z) {
            this.f96720b = 0;
            this.f96719a = 0;
            this.f96722d = SystemClock.elapsedRealtime();
            this.f96723e = 0;
            this.f96721c = System.currentTimeMillis();
            return;
        }
        this.f96723e = SystemClock.elapsedRealtime();
    }
}
