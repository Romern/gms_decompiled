package p000;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;

/* renamed from: bjfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfb extends bjfr {

    /* renamed from: a */
    private final bjex f122610a;

    /* renamed from: b */
    private final aweg f122611b;

    public bjfb(bjex bjex, aweg aweg) {
        this.f122610a = bjex;
        this.f122611b = aweg;
    }

    /* renamed from: a */
    public final Intent mo52452a(Intent intent) {
        if (Binder.getCallingUid() != Process.myUid()) {
            return null;
        }
        intent.setExtrasClassLoader(this.f122610a.getClass().getClassLoader());
        bjfc bjfc = new bjfc(intent);
        bjie.m103593a(this.f122611b, bjfc.mo65079b().f151761b);
        return this.f122610a.mo52450a(bjfc).f122613a;
    }
}
