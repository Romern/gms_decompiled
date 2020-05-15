package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: aaac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaac {

    /* renamed from: a */
    public final sbj f27822a;

    /* renamed from: b */
    public final int f27823b;

    public aaac(sbj sbj, int i) {
        this.f27822a = sbj;
        this.f27823b = i;
    }

    /* renamed from: a */
    public final void mo16650a(int i, Bundle bundle) {
        mo16651a(i, null, bundle);
    }

    /* renamed from: b */
    public final void mo16655b(IBinder.DeathRecipient deathRecipient) {
        this.f27822a.asBinder().unlinkToDeath(deathRecipient, 0);
    }

    /* renamed from: a */
    public final void mo16651a(int i, IBinder iBinder, Bundle bundle) {
        try {
            this.f27822a.mo16678a(i, iBinder, bundle);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo16652a(aaai aaai) {
        mo16653a(aaai, (Bundle) null);
    }

    /* renamed from: a */
    public final void mo16653a(aaai aaai, Bundle bundle) {
        try {
            this.f27822a.mo16678a(0, aaai.asBinder(), bundle);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final void mo16654a(IBinder.DeathRecipient deathRecipient) {
        this.f27822a.asBinder().linkToDeath(deathRecipient, 0);
    }
}
