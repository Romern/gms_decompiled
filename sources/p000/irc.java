package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: irc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class irc extends dcj implements ire {
    public irc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.cryptauth.internal.IHaveKeyCallback");
    }

    /* renamed from: a */
    public final void mo13293a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo13294a(boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        mo8530c(1, bj);
    }
}
