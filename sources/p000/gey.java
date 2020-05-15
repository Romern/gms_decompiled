package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: gey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gey extends dck implements gez {

    /* renamed from: a */
    private final rlf f18077a;

    public gey() {
        super("com.google.android.gms.audiomodem.internal.IAudioModemCallback");
    }

    /* renamed from: a */
    public static gey m13048a(aucf aucf) {
        return new gey(new gev(aucf));
    }

    private gey(rlf rlf) {
        super("com.google.android.gms.audiomodem.internal.IAudioModemCallback");
        this.f18077a = rlf;
    }

    /* renamed from: a */
    public final void mo11755a(Status status) {
        this.f18077a.mo9482a((Object) status);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        mo11755a((Status) dcl.m8163a(parcel, Status.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
