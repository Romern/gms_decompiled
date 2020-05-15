package p000;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* renamed from: bfqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfqv {

    /* renamed from: a */
    public final Map f114946a = new HashMap();

    /* renamed from: b */
    public final bfpc f114947b;

    /* renamed from: c */
    public long f114948c;

    /* renamed from: d */
    public boolean f114949d;

    /* renamed from: e */
    private final Random f114950e = new Random();

    public bfqv(bfpc bfpc) {
        this.f114947b = bfpc;
        mo62165a();
    }

    /* renamed from: a */
    public final void mo62165a() {
        boolean z;
        if (((double) this.f114950e.nextFloat()) < ceyp.f183514a.mo6606a().gnssStatusStatsSamplingRate()) {
            z = true;
        } else {
            z = false;
        }
        this.f114949d = z;
        this.f114948c = SystemClock.elapsedRealtime();
    }
}
