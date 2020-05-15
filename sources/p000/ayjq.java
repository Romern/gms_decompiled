package p000;

import android.util.Log;
import java.util.Random;

/* renamed from: ayjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjq {

    /* renamed from: a */
    public final String f97766a;

    /* renamed from: b */
    public final Random f97767b;

    /* renamed from: c */
    public long f97768c;

    /* renamed from: d */
    public long f97769d;

    /* renamed from: e */
    public long f97770e;

    public ayjq(Random random, String str) {
        this.f97767b = random;
        this.f97766a = str;
        mo54035a();
    }

    /* renamed from: a */
    public final void mo54035a() {
        synchronized (this) {
            if (Log.isLoggable(this.f97766a, 2)) {
                Log.v(this.f97766a, "RateLimiter: reset");
            }
            this.f97768c = 0;
            this.f97769d = 0;
            this.f97770e = 0;
        }
    }

    /* renamed from: b */
    public final long mo54036b() {
        long j;
        synchronized (this) {
            j = this.f97769d + (this.f97768c * 1000);
        }
        return j;
    }

    /* renamed from: c */
    public final long mo54037c() {
        long j;
        synchronized (this) {
            j = this.f97768c * 1000;
        }
        return j;
    }
}
