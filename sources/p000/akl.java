package p000;

import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: akl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akl {

    /* renamed from: a */
    public final Bundle f774a = new Bundle();

    public akl(int i) {
        mo877a(SystemClock.elapsedRealtime());
        this.f774a.putInt("playbackState", i);
    }

    /* renamed from: a */
    public final akm mo876a() {
        return new akm(this.f774a);
    }

    /* renamed from: a */
    public final void mo877a(long j) {
        this.f774a.putLong("timestamp", j);
    }

    /* renamed from: a */
    public final void mo878a(Bundle bundle) {
        this.f774a.putBundle("extras", bundle);
    }
}
