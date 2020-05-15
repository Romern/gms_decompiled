package p000;

import android.os.Bundle;
import android.os.SystemClock;

/* renamed from: ami */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ami {

    /* renamed from: a */
    public final Bundle f905a = new Bundle();

    public ami(int i) {
        mo1031a(SystemClock.elapsedRealtime());
        this.f905a.putInt("sessionState", i);
    }

    /* renamed from: a */
    public final void mo1031a(long j) {
        this.f905a.putLong("timestamp", j);
    }
}
