package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;

/* renamed from: artj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class artj extends dck implements artk {
    public artj() {
        super("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
    }

    /* renamed from: a */
    public void mo48812a(Status status, ConnectionHint connectionHint) {
    }

    /* renamed from: a */
    public void mo48813a(Status status, HandshakeData handshakeData) {
    }

    /* renamed from: a */
    public void mo48814a(Status status, PostSetupAuthData postSetupAuthData) {
    }

    /* renamed from: b */
    public final void mo48815b(Status status, HandshakeData handshakeData) {
    }

    /* renamed from: c */
    public final void mo48816c(Status status, HandshakeData handshakeData) {
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo48812a((Status) dcl.m8163a(parcel, Status.CREATOR), (ConnectionHint) dcl.m8163a(parcel, ConnectionHint.CREATOR));
        } else if (i == 2) {
            Status status = (Status) dcl.m8163a(parcel, Status.CREATOR);
            HandshakeData handshakeData = (HandshakeData) dcl.m8163a(parcel, HandshakeData.CREATOR);
        } else if (i == 3) {
            mo48813a((Status) dcl.m8163a(parcel, Status.CREATOR), (HandshakeData) dcl.m8163a(parcel, HandshakeData.CREATOR));
        } else if (i == 4) {
            Status status2 = (Status) dcl.m8163a(parcel, Status.CREATOR);
            HandshakeData handshakeData2 = (HandshakeData) dcl.m8163a(parcel, HandshakeData.CREATOR);
        } else if (i != 5) {
            return false;
        } else {
            mo48814a((Status) dcl.m8163a(parcel, Status.CREATOR), (PostSetupAuthData) dcl.m8163a(parcel, PostSetupAuthData.CREATOR));
        }
        return true;
    }
}
