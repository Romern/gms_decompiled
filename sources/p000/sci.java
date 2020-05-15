package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ConnectionInfo;

/* renamed from: sci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sci extends dcj implements sck {
    public sci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* renamed from: a */
    public final void mo16677a(int i, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, bundle);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo16678a(int i, IBinder iBinder, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeStrongBinder(iBinder);
        dcl.m8165a(bj, bundle);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo16679a(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        bj.writeStrongBinder(iBinder);
        dcl.m8165a(bj, connectionInfo);
        mo8528b(3, bj);
    }
}
