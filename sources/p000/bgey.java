package p000;

import android.os.SystemClock;

/* renamed from: bgey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgey {

    /* renamed from: a */
    public boolean f116318a = true;

    /* renamed from: b */
    public long f116319b = -1;

    /* renamed from: c */
    private long f116320c = -1;

    /* renamed from: d */
    private long f116321d = -1;

    public bgey(boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f116318a = z;
        this.f116320c = elapsedRealtime;
        this.f116321d = elapsedRealtime;
        this.f116319b = m98723b();
    }

    /* renamed from: b */
    private final long m98723b() {
        return Math.max(this.f116320c, this.f116321d);
    }

    /* renamed from: a */
    public final void mo62732a() {
        this.f116321d = SystemClock.elapsedRealtime();
        this.f116319b = m98723b();
    }

    /* renamed from: a */
    public final void mo62733a(boolean z) {
        this.f116318a = z;
        this.f116320c = SystemClock.elapsedRealtime();
        this.f116319b = m98723b();
    }
}
