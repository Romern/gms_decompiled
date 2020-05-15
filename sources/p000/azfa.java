package p000;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: azfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azfa extends dcj implements azfc {
    public azfa(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.matchstick.net.IMessagingService");
    }

    /* renamed from: a */
    public final void mo54858a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo54859b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(2, bj);
    }
}
