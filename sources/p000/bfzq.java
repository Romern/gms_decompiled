package p000;

import android.os.SystemClock;

/* renamed from: bfzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfzq extends bfzc {
    public bfzq(bfzt bfzt, bfyy bfyy) {
        super(bfzt, bfyy);
    }

    /* renamed from: a */
    public final bpms mo62472a() {
        return bpms.UNAVAILABLE_ACTIVITY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo62473b() {
        return 180;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo62474c() {
        long j;
        if (this.f115763b.mo62460a()) {
            return 60;
        }
        if (!this.f115763b.f115745c.mo62389a(SystemClock.elapsedRealtime(), 900000, 780000, 6)) {
            j = 60;
        } else {
            j = 120;
        }
        boolean z = bfxc.f115575a;
        return (int) Math.max(j, (long) Math.min(1800, this.f115763b.f115743a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo62475d() {
        int i = this.f115763b.f115744b;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    /* renamed from: g */
    public final String mo62478g() {
        return "UnavailableActivityState";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final double mo62479h() {
        return 41.67d;
    }
}
