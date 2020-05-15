package p000;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

/* renamed from: aalg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aalg extends dcj implements aali {
    public aalg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.IMessengerConnection");
    }

    /* renamed from: a */
    public final void mo16968a() {
        mo8530c(2, mo8529bj());
    }

    /* renamed from: a */
    public final void mo16969a(Message message) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, message);
        mo8530c(1, bj);
    }
}
