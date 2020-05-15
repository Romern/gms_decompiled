package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;

/* renamed from: ovm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ovm extends ovc implements IBinder.DeathRecipient {

    /* renamed from: a */
    private final IBinder f38484a;

    /* renamed from: b */
    private final ots f38485b;

    public ovm(IBinder iBinder, ots ots) {
        this.f38485b = ots;
        this.f38484a = iBinder;
    }

    /* renamed from: a */
    public final void mo22660a() {
        boolean z = false;
        this.f38484a.unlinkToDeath(this, 0);
        ots ots = this.f38485b;
        if (Binder.getCallingUid() == Process.myUid()) {
            z = true;
        }
        ots.mo22620a(z);
    }

    public final void binderDied() {
        Log.e("CAR.MISC", "Remote process died before validation");
        this.f38484a.unlinkToDeath(this, 0);
        this.f38485b.mo22620a(false);
    }
}
