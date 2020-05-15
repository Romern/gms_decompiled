package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;

/* renamed from: aigs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aigs extends dcj implements aigu {
    public aigs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
    }

    /* renamed from: a */
    public final void mo36573a(OnStartAdvertisingResultParams onStartAdvertisingResultParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onStartAdvertisingResultParams);
        mo8530c(2, bj);
    }
}
