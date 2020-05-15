package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnConnectionRequestParams;

/* renamed from: aifq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aifq extends dcj implements aifs {
    public aifq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
    }

    /* renamed from: a */
    public final void mo36570a(OnConnectionRequestParams onConnectionRequestParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, onConnectionRequestParams);
        mo8530c(2, bj);
    }
}
