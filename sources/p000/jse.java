package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.common.api.Status;

/* renamed from: jse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jse extends dcj implements jsg {
    public jse(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.proximity.internal.IGetMySyncedMetadataCallback");
    }

    /* renamed from: a */
    public final void mo13960a(Status status, SyncedCryptauthDevice syncedCryptauthDevice) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, syncedCryptauthDevice);
        mo8530c(1, bj);
    }
}
