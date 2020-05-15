package p000;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;

/* renamed from: artk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface artk extends IInterface {
    /* renamed from: a */
    void mo48812a(Status status, ConnectionHint connectionHint);

    /* renamed from: a */
    void mo48813a(Status status, HandshakeData handshakeData);

    /* renamed from: a */
    void mo48814a(Status status, PostSetupAuthData postSetupAuthData);

    /* renamed from: b */
    void mo48815b(Status status, HandshakeData handshakeData);

    /* renamed from: c */
    void mo48816c(Status status, HandshakeData handshakeData);
}
