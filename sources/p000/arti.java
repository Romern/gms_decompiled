package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;

/* renamed from: arti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arti extends dcj implements artk {
    public arti(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
    }

    /* renamed from: a */
    public final void mo48812a(Status status, ConnectionHint connectionHint) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, connectionHint);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo48815b(Status status, HandshakeData handshakeData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, handshakeData);
        mo8530c(2, bj);
    }

    /* renamed from: c */
    public final void mo48816c(Status status, HandshakeData handshakeData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, handshakeData);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo48813a(Status status, HandshakeData handshakeData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, handshakeData);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo48814a(Status status, PostSetupAuthData postSetupAuthData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, postSetupAuthData);
        mo8530c(5, bj);
    }
}
