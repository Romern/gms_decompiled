package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: end */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class end extends dcj implements IInterface {
    public end(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.zapp.protocol.IPlayModuleService");
    }

    /* renamed from: a */
    public final void mo10314a(String str, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        dcl.m8165a(bj, bundle);
        mo8530c(3, bj);
    }
}
