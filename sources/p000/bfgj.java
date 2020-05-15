package p000;

import android.os.SystemClock;

/* renamed from: bfgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfgj {

    /* renamed from: a */
    private int f113764a = 0;

    /* renamed from: b */
    private long f113765b = -1;

    /* renamed from: a */
    public final synchronized long mo61655a() {
        long j;
        int i = this.f113764a;
        if (i != 0) {
            j = this.f113765b + ((long) Math.ceil((double) (((float) i) * 400.0f)));
        } else {
            j = SystemClock.uptimeMillis();
        }
        return j;
    }

    /* renamed from: b */
    public final synchronized void mo61656b() {
        if (this.f113765b == -1) {
            this.f113765b = SystemClock.uptimeMillis();
        }
        this.f113764a++;
    }
}
