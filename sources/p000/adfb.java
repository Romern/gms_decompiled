package p000;

import android.os.SystemClock;

/* renamed from: adfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfb {

    /* renamed from: a */
    final /* synthetic */ adfd f61541a;

    /* renamed from: b */
    private final long f61542b;

    public adfb(adfd adfd) {
        this.f61541a = adfd;
        this.f61542b = -1;
    }

    /* renamed from: a */
    public final long mo33408a() {
        return SystemClock.elapsedRealtime() - this.f61542b;
    }

    public adfb(adfd adfd, long j) {
        this.f61541a = adfd;
        this.f61542b = SystemClock.elapsedRealtime() - j;
    }

    /* renamed from: a */
    public final void mo33409a(String str) {
        if (this.f61542b >= 0 && this.f61541a.f61544a != null) {
            long a = mo33408a();
            Object[] objArr = {str, Long.valueOf(a)};
            this.f61541a.mo33413a(str).mo24368a(a);
        }
    }
}
