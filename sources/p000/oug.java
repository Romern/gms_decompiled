package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: oug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oug extends dcj implements oui {
    public oug(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.carsetup.IConnectionTransferCallbacks");
    }

    /* renamed from: a */
    public final void mo22653a() {
        mo8528b(2, mo8529bj());
    }

    /* renamed from: a */
    public final void mo22654a(Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, bundle);
        mo8528b(1, bj);
    }
}
