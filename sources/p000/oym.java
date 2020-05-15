package p000;

import android.os.IBinder;

/* renamed from: oym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oym implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final oml f38618a;

    /* renamed from: b */
    final /* synthetic */ oyn f38619b;

    public oym(oyn oyn, oml oml) {
        this.f38619b = oyn;
        this.f38618a = oml;
        oml.asBinder().linkToDeath(this, 0);
    }

    public final void binderDied() {
        synchronized (this.f38619b.f38620a) {
            this.f38619b.f38621b.remove(this);
        }
    }
}
