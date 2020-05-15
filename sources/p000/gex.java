package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: gex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gex extends dcj implements gez {
    public gex(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.audiomodem.internal.IAudioModemCallback");
    }

    /* renamed from: a */
    public final void mo11755a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(1, bj);
    }
}
