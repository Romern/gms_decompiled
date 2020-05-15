package p000;

import android.content.Context;
import java.io.File;

/* renamed from: pbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pbn extends pbs {

    /* renamed from: a */
    private long f38789a = -1;

    /* renamed from: a */
    public final int mo22873a() {
        return 0;
    }

    /* renamed from: a */
    public final void mo22875a(long j) {
        this.f38789a = j;
    }

    /* renamed from: b */
    public final String mo22876b() {
        return "com.google.android.gms.car.DB_MIGRATION";
    }

    /* renamed from: c */
    public final long mo22877c() {
        return ccpz.m131236c();
    }

    /* renamed from: d */
    public final boolean mo22878d() {
        if (nzi.m28224a()) {
            return true;
        }
        if (!ccpz.m131237d() || this.f38789a < ccpz.m131236c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final File mo22874a(Context context) {
        return pbp.m30149a(context);
    }
}
